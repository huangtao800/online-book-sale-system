package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.DelayQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import festival.News;

import po.GeneralManagerPO;
import po.Present_Coupon;
import po.Present_Equivalent;
import po.PromotionPO;
import po.ResultMessage;
import po.VIPRank;
import presentationController.GeneralManagerView.GeneralManagerViewControllerInterface;
import presentationController.changeUserNameView.changeUserNameController;
import presentationController.changeUserNameView.changeUserNameControllerInterface;

public class GeneralManagerView extends JFrame implements ActionListener {
	   private static final int line=20;//presentTable 20��
	   private GeneralManagerPO userpo;
	    PromotionPO proPO;
	    private ArrayList<ArrayList<Double>> equivalentList=new ArrayList<ArrayList<Double>>();
		private ArrayList<Double> couponRateList=new ArrayList<Double>();
		private  String[] equi=new String[line];
		private String[] cou=new String[line];
	  
	   private DefaultTableModel equivalentTableModel;  
	   private DefaultTableModel couponTableModel;  

    private javax.swing.JTextField amountOfCouponTextField;
    private javax.swing.JTextField amountOfEquivalentTextField;
    private javax.swing.JButton cancelPromotionButton;
    private javax.swing.JButton cancelSendCouponButton;
    private javax.swing.JButton cancelSendEquiButton;
    private javax.swing.JButton changeUserNameButton1;
    private javax.swing.JButton changeUserPasswordButton1;
    private javax.swing.JButton checkPresentButton;
    private javax.swing.JButton checkPromotionButton;
    private javax.swing.JTextField endDateOfCouponTextField;
    private javax.swing.JTextField endDateOfEqivalentTextField;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton promotionPanelButton;
    private javax.swing.JButton sendCouponButton;
    private javax.swing.JComboBox sendCouponComboBox;
    private javax.swing.JButton sendEquivalentButton;
    private javax.swing.JComboBox sendEquivalentComboBox;
    private javax.swing.JTable setCouponTable;
    private javax.swing.JTable setEqualityTable;
    private javax.swing.JTextField setExchangeRateTextField;
    private javax.swing.JButton setPromotionButton;
    private javax.swing.JTextArea showPresentTextArea;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JCheckBox vip1CheckBox;
    private javax.swing.JCheckBox vip2CheckBox;
    private javax.swing.JCheckBox vip3CheckBox;
    private javax.swing.JCheckBox vip4CheckBox;
    private javax.swing.JCheckBox vip5CheckBox;
    // End of variables declaration
    
    private GeneralManagerViewControllerInterface proController ;//������
    
    public GeneralManagerView(GeneralManagerViewControllerInterface proContr ){
	    	super("�ܾ����������");
	    	this.proController=proContr;
    }
    
    public void createView(){
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
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        promotionPanelButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        setExchangeRateTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        setEqualityTable = new javax.swing.JTable();
        setPromotionButton = new javax.swing.JButton();
        cancelPromotionButton = new javax.swing.JButton();
        checkPromotionButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        setCouponTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        vip1CheckBox = new javax.swing.JCheckBox();
        vip2CheckBox = new javax.swing.JCheckBox();
        vip3CheckBox = new javax.swing.JCheckBox();
        vip4CheckBox = new javax.swing.JCheckBox();
        vip5CheckBox = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        sendEquivalentButton = new javax.swing.JButton();
        cancelSendCouponButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        sendCouponComboBox = new javax.swing.JComboBox();
        endDateOfCouponTextField = new javax.swing.JTextField();
        sendEquivalentComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        amountOfEquivalentTextField = new javax.swing.JTextField();
        endDateOfEqivalentTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        sendCouponButton = new javax.swing.JButton();
        cancelSendEquiButton = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        amountOfCouponTextField = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        checkPresentButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        showPresentTextArea = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        changeUserNameButton1 = new javax.swing.JButton();
        changeUserPasswordButton1 = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

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

        jLabel32.setFont(new java.awt.Font("��Բ", 1, 20)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 0, 0));
        jLabel32.setText("�ܾ���ͻ���");

