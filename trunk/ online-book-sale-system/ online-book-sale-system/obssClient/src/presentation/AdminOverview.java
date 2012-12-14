package presentation;

import java.util.Vector;

import javax.swing.JTable;

import po.UserRole;

//youjiaqi
public class AdminOverview extends javax.swing.JFrame {

   public AdminOverview() {
       initComponents();
   }

   
   private void initComponents() {

       jPanel1 = new javax.swing.JPanel();
       jLabel1 = new javax.swing.JLabel();
       jLabel2 = new javax.swing.JLabel();
       jComboBox1 = new javax.swing.JComboBox();
       jTextField1 = new javax.swing.JTextField();
       jButton1 = new javax.swing.JButton();
       jButton2 = new javax.swing.JButton();
       jSeparator1 = new javax.swing.JSeparator();
       jLabel3 = new javax.swing.JLabel();
       jScrollPane1 = new javax.swing.JScrollPane();
       jTable1 = new javax.swing.JTable();
       jButton3 = new javax.swing.JButton();
       jButton4 = new javax.swing.JButton();
       jButton5 = new javax.swing.JButton();

       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

       jLabel1.setText("用户名：");

       jLabel2.setText("用户类型：");

       jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new UserRole[] { UserRole.Member,UserRole.Administrator,UserRole.SalesManager,UserRole.GeneralManager}));

       jButton1.setText("查找用户");
       jButton1.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton1ActionPerformed(evt);
           }
       });

       jButton2.setText("查看所有用户");
       jButton2.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton2ActionPerformed(evt);
           }
       });

       jLabel3.setText("查找结果：");

       columnNames = setColumnNames();
       rowData = new Vector<Vector>();
       jTable1 = new JTable(rowData, columnNames);
       jTable1.setRowHeight(30);
       jScrollPane1.setViewportView(jTable1);

       jButton3.setText("新增用户");
       jButton3.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton3ActionPerformed(evt);
           }
       });

       jButton4.setText("修改用户信息");
       jButton4.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton3ActionPerformed(evt);
           }
       });
       
       jButton5.setText("删除用户");
       jButton5.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton3ActionPerformed(evt);
           }
       });

       javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
       jPanel1.setLayout(jPanel1Layout);
       jPanel1Layout.setHorizontalGroup(
           jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(jPanel1Layout.createSequentialGroup()
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addComponent(jScrollPane1)
                   .addComponent(jSeparator1)
                   .addGroup(jPanel1Layout.createSequentialGroup()
                       .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                       .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addGap(49, 49, 49)
                       .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                   .addGroup(jPanel1Layout.createSequentialGroup()
                       .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(jPanel1Layout.createSequentialGroup()
                               .addContainerGap()
                               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                   .addGroup(jPanel1Layout.createSequentialGroup()
                                       .addComponent(jLabel1)
                                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                       .addComponent(jTextField1))
                                   .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(jPanel1Layout.createSequentialGroup()
                                       .addGap(46, 46, 46)
                                       .addComponent(jLabel2)
                                       .addGap(39, 39, 39)
                                       .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                       .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
                           .addComponent(jLabel3))
                       .addGap(0, 0, Short.MAX_VALUE)))
               .addContainerGap())
       );
       jPanel1Layout.setVerticalGroup(
           jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(jPanel1Layout.createSequentialGroup()
               .addContainerGap()
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabel1)
                   .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jLabel2))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jButton1)
                   .addComponent(jButton2))
               .addGap(18, 18, 18)
               .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
               .addComponent(jLabel3)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
               .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jButton4)
                   .addComponent(jButton5)
                   .addComponent(jButton3)))
       );

       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       );
       layout.setVerticalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       );

       pack();
   }// </editor-fold>

   
   public static void main(String args[]) {
       /* Set the Nimbus look and feel */
       //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
       /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
        * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
        */
       try {
           for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               if ("Nimbus".equals(info.getName())) {
                   javax.swing.UIManager.setLookAndFeel(info.getClassName());
                   break;
               }
           }
       } catch (ClassNotFoundException ex) {
           java.util.logging.Logger.getLogger(AdminOverview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (InstantiationException ex) {
           java.util.logging.Logger.getLogger(AdminOverview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           java.util.logging.Logger.getLogger(AdminOverview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
           java.util.logging.Logger.getLogger(AdminOverview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }
       //</editor-fold>

       /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               new AdminOverview().setVisible(true);
           }
       });
   }
   
   private Vector<String> setColumnNames(){
   	Vector<String> column = new Vector<String>();
   	column.addElement("用户姓名");
   	column.addElement("用户ID");
   	column.addElement("用户密码");
   	column.addElement("用户类别");
   	
   	return column;
   }
   
   // Variables declaration - do not modify
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JButton jButton3;
   private javax.swing.JButton jButton4;
   private javax.swing.JButton jButton5;
   private javax.swing.JComboBox jComboBox1;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JSeparator jSeparator1;
   private javax.swing.JTable jTable1;
   private javax.swing.JTextField jTextField1;
   private Vector<String> columnNames ;
   private Vector<Vector> rowData;
   // End of variables declaration
}
