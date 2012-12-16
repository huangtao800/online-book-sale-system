package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;

import po.ResultMessage;

import bussinessLogicService.RegistryBLService;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistryView extends JFrame {

	private JPanel contentPane;
	private JTextField nameField;
	private JPasswordField passwordField;
	private JPasswordField passwordConfirmField;
	private RegistryBLService registryController;
	private JTextField addressField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistryView frame = new RegistryView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public RegistryView(RegistryBLService registryController){
		this();
		this.registryController=registryController;
	}
	
	
	/**
	 * Create the frame.
	 */
	public RegistryView() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nameLabel = new JLabel("\u7528\u6237\u540D\uFF1A");
		nameLabel.setFont(new Font("华文行楷", Font.PLAIN, 23));
		nameLabel.setBounds(43, 28, 92, 37);
		contentPane.add(nameLabel);
		
		nameField = new JTextField();
		nameField.setBounds(174, 28, 226, 32);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		JLabel passwordLabel = new JLabel("\u8BBE\u7F6E\u5BC6\u7801\uFF1A");
		passwordLabel.setFont(new Font("华文行楷", Font.PLAIN, 23));
		passwordLabel.setBounds(43, 85, 115, 37);
		contentPane.add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(174, 89, 226, 32);
		contentPane.add(passwordField);
		
		JLabel label = new JLabel("\u786E\u8BA4\u5BC6\u7801\uFF1A");
		label.setFont(new Font("华文行楷", Font.PLAIN, 23));
		label.setBounds(43, 142, 122, 37);
		contentPane.add(label);
		
		passwordConfirmField = new JPasswordField();
		passwordConfirmField.setBounds(174, 146, 226, 32);
		contentPane.add(passwordConfirmField);
		
		JButton registryButton = new JButton("\u6CE8\u518C");
		registryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=nameField.getText();
				String password=new String(passwordField.getPassword());
				String passwordConfirm=new String(passwordConfirmField.getPassword());
				
				String address=addressField.getText();
				
				if(!isPassWordValid(password, passwordConfirm)){
					JOptionPane.showMessageDialog(null, "密码输入不一致！");
				}else {
					registryController.registry(name, passwordConfirm,address);
				}
			}
			
			private boolean isPassWordValid(String password1,String password2){
				return password1.equals(password2);
			}
		});
		registryButton.setBounds(104, 275, 115, 37);
		contentPane.add(registryButton);
		
		JButton cancelButton = new JButton("\u53D6\u6D88");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				RegistryView.this.dispose();
			}
		});
		cancelButton.setBounds(265, 275, 115, 37);
		contentPane.add(cancelButton);
		
		JLabel addressLabel = new JLabel("\u5E38\u7528\u5730\u5740\uFF1A");
		addressLabel.setFont(new Font("华文行楷", Font.PLAIN, 23));
		addressLabel.setBounds(43, 201, 115, 37);
		contentPane.add(addressLabel);
		
		addressField = new JTextField();
		addressField.setBounds(174, 205, 226, 32);
		contentPane.add(addressField);
		addressField.setColumns(10);
	}
}
