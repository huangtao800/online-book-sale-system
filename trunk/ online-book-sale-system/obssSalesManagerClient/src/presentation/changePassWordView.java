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
	    private javax.swing.JPasswordField newPWTextField;
	    private javax.swing.JPasswordField newPWagainTextField;
	    private javax.swing.JPasswordField oldPWTextField;
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
	        oldPWTextField = new javax.swing.JPasswordField();
	        newPWTextField = new javax.swing.JPasswordField();
	        newPWagainTextField = new javax.swing.JPasswordField();

//	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jLabel2.setText("������ԭ���룺");

	        jLabel3.setText("�����������룺");

	        changePWButton.setText("ȷ��");
	        cancelButton.setText("�˳�");

	        jLabel5.setText("�ٴ����������룺");

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
	    		if(!(new String( oldPWTextField.getPassword())).trim().equals("")){
	    			if( !(new String( oldPWTextField.getPassword())).trim().equals(userpo.getUserPassword())){
	    				JOptionPane.showMessageDialog(null, "ԭ���벻��ȷ��");
	    			}else{
	    				if((new String(newPWTextField.getPassword())).trim().equals("")){
	    					JOptionPane.showMessageDialog(null, "�����벻��Ϊ�գ�");
	    				}else{
	    					if((new String(newPWagainTextField.getPassword())).trim().equals("")){
	    						JOptionPane.showMessageDialog(null, "���ٴ����������룡");
	    					}else{
	    						if( ! (new String(newPWTextField.getPassword())).trim()
	    								.equals((new String(newPWagainTextField.getPassword())).trim())){
	    							JOptionPane.showMessageDialog(null, "��ȷ�������������������ͬ��");
	    						}else{
	    							UserPO newuserpo=new UserPO(userpo.getUserID(),userpo.getUserName()
	    									,(new String(newPWTextField.getPassword())).trim(),
	    			    					userpo.getUserRole());
	    							if(controller.changeUser(userpo,newuserpo)== ResultMessage.SUCCEED)
	    							{
	    								userpo.setUserPassword((new String(newPWTextField.getPassword())).trim());
	    								JOptionPane.showMessageDialog(null, "�����޸ĳɹ���");
	    								
	    							}else{
	    								JOptionPane.showMessageDialog(null, "�����޸�ʧ�ܣ�");
	    							}
	    						}
	    					}
	    				}	
	    			}    			
	    		}else{
	    			JOptionPane.showMessageDialog(null, "��������ԭ���룡");
	    		}
	    	}
	
	    	else if(event.getSource()==cancelButton){
	    		dispose();
	    	}
	    }

}
