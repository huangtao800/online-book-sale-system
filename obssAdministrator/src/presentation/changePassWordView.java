package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import po.AdministratorPO;
import po.ResultMessage;
import po.SalesManagerPO;
import po.UserPO;
import po.UserRole;
import presentationController.Admin.AdminOverviewService;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;

public class changePassWordView extends JFrame{
	    private AdminOverviewService adminOverviewController;
	    private AdministratorPO administratorPO;
	    
	    public changePassWordView(AdminOverviewService adminOverviewController,AdministratorPO administratorPO){
	    	this.adminOverviewController = adminOverviewController;
	    	this.administratorPO = administratorPO;
	    	initComponents(this.administratorPO);
	    }
	    
	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">
	    private void initComponents(final AdministratorPO administratorPO) {

	        jPanel1 = new javax.swing.JPanel();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        jTextField1 = new javax.swing.JPasswordField();
	        jTextField2 = new javax.swing.JPasswordField();
	        jTextField3 = new javax.swing.JPasswordField();
	        jButton1 = new javax.swing.JButton();
	        jButton2 = new javax.swing.JButton();

	       

	        jLabel1.setText("原密码：");

	        jLabel2.setText("新密码：");

	        jLabel3.setText("新密码确认：");

	        jButton1.setText("确认修改");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                String oldPassword =( new String(jTextField1.getPassword())).trim();
	                String newPassword1= ( new String(jTextField2.getPassword())).trim();
	                String newPassword2 = ( new String(jTextField3.getPassword())).trim();
	                if(!oldPassword.equals(administratorPO.getUserPassword())){
	                	JOptionPane.showMessageDialog(null,"原密码不正确，请重新输入！");
	                }else{
	                	if(!newPassword1.equals(newPassword2)&&(!newPassword1.equals(""))){
	                		JOptionPane.showMessageDialog(null, "两次密码输入不一致，请重新输入！");
	                	}else if(newPassword1.equals("")){
	                		JOptionPane.showMessageDialog(null,"新密码不能为空！");
	                	}else{
	                		String id = administratorPO.getUserID();
	                		String name = administratorPO.getUserName();
	                		UserPO userPO = new UserPO(id, name, newPassword1, UserRole.Administrator);
	                		ResultMessage resultMessage = adminOverviewController.changePassword(userPO);
	                		if(resultMessage==ResultMessage.SUCCEED){
	                			JOptionPane.showMessageDialog(null, "修改成功！");
	                			dispose();
	                        }else{
	                        	JOptionPane.showMessageDialog(null, "系统异常，请稍后冲重试！");
	                        }
	                	}
	                }
	            }
	        });

	        jButton2.setText("取消修改");
	        jButton2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	               dispose();
	            }
	        });

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(41, 41, 41)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                .addComponent(jLabel2)
	                                .addComponent(jLabel1))
	                            .addComponent(jLabel3))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGap(46, 46, 46))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(39, 39, 39)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel1)
	                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(43, 43, 43)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel2)
	                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(43, 43, 43)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel3)
	                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton2)
	                    .addComponent(jButton1))
	                .addGap(52, 52, 52))
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
	                .addGap(0, 10, Short.MAX_VALUE))
	        );

	        pack();
	    }// </editor-fold>

	    // Variables declaration - do not modify
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton jButton2;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JPasswordField jTextField1;
	    private javax.swing.JPasswordField jTextField2;
	    private javax.swing.JPasswordField jTextField3;
	    // End of variables declaration
	}
