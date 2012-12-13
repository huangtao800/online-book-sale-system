package presentation;
//���ʹ�
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
	   private static final int line=10;//checkEqualityTable,setEqualityTable������Ĭ����ʮ�й��ڵȼ�ȯ����Ϣ
	   private static final int line2=10;//presentTable
	   private static final int column=2;//��һ�б�ʾ�ȼ�ȯ��ȣ��ڶ��б�ʾ�ȼ�ȯ���������
	   private static final int column2=3;//������Ϊ�ȼ�ȯ��Ч��ֹ����
	   
	    private PromotionViewControllerInterface proController ;//������
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
	    	super("�ܾ����������");
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

	        jLabel13.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
	        jLabel13.setText("�ȼ�ȯ����");

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jLabel19.setFont(new java.awt.Font("��Բ", 1, 20)); // NOI18N
	        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
	        jLabel19.setText("��ӭ��������ͼ������ϵͳ ");

	        jLabel20.setFont(new java.awt.Font("��Բ", 0, 14)); // NOI18N
	        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel20.setText("�鿴�����ֶ�");

	        jLabel27.setFont(new java.awt.Font("��Բ", 0, 14)); // NOI18N
	        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel27.setText("���ô����ֶ�");

	        jLabel29.setFont(new java.awt.Font("��Բ", 0, 14)); // NOI18N
	        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel29.setText("�鿴��Χ����");

	        jLabel30.setFont(new java.awt.Font("��Բ", 0, 14)); // NOI18N
	        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel30.setText("�޸ĸ�����Ϣ");

	        jLabel31.setFont(new java.awt.Font("��Բ", 1, 18)); // NOI18N
	        jLabel31.setText("��");

	        jLabel32.setFont(new java.awt.Font("��Բ", 1, 20)); // NOI18N
	        jLabel32.setForeground(new java.awt.Color(255, 0, 0));
	        jLabel32.setText("�ܾ���ͻ���");

	        jLabel33.setFont(new java.awt.Font("��Բ", 0, 16)); // NOI18N
	        jLabel33.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel33.setText("��  �ԣ�");

	        jLabel34.setFont(new java.awt.Font("��Բ", 0, 16)); // NOI18N
	        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel34.setText("��Χ   ����");

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

	        jTabbedPane1.addTab("      ��ҳ     ", jPanel1);

	        jLabel1.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
	        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel1.setText("���Ѷ�����ֵĶһ�������");

	        jLabel2.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
	        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel2.setText("�ȼ�ȯ�Ķ�Ⱥ�ʹ�ñ���:");

	        jLabel3.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
	        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel3.setText("����ȯ�Ĵ����ʣ�");

	        checkExchangeRateTextField.setFont(new java.awt.Font("����", 1, 14)); // NOI18N
	    
	        checkRateOfCouponTextField.setFont(new java.awt.Font("����", 1, 14)); // NOI18N

	        jLabel4.setFont(new java.awt.Font("����", 3, 24)); // NOI18N
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
	                "�ȼ�ȯ���/Ԫ", "�������/Ԫ"
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

	        jLabel5.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
	        jLabel5.setText("���磺0.8��ʾ���ۣ�");

	        checkUpdateButton.setFont(new java.awt.Font("����", 1, 24)); // NOI18N
	        checkUpdateButton.setForeground(new java.awt.Color(0, 204, 153));
	        checkUpdateButton.setText("����");

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

	        jTabbedPane1.addTab("   �鿴�����ֶ�    ", jPanel2);

	        jLabel7.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
	        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel7.setText("���Ѷ�����ֵĶһ�������");

	        setExchangeRateTextField.setFont(new java.awt.Font("����", 1, 14)); // NOI18N
	    
	        jLabel8.setFont(new java.awt.Font("����", 3, 24)); // NOI18N
	        jLabel8.setText("%");

	        jLabel9.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
	        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel9.setText("�ȼ�ȯ�Ķ�Ⱥ�ʹ�ñ���:");

	        jLabel10.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
	        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel10.setText("����ȯ�Ĵ����ʣ�");

	        setRateOfCouponTextField.setFont(new java.awt.Font("����", 1, 14)); // NOI18N

	        jLabel11.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
	        jLabel11.setText("���磺0.8��ʾ���ۣ�");

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
	                "�ȼ�ȯ���/Ԫ", "�������/Ԫ"
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

	        setYesButton.setFont(new java.awt.Font("����", 1, 24)); // NOI18N
	        setYesButton.setForeground(new java.awt.Color(255, 0, 51));
	        setYesButton.setText("ȷ��");

	        setNoButton.setFont(new java.awt.Font("����", 1, 24)); // NOI18N
	        setNoButton.setForeground(new java.awt.Color(0, 153, 153));
	        setNoButton.setText("ȡ��");

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

	        jTabbedPane1.addTab("   ���ô����ֶ�   ", jPanel3);

	        vip1CheckBox.setText("VIP1");

	        vip2CheckBox.setText("VIP2");
	  
	        vip3CheckBox.setText("VIP3");

	        vip4CheckBox.setText("VIP4");

	        vip5CheckBox.setText("VIP5");

	        jLabel12.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
	        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel12.setText("ѡ���Ա�ȼ�");

	        jLabel15.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
	        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel15.setText("����ȯ����");

	        jLabel16.setFont(new java.awt.Font("��Բ", 0, 14)); // NOI18N
	        jLabel16.setText("��");

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
	                "�ȼ�ȯ���/Ԫ", "��������/��", "��ֹ���ڣ���/��/�գ�"
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

	        jLabel17.setFont(new java.awt.Font("��Բ", 0, 14)); // NOI18N
	        jLabel17.setText("��Ч��ֹ���ڣ�");

	        jLabel18.setFont(new java.awt.Font("��Բ", 0, 14)); // NOI18N
	        jLabel18.setForeground(new java.awt.Color(255, 0, 102));
	        jLabel18.setText("ע�����ڸ�ʽΪYYYY/MM/DD���磺2013/01/20");

	        presentYesButton.setFont(new java.awt.Font("����", 1, 24)); // NOI18N
	        presentYesButton.setForeground(new java.awt.Color(255, 0, 51));
	        presentYesButton.setText("ȷ������");
	
	        presentNoButton.setFont(new java.awt.Font("����", 1, 24)); // NOI18N
	        presentNoButton.setForeground(new java.awt.Color(0, 204, 153));
	        presentNoButton.setText(" ȡ�� ");

	        jLabel14.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
	        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
	        jLabel14.setText("�ȼ�ȯ����");

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

	        jTabbedPane1.addTab("   ��Χ����     ", jPanel4);

	        checkPresentButton.setFont(new java.awt.Font("��Բ", 2, 18)); // NOI18N
	        checkPresentButton.setForeground(new java.awt.Color(0, 51, 153));
	        checkPresentButton.setText("�鿴��Χ������Ϣ");

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

	        jTabbedPane1.addTab(" �鿴��Χ���� ", jPanel5);

	        changeUserNameButton.setFont(new java.awt.Font("����", 1, 18)); // NOI18N
	        changeUserNameButton.setForeground(new java.awt.Color(102, 102, 102));
	        changeUserNameButton.setText("�޸��û���");

	        confirmChangeUserNameButton.setFont(new java.awt.Font("����", 1, 18)); // NOI18N
	        confirmChangeUserNameButton.setForeground(new java.awt.Color(255, 0, 0));
	        confirmChangeUserNameButton.setText("ȷ���޸�");

	        jLabel21.setFont(new java.awt.Font("����", 2, 14)); // NOI18N
	        jLabel21.setText("�û�����");

	        jLabel22.setFont(new java.awt.Font("����", 2, 14)); // NOI18N
	        jLabel22.setText("���û�����");

	        changeUserPasswordButton.setFont(new java.awt.Font("����", 1, 18)); // NOI18N
	        changeUserPasswordButton.setForeground(new java.awt.Color(102, 102, 102));
	        changeUserPasswordButton.setText("�޸�����");

	        confirmChangePasswordButton.setFont(new java.awt.Font("����", 1, 18)); // NOI18N
	        confirmChangePasswordButton.setForeground(new java.awt.Color(255, 0, 0));
	        confirmChangePasswordButton.setText("ȷ���޸�");

	        jLabel23.setFont(new java.awt.Font("����", 2, 14)); // NOI18N
	        jLabel23.setText("������ԭ���룺");

	        jLabel24.setFont(new java.awt.Font("����", 2, 14)); // NOI18N
	        jLabel24.setText("�����������룺");

	        jLabel25.setFont(new java.awt.Font("����", 2, 14)); // NOI18N
	        jLabel25.setText("���ٴ����������룺");

	        jLabel26.setFont(new java.awt.Font("����", 2, 14)); // NOI18N
	        jLabel26.setText("�û���ţ�");

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

	        jTabbedPane1.addTab("  ��������   ", jPanel6);

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
	         
	         //����
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
	         
	         numOfCouponTextField.setText(""); //numOfCouponTextField endTimeOfCouponTextField  ����
	         endTimeOfCouponTextField.setText("");
	         
	        checkExchangeRateTextField.setEditable(false);
	        checkRateOfCouponTextField.setEditable(false);
	        
	         String [] columnNames={"�ȼ�ȯ���/Ԫ","�������/Ԫ"};
	         String [][] tableValue=new String[line][column];
	         tableModel=new DefaultTableModel(tableValue,columnNames); 
	         checkEqualityTable.setModel(tableModel);
