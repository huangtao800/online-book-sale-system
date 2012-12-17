package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import po.GeneralManagerPO;
import po.ResultMessage;
import po.UserPO;
import presentationController.changeUserNameView.changeUserNameControllerInterface;

public class changeUserNameView extends JFrame implements ActionListener{
	   private GeneralManagerPO userpo;
	   changeUserNameControllerInterface controller;
	
	    private javax.swing.JButton changeUserNameButton;
	    private javax.swing.JButton cancelButton;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JTextField newUserNameTextField;
	    private javax.swing.JLabel oldUserNameLabel;
	    
	    public changeUserNameView(changeUserNameControllerInterface controller,GeneralManagerPO userpo){
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

	        jLabel2.setFont(new java.awt.Font("方正舒体", 0, 18)); // NOI18N
	        jLabel2.setText("原用户名：");

	        jLabel3.setFont(new java.awt.Font("方正舒体", 0, 18)); // NOI18N
	        jLabel3.setText("新用户名：");

	        changeUserNameButton.setBackground(new java.awt.Color(0, 204, 204));
	        changeUserNameButton.setFont(new java.awt.Font("方正舒体", 1, 24)); // NOI18N
	        changeUserNameButton.setText("确定");

	        cancelButton.setBackground(new java.awt.Color(204, 51, 0));
	        cancelButton.setFont(new java.awt.Font("方正舒体", 1, 24)); // NOI18N
	        cancelButton.setText("退出");

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(28, 28, 28)
	                .addComponent(jLabel2)
	                .addGap(43, 43, 43)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(oldUserNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(newUserNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
	                .addGap(0, 0, Short.MAX_VALUE))
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addGroup(jPanel1Layout.createSequentialGroup()
	                            .addGap(20, 20, 20)
	                            .addComponent(jLabel3))
	                        .addGroup(jPanel1Layout.createSequentialGroup()
	                            .addGap(126, 126, 126)
	                            .addComponent(changeUserNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                .addContainerGap(138, Short.MAX_VALUE))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(46, 46, 46)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(oldUserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(64, 64, 64)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(newUserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
	                .addComponent(changeUserNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(53, 53, 53)
	                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(27, 27, 27))
	        );

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
	    		}else{
	    			UserPO newuserpo=new UserPO(userpo.getUserID(),newUserNameTextField.getText(),
	    					userpo.getUserPassword(),userpo.getUserRole());
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
}
