package View;
//董仁广
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.omg.CORBA.PRIVATE_MEMBER;

import Promotion.PresentPO;
import Promotion.PromotionControllerInterface;
import Promotion.PromotionModelInterface;
import Promotion.PromotionPO;
import Promotion.VIPRank;


public class PromotionView extends JFrame implements ActionListener{
	   private static final int line=10;//checkEqualityTable,setEqualityTable界面上默认有十行关于等价券的信息
	   private static final int line2=10;//presentTable
	   private static final int column=2;//第一列表示等价券额度，第二列表示等价券的最低消费
	   private static final int column2=3;//第三列为等价券有效截止日期
	   private PromotionModelInterface proModel;//模型
	    private PromotionControllerInterface proController ;//控制器
	    
	//	DecimalFormat decimalFormat=new DecimalFormat("####.00");
	    
        private JTable checkEqualityTable;
	    private DefaultTableModel tableModel;
	    
	    private javax.swing.JTextField checkExchangeRateTextField;
	    private javax.swing.JTextField checkRateOfCouponTextField;
	    private javax.swing.JButton checkUpdateButton;
	    private javax.swing.JTextField endTimeOfCouponTextField;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel10;
	    private javax.swing.JLabel jLabel11;
	    private javax.swing.JLabel jLabel12;
	    private javax.swing.JLabel jLabel13;
	    private javax.swing.JLabel jLabel14;
	    private javax.swing.JLabel jLabel15;
	    private javax.swing.JLabel jLabel16;
	    private javax.swing.JLabel jLabel17;
	    private javax.swing.JLabel jLabel18;
	    private javax.swing.JLabel jLabel19;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel20;
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
	    private javax.swing.JPanel jPanel4;
	    private javax.swing.JPopupMenu jPopupMenu1;
	    private javax.swing.JPopupMenu jPopupMenu2;
	    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JScrollPane jScrollPane2;
	    private javax.swing.JScrollPane jScrollPane3;
	    private javax.swing.JSeparator jSeparator1;
	    private javax.swing.JSeparator jSeparator2;
	    private javax.swing.JSeparator jSeparator3;
	    private javax.swing.JTabbedPane jTabbedPane1;
	    private javax.swing.JTextField numOfCouponTextField;
	    private javax.swing.JButton presentNoButton;
	    private javax.swing.JTable presentTable;
	    private javax.swing.JButton presentYesButton;
	    private javax.swing.JTable setEqualityTable;
	    private javax.swing.JTextField setExchangeRateTextField;
	    private javax.swing.JButton setNoButton;
	    private javax.swing.JTextField setRateOfCouponTextField;
	    private javax.swing.JButton setYesButton;
	    private javax.swing.JCheckBox vip1CheckBox;
	    private javax.swing.JCheckBox vip2CheckBox;
	    private javax.swing.JCheckBox vip3CheckBox;
	    private javax.swing.JCheckBox vip4CheckBox;
	    private javax.swing.JCheckBox vip5CheckBox;
	    // End of variables declaration
	 
	    
	    public PromotionView(PromotionControllerInterface proContr,PromotionModelInterface proMod ){
	    	this.proModel=proMod;
	    	this.proController=proContr;
	       // proModel.registerObserver(this);	
	    }
	    
