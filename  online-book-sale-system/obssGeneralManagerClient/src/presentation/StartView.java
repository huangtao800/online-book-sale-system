package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.UIManager;

import org.pushingpixels.substance.api.skin.SubstanceDustCoffeeLookAndFeel;

import po.UserRole;

import bussinessLogicService.StartBLService;

import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartView extends JFrame {

	private JPanel contentPane;
	private JTextField nameField;
	private JPasswordField passwordField;
	private StartBLService startController;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new SubstanceDustCoffeeLookAndFeel());
					StartView frame = new StartView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public StartView(StartBLService controller){
		this();
		this.startController=controller;
	}

	/**
	 * Create the frame.
	 */
	public StartView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nameLabel = new JLabel("\u7528\u6237\u540D\uFF1A");
		nameLabel.setFont(new Font("华文行楷", Font.PLAIN, 15));
		nameLabel.setBounds(64, 78, 78, 33);
		contentPane.add(nameLabel);
		
		nameField = new JTextField();
		nameField.setBounds(152, 78, 180, 36);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		JLabel passwordLabel = new JLabel("\u5BC6\u7801\uFF1A");
		passwordLabel.setFont(new Font("华文行楷", Font.PLAIN, 15));
		passwordLabel.setBounds(64, 129, 78, 33);
		contentPane.add(passwordLabel);
		
		JButton logButton = new JButton("\u767B\u5F55");
		
		//logButton的ActionListener
		logButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName=nameField.getText();
				String password=new String(passwordField.getPassword());
				
				startController.logIn(userName, password,UserRole.GeneralManager);
			}
			
		});
		
		logButton.setBounds(110, 207, 117, 33);
		contentPane.add(logButton);
		
		JButton cancelButton = new JButton("\u9000\u51FA");
		
		//cancelButton的ActionListener
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		cancelButton.setBounds(255, 207, 111, 33);
		contentPane.add(cancelButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(152, 129, 180, 33);
		contentPane.add(passwordField);
		
		
		
	}
	
}
