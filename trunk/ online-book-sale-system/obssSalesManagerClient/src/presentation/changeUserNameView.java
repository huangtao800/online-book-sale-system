package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import po.ResultMessage;
import po.SalesManagerPO;
import po.UserPO;
import po.UserRole;
import presentationController.changeUserNameView.changeUserNameControllerInterface;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class changeUserNameView extends JFrame implements ActionListener{
	   private SalesManagerPO userpo;
	   changeUserNameControllerInterface controller;
	
	    private javax.swing.JButton changeUserNameButton;
	    private javax.swing.JButton cancelButton;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JTextField newUserNameTextField;
	    private javax.swing.JLabel oldUserNameLabel;
	    private UserPO newuserpo;
	    
	    public changeUserNameView(changeUserNameControllerInterface controller,SalesManagerPO userpo){
	    	this.controller=controller;
	    	this.userpo=userpo;
	    	initComponents();
	    }

	    private void initComponents() {

	        jPanel1 = new javax.swing.JPanel();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        oldUserNameLabel = new javax.swing.JLabel();
	        newUserNameTextField = new javax.swing.JTextField();
	        changeUserNameButton = new javax.swing.JButton();
	        cancelButton = new javax.swing.JButton();

//	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	  
	        jLabel2.setText("原用户名：");

//	        jLabel3.setFont(new java.awt.Font("方正舒体", 0, 18)); // NOI18N
	        jLabel3.setText("新用户名：");

//	        changeUserNameButton.setBackground(new java.awt.Color(0, 204, 204));
//	        changeUserNameButton.setFont(new java.awt.Font("方正舒体", 1, 24)); // NOI18N
	        changeUserNameButton.setText("确定");

//	        cancelButton.setBackground(new java.awt.Color(204, 51, 0));
//	        cancelButton.setFont(new java.awt.Font("方正舒体", 1, 24)); // NOI18N
	        cancelButton.setText("退出");

	        javax.swing.GroupLayout gl_jPanel1 = new javax.swing.GroupLayout(jPanel1);
	        gl_jPanel1.setHorizontalGroup(
	        	gl_jPanel1.createParallelGroup(Alignment.LEADING)
	        		.addGroup(gl_jPanel1.createSequentialGroup()
	        			.addGap(28)
	        			.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
	        				.addGroup(gl_jPanel1.createSequentialGroup()
	        					.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING)
	        						.addComponent(jLabel2)
	        						.addComponent(jLabel3))
	        					.addGap(43)
	        					.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
	        						.addComponent(oldUserNameLabel)
	        						.addComponent(newUserNameTextField, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE))
	        					.addContainerGap(41, Short.MAX_VALUE))
	        				.addGroup(gl_jPanel1.createSequentialGroup()
	        					.addComponent(changeUserNameButton, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
	        					.addPreferredGap(ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
	        					.addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
	        					.addGap(49))))
	        );
	        gl_jPanel1.setVerticalGroup(
	        	gl_jPanel1.createParallelGroup(Alignment.LEADING)
	        		.addGroup(gl_jPanel1.createSequentialGroup()
	        			.addGap(46)
	        			.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING)
	        				.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(oldUserNameLabel, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
	        			.addGap(57)
	        			.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING)
	        				.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(newUserNameTextField, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
	        			.addGap(69)
	        			.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(changeUserNameButton, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
	        			.addContainerGap(136, Short.MAX_VALUE))
	        );
	        jPanel1.setLayout(gl_jPanel1);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(0, 0, Short.MAX_VALUE))
	        );

	        pack();
	        
	        this.setVisible(true);
	        oldUserNameLabel.setText(userpo.getUserName());
	        this.setLocation(300, 200);
	        
	        changeUserNameButton.addActionListener(this);
	        cancelButton.addActionListener(this);
   }
	    
	    public void actionPerformed(ActionEvent event){
	    	if(event.getSource()==changeUserNameButton ){
	    		if(newUserNameTextField.getText().equals("")){
	    			JOptionPane.showMessageDialog(null, "新用户名不能为空！");
	    			newuserpo=userpo;
	    		}else{
	    			newuserpo=new UserPO(userpo.getUserID(),newUserNameTextField.getText(),
	    					userpo.getUserPassword(),userpo.getUserRole());//String id,String name,String password,UserRole role
	    			
	    			if(  controller.changeUser(userpo,newuserpo)
	    			     ==ResultMessage.SUCCEED)
	    			{
	    				userpo.setUserName(newUserNameTextField.getText());
	    				JOptionPane.showMessageDialog(null, "修改用户名成功！");
	    			}else{
	    				JOptionPane.showMessageDialog(null, "修改用户名失败！");
	    			}
	    		}
	    		
	    	}
	    	else if(event.getSource()==cancelButton){
	    		dispose();
	    	}
	    }
	    public UserPO getNewUserPO(){
	    	return newuserpo;
	    }
}