        jLabel34.setFont(new java.awt.Font("��Բ", 0, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("��Χ   ����");

        promotionPanelButton.setText("���ô����ֶ�");

        jButton4.setText("��Χ����");

        jButton5.setText("�鿴��Χ����");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(234, 234, 234)
                            .addComponent(jLabel34))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(180, 180, 180)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(promotionPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(79, 79, 79)))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel20)
                        .addGap(123, 123, 123)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(211, Short.MAX_VALUE))
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
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(promotionPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
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

        jTabbedPane1.addTab("            ��ҳ            ", jPanel1);

        jLabel7.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("���������Ѷ�");

        setExchangeRateTextField.setFont(new java.awt.Font("����", 1, 14)); // NOI18N
      
        jLabel8.setFont(new java.awt.Font("����", 3, 24)); // NOI18N
        jLabel8.setText("%");

        jLabel9.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("�ȼ�ȯ:");

        jLabel10.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("����ȯ��");

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
                {null, null},
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
        setEqualityTable.setColumnSelectionAllowed(true);
        setEqualityTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(setEqualityTable);
        setEqualityTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        setEqualityTable.getColumnModel().getColumn(0).setResizable(false);
        setEqualityTable.getColumnModel().getColumn(1).setResizable(false);

        setPromotionButton.setFont(new java.awt.Font("����", 1, 24)); // NOI18N
        setPromotionButton.setForeground(new java.awt.Color(255, 0, 51));
        setPromotionButton.setText("��������");

        cancelPromotionButton.setFont(new java.awt.Font("����", 1, 24)); // NOI18N
        cancelPromotionButton.setForeground(new java.awt.Color(0, 153, 153));
        cancelPromotionButton.setText("ȡ  ��");

        checkPromotionButton.setFont(new java.awt.Font("����", 1, 24)); // NOI18N
        checkPromotionButton.setForeground(new java.awt.Color(204, 204, 0));
        checkPromotionButton.setText("��  ��");

        setCouponTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "������(��:0.8�������)"
            }
        ));
        setCouponTable.setColumnSelectionAllowed(true);
        setCouponTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(setCouponTable);
        setCouponTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        setCouponTable.getColumnModel().getColumn(0).setResizable(false);

        jLabel1.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("�Ķһ�������");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelPromotionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(setPromotionButton, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                .addComponent(checkPromotionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(270, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)))))
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(setExchangeRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(setExchangeRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(checkPromotionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(setPromotionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelPromotionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );

        jTabbedPane1.addTab("           ���ô����ֶ�          ", jPanel3);

        vip1CheckBox.setText("VIP1");

        vip2CheckBox.setText("VIP2");
  
        vip3CheckBox.setText("VIP3");

        vip4CheckBox.setText("VIP4");

        vip5CheckBox.setText("VIP5");

        jLabel12.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("ѡ���Ա�ȼ�");

        jLabel15.setFont(new java.awt.Font("��Բ", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 153));
        jLabel15.setText("�� �� ȯ �� ��");

        jLabel18.setFont(new java.awt.Font("��Բ", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 102));
        jLabel18.setText("��ʾ�����ڸ�ʽΪYYYY/MM/DD���磺2013/01/20");

        sendEquivalentButton.setFont(new java.awt.Font("��Բ", 1, 18)); // NOI18N
        sendEquivalentButton.setForeground(new java.awt.Color(102, 0, 102));
        sendEquivalentButton.setText("���͵ȼ�ȯ");
    
        cancelSendCouponButton.setFont(new java.awt.Font("��Բ", 1, 18)); // NOI18N
        cancelSendCouponButton.setForeground(new java.awt.Color(0, 51, 153));
        cancelSendCouponButton.setText(" ȡ  �� ");

        jLabel14.setFont(new java.awt.Font("��Բ", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 102));
        jLabel14.setText("�� �� ȯ �� ��");

        sendCouponComboBox.setFont(new java.awt.Font("��Բ", 0, 12)); // NOI18N
        sendCouponComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "���޴���ȯ" }));

        sendEquivalentComboBox.setFont(new java.awt.Font("��Բ", 0, 12)); // NOI18N
        sendEquivalentComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "���޵ȼ�ȯ" }));

        jLabel4.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("������");

        jLabel11.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("��");

        sendCouponButton.setFont(new java.awt.Font("��Բ", 1, 18)); // NOI18N
        sendCouponButton.setForeground(new java.awt.Color(0, 51, 153));
        sendCouponButton.setText("���ʹ���ȯ");

        cancelSendEquiButton.setFont(new java.awt.Font("��Բ", 1, 18)); // NOI18N
        cancelSendEquiButton.setForeground(new java.awt.Color(102, 0, 102));
        cancelSendEquiButton.setText("ȡ  ��");

        jLabel17.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("��Ч��ֹ���ڣ�");

        jLabel21.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("���");

        jLabel22.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("���");

        jLabel23.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("��");

        jLabel2.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("������");

        jLabel3.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("��Ч��ֹ���ڣ�");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
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
                                .addComponent(vip5CheckBox)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel17)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel22))
                                            .addGap(30, 30, 30)))
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(sendEquivalentComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel14)
                                        .addComponent(amountOfEquivalentTextField)
                                        .addComponent(endDateOfEqivalentTextField)))
                                .addComponent(sendEquivalentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cancelSendEquiButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 145, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addComponent(sendCouponComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(130, 130, 130))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                    .addComponent(amountOfCouponTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel23)
                                                    .addGap(109, 109, 109)))
                                            .addComponent(endDateOfCouponTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cancelSendCouponButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sendCouponButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(143, 143, 143))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(122, 122, 122))))))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sendCouponComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amountOfEquivalentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountOfCouponTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sendEquivalentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(62, 62, 62)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDateOfEqivalentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDateOfCouponTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendEquivalentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendCouponButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelSendEquiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelSendCouponButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("           ��Χ����            ", jPanel4);

        checkPresentButton.setFont(new java.awt.Font("��Բ", 3, 20)); // NOI18N
        checkPresentButton.setForeground(new java.awt.Color(0, 51, 153));
        checkPresentButton.setText("�鿴��Χ������Ϣ");

        showPresentTextArea.setColumns(20);
        showPresentTextArea.setRows(5);
        jScrollPane4.setViewportView(showPresentTextArea);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(checkPresentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(272, 272, 272))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(checkPresentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("        �鿴��Χ����        ", jPanel5);

        jLabel28.setFont(new java.awt.Font("��Բ", 2, 14)); // NOI18N
        jLabel28.setText("�û���");

        changeUserNameButton1.setFont(new java.awt.Font("��Բ", 2, 18)); // NOI18N
        changeUserNameButton1.setText("�޸��û���");

        changeUserPasswordButton1.setFont(new java.awt.Font("��Բ", 2, 18)); // NOI18N
        changeUserPasswordButton1.setText("�޸�����");

        exitButton.setFont(new java.awt.Font("��Բ", 2, 18)); // NOI18N
        exitButton.setText("��  ��");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175)
                .addComponent(changeUserNameButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(changeUserPasswordButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(changeUserPasswordButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(changeUserNameButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        //****************************************************************************************
     
        this.setVisible(true);
        //
        updateComBoBox();
        
        //��������panel
        userpo=proController.getUserPO();
        userNameLabel.setText(userpo.getUserName());
        changeUserNameButton1.addActionListener(this);
        changeUserPasswordButton1.addActionListener(this);
        exitButton.addActionListener(this);
        
        //���ô����ֶ�Panel
        checkPromotionButton.addActionListener(this);
        setPromotionButton.addActionListener(this);
        cancelPromotionButton.addActionListener(this);
        //��Χ����Panel
        sendEquivalentButton.addActionListener(this);
        sendCouponButton.addActionListener(this);
        cancelSendEquiButton.addActionListener(this);
        cancelSendCouponButton.addActionListener(this);
        //�鿴��Χ����Panel
        checkPresentButton.addActionListener(this);
        showPresentTextArea.setEditable(false);
        
        //�������ѣ�
        String news=News.remind();
        if(news.equals("No News!")){
      	  
        }else{
      	  JOptionPane.showMessageDialog(null, news);
        }
    } 
//������************************************************************************************************
	
    public void actionPerformed(ActionEvent event){
    	//�鿴������Ϣ
    	if(event.getSource()== checkPromotionButton){
    		checkPromotion();
    	}
    	//���ô����ֶ�
    	else if(event.getSource()==setPromotionButton){
    		if(setEqualityTable.isEditing()){
    			setEqualityTable.getCellEditor().stopCellEditing();
			}
    		if(setCouponTable.isEditing()){
    			setCouponTable.getCellEditor().stopCellEditing();
			}
    		
    		savePromotion();
    		updateComBoBox();
    	}
    	//ȡ�����ô����ֶ�
    	else if(event.getSource()==cancelPromotionButton){
    		updatePromotion();
    		updateComBoBox();
    	}
    	//���͵ȼ�ȯ
    	else if(event.getSource()==sendEquivalentButton){
    		sendEquivalent();
    	}
    	//ȡ�����͵ȼ�ȯ
    	else if(event.getSource()==cancelSendEquiButton){
    		
    		amountOfEquivalentTextField.setText("");
    		endDateOfEqivalentTextField.setText("");
    	}
    	//���ʹ���ȯ
    	else if(event.getSource()== sendCouponButton){
    		sendCoupon();
    	}
    	//ȡ�����ʹ���ȯ
    	else if(event.getSource()==cancelSendCouponButton){
    		
    		amountOfCouponTextField.setText("");
    		endDateOfCouponTextField.setText("");
    	}
    	//�鿴�����õĴ�Χ�����ֶ�
    	else if(event.getSource()==checkPresentButton){
    		checkPresent();
    	}
    	//�޸��û���
    	else if(event.getSource()==changeUserNameButton1){
    		changeUserNameControllerInterface controller=new changeUserNameController(userpo) ;
            userNameLabel.setText(userpo.getUserName());
    	}
    	//�޸��û�����
    	else if(event.getSource()==changeUserPasswordButton1){
    		
    	}
    	//�˳�
    	else if(event.getSource()== exitButton){
    		System.exit(1);
    	}
    	
    	
    }//�¼�����
    
    //����������

    //�鿴�����ֶ�
    private void checkPromotion(){
    	proPO=proController.getProPO();
    	if(proPO==null){
    		JOptionPane.showMessageDialog(null, "����δ���д����ֶ����ã�");
    	}
    	else updatePromotion();
        }
    //���´����ֶ�
    private void updatePromotion(){
    	cleanConTable();
    	cleanEquiTable();
    	if(proPO==null){
    		
    	}
    	else{
    		equivalentList=proPO.getEquivalentList();
    		couponRateList=proPO.getCouponrateList();
    		
    		 String [] columnNames={"�ȼ�ȯ���/Ԫ","�������/Ԫ"}; 
	         String [][] tableValue=new String[line][2];
	         equivalentTableModel=new DefaultTableModel(tableValue,columnNames); 
	         setEqualityTable.setModel(equivalentTableModel);
	         
	         String [] name={"������(��:0.8�������)"};
	         String[][] value=new String[line][1];
	         couponTableModel=new DefaultTableModel(value, name);
	         setCouponTable.setModel(couponTableModel);
	         
	         if(  (Math.abs(proPO.getExchangeOfScore()-0.0)<0.000001)  &&
	        		 (equivalentList ==null ||equivalentList.size()==0)  &&
	        		 (couponRateList==null || couponRateList.size()==0)
	        	 ){
	        	  JOptionPane.showMessageDialog(null, "����δ�ƶ�������Ϣ");
	        	  return;
	         }
	         
	         setExchangeRateTextField.setText(""+proPO.getExchangeOfScore());
	         
	    if(equivalentList !=null && equivalentList.size()!=0)     {	
    		for(int i=0;i<equivalentList.size();i++){
    			equivalentTableModel.setValueAt(""+equivalentList.get(i).get(0), i, 0);
    			equivalentTableModel.setValueAt(""+equivalentList.get(i).get(1), i, 1);		
    		}
	    }
	    
	    if(couponRateList!=null && couponRateList.size()!=0){
    		for(int j=0;j<couponRateList.size();j++){
    			couponTableModel.setValueAt(""+couponRateList.get(j), j, 0);
    		}
	    }	
    	}
    }
    
    //��������ֶ�����
    private void savePromotion(){//Jcombobox����
   	 equivalentList=new ArrayList<ArrayList<Double>>();
	 couponRateList=new ArrayList<Double>();
	if(setExchangeRateTextField.getText().equals(""))
		JOptionPane.showMessageDialog(null, "���������Ѷ�Ķһ����� Ϊ�����");
	else{
		if( rateValuable() && trueOfsetEquTable() && trueOfCouTable() ){
			proPO.setExchangeOfScore(Double.parseDouble(setExchangeRateTextField.getText()));
			
			if(setEquTableIsEmpty()){
				
			}else{
			     for(int i=0;i<line;i++){
			    	 if(setEqualityTable.getValueAt(i, 0)==null){
			    		 continue;
			    	 }
			    	 else{
			    		 ArrayList<Double> list=new ArrayList<Double>();
			    		 list.add(Double.parseDouble(setEqualityTable.getValueAt(i, 0).toString().trim()));
			    		 list.add(Double.parseDouble(setEqualityTable.getValueAt(i, 1).toString().trim()));
			    		 equivalentList.add(list);
			    	 }
			     }//for(i)
			}
			
			if(setCouTableIsEmpty()){
				
			}else{
				  for(int i=0;i<line;i++){
				    	 if(setCouponTable.getValueAt(i, 0)==null){
				    		 continue;
				    	 }
				    	 else{    		
				    		 double dou=Double.parseDouble(setCouponTable.getValueAt(i, 0).toString().trim());	
				    		 couponRateList.add(dou);
				    	 }
				     }//for(i)
			}
			
			proPO.setExchangeOfScore(Double.parseDouble(setExchangeRateTextField.getText()));
			proPO.setEquivalentList(equivalentList);
			proPO.setCouponList(couponRateList);
			if(proController.setPromotion_YES(proPO)== ResultMessage.SUCCEED)
				JOptionPane.showMessageDialog(null, "�洢�����ֶγɹ���");
			else 
				JOptionPane.showMessageDialog(null, "�洢ʧ�ܣ�");
			
	    }else JOptionPane.showMessageDialog(null, "�����õ������������ȼ�飡");
		
	}	
    }
//    �鿴�ܾ����ƶ��Ĵ�Χ��������
   @SuppressWarnings("unused")
private void checkPresent(){
	   showPresentTextArea.setText("");
	    ArrayList<Present_Equivalent> present_EquivalentList=proController.getPresent_EquivalentList();
	    ArrayList<Present_Coupon> present_CouponList=proController.getPresent_CouponList();  
	     
	    if(  (present_EquivalentList== null  && present_CouponList==null) || 
	    		  (present_EquivalentList.size()==0 &&  present_CouponList.size()==0 ) ||
	    		  (present_EquivalentList== null  && present_CouponList.size()==0)   ||
	    		  ( present_EquivalentList.size()==0 && present_CouponList==null)  )
		  {
	    	  showPresentTextArea.setText("�ܾ�����δ�ƶ���ȯ,����ȯ�Ѿ��������!");
	      }
	      else{
	    	  Present_Equivalent present_Equivalent;
	    	  Present_Coupon present_Coupon;
//	    	  String equivalent[][];
	    	  //private String equivalent[][]=new String [line][column4];
	    	  //10��,ÿ��ֱ��ʾ:�ȼ�ȯ��ȣ���������Ч��ֹ���ڣ�������� 
	    	  if( present_EquivalentList!= null && present_EquivalentList.size()!=0 ){
	    		  showPresentTextArea.append("**********�ȼ�ȯ**********\n");
	    		  for(int i=0;i<present_EquivalentList.size(); i++){
	    			  present_Equivalent=present_EquivalentList.get(i);
	    			  showPresentTextArea.append("��Ա�ȼ�:"+present_Equivalent.getVIPRank_String() 
	    			  +"  ���:"+present_Equivalent.getDeno()+"Ԫ  "+"�������:"+
	    			  present_Equivalent.getMin()+"Ԫ  "+"����:"+present_Equivalent.getAmount()
	    			  +"��  "+"��Ч��ֹ����:"+CalToStr(present_Equivalent.getEndDate()) +"\n"
	    			  );			  
	    		  }	  
	    	  }
	    	  if( present_CouponList!= null && present_CouponList.size()!=0 ){
	    		  showPresentTextArea.append("**********����ȯ**********\n");
	    		  for(int j=0;j<present_CouponList.size(); j++){
	    			  present_Coupon=present_CouponList.get(j);
	    			  showPresentTextArea.append("��Ա�ȼ�:"+present_Coupon.getVIPRank_String()
	    			    +"  ������:"+present_Coupon.getRate()*10+"��  "+"����:"+present_Coupon.getAmount()
	    			    +"��  "+"��Ч��ֹ����:"+CalToStr(present_Coupon.getEndDate())+"\n"		    					  );
	    		  }   		  
	    	  }   	  
	      }//else	
   }

    
   //���͵ȼ�ȯ
   private void sendEquivalent(){
	   if(!vip1CheckBox.isSelected() && !vip2CheckBox.isSelected() && !vip3CheckBox.isSelected() 
				&&!vip4CheckBox.isSelected() &&!vip5CheckBox.isSelected())
	    {			
		   JOptionPane.showMessageDialog(null, "������ѡ���Ա�ȼ���");
		   return;
		}
	   else if(equivalentList ==null || equivalentList.size()==0){
		   JOptionPane.showMessageDialog(null, "������'���ô����ֶ�'�����ƶ��ȼ�ȯ��Ϣ��");
		   return ;
	   }
	   else{
		   if(StringToInt(amountOfEquivalentTextField.getText()) && 
				                 stringToCalendar(endDateOfEqivalentTextField.getText()) &&
				                 sendEquivalentComboBox.getSelectedIndex()!=-1)
		   {   
			   boolean boo=true;
			   if(vip1CheckBox.isSelected()){
			         if(! present_equSend(VIPRank.VIP1)){
			        	 JOptionPane.showMessageDialog(null,"VIP1��Ա�ĵȼ�ȯ����ʧ�ܣ�");
			        	 boo=false;
			         }
			   }
              if(vip2CheckBox.isSelected()){
            	  if(! present_equSend(VIPRank.VIP2)){
			        	 JOptionPane.showMessageDialog(null,"VIP2��Ա�ĵȼ�ȯ����ʧ�ܣ�");
			        	 boo=false;
			         }
              }
        	      
              if(vip3CheckBox.isSelected()){
            	  if(! present_equSend(VIPRank.VIP3)){
			        	 JOptionPane.showMessageDialog(null,"VIP3��Ա�ĵȼ�ȯ����ʧ�ܣ�");
			        	 boo=false;
			         }
              }
        	          
               if(vip4CheckBox.isSelected()){
            	   if(! present_equSend(VIPRank.VIP4)){
			        	 JOptionPane.showMessageDialog(null,"VIP4��Ա�ĵȼ�ȯ����ʧ�ܣ�");
			        	 boo=false;
			         }
               }
        	          
               if(vip5CheckBox.isSelected()){
            	   if(! present_equSend(VIPRank.VIP5)){
			        	 JOptionPane.showMessageDialog(null,"VIP5��Ա�ĵȼ�ȯ����ʧ�ܣ�");
			        	 boo=false;
			         }
               }
               
               if(boo)
                            JOptionPane.showMessageDialog(null,"�ȼ�ȯ���ͳɹ�");
			 		   
		   }else{
			   JOptionPane.showMessageDialog(null, "�����õĵȼ�ȯ��Ϣ����ȷ��");
		   }	
		}  
   }
   
   //���ʹ���ȯ
   private void sendCoupon(){
	   if(!vip1CheckBox.isSelected() && !vip2CheckBox.isSelected() && !vip3CheckBox.isSelected() 
				&&!vip4CheckBox.isSelected() &&!vip5CheckBox.isSelected())
	    {			
		   JOptionPane.showMessageDialog(null, "������ѡ���Ա�ȼ���");
		   return ;
		}
	   
	   if(equivalentList ==null || equivalentList.size()==0){
		   JOptionPane.showMessageDialog(null, "������'���ô����ֶ�'�����ƶ�����ȯ��Ϣ��");
		   return ;
	   }

		   if(  StringToInt(amountOfCouponTextField.getText()) &&
				   stringToCalendar(endDateOfCouponTextField.getText()) && 
				   sendCouponComboBox.getSelectedIndex()!=-1)
		   {
			   boolean boo=true;
			   if(vip1CheckBox.isSelected()){
			         if(! present_couponSend(VIPRank.VIP1)){
			        	 JOptionPane.showMessageDialog(null,"VIP1��Ա�Ĵ���ȯ����ʧ�ܣ�");
			        	 boo=false;
			         }
			   }
              if(vip2CheckBox.isSelected()){
            	  if(! present_couponSend(VIPRank.VIP2)){
			        	 JOptionPane.showMessageDialog(null,"VIP2��Ա�Ĵ���ȯ����ʧ�ܣ�");
			        	 boo=false;
			         }
              }
        	      
              if(vip3CheckBox.isSelected()){
            	  if(! present_couponSend(VIPRank.VIP3)){
			        	 JOptionPane.showMessageDialog(null,"VIP3��Ա�Ĵ���ȯ����ʧ�ܣ�");
			        	 boo=false;
			         }
              }
        	          
               if(vip4CheckBox.isSelected()){
            	   if(! present_couponSend(VIPRank.VIP4)){
			        	 JOptionPane.showMessageDialog(null,"VIP4��Ա�Ĵ���ȯ����ʧ�ܣ�");
			        	 boo=false;
			         }
               }
        	          
               if(vip5CheckBox.isSelected()){
            	   if(! present_couponSend(VIPRank.VIP5)){
			        	 JOptionPane.showMessageDialog(null,"VIP5��Ա�Ĵ���ȯ����ʧ�ܣ�");
			        	 boo=false;
			         }
               }
               
               if(boo)
                            JOptionPane.showMessageDialog(null,"����ȯ���ͳɹ�");
			   
		   }else{
			   JOptionPane.showMessageDialog(null, "�����õĴ���ȯ��Ϣ����ȷ��");
		   }
   }
   
   //�ȼ�ȯtable���
    private void cleanEquiTable(){
    	for(int i=0;i<line;i++)
    		for (int j=0;j<2;j++)
    	        setEqualityTable.setValueAt(null, i, j);
    }
    //����ȯTable���
    private void cleanConTable(){
    	for(int i=0;i<line;i++)
    		setCouponTable.setValueAt(null, i, 0);
    }

    //setExchangeRateTextField�����Ƿ���ȷ
    private boolean rateValuable(){
    	try {
			double d=Double.parseDouble(setExchangeRateTextField.getText());
			if(d<0.000001 || (Math.abs(d-0.000001)<0.000001) || d>100.0 || (Math.abs(d-100.0)<0.000001))
				return false;
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		} 	
    }
    //setEquivalentTable�Ƿ�Ϊ��
    private boolean setEquTableIsEmpty(){
    	for(int i=0;i<line;i++){
    		for(int j=0;j<2;j++){
    			if(setEqualityTable.getValueAt(i, j)!= null)
    				return false;
    		}
    	}
    	return true;
    }
    //setCouponTable�Ƿ�Ϊ��
    private boolean setCouTableIsEmpty(){
    	for(int i=0;i<line;i++){
    		if(setCouponTable.getValueAt(i, 0)!=null)
    			return false;
    	}
    	return true;
    }
    //setEquivalentTable�������Ƿ����,(����Ϊ��)
    private boolean trueOfsetEquTable(){
    	  double d1,d2;
  	      //boolean boo=false;//�жϱ���Ƿ�Ϊ��
  	    try {
  			for(int i=0;i<line;i++){
  				if(setEqualityTable.getValueAt(i, 0)==null && setEqualityTable.getValueAt(i, 1)==null)
  					continue;//���һ�������У���������Ϊ�գ�����һ��������Ч
  				else{
  				d1=Double.parseDouble(setEqualityTable.getValueAt(i, 0).toString().trim());
  				d2=Double.parseDouble(setEqualityTable.getValueAt(i, 1).toString().trim() );
 				//boo=true;
  				if(d1<0.000001 || d2<0.000001)//�����ݴ�����
  					return false;
  			    }	
  			}//for
  			return true;
  		} catch (Exception e) {
  			return false;
  		}
    }
    //setCouponTable�������Ƿ��������Ϊ�գ�
    private boolean trueOfCouTable(){
    	double d;
    	try {
    		for(int i=0;i<line;i++){
    			if(setCouponTable.getValueAt(i, 0)==null)
    				continue;
    			else{
    				d=Double.parseDouble(setCouponTable.getValueAt(i, 0).toString().trim());
    				if(d<0.000001 || (d-1.0)>0.000001 || Math.abs(d-1.0)<0.000001)   return false;
    			}
    		}
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
    }
    
  //Calendar ת����String
	   private String CalToStr(Calendar cal){
		   SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd");
		   try{
			   return dateFormat.format(cal.getTime());
		   }catch(Exception e){
			   e.printStackTrace();
			   return "";
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
		
		//String ת����int ,�Ҵ�����
		private boolean StringToInt(String s){
			try {
				int in=Integer.parseInt(s);
				if(in<1)
					return false;
				return true;
			} catch (Exception e) {
				// TODO: handle exception
				return false;
			}
		}
		//private  String[] equi=new String[line];
		//private String[] cou=new String[line];
		//    private ArrayList<ArrayList<Double>> equivalentList=new ArrayList<ArrayList<Double>>();
		//private ArrayList<Double> couponRateList=new ArrayList<Double>();
		//JComBoBox ,sendEquivalentComboBox�Զ�����
		private void updateComBoBox(){
			proPO=proController.getProPO();
			equivalentList=proPO.getEquivalentList();
			couponRateList=proPO.getCouponrateList();
			String e[];
			String c[];
			
			if(equivalentList !=null && equivalentList.size()!=0){
				 e=new String[equivalentList.size()];
			    for(int i=0;i<equivalentList.size(); i++){
				    e[i]=equivalentList.get(i).get(0)+"Ԫ,�������"+equivalentList.get(i).get(1)+"Ԫ";
			    }
			    sendEquivalentComboBox.setModel(new DefaultComboBoxModel(e));
			}
			if(couponRateList!=null && couponRateList.size() !=0){
				 c=new String[couponRateList.size()];
			     for(int  j=0;j<couponRateList.size(); j++){
				     c[j]=couponRateList.get(j)*10+"��";
			     }
			     sendCouponComboBox.setModel(new DefaultComboBoxModel(c));
			}
			
			
				
			}
			
    private boolean present_equSend(VIPRank vipX){
    	Present_Equivalent pre_equ=new Present_Equivalent(vipX, 
    			getDeno(), getMin(),
    			Integer.parseInt(amountOfEquivalentTextField.getText()) , 
    			strToCal(endDateOfEqivalentTextField.getText()));
    	if(proController.writePresnet_Equivalent(pre_equ)== ResultMessage.SUCCEED)
    		return true;
    	else return false;
	
    }
    
    private boolean present_couponSend(VIPRank vipX){
    	Present_Coupon pre_couCoupon=new Present_Coupon(vipX, getRate(), 
    			     Integer.parseInt(endDateOfCouponTextField.getText()), 
    			     strToCal(endDateOfCouponTextField.getText()));
    	if(proController.writePresent_Coupon(pre_couCoupon)== ResultMessage.SUCCEED){
    		return true;
    	}else 	return false;
    }
    
    //�ӽ����ϻ�ȡѡȡ����ȯֵ
    private double getDeno(){
    	int de=sendEquivalentComboBox.getSelectedIndex();
    	return equivalentList.get(de).get(0);
    	
    }
    private double getMin(){
    	int mi=sendEquivalentComboBox.getSelectedIndex();
    	return equivalentList.get(mi).get(1);
    }
    private double getRate(){
    	int ra=sendCouponComboBox.getSelectedIndex();
    	return couponRateList.get(ra);
    }
    
    private Calendar strToCal(String s){
    	try {
    		Calendar calendar=Calendar.getInstance();
			SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd");
			Date date=dateFormat.parse(s);
			calendar.setTime(date);
			return calendar;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
    }
	
}