	    public void createProView(){
	    	
	    	 jLabel6 = new javax.swing.JLabel();
	         jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
	         jPopupMenu1 = new javax.swing.JPopupMenu();
	         jPopupMenu2 = new javax.swing.JPopupMenu();
	         jLabel13 = new javax.swing.JLabel();
	         jTabbedPane1 = new javax.swing.JTabbedPane();
	         jPanel1 = new javax.swing.JPanel();
	         jLabel19 = new javax.swing.JLabel();
	         jLabel20 = new javax.swing.JLabel();
	         jPanel2 = new javax.swing.JPanel();
	         jLabel1 = new javax.swing.JLabel();
	         jLabel2 = new javax.swing.JLabel();
	         jLabel3 = new javax.swing.JLabel();
	         checkExchangeRateTextField = new javax.swing.JTextField();
	         checkRateOfCouponTextField = new javax.swing.JTextField();
	         jLabel4 = new javax.swing.JLabel();
	         jScrollPane1 = new javax.swing.JScrollPane();
	       
	         jLabel5 = new javax.swing.JLabel();
	         checkUpdateButton = new javax.swing.JButton();
	         jPanel3 = new javax.swing.JPanel();
	         jLabel7 = new javax.swing.JLabel();
	         setExchangeRateTextField = new javax.swing.JTextField();
	         jLabel8 = new javax.swing.JLabel();
	         jLabel9 = new javax.swing.JLabel();
	         jLabel10 = new javax.swing.JLabel();
	         setRateOfCouponTextField = new javax.swing.JTextField();
	         jLabel11 = new javax.swing.JLabel();
	         jScrollPane2 = new javax.swing.JScrollPane();
	         setEqualityTable = new javax.swing.JTable();
	         setYesButton = new javax.swing.JButton();
	         setNoButton = new javax.swing.JButton();
	         jPanel4 = new javax.swing.JPanel();
	         vip1CheckBox = new javax.swing.JCheckBox();
	         vip2CheckBox = new javax.swing.JCheckBox();
	         vip3CheckBox = new javax.swing.JCheckBox();
	         vip4CheckBox = new javax.swing.JCheckBox();
	         vip5CheckBox = new javax.swing.JCheckBox();
	         jLabel12 = new javax.swing.JLabel();
	         jLabel15 = new javax.swing.JLabel();
	         jLabel16 = new javax.swing.JLabel();
	         numOfCouponTextField = new javax.swing.JTextField();
	         jScrollPane3 = new javax.swing.JScrollPane();
	         presentTable = new javax.swing.JTable();
	         jLabel17 = new javax.swing.JLabel();
	         endTimeOfCouponTextField = new javax.swing.JTextField();
	         jSeparator1 = new javax.swing.JSeparator();
	         jSeparator2 = new javax.swing.JSeparator();
	         jLabel18 = new javax.swing.JLabel();
	         presentYesButton = new javax.swing.JButton();
	         presentNoButton = new javax.swing.JButton();
	         jSeparator3 = new javax.swing.JSeparator();
	         jLabel14 = new javax.swing.JLabel();
	    
	         
	         String [] columnNames={"等价券额度/元","最低消费/元"};
	         String [][] tableValue=new String[line][column];
	         tableModel=new DefaultTableModel(tableValue,columnNames); 
	         checkEqualityTable = new JTable(tableModel);
	         
	         
	         //监听
	         checkUpdateButton.addActionListener(this);
	          setYesButton.addActionListener(this);
	          setNoButton.addActionListener(this);
	          presentNoButton.addActionListener(this);
	          presentYesButton.addActionListener(this);

	         jLabel6.setText("jLabel6");

	         jRadioButtonMenuItem1.setSelected(true);
	         jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

	         jLabel13.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
	         jLabel13.setText("等价券赠送");

	         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	         jLabel19.setFont(new java.awt.Font("幼圆", 2, 14)); // NOI18N
	         jLabel19.setText("欢迎进入网上图书销售系统的总经理操作界面");

	         jLabel20.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
	         jLabel20.setText("您可以查看、修改促销手段，为您的顾客赠送礼券");

	         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	         jPanel1.setLayout(jPanel1Layout);
	         jPanel1Layout.setHorizontalGroup(
	             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	             .addGroup(jPanel1Layout.createSequentialGroup()
	                 .addGap(23, 23, 23)
	                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                     .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                     .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                 .addContainerGap(328, Short.MAX_VALUE))
	         );
	         jPanel1Layout.setVerticalGroup(
	             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	             .addGroup(jPanel1Layout.createSequentialGroup()
	                 .addGap(31, 31, 31)
	                 .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
	                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                 .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
	                 .addContainerGap(303, Short.MAX_VALUE))
	         );

	         jTabbedPane1.addTab("          首页        ", jPanel1);

	         jLabel1.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
	         jLabel1.setText("消费额与积分的兑换比例：");

	         jLabel2.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
	         jLabel2.setText("等价券的额度和使用比例:");

	         jLabel3.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
	         jLabel3.setText("打折券的打折率：");

	         checkExchangeRateTextField.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
	        

	         checkRateOfCouponTextField.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N

	         jLabel4.setFont(new java.awt.Font("宋体", 3, 24)); // NOI18N
	         jLabel4.setText("%");

	      //   DefaultTableModel checkTableModel
//	         String [][] tableValue=new String[line][column];
//	         String [] columnNames=new String[column];
//	         checkEqualityTable=
//	         checkEqualityTable.setModel(tableModel =new DefaultTableModel(
//	        		 tableValue,
////	             new String [][] {
////	                 {null, null},
////	                 {null, null},
////	                 {null, null},
////	                 {null, null},
////	                 {null, null},
////	                 {null, null},
////	                 {null, null},
////	                 {null, null},
////	                 {null, null},
////	                 {null, null}
////	             },
////	             new String [] {
////	                 "等价券额度//元", "最低消费/元"
////	             }
//	        		 columnNames
//	         ) {
//	             Class[] types = new Class [] {
//	                 java.lang.Double.class, java.lang.Double.class
//	             };
//
//	             public Class getColumnClass(int columnIndex) {
//	                 return types [columnIndex];
//	             }
//	         });
	         jScrollPane1.setViewportView(checkEqualityTable);

	         jLabel5.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
	         jLabel5.setText("（如：0.8表示八折）");

	         checkUpdateButton.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
	         checkUpdateButton.setText("更新");

	         javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	         jPanel2.setLayout(jPanel2Layout);
	         jPanel2Layout.setHorizontalGroup(
	             jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
	                 .addGap(0, 26, Short.MAX_VALUE)
	                 .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                     .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
	                     .addComponent(jLabel3))
	                 .addGap(18, 18, 18)
	                 .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                     .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
	                     .addGroup(jPanel2Layout.createSequentialGroup()
	                         .addComponent(checkRateOfCouponTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
	                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                         .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                 .addGap(131, 131, 131))
	             .addGroup(jPanel2Layout.createSequentialGroup()
	                 .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                     .addGroup(jPanel2Layout.createSequentialGroup()
	                         .addGap(24, 24, 24)
	                         .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
	                         .addGap(18, 18, 18)
	                         .addComponent(checkExchangeRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
	                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                         .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
	                     .addGroup(jPanel2Layout.createSequentialGroup()
	                         .addGap(264, 264, 264)
	                         .addComponent(checkUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                 .addContainerGap())
	         );
	         jPanel2Layout.setVerticalGroup(
	             jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	             .addGroup(jPanel2Layout.createSequentialGroup()
	                 .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                     .addGroup(jPanel2Layout.createSequentialGroup()
	                         .addGap(22, 22, 22)
	                         .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                             .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                             .addComponent(checkExchangeRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                     .addGroup(jPanel2Layout.createSequentialGroup()
	                         .addGap(28, 28, 28)
	                         .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                 .addGap(35, 35, 35)
	                 .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                     .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
	                     .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
	                 .addGap(50, 50, 50)
	                 .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                     .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
	                     .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                         .addComponent(checkRateOfCouponTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
	                         .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                 .addGap(39, 39, 39)
	                 .addComponent(checkUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                 .addContainerGap(36, Short.MAX_VALUE))
	         );

	         jTabbedPane1.addTab("        查看促销手段         ", jPanel2);

	         jLabel7.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
	         jLabel7.setText("消费额与积分的兑换比例：");

	         setExchangeRateTextField.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N

	         jLabel8.setFont(new java.awt.Font("宋体", 3, 24)); // NOI18N
	         jLabel8.setText("%");

	         jLabel9.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
	         jLabel9.setText("等价券的额度和使用比例:");

	         jLabel10.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
	         jLabel10.setText("打折券的打折率：");

	         setRateOfCouponTextField.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N

	         jLabel11.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
	         jLabel11.setText("（如：0.8表示八折）");

	         setEqualityTable.setModel(new javax.swing.table.DefaultTableModel(
	             new Object [][] {
	                 {null, null},
	                 {null, null},
	                 {null, null},
	                 {null, null},
	                 {null, null},
	                 {null, null},
	                 {null, null},
	                 {null, null},
	                 {null, null},
	                 {null, null}
	             },
	             new String [] {
	                 "等价券额度/元", "最低消费/元"
	             }
	         ) {
	             Class[] types = new Class [] {
	                 java.lang.Double.class, java.lang.Double.class
	             };

	             public Class getColumnClass(int columnIndex) {
	                 return types [columnIndex];
	             }
	         });
	         jScrollPane2.setViewportView(setEqualityTable);

	         setYesButton.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
	         setYesButton.setText("确定");

	         setNoButton.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
	         setNoButton.setText("取消");

	         javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
	         jPanel3.setLayout(jPanel3Layout);
	         jPanel3Layout.setHorizontalGroup(
	             jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	             .addGroup(jPanel3Layout.createSequentialGroup()
	                 .addContainerGap()
	                 .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
	                         .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
	                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                         .addComponent(setExchangeRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
	                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                         .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                         .addGap(306, 306, 306))
	                     .addGroup(jPanel3Layout.createSequentialGroup()
	                         .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                             .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
	                             .addComponent(jLabel10))
	                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                         .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                             .addGroup(jPanel3Layout.createSequentialGroup()
	                                 .addComponent(setRateOfCouponTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                 .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
	                             .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
	                         .addGap(0, 0, Short.MAX_VALUE))))
	             .addGroup(jPanel3Layout.createSequentialGroup()
	                 .addGap(167, 167, 167)
	                 .addComponent(setYesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
	                 .addGap(84, 84, 84)
	                 .addComponent(setNoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
	                 .addGap(0, 0, Short.MAX_VALUE))
	         );
	         jPanel3Layout.setVerticalGroup(
	             jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	             .addGroup(jPanel3Layout.createSequentialGroup()
	                 .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                     .addGroup(jPanel3Layout.createSequentialGroup()
	                         .addGap(24, 24, 24)
	                         .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                             .addComponent(setExchangeRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
	                             .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                     .addGroup(jPanel3Layout.createSequentialGroup()
	                         .addGap(28, 28, 28)
	                         .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                 .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                     .addGroup(jPanel3Layout.createSequentialGroup()
	                         .addGap(81, 81, 81)
	                         .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
	                     .addGroup(jPanel3Layout.createSequentialGroup()
	                         .addGap(66, 66, 66)
	                         .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                 .addGap(37, 37, 37)
	                 .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                     .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
	                     .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                         .addComponent(setRateOfCouponTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
	                         .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
	                 .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                     .addComponent(setYesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
	                     .addComponent(setNoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
	                 .addGap(35, 35, 35))
	         );

	         jTabbedPane1.addTab("       设置促销手段      ", jPanel3);

	         vip1CheckBox.setText("VIP1");

	         vip2CheckBox.setText("VIP2");
	        
	         vip3CheckBox.setText("VIP3");

	         vip4CheckBox.setText("VIP4");

	         vip5CheckBox.setText("VIP5");

	         jLabel12.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
	         jLabel12.setText("选择会员等级");

	         jLabel15.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
	         jLabel15.setText("打折券赠送");

	         jLabel16.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
	         jLabel16.setText("张");

	         presentTable.setModel(new javax.swing.table.DefaultTableModel(
	             new Object [][] {
	                 {null, null, null},
	                 {null, null, null},
	                 {null, null, null},
	                 {null, null, null},
	                 {null, null, null},
	                 {null, null, null},
	                 {null, null, null},
	                 {null, null, null},
	                 {null, null, null},
	                 {null, null, null}
	             },
	             new String [] {
	                 "等价券额度/元", "赠送数量/张", "截止日期（年/月/日）"
	             }
	         ) {
	             Class[] types = new Class [] {
	                 java.lang.Double.class, java.lang.Short.class, java.lang.Object.class
	             };

	             public Class getColumnClass(int columnIndex) {
	                 return types [columnIndex];
	             }
	         });
	         jScrollPane3.setViewportView(presentTable);

	         jLabel17.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
	         jLabel17.setText("有效截止日期：");

	         jLabel18.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
	         jLabel18.setForeground(new java.awt.Color(255, 0, 102));
	         jLabel18.setText("注：日期格式为YYYY/MM/DD，如：2013/01/20");

	         presentYesButton.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
	         presentYesButton.setText("确定赠送");
	       
	         presentNoButton.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
	         presentNoButton.setText(" 取消 ");

	         jLabel14.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
	         jLabel14.setText("等价券赠送");

	         javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
	         jPanel4.setLayout(jPanel4Layout);
	         jPanel4Layout.setHorizontalGroup(
	             jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	             .addGroup(jPanel4Layout.createSequentialGroup()
	                 .addContainerGap()
	                 .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                     .addGroup(jPanel4Layout.createSequentialGroup()
	                         .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
	                         .addGap(50, 50, 50)
	                         .addComponent(numOfCouponTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
	                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                         .addComponent(jLabel16)
	                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                         .addComponent(jLabel17)
	                         .addGap(18, 18, 18)
	                         .addComponent(endTimeOfCouponTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
	                         .addGap(106, 106, 106))
	                     .addGroup(jPanel4Layout.createSequentialGroup()
	                         .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                             .addComponent(jSeparator3)
	                             .addComponent(jSeparator1)
	                             .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
	                             .addGroup(jPanel4Layout.createSequentialGroup()
	                                 .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                     .addGroup(jPanel4Layout.createSequentialGroup()
	                                         .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                         .addGap(18, 18, 18)
	                                         .addComponent(vip1CheckBox)
	                                         .addGap(18, 18, 18)
	                                         .addComponent(vip2CheckBox)
	                                         .addGap(18, 18, 18)
	                                         .addComponent(vip3CheckBox)
	                                         .addGap(18, 18, 18)
	                                         .addComponent(vip4CheckBox)
	                                         .addGap(18, 18, 18)
	                                         .addComponent(vip5CheckBox))
	                                     .addGroup(jPanel4Layout.createSequentialGroup()
	                                         .addGap(168, 168, 168)
	                                         .addComponent(presentYesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                         .addGap(75, 75, 75)
	                                         .addComponent(presentNoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                     .addGroup(jPanel4Layout.createSequentialGroup()
	                                         .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                         .addGap(39, 39, 39)
	                                         .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                                 .addGap(0, 75, Short.MAX_VALUE)))
	                         .addContainerGap())
	                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
	                         .addGap(0, 0, Short.MAX_VALUE)
	                         .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
	                         .addGap(20, 20, 20))))
	         );
	         jPanel4Layout.setVerticalGroup(
	             jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	             .addGroup(jPanel4Layout.createSequentialGroup()
	                 .addContainerGap()
	                 .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                     .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                     .addComponent(vip1CheckBox)
	                     .addComponent(vip2CheckBox)
	                     .addComponent(vip3CheckBox)
	                     .addComponent(vip4CheckBox)
	                     .addComponent(vip5CheckBox))
	                 .addGap(14, 14, 14)
	                 .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
	                 .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                     .addGroup(jPanel4Layout.createSequentialGroup()
	                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                         .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
	                         .addGap(20, 20, 20))
	                     .addGroup(jPanel4Layout.createSequentialGroup()
	                         .addGap(26, 26, 26)
	                         .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
	                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	                 .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
	                 .addGap(18, 18, 18)
	                 .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                     .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                         .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
	                         .addComponent(numOfCouponTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
	                         .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
	                     .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                         .addComponent(endTimeOfCouponTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
	                         .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                 .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
	                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                 .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
	                 .addGap(18, 18, 18)
	                 .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                     .addComponent(presentYesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
	                     .addComponent(presentNoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
	                 .addGap(280, 280, 280))
	         );

	         jTabbedPane1.addTab("        大范围促销        ", jPanel4);

	         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	         getContentPane().setLayout(layout);
	         layout.setHorizontalGroup(
	             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	             .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
	         );
	         layout.setVerticalGroup(
	             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	             .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
	         );
	       //numOfCouponTextField endTimeOfCouponTextField  有用
	         numOfCouponTextField.setText("");
	         endTimeOfCouponTextField.setText("");
	         
	         pack();
	        this.setVisible(true);
	    }// </editor-fold>
	    

	
//事件响应
	public void actionPerformed(ActionEvent event){
		
//查看促销手段
		if(event.getSource()==checkUpdateButton){
			promotionShow_setClear();
			promotionShow_check();
		}
		
//确认设置促销手段
		else if(event.getSource()==setYesButton){
			//把设置的促销手段存入数据层
			if(setEqualityTable.isEditing()){				
				setEqualityTable.getCellEditor().stopCellEditing();
			}
			
			proPO=new PromotionPO();
			if(stringToDoubel(setExchangeRateTextField.getText()) && 
				stringToDoubel(setRateOfCouponTextField.getText()) && 
				stringToDouble_List()  	)
			{
			      double exchangeRate=Double.parseDouble((String)setExchangeRateTextField.getText());
			      double rateOfCoupon=Double.parseDouble((String)setRateOfCouponTextField.getText());
			     
			      if(  exchangeRate>=0.000001 &&//大于零
			            rateOfCoupon>=0.000001 &&
			    		exchangeRate<100.0  &&
			    		rateOfCoupon<1.0){
			      proPO.setExchangeOfScore(exchangeRate);
			      proPO.setDiscount(rateOfCoupon);
			      
			      for(int i=0;i<line;i++){
			    	  if((   setEqualityTable.getValueAt(i, 0)!=null ) &&//不为空
			    		(Double.parseDouble(setEqualityTable.getValueAt(i, 0).toString().trim())- 0.0)>0.000001)//且值大于零
			    		  /*
			    		   * Double.parseDouble(***.toString().trim())把从表格中取得的Object对象转化成String；
			    		   * 而不能用(String)***强制类型转换
			    		   * 尼玛！！！！
			    		   * */
			    	  {
			    		  proPO.setEquivalent(i, 0, Double.parseDouble(setEqualityTable.getValueAt(i, 0).toString().trim()) );
			    		  proPO.setEquivalent(i, 1,Double.parseDouble(setEqualityTable.getValueAt(i, 1).toString().trim()) );
			    	  }else {
			    		  proPO.setEquivalent(i,  0,  0.0);
			    		  proPO.setEquivalent(i,  1,  0.0);
			    	  }  
			      }//for
			      proController.setPromotion_YES(proPO);
				  JOptionPane.showMessageDialog(null,"促销手段设置成功！");
			      }
			      else   JOptionPane.showMessageDialog(null,"您输入的数据有误！请重新输入！");
			}//if
			else{
				  JOptionPane.showMessageDialog(null,"您输入的数据有误！请重新输入！");
			}	
		}
		
//取消设置促销手段
		else if(event.getSource()==setNoButton){
			promotionShow_setClear();
		}
		
//确认礼券赠送设置
		else if(event.getSource()==presentYesButton){
			////把设置的礼券赠送规则存入数据层
			if(presentTable.isEditing()){
				presentTable.getCellEditor().stopCellEditing();
			}
			
			if(!vip1CheckBox.isSelected() && !vip2CheckBox.isSelected() && !vip3CheckBox.isSelected() 
					&&!vip4CheckBox.isSelected() &&!vip5CheckBox.isSelected()){
				JOptionPane.showMessageDialog(null, "请首先选择会员等级！");
			}
			else if(numOfCouponTextField.getText().equals("") && endTimeOfCouponTextField.getText().equals("") && isEmpty_presentTable()){
				JOptionPane.showMessageDialog(null, "礼券信息不能全为空！");
			}
			else if( (
					   ( stringToDoubel(numOfCouponTextField.getText())  &&  stringToCalendar(endTimeOfCouponTextField.getText()) ) || 
					        (numOfCouponTextField.getText().equals("") && endTimeOfCouponTextField.getText().equals(""))
					      )
					        && stringTo_Dou_Int_Cal() )////?数据标准性检查
			{          
				           if(equivalentExist()){//设置的等价券都存在
				                          if(vip1CheckBox.isSelected())
				                        	  presentInformationGet(VIPRank.VIP1);
				                          if(vip2CheckBox.isSelected())
				                        	  presentInformationGet(VIPRank.VIP2);
				                          if(vip3CheckBox.isSelected())
				                        	  presentInformationGet(VIPRank.VIP3);
				                          if(vip4CheckBox.isSelected())
				                        	  presentInformationGet(VIPRank.VIP4);
				                          if(vip5CheckBox.isSelected())
				                        	  presentInformationGet(VIPRank.VIP5);
				                          
				                          JOptionPane.showMessageDialog(null,"礼券赠送成功");
				                         
			                }
				           else {
				        	   JOptionPane.showMessageDialog(null, "您设置的某些等价券不存在,请先查看促销手段后再设置!");		
				           }
			}else{                                                                                                 //数据标准性检查
				JOptionPane.showMessageDialog(null, "您输入的数据有误，请确认！");
			}
		
//			if(vip1CheckBox.isSelected()){

//			JOptionPane.showMessageDialog
//			(null,"礼券赠送规则设置成功！\n系统已通知销售经理按照您的设置进行礼券赠送");
//			presentShow_clear();
		}
		
//取消礼券赠送设置
		else if(event.getSource()==presentNoButton){
			presentShow_clear();
		}
		
	}//actionPerformed

 //其他方法
	PromotionPO proPO;
	double [][] equivalentList;
	
//从数据层获取promotionPO对象
	public void getPromotionPO(){
		 proPO=proController.getProPO();
	}
	
//查看促销手段界面
	public void promotionShow_check(){
		 getPromotionPO();
		
		 checkExchangeRateTextField.setText(""+proPO.getExchangeOfScore());
		 checkRateOfCouponTextField.setText(""+proPO.getDiscount());
		 equivalentList=proPO.getEquivalentList();                                                 
		 for(int i=0;i<line;i++){
				 if(   (Math.abs(equivalentList[i][0]-0.0))>0.000001){//等价券的额度不等于0

					 tableModel.setValueAt(equivalentList[i][0], i, 0);
					 tableModel.setValueAt(equivalentList[i][1], i, 1);
				 } 
				 else{
					 checkEqualityTable.setValueAt(null, i,0);
					 checkEqualityTable.setValueAt(null, i,1);
				 }
		 }//for 	
	}
	
//取消设置促销手段后，界面清空
	public void promotionShow_setClear(){
		setExchangeRateTextField.setText("");
		setRateOfCouponTextField.setText("");
		
		if(setEqualityTable.isEditing()){				//很重要，使table退出可编辑状态
			setEqualityTable.getCellEditor().stopCellEditing();
		}
		
		 for(int i=0;i<line;i++){
			 for(int j=0;j<column;j++){
				 setEqualityTable.setValueAt(null, i,j); 
			 }
		 } //for 			
	 }
	
	
//取消礼券赠送设置后，界面内容清空
	public void presentShow_clear(){
		vip1CheckBox.setSelected(false);
		vip2CheckBox.setSelected(false);
		vip3CheckBox.setSelected(false);
		vip4CheckBox.setSelected(false);
		vip5CheckBox.setSelected(false);
		numOfCouponTextField.setText("");
		endTimeOfCouponTextField.setText("");
		
		if(presentTable.isEditing()){				//很重要，使table退出可编辑状态
			presentTable.getCellEditor().stopCellEditing();
		}
		
		for(int i=0;i<line2;i++){
			for(int j=0;j<column2;j++){
			   presentTable.setValueAt(null, i, j);
			}
		}//for
	}
	
//判断string是否可以转换成double型
	public boolean stringToDoubel(String s){
		double d;
		try{
		   d=Double.parseDouble(s);
		   return true;
		}catch(Exception e){
			return false;
		}
	}
	
//判断string是否可以转换成Calendar类型
	public boolean stringToCalendar(String s){
		SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd");
		try{
			Date date=format.parse(s);
			return true;	
		}catch(Exception e){
			return false;
		}	
	}
	
//判断界面上表格setEqualityTable中数据是否可以转化成double型,且大于零
	public boolean stringToDouble_List(){
	    double d1,d2;
	    boolean boo=false;//判断表格是否为空
	    try {
			for(int i=0;i<line;i++){
				if(setEqualityTable.getValueAt(i, 0)==null && setEqualityTable.getValueAt(i, 1)==null)
					continue;//如果一行数据中，两个数都为空，则这一行数据无效
				else{
				d1=Double.parseDouble(setEqualityTable.getValueAt(i, 0).toString().trim());
				d2=Double.parseDouble(setEqualityTable.getValueAt(i, 1).toString().trim() );
				boo=true;
				if(d1<0.000001 || d2<0.000001)//且数据大于零
					return false;
			    }	
			}//for
			if(boo)
	    	    return true;
			else 
				return false;
		} catch (Exception e) {
			return false;
		}
	}
	
//判断表格presentTable中数据是否符合标准；表格可以为空
	public boolean stringTo_Dou_Int_Cal(){
		double d;
		int in;
        //boolean boo=false;//判断表格是否为空
		Date date;
		SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd");
		
		try{
		       for(int i=0;i<line2;i++){
				     if( (presentTable.getValueAt(i, 0) == null) && presentTable.getValueAt(i, 1)==null && presentTable.getValueAt(i, 2)==null )
					         continue;
				     else{
				     //boo=true;
			         d=Double.parseDouble(  presentTable.getValueAt(i, 0).toString().trim() );
				     in=Integer.parseInt( presentTable.getValueAt(i, 1).toString().trim() );
			       	date=format.parse( presentTable.getValueAt(i, 2).toString().trim() );
			       	if(d<0.00001 || in<=0)
			       		return false;	
		            }
			}//for
//		       if(boo)
//		              return true;
//		       else
//		    	      return false;
		       return true;
		}catch(Exception e){
			return false;	
		}
	}
	
//判断礼券赠送界面中的PresentTable（等价券）是否为空
	public boolean isEmpty_presentTable(){
		for(int i=0;i<line2;i++){
			for(int j=0;j<3;j++){
			       if(presentTable.getValueAt(i, j) !=null)
				          return false;
			}
		}
		return true;
	}
	
	
//判断大范围促销设置中，所赠送的等价券（面额）是否存在;  presentTable表格可以为空
	public boolean equivalentExist(){
		PromotionPO promotionPO=proController.getProPO();
		double [][] equivalent=promotionPO.getEquivalentList();//数组是按引用传递的
     	boolean boo;
		for(int i=0;i<line2;i++){
          boo=false;
          
			if(presentTable.getValueAt(i, 0)==null)
				continue;
			else{
			             for(int j=0;j<line;j++){
				                 if(  Math.abs( Double.parseDouble(presentTable.getValueAt(i, 0).toString().trim() ) -  equivalent[j][0] )<=0.000001   ){//find
                    	                boo=true;
					                    break;     
				                 }
			              }//for(j)	
             			 if(!boo)
             				   return false;		
			}//else
		}//for (i)
		return true;
	}
	
	   PresentPO presentPO;
	   String [][]  present_equivalent;
//大范围促销，从界面读取礼券赠送设置信息
	public void presentInformationGet(VIPRank vipX){
		presentPO=new PresentPO();
		present_equivalent=presentPO.getEquivalent();
		PromotionPO promotionPO=proController.getProPO();
		double [][] equivalent=promotionPO.getEquivalentList();//数组是按引用传递的
		
		presentPO.setVipLevel(vipX);
		
		if(   !numOfCouponTextField.getText().equals("") && !endTimeOfCouponTextField.equals("")){
		           presentPO.setAmountOfCoupon(Integer.parseInt(numOfCouponTextField.getText() ) );
		           presentPO.setEndDateOfCoupon(endTimeOfCouponTextField.getText());
		           presentPO.setDiscount(promotionPO.getDiscount());
		}else{
			 presentPO.setAmountOfCoupon(0);
			 presentPO.setEndDateOfCoupon(null);
			 presentPO.setDiscount(0.0);
		}
		
		for(int i=0;i<line2;i++){
			if(presentTable.getValueAt(i, 0)== null)
				continue;
			else{
				for(int j=0;j<line;j++){
					 if(( Double.parseDouble(presentTable.getValueAt(i, 0).toString().trim() ) -  equivalent[j][0] )<=0.000001   ){//find
						 present_equivalent[i][0]=presentTable.getValueAt(i, 0).toString().trim();
						 present_equivalent[i][1]=presentTable.getValueAt(i, 1).toString().trim();
						 present_equivalent[i][2]=presentTable.getValueAt(i, 2).toString().trim();
						 present_equivalent[i][3]=""+equivalent[j][1];					 
						 
						 break;
				      }//if
				
			    }//for(j)
		   }//else	
	}//for(i)
		proController.present_YES(presentPO);  //promotionPO消亡了？
}
//
	
	
}//大boss