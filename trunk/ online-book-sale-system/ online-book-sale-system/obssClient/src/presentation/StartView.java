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
	private final ButtonGroup buttonGroup = new ButtonGroup();
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
		setBounds(100, 100, 477, 380);
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
		
		final JRadioButton memberButton = new JRadioButton("\u987E\u5BA2");
		buttonGroup.add(memberButton);
		memberButton.setBounds(49, 183, 54, 23);
		memberButton.setSelected(true);
		contentPane.add(memberButton);
		
		final JRadioButton saleManagerButton = new JRadioButton("\u9500\u552E\u7ECF\u7406");
		buttonGroup.add(saleManagerButton);
		saleManagerButton.setBounds(117, 183, 78, 23);
		contentPane.add(saleManagerButton);
		
		final JRadioButton managerButton = new JRadioButton("\u603B\u7ECF\u7406");
		buttonGroup.add(managerButton);
		managerButton.setBounds(204, 183, 67, 23);
		contentPane.add(managerButton);
		
		JRadioButton radioButton_3 = new JRadioButton("\u7BA1\u7406\u5458");
		buttonGroup.add(radioButton_3);
		radioButton_3.setBounds(293, 184, 72, 21);
		contentPane.add(radioButton_3);
		
		JButton logButton = new JButton("\u767B\u5F55");
		
		//logButton的ActionListener
		logButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName=nameField.getText();
				String password=new String(passwordField.getPassword());
				UserRole role=getUserRole();
				
				startController.logIn(userName, password,role);
			}
			
			private UserRole getUserRole(){
				if(buttonGroup.getSelection()==memberButton.getModel()){
					return UserRole.Member;
				}else if(buttonGroup.getSelection()==managerButton.getModel()){
					return UserRole.GeneralManager;
				}else if(buttonGroup.getSelection()==saleManagerButton.getModel()){
					return UserRole.SalesManager;
				}else{
					return UserRole.Administrator;
				}
			}
		});
		
		logButton.setBounds(103, 234, 117, 33);
		contentPane.add(logButton);
		
		JButton cancelButton = new JButton("\u9000\u51FA");
		
		//cancelButton的ActionListener
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		cancelButton.setBounds(254, 234, 111, 33);
		contentPane.add(cancelButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(152, 129, 180, 33);
		contentPane.add(passwordField);
		
		JButton registryButton = new JButton("\u6CE8\u518C\u65B0\u7528\u6237");
		registryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startController.startRegistry();
			}
		});
		registryButton.setBounds(342, 78, 93, 33);
		contentPane.add(registryButton);
		
		
		
	}
	
}
