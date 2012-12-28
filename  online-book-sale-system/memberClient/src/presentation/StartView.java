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
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


import org.pushingpixels.substance.api.skin.SubstanceDustCoffeeLookAndFeel;

import po.UserRole;

import bussinessLogicService.StartBLService;

import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
		setTitle("\u987E\u5BA2\u767B\u5F55");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 370);
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
		nameField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e){
				char c=e.getKeyChar();
				if(c=='\n'){
					passwordField.requestFocus();
				}
			}
		});
		
		JLabel passwordLabel = new JLabel("\u5BC6\u7801\uFF1A");
		passwordLabel.setFont(new Font("华文行楷", Font.PLAIN, 15));
		passwordLabel.setBounds(64, 129, 78, 33);
		contentPane.add(passwordLabel);
		
		final JButton logButton = new JButton("\u767B\u5F55");
		
		//logButton的ActionListener
		logButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName=nameField.getText();
				String password=new String(passwordField.getPassword());
				UserRole role=UserRole.Member;
				
				startController.logIn(userName, password,role);
			}

		});
		
		logButton.setBounds(104, 210, 117, 33);
		contentPane.add(logButton);
		
		JButton cancelButton = new JButton("\u9000\u51FA");
		
		//cancelButton的ActionListener
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		cancelButton.setBounds(258, 210, 111, 33);
		contentPane.add(cancelButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(152, 129, 180, 33);
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e){
				char c=e.getKeyChar();
				if(c=='\n'){
					logButton.doClick();
				}
			}
		});
		
		contentPane.add(passwordField);
		
		JButton registryButton = new JButton("\u6CE8\u518C\u65B0\u7528\u6237");
		registryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startController.startRegistry();
			}
		});
		registryButton.setBounds(342, 78, 111, 33);
		contentPane.add(registryButton);
		
		JLabel lblObss = new JLabel("OBSS\u56FE\u4E66\u9500\u552E\u7CFB\u7EDF");
		lblObss.setFont(new Font("华文彩云", Font.ITALIC, 23));
		lblObss.setBounds(141, 24, 199, 25);
		contentPane.add(lblObss);
		
		
		
	}
}
