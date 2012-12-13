package presentation;
//董仁广
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import festival.News;

import po.GeneralManagerPO;
import po.PresentPO;
import po.PromotionPO;
import po.UserRole;
import po.VIPRank;
import presentationController.PromotionView.PromotionViewController;
import presentationController.PromotionView.PromotionViewControllerInterface;


@SuppressWarnings("serial")
public class PromotionView extends JFrame implements ActionListener{
	   private static final int line=10;//checkEqualityTable,setEqualityTable界面上默认有十行关于等价券的信息
	   private static final int line2=10;//presentTable
	   private static final int column=2;//第一列表示等价券额度，第二列表示等价券的最低消费
	   private static final int column2=3;//第三列为等价券有效截止日期
	   
	    private PromotionViewControllerInterface proController ;//控制器
	    private DefaultTableModel tableModel;  
//        private JTable checkEqualityTable;  
        
        
        private javax.swing.JButton changeUserNameButton;
        private javax.swing.JButton changeUserPasswordButton;
        private javax.swing.JTable checkEqualityTable;
        private javax.swing.JTextField checkExchangeRateTextField;
        private javax.swing.JButton checkPresentButton;
        private javax.swing.JTextArea checkPresentTextArea;
        private javax.swing.JTextField checkRateOfCouponTextField;
        private javax.swing.JButton checkUpdateButton;
        private javax.swing.JButton confirmChangePasswordButton;
        private javax.swing.JButton confirmChangeUserNameButton;
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
        private javax.swing.JLabel jLabel21;
        private javax.swing.JLabel jLabel22;
        private javax.swing.JLabel jLabel23;
        private javax.swing.JLabel jLabel24;
        private javax.swing.JLabel jLabel25;
        private javax.swing.JLabel jLabel26;
        private javax.swing.JLabel jLabel27;
        private javax.swing.JLabel jLabel29;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel30;
        private javax.swing.JLabel jLabel31;
        private javax.swing.JLabel jLabel32;
        private javax.swing.JLabel jLabel33;
        private javax.swing.JLabel jLabel34;
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
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JPopupMenu jPopupMenu1;
        private javax.swing.JPopupMenu jPopupMenu2;
        private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JScrollPane jScrollPane4;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JSeparator jSeparator2;
        private javax.swing.JSeparator jSeparator3;
        private javax.swing.JSeparator jSeparator4;
        private javax.swing.JTabbedPane jTabbedPane1;
        private javax.swing.JTextField newPWAgainTextField;
        private javax.swing.JTextField newPWTextField;
        private javax.swing.JTextField newUserNameTextField;
        private javax.swing.JTextField numOfCouponTextField;
        private javax.swing.JTextField originalPWTextField;
        private javax.swing.JTextField originalUserNameTextField;
        private javax.swing.JButton presentNoButton;
        private javax.swing.JTable presentTable;
        private javax.swing.JButton presentYesButton;
        private javax.swing.JTable setEqualityTable;
        private javax.swing.JTextField setExchangeRateTextField;
        private javax.swing.JButton setNoButton;
        private javax.swing.JTextField setRateOfCouponTextField;
        private javax.swing.JButton setYesButton;
        private javax.swing.JTextField userIDTextField;
        private javax.swing.JCheckBox vip1CheckBox;
        private javax.swing.JCheckBox vip2CheckBox;
        private javax.swing.JCheckBox vip3CheckBox;
        private javax.swing.JCheckBox vip4CheckBox;
        private javax.swing.JCheckBox vip5CheckBox;
	    // End of variables declaration
	 
	    
	    public PromotionView(PromotionViewControllerInterface proContr ){
	    	super("总经理操作界面");
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
	        jLabel27 = new javax.swing.JLabel();
	        jLabel29 = new javax.swing.JLabel();
	        jLabel30 = new javax.swing.JLabel();
	        jLabel31 = new javax.swing.JLabel();
	        jLabel32 = new javax.swing.JLabel();
	        jLabel33 = new javax.swing.JLabel();
	        jLabel34 = new javax.swing.JLabel();
	        jPanel2 = new javax.swing.JPanel();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        checkExchangeRateTextField = new javax.swing.JTextField();
	        checkRateOfCouponTextField = new javax.swing.JTextField();
	        jLabel4 = new javax.swing.JLabel();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        checkEqualityTable = new javax.swing.JTable();
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
	        jPanel5 = new javax.swing.JPanel();
	        checkPresentButton = new javax.swing.JButton();
	        jScrollPane4 = new javax.swing.JScrollPane();
	        checkPresentTextArea = new javax.swing.JTextArea();
	        jPanel6 = new javax.swing.JPanel();
	        changeUserNameButton = new javax.swing.JButton();
	        confirmChangeUserNameButton = new javax.swing.JButton();
	        jLabel21 = new javax.swing.JLabel();
	        jLabel22 = new javax.swing.JLabel();
	        originalUserNameTextField = new javax.swing.JTextField();
	        newUserNameTextField = new javax.swing.JTextField();
	        changeUserPasswordButton = new javax.swing.JButton();
	        confirmChangePasswordButton = new javax.swing.JButton();
	        jLabel23 = new javax.swing.JLabel();
	        jLabel24 = new javax.swing.JLabel();
	        jLabel25 = new javax.swing.JLabel();
	        originalPWTextField = new javax.swing.JTextField();
	        newPWTextField = new javax.swing.JTextField();
	        newPWAgainTextField = new javax.swing.JTextField();
	        jSeparator4 = new javax.swing.JSeparator();
	        jLabel26 = new javax.swing.JLabel();
	        userIDTextField = new javax.swing.JTextField();

	        jLabel6.setText("jLabel6");

	        jRadioButtonMenuItem1.setSelected(true);
	        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

	        jLabel13.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
	        jLabel13.setText("等价券赠送");

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jLabel19.setFont(new java.awt.Font("幼圆", 1, 20)); // NOI18N
	        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
	        jLabel19.setText("欢迎进入网上图书销售系统 ");

	        jLabel20.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
	        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel20.setText("查看促销手段");

	        jLabel27.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
	        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel27.setText("设置促销手段");

	        jLabel29.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
	        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel29.setText("查看大范围促销");

	        jLabel30.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
	        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel30.setText("修改个人信息");

	        jLabel31.setFont(new java.awt.Font("幼圆", 1, 18)); // NOI18N
	        jLabel31.setText("您");

	        jLabel32.setFont(new java.awt.Font("幼圆", 1, 20)); // NOI18N
	        jLabel32.setForeground(new java.awt.Color(255, 0, 0));
	        jLabel32.setText("总经理客户端");

	        jLabel33.setFont(new java.awt.Font("幼圆", 0, 16)); // NOI18N
	        jLabel33.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel33.setText("可  以：");

	        jLabel34.setFont(new java.awt.Font("幼圆", 0, 16)); // NOI18N
	        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel34.setText("大范围   促销");

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(jPanel1Layout.createSequentialGroup()
	                                .addGap(180, 180, 180)
	                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(27, 27, 27)
	                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addGroup(jPanel1Layout.createSequentialGroup()
	                                .addGap(62, 62, 62)
	                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(18, 18, 18)
	                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addGroup(jPanel1Layout.createSequentialGroup()
	                                .addGap(234, 234, 234)
	                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(jLabel34)
	                                    .addGroup(jPanel1Layout.createSequentialGroup()
	                                        .addGap(26, 26, 26)
	                                        .addComponent(jLabel33)))))
	                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
	                            .addGap(141, 141, 141)
	                            .addComponent(jLabel20)
	                            .addGap(123, 123, 123)
	                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(274, 274, 274)
	                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap(123, Short.MAX_VALUE))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(47, 47, 47)
	                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
	                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(jLabel34)
	                .addGap(18, 18, 18)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(37, 37, 37))
	        );

	        jTabbedPane1.addTab("      首页     ", jPanel1);

	        jLabel1.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
	        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel1.setText("消费额与积分的兑换比例：");

	        jLabel2.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
	        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel2.setText("等价券的额度和使用比例:");

	        jLabel3.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
	        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel3.setText("打折券的打折率：");

	        checkExchangeRateTextField.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
	    
	        checkRateOfCouponTextField.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N

	        jLabel4.setFont(new java.awt.Font("宋体", 3, 24)); // NOI18N
	        jLabel4.setText("%");

	        checkEqualityTable.setModel(new javax.swing.table.DefaultTableModel(
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
	            boolean[] canEdit = new boolean [] {
	                false, false
	            };

	            public Class getColumnClass(int columnIndex) {
	                return types [columnIndex];
	            }

	            public boolean isCellEditable(int rowIndex, int columnIndex) {
	                return canEdit [columnIndex];
	            }
	        });
	        jScrollPane1.setViewportView(checkEqualityTable);

	        jLabel5.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
	        jLabel5.setText("（如：0.8表示八折）");

	        checkUpdateButton.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
	        checkUpdateButton.setForeground(new java.awt.Color(0, 204, 153));
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

	        jTabbedPane1.addTab("   查看促销手段    ", jPanel2);

	        jLabel7.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
	        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel7.setText("消费额与积分的兑换比例：");

	        setExchangeRateTextField.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
	    
	        jLabel8.setFont(new java.awt.Font("宋体", 3, 24)); // NOI18N
	        jLabel8.setText("%");

	        jLabel9.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
	        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel9.setText("等价券的额度和使用比例:");

	        jLabel10.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
	        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
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

	        setYesButton.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
	        setYesButton.setForeground(new java.awt.Color(255, 0, 51));
	        setYesButton.setText("确定");

	        setNoButton.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
	        setNoButton.setForeground(new java.awt.Color(0, 153, 153));
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

	        jTabbedPane1.addTab("   设置促销手段   ", jPanel3);

	        vip1CheckBox.setText("VIP1");

	        vip2CheckBox.setText("VIP2");
	  
	        vip3CheckBox.setText("VIP3");

	        vip4CheckBox.setText("VIP4");

	        vip5CheckBox.setText("VIP5");

	        jLabel12.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
	        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel12.setText("选择会员等级");

	        jLabel15.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
	        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
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

	        presentYesButton.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
	        presentYesButton.setForeground(new java.awt.Color(255, 0, 51));
	        presentYesButton.setText("确定赠送");
	
	        presentNoButton.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
	        presentNoButton.setForeground(new java.awt.Color(0, 204, 153));
	        presentNoButton.setText(" 取消 ");

	        jLabel14.setFont(new java.awt.Font("幼圆", 1, 14)); // NOI18N
	        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
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
	                                        .addGap(141, 141, 141)
	                                        .addComponent(presentYesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addGap(75, 75, 75)
	                                        .addComponent(presentNoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
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

	        jTabbedPane1.addTab("   大范围促销     ", jPanel4);

	        checkPresentButton.setFont(new java.awt.Font("幼圆", 2, 18)); // NOI18N
	        checkPresentButton.setForeground(new java.awt.Color(0, 51, 153));
	        checkPresentButton.setText("查看大范围促销信息");

	        checkPresentTextArea.setColumns(20);
	        checkPresentTextArea.setRows(5);
	        jScrollPane4.setViewportView(checkPresentTextArea);

	        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
	        jPanel5.setLayout(jPanel5Layout);
	        jPanel5Layout.setHorizontalGroup(
	            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel5Layout.createSequentialGroup()
	                .addGap(101, 101, 101)
	                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(75, Short.MAX_VALUE))
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(checkPresentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(202, 202, 202))
	        );
	        jPanel5Layout.setVerticalGroup(
	            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel5Layout.createSequentialGroup()
	                .addGap(27, 27, 27)
	                .addComponent(checkPresentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(32, 32, 32)
	                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(45, Short.MAX_VALUE))
	        );

	        jTabbedPane1.addTab(" 查看大范围促销 ", jPanel5);

	        changeUserNameButton.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
	        changeUserNameButton.setForeground(new java.awt.Color(102, 102, 102));
	        changeUserNameButton.setText("修改用户名");

	        confirmChangeUserNameButton.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
	        confirmChangeUserNameButton.setForeground(new java.awt.Color(255, 0, 0));
	        confirmChangeUserNameButton.setText("确认修改");

	        jLabel21.setFont(new java.awt.Font("宋体", 2, 14)); // NOI18N
	        jLabel21.setText("用户名：");

	        jLabel22.setFont(new java.awt.Font("宋体", 2, 14)); // NOI18N
	        jLabel22.setText("新用户名：");

	        changeUserPasswordButton.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
	        changeUserPasswordButton.setForeground(new java.awt.Color(102, 102, 102));
	        changeUserPasswordButton.setText("修改密码");

	        confirmChangePasswordButton.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
	        confirmChangePasswordButton.setForeground(new java.awt.Color(255, 0, 0));
	        confirmChangePasswordButton.setText("确认修改");

	        jLabel23.setFont(new java.awt.Font("宋体", 2, 14)); // NOI18N
	        jLabel23.setText("请输入原密码：");

	        jLabel24.setFont(new java.awt.Font("宋体", 2, 14)); // NOI18N
	        jLabel24.setText("请输入新密码：");

	        jLabel25.setFont(new java.awt.Font("宋体", 2, 14)); // NOI18N
	        jLabel25.setText("请再次输入新密码：");

	        jLabel26.setFont(new java.awt.Font("宋体", 2, 14)); // NOI18N
	        jLabel26.setText("用户编号：");

	        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
	        jPanel6.setLayout(jPanel6Layout);
	        jPanel6Layout.setHorizontalGroup(
	            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel6Layout.createSequentialGroup()
	                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel6Layout.createSequentialGroup()
	                        .addGap(35, 35, 35)
	                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addGroup(jPanel6Layout.createSequentialGroup()
	                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                    .addComponent(confirmChangePasswordButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                    .addComponent(changeUserPasswordButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                    .addComponent(jLabel25)
	                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                        .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                        .addComponent(jLabel23)))
	                                .addGap(18, 18, 18)
	                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                    .addComponent(originalPWTextField)
	                                    .addComponent(newPWTextField)
	                                    .addComponent(newPWAgainTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
	                            .addGroup(jPanel6Layout.createSequentialGroup()
	                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                    .addComponent(changeUserNameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                    .addComponent(confirmChangeUserNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                .addGap(91, 91, 91)
	                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                    .addGroup(jPanel6Layout.createSequentialGroup()
	                                        .addGap(2, 2, 2)
	                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                            .addComponent(jLabel22)
	                                            .addComponent(jLabel21))
	                                        .addGap(18, 18, 18)
	                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                            .addComponent(originalUserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                            .addComponent(newUserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                                    .addGroup(jPanel6Layout.createSequentialGroup()
	                                        .addComponent(jLabel26)
	                                        .addGap(18, 18, 18)
	                                        .addComponent(userIDTextField)))
	                                .addGap(2, 2, 2)))
	                        .addGap(0, 119, Short.MAX_VALUE))
	                    .addGroup(jPanel6Layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(jSeparator4)))
	                .addContainerGap())
	        );
	        jPanel6Layout.setVerticalGroup(
	            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
	                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel6Layout.createSequentialGroup()
	                        .addGap(48, 48, 48)
	                        .addComponent(changeUserNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(40, 40, 40)
	                        .addComponent(confirmChangeUserNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                    .addGroup(jPanel6Layout.createSequentialGroup()
	                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(jPanel6Layout.createSequentialGroup()
	                                .addGap(25, 25, 25)
	                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addGroup(jPanel6Layout.createSequentialGroup()
	                                .addContainerGap()
	                                .addComponent(userIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
	                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(originalUserNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(31, 31, 31)
	                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(newUserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(30, 30, 30)))
	                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(29, 29, 29)
	                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
	                        .addComponent(changeUserPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(46, 46, 46)
	                        .addComponent(confirmChangePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(40, 40, 40))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
	                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(originalPWTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(37, 37, 37)
	                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(newPWTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(37, 37, 37)
	                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(newPWAgainTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addContainerGap())))
	        );

	        jTabbedPane1.addTab("  个人中心   ", jPanel6);

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

	        pack();
	         //**********************************************************************************************************
		      
	         this.setVisible(true);
	         
	         //监听
	         checkUpdateButton.addActionListener(this);
	          setYesButton.addActionListener(this);
	          setNoButton.addActionListener(this);
	          presentNoButton.addActionListener(this);
	          presentYesButton.addActionListener(this);
	          checkPresentButton.addActionListener(this);
	          changeUserNameButton.addActionListener(this);
	          changeUserPasswordButton.addActionListener(this);
	          confirmChangePasswordButton.addActionListener(this);
	          confirmChangeUserNameButton.addActionListener(this);
	         
	         numOfCouponTextField.setText(""); //numOfCouponTextField endTimeOfCouponTextField  有用
	         endTimeOfCouponTextField.setText("");
	         
	        checkExchangeRateTextField.setEditable(false);
	        checkRateOfCouponTextField.setEditable(false);
	        
	         String [] columnNames={"等价券额度/元","最低消费/元"};
	         String [][] tableValue=new String[line][column];
	         tableModel=new DefaultTableModel(tableValue,columnNames); 
	         checkEqualityTable.setModel(tableModel);
//	         checkEqualityTable = new JTable(tableModel);
   
             //个人中心
	          generalManagerPO=proController.getUserPO();
	          userIDTextField.setText(generalManagerPO.getUserID());
	          originalUserNameTextField.setText(generalManagerPO.getUserName());
	          confirmChangePasswordButton.setEnabled(false);
	          confirmChangeUserNameButton.setEnabled(false);
	          userIDTextField.setEditable(false);
	          originalUserNameTextField.setEditable(false);
	          
				jLabel22.setEnabled(false); newUserNameTextField.setEnabled(false);
				jLabel23.setEnabled(false);  originalPWTextField.setEnabled(false);
				jLabel24.setEnabled(false);  newPWTextField.setEnabled(false);
				jLabel25.setEnabled(false);  newPWAgainTextField.setEnabled(false);
	          
	          
	         //节日提醒！
	          String news=News.remind();
	          if(news.equals("No News!")){
	        	  
	          }else{
	        	  JOptionPane.showMessageDialog(null, news);
	          }
	          
	    }// </editor-fold>
//界面完*************************************************************************************************************	    

	
//事件响应
	    GeneralManagerPO generalManagerPO;
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
//查看大范围促销信息		
		else if(event.getSource()== checkPresentButton){
			checkPresentTextArea.setText("");
			checkPresent();
			
		}
//修改用户名
		else if(event.getSource()== changeUserNameButton){
			jLabel22.setEnabled(true);
			newUserNameTextField.setEnabled(true);
			JOptionPane.showMessageDialog(null, "请在'新用户名'栏里输入新用户名！输入完毕后请单击'确认修改' !");
			confirmChangeUserNameButton.setEnabled(true);
		}
//确认修改用户名
		else if(event.getSource()== confirmChangeUserNameButton){
			if(newUserNameTextField.getText().equals("")){
				JOptionPane.showMessageDialog(null, "新用户名不能为空！");
			}else {
				generalManagerPO.setUserName(newUserNameTextField.getText());
				
				proController.changeUser(generalManagerPO.getUserName(),generalManagerPO.getUserID(),
						                                generalManagerPO.getUserPassword(),generalManagerPO.getUserRole()); 
				confirmChangeUserNameButton.setEnabled(false);
				jLabel22.setEnabled(false);
				newUserNameTextField.setEnabled(false);
				JOptionPane.showMessageDialog(null, "修改用户名成功！");
			}
		}
//修改用户密码
		else if(event.getSource()== changeUserPasswordButton){
			jLabel23.setEnabled(true);  originalPWTextField.setEnabled(true);
			jLabel24.setEnabled(true);  newPWTextField.setEnabled(true);
			jLabel25.setEnabled(true);  newPWAgainTextField.setEnabled(true);
			JOptionPane.showMessageDialog(null, "请依次输入原密码，新密码！");
			confirmChangePasswordButton.setEnabled(true);
		}
//确认修改密码
		else if (event.getSource()== confirmChangePasswordButton){
			if(! originalPWTextField.getText().equals(generalManagerPO.getUserPassword())){
				JOptionPane.showMessageDialog(null, "原密码正确！");
			}else{
				      if(newPWTextField.getText().equals("")){
				    	  JOptionPane.showMessageDialog(null, "新密码不能为空！");
				      }else{
				    	   if(newPWAgainTextField.getText().equals("")){
				    		   JOptionPane.showMessageDialog(null, "请再次输入新密码！");
				    	   }else{
				    	  
				    	  if(  ! newPWTextField.getText().equals(newPWAgainTextField.getText())){
				    		  JOptionPane.showMessageDialog(null, "您输入的新密码前后不一致，请检查！");
				    	  }else{
				    		  generalManagerPO.setUserPassword(newPWTextField.getText());
				    		  proController.changeUser(generalManagerPO.getUserName(),generalManagerPO.getUserID(),
		                                generalManagerPO.getUserPassword(),generalManagerPO.getUserRole()); 
				    		  
				  			jLabel23.setEnabled(false);  originalPWTextField.setEnabled(false);
							jLabel24.setEnabled(false);  newPWTextField.setEnabled(false);
							jLabel25.setEnabled(false);  newPWAgainTextField.setEnabled(false);
							confirmChangePasswordButton.setEnabled(false);
							JOptionPane.showMessageDialog(null, "修改密码成功！");
				    	  }
				      }
				      }
			}		
		}
		
	}//actionPerformed

 //其他方法
	PromotionPO proPO;
	double [][] equivalentList;
	
//从数据层获取promotionPO对象
	private void getPromotionPO(){
		 proPO=proController.getProPO();
	}
	
//查看促销手段界面
	private void promotionShow_check(){
		 getPromotionPO();
		if(proPO==null){
			JOptionPane.showMessageDialog(null,"您还尚未设置促销手段！");
		}else{
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
		}//else
	}
	
//取消设置促销手段后，界面清空
     private void promotionShow_setClear(){
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
	private void presentShow_clear(){
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
	private boolean stringToDoubel(String s){
		try{
		   @SuppressWarnings("unused")
		double d=Double.parseDouble(s);
		   return true;
		}catch(Exception e){
			return false;
		}
	}
	
//判断string是否可以转换成Calendar类型；且制定的日期不能小于当天；且不能出现诸如"2月30日"这样不合理的错误
	private boolean stringToCalendar(String s){
		SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd");
		try{
			Date date=format.parse(s);
			Calendar nowCalendar=Calendar.getInstance();
			Calendar cal=Calendar.getInstance();
			cal.setTime(date);
			int year=cal.get(Calendar.YEAR);
			int month=cal.get(Calendar.MONTH) +1;
			int day=cal.get(Calendar.DATE);
			if(month<1 || month>12)   
				return false;			
			
			if(day<1 || day>31)       
				return false;			 
			if(cal.compareTo(nowCalendar) <0)  
				return false;
			if (year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0){             //闰年，2.29
				if(month==2 && day>29)  
					return false;
			}else {//平年,2.28
				if(month==2 && day >28)  
					return false;
			}
			
			if(month==1 && day>31) return false;
			else if (month==3 && day>31)  return false;
			else if(month==4 && day>30)   return false;
			else if (month==5 && day>31)  return false;
			else if(month==6 && day>30)   return false;
			else if (month==7 && day>31)  return false;
			else if(month==8 && day>31)   return false;
			else if (month==9 && day>30)  return false;
			else if(month==10 && day>31)   return false;
			else if (month==11 && day>30)  return false;
			else if(month==12 && day>31)   return false;

			return true;	
		}catch(Exception e){
			return false;
		}	
	}
	
//判断界面上表格setEqualityTable中数据是否可以转化成double型,且大于零
	private boolean stringToDouble_List(){
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
	private boolean stringTo_Dou_Int_Cal(){
		double d;
		int in;
        //boolean boo=false;//判断表格是否为空
		@SuppressWarnings("unused")
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

		       return true;
		}catch(Exception e){
			return false;	
		}
	}
	
//判断礼券赠送界面中的PresentTable（等价券）是否为空
	private boolean isEmpty_presentTable(){
		for(int i=0;i<line2;i++){
			for(int j=0;j<3;j++){
			       if(presentTable.getValueAt(i, j) !=null)
				          return false;
			}
		}
		return true;
	}
	
	
//判断大范围促销设置中，所赠送的等价券（面额）是否存在;  presentTable表格可以为空
	private boolean equivalentExist(){
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
	private void presentInformationGet(VIPRank vipX){
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
//    查看总经理制定的大范围促销规则
   private void checkPresent(){
	   ArrayList<PresentPO> presentPOList=proController.getPresentPOList();                     //mainViewController.getPresentPOList();
	      
	      if(  presentPOList== null ){
	    	  checkPresentTextArea.append("总经理尚未制定礼券!");
	      }
	      else if( presentPOList.size() == 0){
	    	  checkPresentTextArea.append("总经理未制定礼券 或 礼券已经赠送完毕！");
	      }
	      else{
	    	  PresentPO presentPO;
	    	  String equivalent[][];
	    	  //private String equivalent[][]=new String [line][column4];
	    	  //10组,每组分别表示:等价券额度，张数，有效截止日期，最低消费 
	    	 
	    	  for(int i=0;i<presentPOList.size(); i++){
	    		  presentPO=presentPOList.get(i);
	    		  equivalent=presentPO.getEquivalent();
	    		  
	    		  checkPresentTextArea.append(presentPO.getVipLevel_String()+"\n");
	    		  
	    		  for(int j=0;j<equivalent.length;j++){
	    			  if( (Double.parseDouble(equivalent[j][0]) - 0.0)>0.000001  ){//是否判断一下是否有过期的?。。
	    				  checkPresentTextArea.append ("\t"+"等价券"+"\t"+"额度/元:"+"\t"+equivalent[j][0]+"\t"+"数量/张:"+"\t"+equivalent[j][1]
	    				  +"\t"+"最低消费:"+"\t"+equivalent[j][3]+"\t"+"有效截止日期:"+"\t"+equivalent[j][2]+"\n");
	    			  } 
	    		  }//for(j)
	    		   		    		  
	    		  if( (presentPO.getDiscount() - 0.0) > 0.000001 ){//存在//是否判断一下是否有过期的。。
	    			  checkPresentTextArea.append("\t"+"打折券"+"\t"+"打折率:"+"\t"+presentPO.getDiscount()+"\t"+"数量/张:"+"\t"+
	    		                  presentPO.getAmountOfCoupon()+"\t"+"有效截止日期"+"\t"+presentPO.getEndDateOfCoupon()+"\n");
	    		  }
	    		  
	    		  checkPresentTextArea.append("\n");
	    	  }//for(i)	  
	      }//else	
   }

	
	
}//大boss