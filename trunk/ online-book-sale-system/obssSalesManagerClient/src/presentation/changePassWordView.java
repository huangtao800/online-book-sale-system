package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import po.ResultMessage;
import po.SalesManagerPO;
import presentationController.changePasswordView.changePasswordControllerInterface;

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

	        jLabel2.setFont(new java.awt.Font("方正舒体", 0, 18)); // NOI18N
	        jLabel2.setText("请输入原密码：");

	        jLabel3.setFont(new java.awt.Font("方正舒体", 0, 18)); // NOI18N
	        jLabel3.setText("请输入新密码：");

	        changePWButton.setBackground(new java.awt.Color(0, 255, 255));
	        changePWButton.setFont(new java.awt.Font("方正舒体", 1, 24)); // NOI18N
	        changePWButton.setText("确定");

	        cancelButton.setBackground(new java.awt.Color(204, 51, 0));
	        cancelButton.setFont(new java.awt.Font("方正舒体", 1, 24)); // NOI18N
	        cancelButton.setText("取消");

	        jLabel5.setFont(new java.awt.Font("方正舒体", 0, 16)); // NOI18N
	        jLabel5.setText("再次输入新密码：");

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addGap(0, 0, Short.MAX_VALUE)
	                .addComponent(userIDLabel)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(newPWTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
	                    .addComponent(newPWagainTextField)
	                    .addComponent(oldPWTextField))
	                .addGap(34, 34, 34))
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addComponent(jLabel3)
	                            .addComponent(jLabel5)
	                            .addComponent(jLabel2))
	                        .addGroup(layout.createSequentialGroup()
	                            .addGap(125, 125, 125)
	                            .addComponent(changePWButton))))
	                .addContainerGap(142, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(19, 19, 19)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(userIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(0, 0, 0)
	                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addComponent(oldPWTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(39, 39, 39)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(newPWTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(52, 52, 52)
	                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(38, 38, 38)
	                        .addComponent(newPWagainTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
	                .addComponent(changePWButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(32, 32, 32)
	                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(33, 33, 33))
	        );

	        pack();
	        
	        this.setVisible(true);
	        this.setLocation(200,300);
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
	    							if(controller.changeUser(userpo.getUserName(), userpo.getUserID(),
	    									                newPWTextField.getText(), userpo.getUserRole())== ResultMessage.SUCCEED)
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
