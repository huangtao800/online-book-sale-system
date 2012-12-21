package presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import po.ResultMessage;
import presentationController.customer.CustomerViewController;
import presentationController.customer.CustomerViewService;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChangePasswordFrame extends JFrame {

	private JPanel contentPane;
	private JPasswordField oldPasswordField;
	private JPasswordField newPasswordField1;
	private JPasswordField newPasswordField2;
	private CustomerViewService memberViewController;
	
	public ChangePasswordFrame(CustomerViewService memberViewController){
		this();
		this.memberViewController=memberViewController;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangePasswordFrame frame = new ChangePasswordFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChangePasswordFrame() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u539F\u59CB\u5BC6\u7801\uFF1A");
		label.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 18));
		label.setBounds(37, 42, 167, 34);
		contentPane.add(label);
		
		oldPasswordField = new JPasswordField();
		oldPasswordField.setBounds(223, 50, 167, 24);
		contentPane.add(oldPasswordField);
		
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u65B0\u5BC6\u7801\uFF1A");
		label_1.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 18));
		label_1.setBounds(43, 105, 143, 24);
		contentPane.add(label_1);
		
		newPasswordField1 = new JPasswordField();
		newPasswordField1.setBounds(223, 108, 167, 24);
		contentPane.add(newPasswordField1);
		
		JLabel label_2 = new JLabel("\u8BF7\u518D\u6B21\u8F93\u5165\u65B0\u5BC6\u7801\uFF1A");
		label_2.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 18));
		label_2.setBounds(37, 162, 167, 24);
		contentPane.add(label_2);
		
		newPasswordField2 = new JPasswordField();
		newPasswordField2.setBounds(223, 166, 167, 24);
		contentPane.add(newPasswordField2);
		
		JButton confirmButton = new JButton("\u786E\u8BA4");
		confirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String oldPassword=new String(oldPasswordField.getPassword());
				if(!memberViewController.checkPassword(oldPassword)){
					JOptionPane.showMessageDialog(null, "±ß«∏£°√‹¬Î ‰»Î¥ÌŒÛ£°");
				}else{
					String password1=new String(newPasswordField1.getPassword());
					String password2=new String(newPasswordField2.getPassword());
					
					
					if(password1.equals(password2)){
						ResultMessage message=memberViewController.changePassword(password1);
						if(message==ResultMessage.SUCCEED){
							JOptionPane.showMessageDialog(null, "–ﬁ∏ƒ≥…π¶£°");
							setVisible(false);
							dispose();
						}
					}else{
						JOptionPane.showMessageDialog(null, "√‹¬Î ‰»Î≤ª“ª÷¬£°");
					}
				}
			}
		});
		confirmButton.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 18));
		confirmButton.setBounds(87, 207, 110, 34);
		contentPane.add(confirmButton);
		
		JButton cancelButton = new JButton("\u53D6\u6D88");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		cancelButton.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 18));
		cancelButton.setBounds(222, 206, 110, 36);
		contentPane.add(cancelButton);
	}
}
