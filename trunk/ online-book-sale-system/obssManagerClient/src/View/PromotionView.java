package View;
//���ʹ�
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
	   private static final int line=10;//checkEqualityTable,setEqualityTable������Ĭ����ʮ�й��ڵȼ�ȯ����Ϣ
	   private static final int line2=10;//presentTable
	   private static final int column=2;//��һ�б�ʾ�ȼ�ȯ��ȣ��ڶ��б�ʾ�ȼ�ȯ���������
	   private static final int column2=3;//������Ϊ�ȼ�ȯ��Ч��ֹ����
	   private PromotionModelInterface proModel;//ģ��
	    private PromotionControllerInterface proController ;//������
	    
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
	    
	         
	         String [] columnNames={"�ȼ�ȯ���/Ԫ","�������/Ԫ"};
	         String [][] tableValue=new String[line][column];
	         tableModel=new DefaultTableModel(tableValue,columnNames); 
	         checkEqualityTable = new JTable(tableModel);
	         
	         
	         //����
	         checkUpdateButton.addActionListener(this);
	          setYesButton.addActionListener(this);
	          setNoButton.addActionListener(this);
	          presentNoButton.addActionListener(this);
	          presentYesButton.addActionListener(this);

	         jLabel6.setText("jLabel6");

	         jRadioButtonMenuItem1.setSelected(true);
	         jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

	         jLabel13.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
	         jLabel13.setText("�ȼ�ȯ����");

	         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	         jLabel19.setFont(new java.awt.Font("��Բ", 2, 14)); // NOI18N
	         jLabel19.setText("��ӭ��������ͼ������ϵͳ���ܾ����������");

	         jLabel20.setFont(new java.awt.Font("��Բ", 0, 14)); // NOI18N
	         jLabel20.setText("�����Բ鿴���޸Ĵ����ֶΣ�Ϊ���Ĺ˿�������ȯ");

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

	         jTabbedPane1.addTab("          ��ҳ        ", jPanel1);

	         jLabel1.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
	         jLabel1.setText("���Ѷ�����ֵĶһ�������");

	         jLabel2.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
	         jLabel2.setText("�ȼ�ȯ�Ķ�Ⱥ�ʹ�ñ���:");

	         jLabel3.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
	         jLabel3.setText("����ȯ�Ĵ����ʣ�");

	         checkExchangeRateTextField.setFont(new java.awt.Font("����", 1, 14)); // NOI18N
	        

	         checkRateOfCouponTextField.setFont(new java.awt.Font("����", 1, 14)); // NOI18N

	         jLabel4.setFont(new java.awt.Font("����", 3, 24)); // NOI18N
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
////	                 "�ȼ�ȯ���//Ԫ", "�������/Ԫ"
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

	         jLabel5.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
	         jLabel5.setText("���磺0.8��ʾ���ۣ�");

	         checkUpdateButton.setFont(new java.awt.Font("����", 1, 18)); // NOI18N
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

	         jTabbedPane1.addTab("        �鿴�����ֶ�         ", jPanel2);

	         jLabel7.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
	         jLabel7.setText("���Ѷ�����ֵĶһ�������");

	         setExchangeRateTextField.setFont(new java.awt.Font("����", 1, 14)); // NOI18N

	         jLabel8.setFont(new java.awt.Font("����", 3, 24)); // NOI18N
	         jLabel8.setText("%");

	         jLabel9.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
	         jLabel9.setText("�ȼ�ȯ�Ķ�Ⱥ�ʹ�ñ���:");

	         jLabel10.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
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

	         setYesButton.setFont(new java.awt.Font("����", 1, 18)); // NOI18N
	         setYesButton.setText("ȷ��");

	         setNoButton.setFont(new java.awt.Font("����", 1, 18)); // NOI18N
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

	         jTabbedPane1.addTab("       ���ô����ֶ�      ", jPanel3);

	         vip1CheckBox.setText("VIP1");

	         vip2CheckBox.setText("VIP2");
	        
	         vip3CheckBox.setText("VIP3");

	         vip4CheckBox.setText("VIP4");

	         vip5CheckBox.setText("VIP5");

	         jLabel12.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
	         jLabel12.setText("ѡ���Ա�ȼ�");

	         jLabel15.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
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

	         presentYesButton.setFont(new java.awt.Font("����", 1, 18)); // NOI18N
	         presentYesButton.setText("ȷ������");
	       
	         presentNoButton.setFont(new java.awt.Font("����", 1, 18)); // NOI18N
	         presentNoButton.setText(" ȡ�� ");

	         jLabel14.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
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

	         jTabbedPane1.addTab("        ��Χ����        ", jPanel4);

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
	       //numOfCouponTextField endTimeOfCouponTextField  ����
	         numOfCouponTextField.setText("");
	         endTimeOfCouponTextField.setText("");
	         
	         pack();
	        this.setVisible(true);
	    }// </editor-fold>
	    

	
//�¼���Ӧ
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
		
	}//actionPerformed

 //��������
	PromotionPO proPO;
	double [][] equivalentList;
	
//�����ݲ��ȡpromotionPO����
	public void getPromotionPO(){
		 proPO=proController.getProPO();
	}
	
//�鿴�����ֶν���
	public void promotionShow_check(){
		 getPromotionPO();
		
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
	}
	
//ȡ�����ô����ֶκ󣬽������
	public void promotionShow_setClear(){
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
	public void presentShow_clear(){
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
	public boolean stringToDoubel(String s){
		double d;
		try{
		   d=Double.parseDouble(s);
		   return true;
		}catch(Exception e){
			return false;
		}
	}
	
//�ж�string�Ƿ����ת����Calendar����
	public boolean stringToCalendar(String s){
		SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd");
		try{
			Date date=format.parse(s);
			return true;	
		}catch(Exception e){
			return false;
		}	
	}
	
//�жϽ����ϱ��setEqualityTable�������Ƿ����ת����double��,�Ҵ�����
	public boolean stringToDouble_List(){
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
	public boolean stringTo_Dou_Int_Cal(){
		double d;
		int in;
        //boolean boo=false;//�жϱ���Ƿ�Ϊ��
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
	
//�ж���ȯ���ͽ����е�PresentTable���ȼ�ȯ���Ƿ�Ϊ��
	public boolean isEmpty_presentTable(){
		for(int i=0;i<line2;i++){
			for(int j=0;j<3;j++){
			       if(presentTable.getValueAt(i, j) !=null)
				          return false;
			}
		}
		return true;
	}
	
	
//�жϴ�Χ���������У������͵ĵȼ�ȯ�����Ƿ����;  presentTable������Ϊ��
	public boolean equivalentExist(){
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
	public void presentInformationGet(VIPRank vipX){
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
	
	
}//��boss