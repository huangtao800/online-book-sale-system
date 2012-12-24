package presentation;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import bussinessLogic.controller.UserController;

import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import presentationController.Admin.AdminViewController;
import presentationController.Admin.AdminViewService;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;

/**
*
* @author 尤佳琪
*/

public class AdminView extends javax.swing.JFrame {

   
   public AdminView(int index) {
	   this.index = index;
	   adminViewController = AdminViewController.getInstance();
       initComponents();
   }

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">
   private void initComponents() {
       
	   
       jTabbedPane1 = new javax.swing.JTabbedPane();
       jPanel1 = new javax.swing.JPanel();
     
       jLabel2 = new javax.swing.JLabel();
       jLabel3 = new javax.swing.JLabel();
       jLabel4 = new javax.swing.JLabel();
       jLabel5 = new javax.swing.JLabel();
       jComboBox1 = new javax.swing.JComboBox();
    
       jTextField2 = new javax.swing.JTextField();
       jTextField3 = new javax.swing.JTextField();
       jTextField4 = new javax.swing.JTextField();
       jButton1 = new javax.swing.JButton();
       jButton2 = new javax.swing.JButton();
       jPanel2 = new javax.swing.JPanel();
       jTextField5 = new javax.swing.JTextField();
       jButton3 = new javax.swing.JButton();
       jLabel6 = new javax.swing.JLabel();
       jComboBox2 = new javax.swing.JComboBox();
       jLabel7 = new javax.swing.JLabel();
       jLabel8 = new javax.swing.JLabel();
       jLabel9 = new javax.swing.JLabel();
       jLabel10 = new javax.swing.JLabel();
       jLabel11 = new javax.swing.JLabel();
       jTextField6 = new javax.swing.JTextField();
       jTextField7 = new javax.swing.JTextField();
       jTextField8 = new javax.swing.JTextField();
       jTextField9 = new javax.swing.JTextField();
       jTextField10 = new javax.swing.JTextField();
       jButton4 = new javax.swing.JButton();
       jButton5 = new javax.swing.JButton();
       jButton9 = new javax.swing.JButton();
       jSeparator1 = new javax.swing.JSeparator();
       jLabel16 = new javax.swing.JLabel();
       jPanel3 = new javax.swing.JPanel();
       jButton6 = new javax.swing.JButton();
       jTextField11 = new javax.swing.JTextField();
       jLabel12 = new javax.swing.JLabel();
       jLabel13 = new javax.swing.JLabel();
       jLabel14 = new javax.swing.JLabel();
       jLabel15 = new javax.swing.JLabel();
       jTextField12 = new javax.swing.JTextField();
       jTextField13 = new javax.swing.JTextField();
       jTextField14 = new javax.swing.JTextField();
       jComboBox3 = new javax.swing.JComboBox();
       jButton7 = new javax.swing.JButton();
       jButton8 = new javax.swing.JButton();
       jButton10 = new javax.swing.JButton();
       jSeparator2 = new javax.swing.JSeparator();
       jLabel17 = new javax.swing.JLabel();

//       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

   

       jLabel2.setText("用户姓名：");

       jLabel3.setText("用户密码设置：");

       jLabel4.setText("用户密码确认：");

       jLabel5.setText("用户类型：");

       jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new UserRole[] { UserRole.Member, UserRole.GeneralManager, UserRole.SalesManager, UserRole.Administrator }));

       jTextField2.setText("");
       jTextField3.setText("");
       jTextField4.setText("");
       
       jButton1.setText("确认添加");
       jButton1.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
        	  UserRole role = (UserRole) jComboBox1.getSelectedItem();
              String id = adminViewController.autoGetUserId(role);
              String name = jTextField2.getText().trim();
              String password1 = jTextField3.getText().trim();
              String password2 = jTextField4.getText().trim();
              String password = "";
              
              if(!password1.equals("")&&password1.equals(password2)){
            	  password = jTextField3.getText().trim();
            	  ResultMessage resultMessage = adminViewController.add(name,id,password,role);
                  
                  if(resultMessage==ResultMessage.SUCCEED){
                	  JOptionPane.showMessageDialog(null, "添加成功！");
                  }else if(resultMessage==ResultMessage.EXIST){
                	  JOptionPane.showMessageDialog(null, "该用户名已存在，请重新输入用户名");
                  }
              }else{
            	  JOptionPane.showMessageDialog(null," 两次密码输入不一致，请重新输入！");
              }
           }
       });

       jButton2.setText("清空");
       jButton2.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
        	  
               jTextField2.setText("");
               jTextField3.setText("");
               jTextField4.setText("");
           }
       });

       javax.swing.GroupLayout gl_jPanel1 = new javax.swing.GroupLayout(jPanel1);
       gl_jPanel1.setHorizontalGroup(
       	gl_jPanel1.createParallelGroup(Alignment.LEADING)
       		.addGroup(gl_jPanel1.createSequentialGroup()
       			.addGap(52)
       			.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
       				.addComponent(jLabel5)
       				.addComponent(jLabel2)
       				.addComponent(jLabel3)
       				.addComponent(jLabel4)
       				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
       			.addPreferredGap(ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
       			.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING, false)
       				.addComponent(jComboBox1, 0, 188, Short.MAX_VALUE)
       				.addComponent(jTextField2, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
       				.addComponent(jTextField3, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
       				.addComponent(jTextField4, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
       				.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
       			.addContainerGap(98, Short.MAX_VALUE))
       );
       gl_jPanel1.setVerticalGroup(
       	gl_jPanel1.createParallelGroup(Alignment.LEADING)
       		.addGroup(gl_jPanel1.createSequentialGroup()
       			.addGap(27)
       			.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
       				.addComponent(jLabel5)
       				.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
       			.addGap(24)
       			.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
       				.addComponent(jLabel2)
       				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
       			.addGap(24)
       			.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
       				.addComponent(jLabel3)
       				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
       			.addGap(21)
       			.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING)
       				.addComponent(jLabel4)
       				.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
       			.addGap(89)
       			.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
       				.addComponent(jButton1)
       				.addComponent(jButton2))
       			.addContainerGap(211, Short.MAX_VALUE))
       );
       jPanel1.setLayout(gl_jPanel1);

       jTabbedPane1.addTab("增加用户", jPanel1);

       jTextField5.setText("");

       jButton3.setText("查询原有信息");
       jButton3.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
        	   String name = jTextField5.getText().trim();
        	   if(name.equals("")){
        		   JOptionPane.showMessageDialog(null, "请输入用户名！");
        	   }else{
        		   UserRole userRole = (UserRole)jComboBox2.getSelectedItem();
            	   UserPO userPO = adminViewController.findUser(name, userRole);
            	   if(userPO==null){
            		   JOptionPane.showMessageDialog(null, "该用户不存在，请重新输入！");
            	   }else{
            		   jTextField6.setText(userPO.getUserID());
            		   jTextField7.setText(userPO.getUserName());
            		   jTextField8.setText(userPO.getUserPassword());
            		   jTextField6.setEditable(false);
            	   }
        	   }
        	  
           }
       });

       jLabel6.setText("用户类型（不可修改）：");

       jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new UserRole[] { UserRole.Member, UserRole.GeneralManager, UserRole.SalesManager, UserRole.Administrator }));

       jLabel7.setText("用户ID（不可修改）：");

       jLabel8.setText("用户姓名：");

       jLabel9.setText("原密码：");

       jLabel10.setText("新密码：");

       jLabel11.setText("新密码确认：");

       

       jButton4.setText("确认修改");

       jButton4.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
        	   String beforeName = jTextField5.getText().trim();
        	   UserRole userRole = (UserRole)jComboBox2.getSelectedItem();
        	
        	   String id = jTextField6.getText().trim();
        	   String afterName = jTextField7.getText().trim();
        	   String beforePassword = jTextField8.getText().trim();
               String password1 = jTextField9.getText().trim();
               String password2 = jTextField10.getText().trim();
               String afterPassword = "";
               ResultMessage resultMessage=ResultMessage.SUCCEED;
             //id和用户类型不能被修改 1.只修改密码 2.只修改用户名  3.都修改
               if(password1.equals("")){        //只修改用户名
            	   UserPO beforeUserPO = new UserPO(id, beforeName, beforePassword, userRole);
                   UserPO afterUserPO = new UserPO(id, afterName, beforePassword, userRole);
                  resultMessage = adminViewController.change(beforeUserPO,afterUserPO);
               }else if((!beforeName.equals(afterName))&&!password1.equals("")
            		           &&password1.equals(password2)){  //都修改
            	   afterPassword = password1;
            	   UserPO beforeUserPO = new UserPO(id, beforeName, beforePassword, userRole);
                   UserPO afterUserPO = new UserPO(id, afterName, afterPassword, userRole);
                   resultMessage = adminViewController.change(beforeUserPO,afterUserPO);
               }else if(!password1.equals(password2)){
            	   JOptionPane.showMessageDialog(null, "两次密码输入不一致，请重新输入！");
               }else if(beforeName.equals(afterName)&&!password1.equals("")
            		           &&password1.equals(password2)){ //只修改密码
            	   afterPassword = password1;
            	   UserPO beforeUserPO = new UserPO(id, beforeName, afterPassword, userRole);
            	   resultMessage = adminViewController.changePassword(beforeUserPO);
               }
               
               if(resultMessage==ResultMessage.SUCCEED){
            	   JOptionPane.showMessageDialog(null, "修改成功！");
               }else if(resultMessage==ResultMessage.EXIST){
            	   JOptionPane.showMessageDialog(null, "该用户名已经存在，请重新输入用户名！");
               }else{
            	   JOptionPane.showMessageDialog(null, "系统异常，请重试！");
               }   
               
           }
       });
       
       jButton5.setText("清空");
       jButton5.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jTextField5.setText("");
               jTextField6.setText("");
               jTextField7.setText("");
               jTextField8.setText("");
               jTextField9.setText("");
               jTextField10.setText("");
           }
       });

       jButton9.setText("重新填写");
       jButton9.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
        	   jTextField5.setText("");
           }
       });

       jLabel16.setText("用户姓名：");

       javax.swing.GroupLayout gl_jPanel2 = new javax.swing.GroupLayout(jPanel2);
       jPanel2.setLayout(gl_jPanel2);
       gl_jPanel2.setHorizontalGroup(
           gl_jPanel2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(gl_jPanel2.createSequentialGroup()
               .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGap(0, 0, Short.MAX_VALUE))
           .addGroup(gl_jPanel2.createSequentialGroup()
               .addGap(59, 59, 59)
               .addGroup(gl_jPanel2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(gl_jPanel2.createSequentialGroup()
                       .addComponent(jLabel8)
                       .addGap(0, 0, Short.MAX_VALUE))
                   .addGroup(gl_jPanel2.createSequentialGroup()
                       .addGroup(gl_jPanel2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jLabel6)
                           .addComponent(jLabel9)
                           .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jLabel10)
                           .addComponent(jLabel11)
                           .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jLabel7)
                           .addComponent(jLabel16))
                       .addGap(66, 66, 66)
                       .addGroup(gl_jPanel2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(gl_jPanel2.createSequentialGroup()
                               .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addGap(0, 0, Short.MAX_VALUE))
                           .addGroup(gl_jPanel2.createSequentialGroup()
                               .addGroup(gl_jPanel2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
       );
       gl_jPanel2.setVerticalGroup(
           gl_jPanel2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(gl_jPanel2.createSequentialGroup()
               .addContainerGap()
               .addGroup(gl_jPanel2.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jLabel16))
               .addGap(18, 18, 18)
               .addGroup(gl_jPanel2.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                   .addComponent(jLabel6)
                   .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
               .addGroup(gl_jPanel2.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jButton3)
                   .addComponent(jButton9))
               .addGap(21, 21, 21)
               .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGroup(gl_jPanel2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(gl_jPanel2.createSequentialGroup()
                       .addGap(23, 23, 23)
                       .addComponent(jLabel7))
                   .addGroup(gl_jPanel2.createSequentialGroup()
                       .addGap(20, 20, 20)
                       .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGap(30, 30, 30)
               .addGroup(gl_jPanel2.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabel8)
                   .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGap(30, 30, 30)
               .addGroup(gl_jPanel2.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabel9)
                   .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGap(30, 30, 30)
               .addGroup(gl_jPanel2.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabel10)
                   .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGap(30, 30, 30)
               .addGroup(gl_jPanel2.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabel11)
                   .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
               .addGroup(gl_jPanel2.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jButton4)
                   .addComponent(jButton5))
               .addGap(43, 43, 43))
       );

       jTabbedPane1.addTab("修改用户", jPanel2);

       jButton6.setText("查找原有信息");
       jButton6.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
        	   String name = jTextField11.getText().trim();
        	   if(name.equals("")){
        		   JOptionPane.showMessageDialog(null, "请输入用户名！");
        	   }else{
        		   UserRole userRole = (UserRole)jComboBox3.getSelectedItem();
            	   UserPO userPO = adminViewController.findUser(name, userRole);
            	   if(userPO==null){
            		   JOptionPane.showMessageDialog(null, "该用户不存在，请重新输入！");
            	   }else{
            		   jTextField12.setText(userPO.getUserID());
            		   jTextField13.setText(userPO.getUserName());
            		   jTextField14.setText(userPO.getUserPassword());
            		  
            	   }
        	   }
        	  
           }
       });

       jLabel12.setText("用户类型：");

       jLabel13.setText("用户姓名：");

       jLabel14.setText("用户ID：");

       jLabel15.setText("用户密码：");

       jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new UserRole[] { UserRole.Member, UserRole.GeneralManager, UserRole.SalesManager, UserRole.Administrator }));

       jButton7.setText("确认删除");
       jButton7.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
        	     String name = jTextField13.getText().trim();
        	     UserRole userRole = (UserRole)jComboBox3.getSelectedItem();
        	     UserPO userPO = adminViewController.findUser(name, userRole);
        	   
                 ResultMessage resultMessage = adminViewController.delete(userPO, userRole);
                 if(resultMessage==ResultMessage.SUCCEED){
                	 jTextField12.setText("");
                     jTextField13.setText("");
                     jTextField14.setText("");
                	 JOptionPane.showMessageDialog(null, "删除成功！");
                 }else{
                	 JOptionPane.showMessageDialog(null, "系统异常，请重试！");
                 }
             
           }
       });

       jButton8.setText("取消删除");
       jButton8.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
             jTextField12.setText("");
             jTextField13.setText("");
             jTextField14.setText("");
           }
       });

       jButton10.setText("重新填写");
       jButton10.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
        	   jTextField11.setText("");
           }
       });

       jLabel17.setText("用户姓名：");

       javax.swing.GroupLayout gl_jPanel3 = new javax.swing.GroupLayout(jPanel3);
       jPanel3.setLayout(gl_jPanel3);
       gl_jPanel3.setHorizontalGroup(
           gl_jPanel3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(gl_jPanel3.createSequentialGroup()
               .addGap(49, 49, 49)
               .addGroup(gl_jPanel3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addComponent(jLabel14)
                   .addComponent(jLabel13)
                   .addComponent(jLabel15)
                   .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addGroup(gl_jPanel3.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                       .addComponent(jLabel17)
                       .addComponent(jLabel12)))
               .addGroup(gl_jPanel3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(gl_jPanel3.createSequentialGroup()
                       .addGap(111, 111, 111)
                       .addGroup(gl_jPanel3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                       .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gl_jPanel3.createSequentialGroup()
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                       .addGroup(gl_jPanel3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                       .addGap(79, 79, 79))))
           .addGroup(gl_jPanel3.createSequentialGroup()
               .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGap(0, 18, Short.MAX_VALUE))
       );
       gl_jPanel3.setVerticalGroup(
           gl_jPanel3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(gl_jPanel3.createSequentialGroup()
               .addContainerGap()
               .addGroup(gl_jPanel3.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jLabel17))
               .addGap(18, 18, 18)
               .addGroup(gl_jPanel3.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabel12)
                   .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
               .addGroup(gl_jPanel3.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jButton6)
                   .addComponent(jButton10))
               .addGap(14, 14, 14)
               .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGap(21, 21, 21)
               .addGroup(gl_jPanel3.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jLabel14))
               .addGap(30, 30, 30)
               .addGroup(gl_jPanel3.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jLabel13))
               .addGap(30, 30, 30)
               .addGroup(gl_jPanel3.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jLabel15))
               .addGap(35, 35, 35)
               .addGroup(gl_jPanel3.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jButton7)
                   .addComponent(jButton8))
               .addContainerGap(155, Short.MAX_VALUE))
       );

       jTabbedPane1.addTab("删除用户", jPanel3);

       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
       );
       layout.setVerticalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
       );

       pack();
       
       if(index==0){
       	  jTabbedPane1.setSelectedIndex(1);
       }else if(index==1){
          jTabbedPane1.setSelectedIndex(0);
       }else if(index==2){
    	  jTabbedPane1.setSelectedIndex(2);
       }
   }// </editor-fold>

 
   // Variables declaration - do not modify
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton10;
   private javax.swing.JButton jButton2;
   private javax.swing.JButton jButton3;
   private javax.swing.JButton jButton4;
   private javax.swing.JButton jButton5;
   private javax.swing.JButton jButton6;
   private javax.swing.JButton jButton7;
   private javax.swing.JButton jButton8;
   private javax.swing.JButton jButton9;
   private javax.swing.JComboBox jComboBox1;
   private javax.swing.JComboBox jComboBox2;
   private javax.swing.JComboBox jComboBox3;
 
   private javax.swing.JLabel jLabel10;
   private javax.swing.JLabel jLabel11;
   private javax.swing.JLabel jLabel12;
   private javax.swing.JLabel jLabel13;
   private javax.swing.JLabel jLabel14;
   private javax.swing.JLabel jLabel15;
   private javax.swing.JLabel jLabel16;
   private javax.swing.JLabel jLabel17;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JSeparator jSeparator1;
   private javax.swing.JSeparator jSeparator2;
   private javax.swing.JTabbedPane jTabbedPane1;
  
   private javax.swing.JTextField jTextField10;
   private javax.swing.JTextField jTextField11;
   private javax.swing.JTextField jTextField12;
   private javax.swing.JTextField jTextField13;
   private javax.swing.JTextField jTextField14;
   private javax.swing.JTextField jTextField2;
   private javax.swing.JTextField jTextField3;
   private javax.swing.JTextField jTextField4;
   private javax.swing.JTextField jTextField5;
   private javax.swing.JTextField jTextField6;
   private javax.swing.JTextField jTextField7;
   private javax.swing.JTextField jTextField8;
   private javax.swing.JTextField jTextField9;
   private AdminViewService adminViewController;
   private int index;
}
