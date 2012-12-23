package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import po.GeneralManagerPO;
import po.ResultMessage;
import po.UserPO;
import presentationController.changePasswordView.changePasswordControllerInterface;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class changePassWordView extends JFrame implements ActionListener{
	    changePasswordControllerInterface controller;
	    GeneralManagerPO userpo;
	
	    private javax.swing.JButton changePWButton;
	    private javax.swing.JButton cancelButton;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel5;
	    private javax.swing.JTextField newPWTextField;
	    private javax.swing.JTextField newPWagainTextField;
	    private javax.swing.JTextField oldPWTextField;
	    private javax.swing.JLabel userIDLabel;
	    
	    public changePassWordView(changePasswordControllerInterface controller,GeneralManagerPO userpo){
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

//	        jLabel2.setFont(new java.awt.Font("方正舒体", 0, 18)); // NOI18N
	        jLabel2.setText("请输入原密码：");

//	        jLabel3.setFont(new java.awt.Font("方正舒体", 0, 18)); // NOI18N
	        jLabel3.setText("请输入新密码：");

//	        changePWButton.setBackground(new java.awt.Color(0, 255, 255));
//	        changePWButton.setFont(new java.awt.Font("方正舒体", 1, 24)); // NOI18N
	        changePWButton.setText("确定");

//	        cancelButton.setBackground(new java.awt.Color(204, 51, 0));
//	        cancelButton.setFont(new java.awt.Font("方正舒体", 1, 24)); // NOI18N
	        cancelButton.setText("退出");

//	        jLabel5.setFont(new java.awt.Font("方正舒体", 0, 16)); // NOI18N
	        jLabel5.setText("再次输入新密码：");

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        layout.setHorizontalGroup(
	        	layout.createParallelGroup(Alignment.TRAILING)
	        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
	        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
	        				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
	        					.addGroup(layout.createSequentialGroup()
	        						.addContainerGap()
	        						.addComponent(changePWButton, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
	        					.addGroup(Alignment.LEADING, layout.createSequentialGroup()
	        						.addGap(0, 194, Short.MAX_VALUE)
	        						.addComponent(userIDLabel))
	        					.addGroup(Alignment.LEADING, layout.createSequentialGroup()
	        						.addContainerGap()
	        						.addComponent(jLabel3))
	        					.addGroup(Alignment.LEADING, layout.createSequentialGroup()
	        						.addContainerGap()
	        						.addComponent(jLabel5)))
	        				.addGroup(layout.createSequentialGroup()
	        					.addContainerGap()
	        					.addComponent(jLabel2)
	        					.addPreferredGap(ComponentPlacement.RELATED)))
	        			.addPreferredGap(ComponentPlacement.RELATED)
	        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
	        				.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
	        					.addComponent(oldPWTextField, Alignment.TRAILING)
	        					.addComponent(newPWagainTextField)
	        					.addComponent(newPWTextField, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
	        				.addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
	        			.addContainerGap())
	        );
	        layout.setVerticalGroup(
	        	layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addGap(19)
	        			.addComponent(userIDLabel, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
	        			.addGap(0)
	        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(oldPWTextField, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
	        			.addGap(39)
	        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(newPWTextField, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
	        			.addGap(38)
	        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
	        				.addComponent(jLabel5, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(newPWagainTextField, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
	        			.addGap(68)
	        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(changePWButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
	        			.addGap(109))
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
