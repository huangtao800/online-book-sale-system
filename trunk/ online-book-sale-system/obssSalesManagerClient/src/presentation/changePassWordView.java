package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import po.ResultMessage;
import po.SalesManagerPO;
import po.UserPO;
import presentationController.changePasswordView.changePasswordControllerInterface;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;

public class changePassWordView extends JFrame implements ActionListener{
	    changePasswordControllerInterface controller;
	    SalesManagerPO userpo;
	
	    private javax.swing.JButton changePWButton;
	    private javax.swing.JButton cancelButton;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel5;
	    private javax.swing.JTextField newPWTextField;
	    private javax.swing.JTextField newPWagainTextField;
	    private javax.swing.JTextField oldPWTextField;
	    private javax.swing.JLabel userIDLabel;
	    
	    public changePassWordView(changePasswordControllerInterface controller,SalesManagerPO userpo){
	    	this.userpo=userpo;
	    	this.controller=controller;
	    	initComponents();
	    }
	    
	    private void initComponents() {

	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        changePWButton = new javax.swing.JButton();
	        cancelButton = new javax.swing.JButton();
	        userIDLabel = new javax.swing.JLabel();
	        jLabel5 = new javax.swing.JLabel();
	        oldPWTextField = new javax.swing.JTextField();
	        newPWTextField = new javax.swing.JTextField();
	        newPWagainTextField = new javax.swing.JTextField();

//	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jLabel2.setText("请输入原密码：");

	        jLabel3.setText("请输入新密码：");

	        changePWButton.setText("确定");
	        cancelButton.setText("退出");

	        jLabel5.setText("再次输入新密码：");

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        layout.setHorizontalGroup(
	        	layout.createParallelGroup(Alignment.TRAILING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
	        				.addGroup(layout.createSequentialGroup()
	        					.addContainerGap()
	        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
	        						.addComponent(changePWButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        						.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
	        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
	        								.addGroup(layout.createSequentialGroup()
	        									.addComponent(userIDLabel)
	        									.addPreferredGap(ComponentPlacement.RELATED)
	        									.addComponent(jLabel2))
	        								.addGroup(layout.createParallelGroup(Alignment.LEADING)
	        									.addComponent(jLabel3)
	        									.addComponent(jLabel5)))
	        							.addGap(24)))
	        					.addGap(18)
	        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
	        						.addComponent(oldPWTextField, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
	        						.addComponent(newPWagainTextField, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
	        						.addComponent(newPWTextField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))
	        				.addComponent(cancelButton, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
	        			.addContainerGap())
	        );
	        layout.setVerticalGroup(
	        	layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addGap(19)
	        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
	        				.addGroup(layout.createSequentialGroup()
	        					.addComponent(userIDLabel, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
	        					.addGap(27))
	        				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
	        					.addComponent(oldPWTextField, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
	        					.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
	        			.addGap(39)
	        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(newPWTextField, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
	        			.addGap(38)
	        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(newPWagainTextField, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
	        			.addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
	        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(changePWButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
	        			.addGap(118))
	        );
	        getContentPane().setLayout(layout);

	        pack();
	        
	        this.setVisible(true);
	        this.setLocation(300,200);
	        changePWButton.addActionListener(this);
	        cancelButton.addActionListener(this);
	    }// </editor-fold>
	    
	    public void actionPerformed(ActionEvent event){
	    	if(event.getSource()==changePWButton ){
	    		if(! oldPWTextField.getText().equals("")){
	    			if( ! oldPWTextField.getText().equals(userpo.getUserPassword())){
	    				JOptionPane.showMessageDialog(null, "原密码不正确！");
	    			}else{
	    				if(newPWTextField.getText().equals("")){
	    					JOptionPane.showMessageDialog(null, "新密码不能为空！");
	    				}else{
	    					if(newPWagainTextField.getText().equals("")){
	    						JOptionPane.showMessageDialog(null, "请再次输入新密码！");
	    					}else{
	    						if( ! newPWTextField.getText().equals(newPWagainTextField.getText())){
	    							JOptionPane.showMessageDialog(null, "请确认两次输入的新密码相同！");
	    						}else{
	    							UserPO newuserpo=new UserPO(userpo.getUserID(),userpo.getUserName(),newPWTextField.getText(),
	    			    					userpo.getUserRole());
	    							if(controller.changeUser(userpo,newuserpo)== ResultMessage.SUCCEED)
	    							{
	    								userpo.setUserPassword(newPWTextField.getText());
	    								JOptionPane.showMessageDialog(null, "密码修改成功！");
	    								
	    							}else{
	    								JOptionPane.showMessageDialog(null, "密码修改失败！");
	    							}
	    						}
	    					}
	    				}	
	    			}    			
	    		}else{
	    			JOptionPane.showMessageDialog(null, "请先输入原密码！");
	    		}
	    	}
	
	    	else if(event.getSource()==cancelButton){
	    		dispose();
	    	}
	    }

}
