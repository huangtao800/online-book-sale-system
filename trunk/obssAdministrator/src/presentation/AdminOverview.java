package presentation;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import bussinessLogicService.StartBLService;

import po.AdministratorPO;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import presentationController.Admin.AdminOverviewService;
import presentationController.start.StartController;


/**
 *
 * @author YJQ
 */
public class AdminOverview extends javax.swing.JFrame {

   
	public AdminOverview(AdminOverviewService adminOverviewController,AdministratorPO administratorPO) {
		setTitle("\u7BA1\u7406\u5458\u5BA2\u6237\u7AEF");
	       this.administratorPO = administratorPO;
		   this.adminOverviewController = adminOverviewController;
	       initComponents();
	}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new UserRole[] { UserRole.Member,UserRole.Administrator,UserRole.SalesManager,UserRole.GeneralManager}));

        jLabel3.setText("查找结果：");

        columnNames = setColumnNames();
        rowData = new Vector<Vector>();
        jTable1 = new JTable(rowData, columnNames);
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);
       
        jButton3.setText("新增用户");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
         	   
         		   adminOverviewController.initAdminView(1);
    			   
            }
        });

        jButton4.setText("修改用户");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
         	  
                 adminOverviewController.initAdminView(0);
            }
        });
        
        jButton5.setText("删除用户");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
         	   adminOverviewController.initAdminView(2);
            }
        });

        

        javax.swing.GroupLayout gl_jPanel1 = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(gl_jPanel1);
        gl_jPanel1.setHorizontalGroup(
            gl_jPanel1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_jPanel1.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator1)
            .addComponent(jScrollPane1)
            .addGroup(gl_jPanel1.createSequentialGroup()
                .addComponent(jLabel3)
                .addContainerGap())
        );
        gl_jPanel1.setVerticalGroup(
            gl_jPanel1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_jPanel1.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(gl_jPanel1.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton3)))
        );

        jLabel4.setText("管理员用户界面：");

        jLabel5.setText("用户姓名：");

        jLabel6.setText(administratorPO.getUserName());

        jButton7.setText("修改密码");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
                new changePassWordView(adminOverviewController,administratorPO).setVisible(true);
            }
        });

        jButton8.setText("修改用户名");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	String newName = JOptionPane.showInputDialog("请输入新的用户名:").trim();
				if (newName == null) {
					return;
				}
				if(newName.equals("")){
					JOptionPane.showMessageDialog(null, "名称不能为空！");
					return;
				}
				String id = administratorPO.getUserID();
				String oldName = administratorPO.getUserName();
				String password = administratorPO.getUserPassword();
				UserPO beforeUserPO = new UserPO(id, oldName, password, UserRole.Administrator);
				UserPO afterUserPO = new UserPO(id,newName,password,UserRole.Administrator);
				ResultMessage message = adminOverviewController.changeName(beforeUserPO, afterUserPO);
				if (message == ResultMessage.SUCCEED) {
					jLabel6.setText(newName);
					JOptionPane.showMessageDialog(null, "修改成功！");
					
				} else if(message==ResultMessage.EXIST){
					JOptionPane.showMessageDialog(null, "抱歉！该用户名已被使用！");
				}else{
					JOptionPane.showMessageDialog(null,"系统异常，请稍后重试！");
				}
               
            }
        });

        jButton9.setText("切换用户登录");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	adminOverviewController.changeToAnotherUser();
            	StartBLService startController=new StartController();
            	
            }
        });

        jLabel1.setText("用户名：");

        jLabel2.setText("用户类型：");

        jButton1.setText("查找用户");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               String name = jTextField1.getText().trim();
               UserRole userRole = (UserRole)jComboBox1.getSelectedItem();
               
               if(name.equals("")){
             	  JOptionPane.showMessageDialog(null, "请输入用户名！");
               }else{
             	  UserPO userPO = adminOverviewController.findUser(name, userRole);
             	  if(userPO==null){
                	      rowData = new Vector<Vector>();
                	      DefaultTableModel dtm=new DefaultTableModel(rowData, columnNames);
                       jTable1.setModel(dtm);
                       
                	      JOptionPane.showMessageDialog(null, "用户不存在，请重新查找");
                   }else{
                      rowData = new Vector<Vector>();
                      Vector<String> row = new Vector<String>();
                      row.add(userPO.getUserName());
                      row.add(userPO.getUserID());
                      row.add(userPO.getUserPassword());
                      row.add(userPO.getUserRole().toString());
                      rowData.add(row);
                      DefaultTableModel dtm=new DefaultTableModel(rowData, columnNames);
                      jTable1.setModel(dtm);
                      jTable1.setEnabled(false);
                   }
               }
              
               
            }
        });

        jButton2.setText("查看所有用户");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
         	    ArrayList<UserPO> userList = adminOverviewController.overviewUser();
         	    if(userList.size()!=0){
         	        rowData = new Vector<Vector>();
               	    for(int i = 0; i < userList.size(); i++){
               	       Vector<String> row = new Vector<String>();
                        row.add(userList.get(i).getUserName());
                        row.add(userList.get(i).getUserID());
                        row.add(userList.get(i).getUserPassword());
                        row.add(userList.get(i).getUserRole().toString());
                        rowData.add(row);
            	        }
               	
               	    DefaultTableModel dtm=new DefaultTableModel(rowData, columnNames);
                     jTable1.setModel(dtm);
                     jTable1.setEnabled(false);
                 }else{
             	   JOptionPane.showMessageDialog(null, "该系统不存在用户！");
                 }
            }
        });

        jButton6.setText("刷新用户列表");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
         	   ArrayList<UserPO> userList = adminOverviewController.overviewUser();
         	   if(userList.size()!=0){
         	        rowData = new Vector<Vector>();
               	    for(int i = 0; i < userList.size(); i++){
               	       Vector<String> row = new Vector<String>();
                        row.add(userList.get(i).getUserName());
                        row.add(userList.get(i).getUserID());
                        row.add(userList.get(i).getUserPassword());
                        row.add(userList.get(i).getUserRole().toString());
                        rowData.add(row);
            	        }
               	
               	    DefaultTableModel dtm=new DefaultTableModel(rowData, columnNames);
                     jTable1.setModel(dtm);
                     jTable1.setEnabled(false);
                }else{
             	   JOptionPane.showMessageDialog(null, "该系统不存在用户！");
                }
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel5)
                .addGap(50, 50, 50)
                .addComponent(jLabel6)
                .addGap(53, 53, 53)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>

  
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
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private Vector<String> columnNames ;
    private Vector<Vector> rowData;
    private AdminOverviewService adminOverviewController;
    private AdministratorPO administratorPO;
    // End of variables declaration
}