//	         checkEqualityTable = new JTable(tableModel);
   
             //��������
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
	          
	          
	         //�������ѣ�
	          String news=News.remind();
	          if(news.equals("No News!")){
	        	  
	          }else{
	        	  JOptionPane.showMessageDialog(null, news);
	          }
	          
	    }// </editor-fold>
//������*************************************************************************************************************	    

	
//�¼���Ӧ
	    GeneralManagerPO generalManagerPO;
	public void actionPerformed(ActionEvent event){
		
//�鿴�����ֶ�
		if(event.getSource()==checkUpdateButton){
			promotionShow_setClear();
			promotionShow_check();
		}
		
//ȷ�����ô����ֶ�
		else if(event.getSource()==setYesButton){
			//�����õĴ����ֶδ������ݲ�
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
			     
			      if(  exchangeRate>=0.000001 &&//������
			            rateOfCoupon>=0.000001 &&
			    		exchangeRate<100.0  &&
			    		rateOfCoupon<1.0){
			      proPO.setExchangeOfScore(exchangeRate);
			      proPO.setDiscount(rateOfCoupon);
			      
			      for(int i=0;i<line;i++){
			    	  if((   setEqualityTable.getValueAt(i, 0)!=null ) &&//��Ϊ��
			    		(Double.parseDouble(setEqualityTable.getValueAt(i, 0).toString().trim())- 0.0)>0.000001)//��ֵ������
			    		  /*
			    		   * Double.parseDouble(***.toString().trim())�Ѵӱ����ȡ�õ�Object����ת����String��
			    		   * ��������(String)***ǿ������ת��
			    		   * ���꣡������
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
				  JOptionPane.showMessageDialog(null,"�����ֶ����óɹ���");
			      }
			      else   JOptionPane.showMessageDialog(null,"������������������������룡");
			}//if
			else{
				  JOptionPane.showMessageDialog(null,"������������������������룡");
			}	
		}
		
//ȡ�����ô����ֶ�
		else if(event.getSource()==setNoButton){
			promotionShow_setClear();
		}
		
//ȷ����ȯ��������
		else if(event.getSource()==presentYesButton){
			////�����õ���ȯ���͹���������ݲ�
			if(presentTable.isEditing()){
				presentTable.getCellEditor().stopCellEditing();
			}
			
			if(!vip1CheckBox.isSelected() && !vip2CheckBox.isSelected() && !vip3CheckBox.isSelected() 
					&&!vip4CheckBox.isSelected() &&!vip5CheckBox.isSelected()){
				JOptionPane.showMessageDialog(null, "������ѡ���Ա�ȼ���");
			}
			else if(numOfCouponTextField.getText().equals("") && endTimeOfCouponTextField.getText().equals("") && isEmpty_presentTable()){
				JOptionPane.showMessageDialog(null, "��ȯ��Ϣ����ȫΪ�գ�");
			}
			else if( (
					   ( stringToDoubel(numOfCouponTextField.getText())  &&  stringToCalendar(endTimeOfCouponTextField.getText()) ) || 
					        (numOfCouponTextField.getText().equals("") && endTimeOfCouponTextField.getText().equals(""))
					      )
					        && stringTo_Dou_Int_Cal() )////?���ݱ�׼�Լ��
			{          
				           if(equivalentExist()){//���õĵȼ�ȯ������
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
				                          
				                          JOptionPane.showMessageDialog(null,"��ȯ���ͳɹ�");
				                         
			                }
				           else {
				        	   JOptionPane.showMessageDialog(null, "�����õ�ĳЩ�ȼ�ȯ������,���Ȳ鿴�����ֶκ�������!");		
				           }
			}else{                                                                                                 //���ݱ�׼�Լ��
				JOptionPane.showMessageDialog(null, "�����������������ȷ�ϣ�");
			}
		
//			if(vip1CheckBox.isSelected()){

//			JOptionPane.showMessageDialog
//			(null,"��ȯ���͹������óɹ���\nϵͳ��֪ͨ���۾������������ý�����ȯ����");
//			presentShow_clear();
		}
		
//ȡ����ȯ��������
		else if(event.getSource()==presentNoButton){
			presentShow_clear();
		}
//�鿴��Χ������Ϣ		
		else if(event.getSource()== checkPresentButton){
			checkPresentTextArea.setText("");
			checkPresent();
			
		}
//�޸��û���
		else if(event.getSource()== changeUserNameButton){
			jLabel22.setEnabled(true);
			newUserNameTextField.setEnabled(true);
			JOptionPane.showMessageDialog(null, "����'���û���'�����������û�����������Ϻ��뵥��'ȷ���޸�' !");
			confirmChangeUserNameButton.setEnabled(true);
		}
//ȷ���޸��û���
		else if(event.getSource()== confirmChangeUserNameButton){
			if(newUserNameTextField.getText().equals("")){
				JOptionPane.showMessageDialog(null, "���û�������Ϊ�գ�");
			}else {
				generalManagerPO.setUserName(newUserNameTextField.getText());
				
				proController.changeUser(generalManagerPO.getUserName(),generalManagerPO.getUserID(),
						                                generalManagerPO.getUserPassword(),generalManagerPO.getUserRole()); 
				confirmChangeUserNameButton.setEnabled(false);
				jLabel22.setEnabled(false);
				newUserNameTextField.setEnabled(false);
				JOptionPane.showMessageDialog(null, "�޸��û����ɹ���");
			}
		}
//�޸��û�����
		else if(event.getSource()== changeUserPasswordButton){
			jLabel23.setEnabled(true);  originalPWTextField.setEnabled(true);
			jLabel24.setEnabled(true);  newPWTextField.setEnabled(true);
			jLabel25.setEnabled(true);  newPWAgainTextField.setEnabled(true);
			JOptionPane.showMessageDialog(null, "����������ԭ���룬�����룡");
			confirmChangePasswordButton.setEnabled(true);
		}
//ȷ���޸�����
		else if (event.getSource()== confirmChangePasswordButton){
			if(! originalPWTextField.getText().equals(generalManagerPO.getUserPassword())){
				JOptionPane.showMessageDialog(null, "ԭ������ȷ��");
			}else{
				      if(newPWTextField.getText().equals("")){
				    	  JOptionPane.showMessageDialog(null, "�����벻��Ϊ�գ�");
				      }else{
				    	   if(newPWAgainTextField.getText().equals("")){
				    		   JOptionPane.showMessageDialog(null, "���ٴ����������룡");
				    	   }else{
				    	  
				    	  if(  ! newPWTextField.getText().equals(newPWAgainTextField.getText())){
				    		  JOptionPane.showMessageDialog(null, "�������������ǰ��һ�£����飡");
				    	  }else{
				    		  generalManagerPO.setUserPassword(newPWTextField.getText());
				    		  proController.changeUser(generalManagerPO.getUserName(),generalManagerPO.getUserID(),
		                                generalManagerPO.getUserPassword(),generalManagerPO.getUserRole()); 
				    		  
				  			jLabel23.setEnabled(false);  originalPWTextField.setEnabled(false);
							jLabel24.setEnabled(false);  newPWTextField.setEnabled(false);
							jLabel25.setEnabled(false);  newPWAgainTextField.setEnabled(false);
							confirmChangePasswordButton.setEnabled(false);
							JOptionPane.showMessageDialog(null, "�޸�����ɹ���");
				    	  }
				      }
				      }
			}		
		}
		
	}//actionPerformed

 //��������
	PromotionPO proPO;
	double [][] equivalentList;
	
//�����ݲ��ȡpromotionPO����
	private void getPromotionPO(){
		 proPO=proController.getProPO();
	}
	
//�鿴�����ֶν���
	private void promotionShow_check(){
		 getPromotionPO();
		if(proPO==null){
			JOptionPane.showMessageDialog(null,"������δ���ô����ֶΣ�");
		}else{
		         checkExchangeRateTextField.setText(""+proPO.getExchangeOfScore());
		         checkRateOfCouponTextField.setText(""+proPO.getDiscount());
		         equivalentList=proPO.getEquivalentList();                                                 
		         for(int i=0;i<line;i++){
				         if(   (Math.abs(equivalentList[i][0]-0.0))>0.000001){//�ȼ�ȯ�Ķ�Ȳ�����0

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
	
//ȡ�����ô����ֶκ󣬽������
     private void promotionShow_setClear(){
		setExchangeRateTextField.setText("");
		setRateOfCouponTextField.setText("");
		
		if(setEqualityTable.isEditing()){				//����Ҫ��ʹtable�˳��ɱ༭״̬
			setEqualityTable.getCellEditor().stopCellEditing();
		}
		
		 for(int i=0;i<line;i++){
			 for(int j=0;j<column;j++){
				 setEqualityTable.setValueAt(null, i,j); 
			 }
		 } //for 			
	 }
	
	
//ȡ����ȯ�������ú󣬽����������
	private void presentShow_clear(){
		vip1CheckBox.setSelected(false);
		vip2CheckBox.setSelected(false);
		vip3CheckBox.setSelected(false);
		vip4CheckBox.setSelected(false);
		vip5CheckBox.setSelected(false);
		numOfCouponTextField.setText("");
		endTimeOfCouponTextField.setText("");
		
		if(presentTable.isEditing()){				//����Ҫ��ʹtable�˳��ɱ༭״̬
			presentTable.getCellEditor().stopCellEditing();
		}
		
		for(int i=0;i<line2;i++){
			for(int j=0;j<column2;j++){
			   presentTable.setValueAt(null, i, j);
			}
		}//for
	}
	
//�ж�string�Ƿ����ת����double��
	private boolean stringToDoubel(String s){
		try{
		   @SuppressWarnings("unused")
		double d=Double.parseDouble(s);
		   return true;
		}catch(Exception e){
			return false;
		}
	}
	
//�ж�string�Ƿ����ת����Calendar���ͣ����ƶ������ڲ���С�ڵ��죻�Ҳ��ܳ�������"2��30��"����������Ĵ���
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
			if (year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0){             //���꣬2.29
				if(month==2 && day>29)  
					return false;
			}else {//ƽ��,2.28
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
	
//�жϽ����ϱ��setEqualityTable�������Ƿ����ת����double��,�Ҵ�����
	private boolean stringToDouble_List(){
	    double d1,d2;
	    boolean boo=false;//�жϱ���Ƿ�Ϊ��
	    try {
			for(int i=0;i<line;i++){
				if(setEqualityTable.getValueAt(i, 0)==null && setEqualityTable.getValueAt(i, 1)==null)
					continue;//���һ�������У���������Ϊ�գ�����һ��������Ч
				else{
				d1=Double.parseDouble(setEqualityTable.getValueAt(i, 0).toString().trim());
				d2=Double.parseDouble(setEqualityTable.getValueAt(i, 1).toString().trim() );
				boo=true;
				if(d1<0.000001 || d2<0.000001)//�����ݴ�����
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
	
//�жϱ��presentTable�������Ƿ���ϱ�׼��������Ϊ��
	private boolean stringTo_Dou_Int_Cal(){
		double d;
		int in;
        //boolean boo=false;//�жϱ���Ƿ�Ϊ��
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
	
//�ж���ȯ���ͽ����е�PresentTable���ȼ�ȯ���Ƿ�Ϊ��
	private boolean isEmpty_presentTable(){
		for(int i=0;i<line2;i++){
			for(int j=0;j<3;j++){
			       if(presentTable.getValueAt(i, j) !=null)
				          return false;
			}
		}
		return true;
	}
	
	
//�жϴ�Χ���������У������͵ĵȼ�ȯ�����Ƿ����;  presentTable������Ϊ��
	private boolean equivalentExist(){
		PromotionPO promotionPO=proController.getProPO();
		double [][] equivalent=promotionPO.getEquivalentList();//�����ǰ����ô��ݵ�
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
//��Χ�������ӽ����ȡ��ȯ����������Ϣ
	private void presentInformationGet(VIPRank vipX){
		presentPO=new PresentPO();
		present_equivalent=presentPO.getEquivalent();
		PromotionPO promotionPO=proController.getProPO();
		double [][] equivalent=promotionPO.getEquivalentList();//�����ǰ����ô��ݵ�
		
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
		proController.present_YES(presentPO);  //promotionPO�����ˣ�
}
//
//    �鿴�ܾ����ƶ��Ĵ�Χ��������
   private void checkPresent(){
	   ArrayList<PresentPO> presentPOList=proController.getPresentPOList();                     //mainViewController.getPresentPOList();
	      
	      if(  presentPOList== null ){
	    	  checkPresentTextArea.append("�ܾ�����δ�ƶ���ȯ!");
	      }
	      else if( presentPOList.size() == 0){
	    	  checkPresentTextArea.append("�ܾ���δ�ƶ���ȯ �� ��ȯ�Ѿ�������ϣ�");
	      }
	      else{
	    	  PresentPO presentPO;
	    	  String equivalent[][];
	    	  //private String equivalent[][]=new String [line][column4];
	    	  //10��,ÿ��ֱ��ʾ:�ȼ�ȯ��ȣ���������Ч��ֹ���ڣ�������� 
	    	 
	    	  for(int i=0;i<presentPOList.size(); i++){
	    		  presentPO=presentPOList.get(i);
	    		  equivalent=presentPO.getEquivalent();
	    		  
	    		  checkPresentTextArea.append(presentPO.getVipLevel_String()+"\n");
	    		  
	    		  for(int j=0;j<equivalent.length;j++){
	    			  if( (Double.parseDouble(equivalent[j][0]) - 0.0)>0.000001  ){//�Ƿ��ж�һ���Ƿ��й��ڵ�?����
	    				  checkPresentTextArea.append ("\t"+"�ȼ�ȯ"+"\t"+"���/Ԫ:"+"\t"+equivalent[j][0]+"\t"+"����/��:"+"\t"+equivalent[j][1]
	    				  +"\t"+"�������:"+"\t"+equivalent[j][3]+"\t"+"��Ч��ֹ����:"+"\t"+equivalent[j][2]+"\n");
	    			  } 
	    		  }//for(j)
	    		   		    		  
	    		  if( (presentPO.getDiscount() - 0.0) > 0.000001 ){//����//�Ƿ��ж�һ���Ƿ��й��ڵġ���
	    			  checkPresentTextArea.append("\t"+"����ȯ"+"\t"+"������:"+"\t"+presentPO.getDiscount()+"\t"+"����/��:"+"\t"+
	    		                  presentPO.getAmountOfCoupon()+"\t"+"��Ч��ֹ����"+"\t"+presentPO.getEndDateOfCoupon()+"\n");
	    		  }
	    		  
	    		  checkPresentTextArea.append("\n");
	    	  }//for(i)	  
	      }//else	
   }

	
	
}//��boss