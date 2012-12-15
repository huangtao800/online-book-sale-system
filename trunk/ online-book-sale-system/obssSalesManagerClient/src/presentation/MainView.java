package presentation;
//���ʹ�
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import po.BookPO;
import po.MemberPO;
import po.OrderPO;
import po.OrderState;
import po.Present_Coupon;
import po.Present_Equivalent;
import po.ResultMessage;
import po.SalesManagerPO;
import po.UserRole;
import presentationController.changePasswordView.changePasswordController;
import presentationController.changePasswordView.changePasswordControllerInterface;
import presentationController.changeUserNameView.changeUserNameController;
import presentationController.changeUserNameView.changeUserNameControllerInterface;
import presentationController.mainView.MainViewController;
import presentationController.mainView.MainViewControllerInterface;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.org.apache.xml.internal.serializer.utils.StringToIntTable;

public class MainView extends JFrame implements ActionListener{
	   MainViewControllerInterface mainViewController;
	   private int lineOfUncompletedOrder=11;//��ʼΪ11
//	   private JTable orderTable;
	   private DefaultTableModel tableModel;
	   private SalesManagerPO userpo;
	   private ArrayList<OrderPO> uncompletedOrderList;
//	   SalesManagerModelInterface model;
	
	    private javax.swing.JButton addBookButton;
	    private javax.swing.JTextField bookAutherTextField;
	    private javax.swing.JTextField bookIDTextField;
	    private javax.swing.JTextField bookNameTextField;
	    private javax.swing.JTextField bookNumberTextField;
	    private javax.swing.JPanel bookPanel;
	    private javax.swing.JTextField bookPriceTextField;
	    private javax.swing.JTextField bookPublishHouseTextField;
	    private javax.swing.JTextField bookPublishYearField;
	    private javax.swing.JList bookTypeList;
	    private javax.swing.JPanel bookTypejPanel;
	    private javax.swing.ButtonGroup buttonGroup1;
	    private javax.swing.JButton changeBookButton;
	    private javax.swing.JButton changeOrderButton;
	    private javax.swing.JButton checkMemberInforButton;
	    private javax.swing.JButton checkPresentButton;
	    private javax.swing.JButton confirmChangeBookButton;
	    private javax.swing.JButton deleteBookButton;
	    private javax.swing.JRadioButton distributionRadioButton;
	    private javax.swing.JPanel homePagePanel;
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton jButton2;
	    private javax.swing.JButton jButton3;
	    private javax.swing.JButton changeUserNameButton;
	    private javax.swing.JButton changeUserPasswordButton;
	    private javax.swing.JButton exitButton;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel10;
	    private javax.swing.JLabel jLabel11;
	    private javax.swing.JLabel jLabel13;
	    private javax.swing.JLabel jLabel14;
	    private javax.swing.JLabel jLabel15;
	    private javax.swing.JLabel jLabel19;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel20;
	    private javax.swing.JLabel jLabel21;
	    private javax.swing.JLabel jLabel22;
	    private javax.swing.JLabel jLabel23;
	    private javax.swing.JLabel jLabel24;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JLabel jLabel5;
	    private javax.swing.JLabel jLabel6;
	    private javax.swing.JLabel jLabel7;
	    private javax.swing.JLabel jLabel8;
	    private javax.swing.JLabel jLabel9;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JScrollPane jScrollPane2;
	    private javax.swing.JScrollPane jScrollPane3;
	    private javax.swing.JScrollPane jScrollPane4;
	    private javax.swing.JScrollPane jScrollPane5;
	    private javax.swing.JScrollPane jScrollPane6;
	    private javax.swing.JTabbedPane mainViewTabbedPane;
	    private javax.swing.JTextField memberIDTextField;
	    private javax.swing.JTextArea memberInforTextArea;
	    private javax.swing.JTextArea memberOrderTextArea;
	    private javax.swing.JPanel memberPanel;
	    private javax.swing.JPanel orderPanel;
	    private javax.swing.JTable orderTable;
	    private javax.swing.JRadioButton orderedRadioButton;
	    private javax.swing.JPanel presentPanel;
	    private javax.swing.JButton sendPresentButton;
	    private javax.swing.JTextArea showPresentTextArea;
	    private javax.swing.JRadioButton signedRadioButton;
	    private javax.swing.JRadioButton transportRadioButton;
	    private javax.swing.JComboBox typeComboBox;
	    private javax.swing.JButton updateOrderButton;
	    private javax.swing.JLabel userNameLabel;
	    // End of variables declaration
	    
	    public MainView(MainViewControllerInterface mainViewController){
	    	super("���۾����������");
	    	this.mainViewController=mainViewController;
	    }
	    
	    @SuppressWarnings("unchecked")
		public void createMainView(){

	        buttonGroup1 = new javax.swing.ButtonGroup();
	        mainViewTabbedPane = new javax.swing.JTabbedPane();
	        homePagePanel = new javax.swing.JPanel();
	        jLabel15 = new javax.swing.JLabel();
	        jLabel19 = new javax.swing.JLabel();
	        jLabel20 = new javax.swing.JLabel();
	        jLabel21 = new javax.swing.JLabel();
	        jLabel22 = new javax.swing.JLabel();
	        jLabel23 = new javax.swing.JLabel();
	        jLabel24 = new javax.swing.JLabel();
	        memberPanel = new javax.swing.JPanel();
	        checkMemberInforButton = new javax.swing.JButton();
	        jLabel8 = new javax.swing.JLabel();
	        memberIDTextField = new javax.swing.JTextField();
	        jLabel9 = new javax.swing.JLabel();
	        jLabel10 = new javax.swing.JLabel();
	        jScrollPane4 = new javax.swing.JScrollPane();
	        memberInforTextArea = new javax.swing.JTextArea();
	        jScrollPane5 = new javax.swing.JScrollPane();
	        memberOrderTextArea = new javax.swing.JTextArea();
	        presentPanel = new javax.swing.JPanel();
	        checkPresentButton = new javax.swing.JButton();
	        sendPresentButton = new javax.swing.JButton();
	        jScrollPane2 = new javax.swing.JScrollPane();
	        showPresentTextArea = new javax.swing.JTextArea();
	        orderPanel = new javax.swing.JPanel();
	        jScrollPane3 = new javax.swing.JScrollPane();
	        orderTable = new javax.swing.JTable();
	        updateOrderButton = new javax.swing.JButton();
	        orderedRadioButton = new javax.swing.JRadioButton();
	        distributionRadioButton = new javax.swing.JRadioButton();
	        transportRadioButton = new javax.swing.JRadioButton();
	        signedRadioButton = new javax.swing.JRadioButton();
	        jLabel7 = new javax.swing.JLabel();
	        changeOrderButton = new javax.swing.JButton();
	        bookPanel = new javax.swing.JPanel();
	        addBookButton = new javax.swing.JButton();
	        deleteBookButton = new javax.swing.JButton();
	        changeBookButton = new javax.swing.JButton();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        jLabel4 = new javax.swing.JLabel();
	        jLabel5 = new javax.swing.JLabel();
	        jLabel6 = new javax.swing.JLabel();
	        bookIDTextField = new javax.swing.JTextField();
	        bookAutherTextField = new javax.swing.JTextField();
	        bookPublishYearField = new javax.swing.JTextField();
	        bookPublishHouseTextField = new javax.swing.JTextField();
	        bookNameTextField = new javax.swing.JTextField();
	        confirmChangeBookButton = new javax.swing.JButton();
	        jLabel13 = new javax.swing.JLabel();
	        bookPriceTextField = new javax.swing.JTextField();
	        jLabel14 = new javax.swing.JLabel();
	        bookNumberTextField = new javax.swing.JTextField();
	        typeComboBox = new javax.swing.JComboBox();
	        bookTypejPanel = new javax.swing.JPanel();
	        jScrollPane6 = new javax.swing.JScrollPane();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        bookTypeList = new javax.swing.JList();
	        jButton1 = new javax.swing.JButton();
	        jButton2 = new javax.swing.JButton();
	        jButton3 = new javax.swing.JButton();
	        jPanel1 = new javax.swing.JPanel();
	        jLabel11 = new javax.swing.JLabel();
	        userNameLabel = new javax.swing.JLabel();
	        changeUserNameButton = new javax.swing.JButton();
	        changeUserPasswordButton = new javax.swing.JButton();
	        exitButton = new javax.swing.JButton();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jLabel15.setFont(new java.awt.Font("��Բ", 1, 24)); // NOI18N
	        jLabel15.setForeground(new java.awt.Color(255, 153, 0));
	        jLabel15.setText("��ӭ�������Ϲ���ϵͳ ���۾���ͻ���");

	        jLabel19.setFont(new java.awt.Font("����", 2, 18)); // NOI18N
	        jLabel19.setText("�鿴�˿���Ϣ");

	        jLabel20.setFont(new java.awt.Font("����", 2, 18)); // NOI18N
	        jLabel20.setText("������ȯ");

	        jLabel21.setFont(new java.awt.Font("����", 2, 18)); // NOI18N
	        jLabel21.setText("������");

	        jLabel22.setFont(new java.awt.Font("����", 2, 18)); // NOI18N
	        jLabel22.setText("����ͼ��");

	        jLabel23.setFont(new java.awt.Font("��Բ", 1, 18)); // NOI18N
	        jLabel23.setText("�����Խ��У�");

	        jLabel24.setFont(new java.awt.Font("����", 2, 18)); // NOI18N
	        jLabel24.setText("�޸ĸ�����Ϣ");

	        javax.swing.GroupLayout homePagePanelLayout = new javax.swing.GroupLayout(homePagePanel);
	        homePagePanel.setLayout(homePagePanelLayout);
	        homePagePanelLayout.setHorizontalGroup(
	            homePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(homePagePanelLayout.createSequentialGroup()
	                .addGroup(homePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(homePagePanelLayout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(homePagePanelLayout.createSequentialGroup()
	                        .addGap(117, 117, 117)
	                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(homePagePanelLayout.createSequentialGroup()
	                        .addGap(227, 227, 227)
	                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(homePagePanelLayout.createSequentialGroup()
	                        .addGap(313, 313, 313)
	                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap(204, Short.MAX_VALUE))
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePagePanelLayout.createSequentialGroup()
	                .addGap(0, 0, Short.MAX_VALUE)
	                .addGroup(homePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePagePanelLayout.createSequentialGroup()
	                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(284, 284, 284))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePagePanelLayout.createSequentialGroup()
	                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(154, 154, 154))))
	        );
	        homePagePanelLayout.setVerticalGroup(
	            homePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(homePagePanelLayout.createSequentialGroup()
	                .addGap(21, 21, 21)
	                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGroup(homePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(homePagePanelLayout.createSequentialGroup()
	                        .addGap(45, 45, 45)
	                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(30, 30, 30)
	                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(37, 37, 37)
	                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(42, 42, 42)
	                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
	                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(30, 30, 30))
	                    .addGroup(homePagePanelLayout.createSequentialGroup()
	                        .addGap(18, 18, 18)
	                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addContainerGap())))
	        );

	        mainViewTabbedPane.addTab("       ��ҳ       ", homePagePanel);

	        checkMemberInforButton.setBackground(new java.awt.Color(0, 255, 255));
	        checkMemberInforButton.setFont(new java.awt.Font("��Բ", 1, 24)); // NOI18N
	        checkMemberInforButton.setForeground(new java.awt.Color(0, 51, 102));
	        checkMemberInforButton.setText("�鿴�˿���Ϣ");

	        jLabel8.setFont(new java.awt.Font("��Բ", 2, 14)); // NOI18N
	        jLabel8.setText("�˿ͱ�ţ�");

	        jLabel9.setFont(new java.awt.Font("��Բ", 0, 18)); // NOI18N
	        jLabel9.setText("������Ϣ");

	        jLabel10.setFont(new java.awt.Font("��Բ", 0, 18)); // NOI18N
	        jLabel10.setText("�����¼");

	        memberInforTextArea.setColumns(20);
	        memberInforTextArea.setRows(5);
	        jScrollPane4.setViewportView(memberInforTextArea);

	        memberOrderTextArea.setColumns(20);
	        memberOrderTextArea.setRows(5);
	        jScrollPane5.setViewportView(memberOrderTextArea);

	        javax.swing.GroupLayout memberPanelLayout = new javax.swing.GroupLayout(memberPanel);
	        memberPanel.setLayout(memberPanelLayout);
	        memberPanelLayout.setHorizontalGroup(
	            memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(memberPanelLayout.createSequentialGroup()
	                .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(memberPanelLayout.createSequentialGroup()
	                        .addGap(102, 102, 102)
	                        .addComponent(memberIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(memberPanelLayout.createSequentialGroup()
	                        .addGap(26, 26, 26)
	                        .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(checkMemberInforButton)
	                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                .addContainerGap())
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, memberPanelLayout.createSequentialGroup()
	                .addContainerGap(259, Short.MAX_VALUE)
	                .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, memberPanelLayout.createSequentialGroup()
	                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(47, 47, 47)
	                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(41, 41, 41))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, memberPanelLayout.createSequentialGroup()
	                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(178, 178, 178)
	                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(113, 113, 113))))
	        );
	        memberPanelLayout.setVerticalGroup(
	            memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(memberPanelLayout.createSequentialGroup()
	                .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(memberPanelLayout.createSequentialGroup()
	                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(24, 24, 24))
	                    .addGroup(memberPanelLayout.createSequentialGroup()
	                        .addGap(16, 16, 16)
	                        .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(memberIDTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
	                        .addGap(74, 74, 74)))
	                .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(checkMemberInforButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(35, 35, 35))
	        );

	        mainViewTabbedPane.addTab("    �˿���Ϣ��ѯ     ", memberPanel);

	        checkPresentButton.setBackground(new java.awt.Color(0, 153, 153));
	        checkPresentButton.setFont(new java.awt.Font("��Բ", 1, 18)); // NOI18N
	        checkPresentButton.setForeground(new java.awt.Color(255, 102, 102));
	        checkPresentButton.setText("�鿴��ȯ������Ϣ");

	        sendPresentButton.setBackground(new java.awt.Color(0, 204, 204));
	        sendPresentButton.setFont(new java.awt.Font("��Բ", 1, 18)); // NOI18N
	        sendPresentButton.setForeground(new java.awt.Color(255, 0, 0));
	        sendPresentButton.setText("ȷ������");
	
	        showPresentTextArea.setColumns(20);
	        showPresentTextArea.setRows(5);
	        jScrollPane2.setViewportView(showPresentTextArea);

	        javax.swing.GroupLayout presentPanelLayout = new javax.swing.GroupLayout(presentPanel);
	        presentPanel.setLayout(presentPanelLayout);
	        presentPanelLayout.setHorizontalGroup(
	            presentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(presentPanelLayout.createSequentialGroup()
	                .addGroup(presentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(presentPanelLayout.createSequentialGroup()
	                        .addGap(117, 117, 117)
	                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(presentPanelLayout.createSequentialGroup()
	                        .addGap(256, 256, 256)
	                        .addComponent(checkPresentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(presentPanelLayout.createSequentialGroup()
	                        .addGap(307, 307, 307)
	                        .addComponent(sendPresentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap(160, Short.MAX_VALUE))
	        );
	        presentPanelLayout.setVerticalGroup(
	            presentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(presentPanelLayout.createSequentialGroup()
	                .addGap(24, 24, 24)
	                .addComponent(checkPresentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(32, 32, 32)
	                .addComponent(sendPresentButton, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
	                .addGap(25, 25, 25))
	        );

	        mainViewTabbedPane.addTab("      ��ȯ����       ", presentPanel);

	        orderTable.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {
	                {null, null, null, null, null},
	                {null, null, null, null, null},
	                {null, null, null, null, null},
	                {null, null, null, null, null},
	                {null, null, null, null, null},
	                {null, null, null, null, null},
	                {null, null, null, null, null},
	                {null, null, null, null, null},
	                {null, null, null, null, null},
	                {null, null, null, null, null},
	                {null, null, null, null, null}
	            },
	            new String [] {
	                "������", "�µ�ʱ��", "�ܼ�", "�˿ͱ��", "����״̬"
	            }
	        ) {
	            Class[] types = new Class [] {
	                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
	            };
	            boolean[] canEdit = new boolean [] {
	                false, false, false, false, false
	            };

	            public Class getColumnClass(int columnIndex) {
	                return types [columnIndex];
	            }

	            public boolean isCellEditable(int rowIndex, int columnIndex) {
	                return canEdit [columnIndex];
	            }
	        });
	        jScrollPane3.setViewportView(orderTable);

	        updateOrderButton.setBackground(new java.awt.Color(0, 204, 204));
	        updateOrderButton.setFont(new java.awt.Font("��Բ", 1, 18)); // NOI18N
	        updateOrderButton.setForeground(new java.awt.Color(102, 102, 102));
	        updateOrderButton.setText("����δ��ɵĶ���");

	        buttonGroup1.add(orderedRadioButton);
	        orderedRadioButton.setFont(new java.awt.Font("����", 2, 14)); // NOI18N
	        orderedRadioButton.setText("���µ�");

	        buttonGroup1.add(distributionRadioButton);
	        distributionRadioButton.setFont(new java.awt.Font("����", 2, 14)); // NOI18N
	        distributionRadioButton.setText("�ֿ����");

	        buttonGroup1.add(transportRadioButton);
	        transportRadioButton.setFont(new java.awt.Font("����", 2, 14)); // NOI18N
	        transportRadioButton.setText("��������");

	        buttonGroup1.add(signedRadioButton);
	        signedRadioButton.setFont(new java.awt.Font("����", 2, 14)); // NOI18N
	        signedRadioButton.setText("��ǩ��");
	
	        jLabel7.setFont(new java.awt.Font("����", 2, 14)); // NOI18N
	        jLabel7.setText("����״̬��");

	        changeOrderButton.setBackground(new java.awt.Color(255, 102, 102));
	        changeOrderButton.setFont(new java.awt.Font("��Բ", 1, 18)); // NOI18N
	        changeOrderButton.setForeground(new java.awt.Color(0, 102, 102));
	        changeOrderButton.setText("�޸Ķ���״̬");

	        javax.swing.GroupLayout orderPanelLayout = new javax.swing.GroupLayout(orderPanel);
	        orderPanel.setLayout(orderPanelLayout);
	        orderPanelLayout.setHorizontalGroup(
	            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(orderPanelLayout.createSequentialGroup()
	                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(orderPanelLayout.createSequentialGroup()
	                        .addGap(250, 250, 250)
	                        .addComponent(updateOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(orderPanelLayout.createSequentialGroup()
	                        .addGap(122, 122, 122)
	                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(orderPanelLayout.createSequentialGroup()
	                        .addGap(39, 39, 39)
	                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addComponent(orderedRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(37, 37, 37)
	                        .addComponent(distributionRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(46, 46, 46)
	                        .addComponent(transportRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(31, 31, 31)
	                        .addComponent(signedRadioButton))
	                    .addGroup(orderPanelLayout.createSequentialGroup()
	                        .addGap(293, 293, 293)
	                        .addComponent(changeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap(185, Short.MAX_VALUE))
	        );
	        orderPanelLayout.setVerticalGroup(
	            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(orderPanelLayout.createSequentialGroup()
	                .addGap(25, 25, 25)
	                .addComponent(updateOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(27, 27, 27)
	                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(51, 51, 51)
	                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(orderedRadioButton)
	                    .addComponent(distributionRadioButton)
	                    .addComponent(transportRadioButton)
	                    .addComponent(signedRadioButton))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
	                .addComponent(changeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(36, 36, 36))
	        );

	        mainViewTabbedPane.addTab("      ��������      ", orderPanel);

	        addBookButton.setBackground(new java.awt.Color(0, 204, 204));
	        addBookButton.setFont(new java.awt.Font("��Բ", 1, 18)); // NOI18N
	        addBookButton.setText("���ͼ��");

	        deleteBookButton.setBackground(new java.awt.Color(0, 204, 204));
	        deleteBookButton.setFont(new java.awt.Font("��Բ", 1, 18)); // NOI18N
	        deleteBookButton.setText("ɾ��ͼ��");

	        changeBookButton.setBackground(new java.awt.Color(0, 204, 204));
	        changeBookButton.setFont(new java.awt.Font("��Բ", 1, 18)); // NOI18N
	        changeBookButton.setText("�޸�ͼ��");

	        jLabel1.setFont(new java.awt.Font("����", 0, 14)); // NOI18N
	        jLabel1.setText("ͼ�����ƣ�");

	        jLabel2.setFont(new java.awt.Font("����", 0, 14)); // NOI18N
	        jLabel2.setText("ͼ���ţ�");

	        jLabel3.setFont(new java.awt.Font("����", 0, 14)); // NOI18N
	        jLabel3.setText("���ߣ�");

	        jLabel4.setFont(new java.awt.Font("����", 0, 14)); // NOI18N
	        jLabel4.setText("�����磺");

	        jLabel5.setFont(new java.awt.Font("����", 0, 14)); // NOI18N
	        jLabel5.setText("������ݣ�");

	        jLabel6.setFont(new java.awt.Font("����", 0, 14)); // NOI18N
	        jLabel6.setText("ͼ�����");

	        confirmChangeBookButton.setBackground(new java.awt.Color(0, 204, 204));
	        confirmChangeBookButton.setFont(new java.awt.Font("��Բ", 1, 18)); // NOI18N
	        confirmChangeBookButton.setForeground(new java.awt.Color(255, 0, 0));
	        confirmChangeBookButton.setText("ȷ���޸�");

	        jLabel13.setFont(new java.awt.Font("����", 0, 14)); // NOI18N
	        jLabel13.setText("�۸�/Ԫ��");

	        jLabel14.setFont(new java.awt.Font("����", 0, 14)); // NOI18N
	        jLabel14.setText("����/�᣺");

	        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
	        
	        
	        javax.swing.GroupLayout bookPanelLayout = new javax.swing.GroupLayout(bookPanel);
	        bookPanel.setLayout(bookPanelLayout);
	        bookPanelLayout.setHorizontalGroup(
	            bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookPanelLayout.createSequentialGroup()
	                .addContainerGap(293, Short.MAX_VALUE)
	                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookPanelLayout.createSequentialGroup()
	                        .addComponent(addBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(305, 305, 305))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookPanelLayout.createSequentialGroup()
	                        .addComponent(changeBookButton)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(confirmChangeBookButton)
	                        .addGap(266, 266, 266))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookPanelLayout.createSequentialGroup()
	                        .addComponent(deleteBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(303, 303, 303))))
	            .addGroup(bookPanelLayout.createSequentialGroup()
	                .addGap(17, 17, 17)
	                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(bookPanelLayout.createSequentialGroup()
	                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(bookPublishYearField, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
	                            .addComponent(bookNumberTextField))
	                        .addGap(18, 18, 18)
	                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jLabel3)
	                            .addComponent(jLabel4))
	                        .addGap(13, 13, 13))
	                    .addGroup(bookPanelLayout.createSequentialGroup()
	                        .addComponent(jLabel2)
	                        .addGap(10, 10, 10)
	                        .addComponent(bookIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addComponent(jLabel1)))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(bookPanelLayout.createSequentialGroup()
	                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(bookPublishHouseTextField)
	                            .addComponent(bookAutherTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
	                        .addGap(36, 36, 36)
	                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addComponent(jLabel13)
	                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(18, 18, 18)
	                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(bookPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                    .addComponent(bookNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap(72, Short.MAX_VALUE))
	        );
	        bookPanelLayout.setVerticalGroup(
	            bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(bookPanelLayout.createSequentialGroup()
	                .addGap(18, 18, 18)
	                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(bookIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(bookNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(bookPanelLayout.createSequentialGroup()
	                        .addGap(25, 25, 25)
	                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(bookNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(16, 16, 16))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookPanelLayout.createSequentialGroup()
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                .addComponent(bookAutherTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addComponent(bookPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                        .addGap(17, 17, 17)))
	                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(bookPanelLayout.createSequentialGroup()
	                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(bookPanelLayout.createSequentialGroup()
	                                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                                    .addComponent(bookPublishYearField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(bookPublishHouseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                .addGap(42, 42, 42)
	                                .addComponent(addBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(43, 43, 43))
	                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookPanelLayout.createSequentialGroup()
	                                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                .addGap(116, 116, 116)))
	                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(changeBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(confirmChangeBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(42, 42, 42)
	                        .addComponent(deleteBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGap(62, 62, 62))
	        );

	        mainViewTabbedPane.addTab("     ͼ�����      ", bookPanel);

	        bookTypeList.setModel(new javax.swing.AbstractListModel() {
	            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
	            public int getSize() { return strings.length; }
	            public Object getElementAt(int i) { return strings[i]; }
	        });
	        
	        
	        jScrollPane1.setViewportView(bookTypeList);

	        jScrollPane6.setViewportView(jScrollPane1);

	        jButton1.setBackground(new java.awt.Color(153, 255, 0));
	        jButton1.setFont(new java.awt.Font("��Բ", 1, 24)); // NOI18N
	        jButton1.setText("����ͼ�����");

	        jButton2.setBackground(new java.awt.Color(153, 255, 0));
	        jButton2.setFont(new java.awt.Font("��Բ", 1, 24)); // NOI18N
	        jButton2.setText("ɾ��ͼ�����");

	        jButton3.setBackground(new java.awt.Color(153, 255, 0));
	        jButton3.setFont(new java.awt.Font("��Բ", 1, 24)); // NOI18N
	        jButton3.setText("�޸�ͼ�����");

	        javax.swing.GroupLayout bookTypejPanelLayout = new javax.swing.GroupLayout(bookTypejPanel);
	        bookTypejPanel.setLayout(bookTypejPanelLayout);
	        bookTypejPanelLayout.setHorizontalGroup(
	            bookTypejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(bookTypejPanelLayout.createSequentialGroup()
	                .addGap(125, 125, 125)
	                .addGroup(bookTypejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
	                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(116, 116, 116))
	        );
	        bookTypejPanelLayout.setVerticalGroup(
	            bookTypejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(bookTypejPanelLayout.createSequentialGroup()
	                .addGroup(bookTypejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(bookTypejPanelLayout.createSequentialGroup()
	                        .addGap(79, 79, 79)
	                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(53, 53, 53)
	                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(53, 53, 53)
	                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(bookTypejPanelLayout.createSequentialGroup()
	                        .addGap(56, 56, 56)
	                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGap(0, 45, Short.MAX_VALUE))
	        );

	        mainViewTabbedPane.addTab("   ����ͼ�����   ", bookTypejPanel);

	        jLabel11.setFont(new java.awt.Font("��������", 0, 18)); // NOI18N
	        jLabel11.setText("�û�����");

	        changeUserNameButton.setFont(new java.awt.Font("��Բ", 2, 18)); // NOI18N
	        changeUserNameButton.setText("�޸��û���");

	        changeUserPasswordButton.setFont(new java.awt.Font("��Բ", 2, 18)); // NOI18N
	        changeUserPasswordButton.setText("�޸�����");

	        exitButton.setFont(new java.awt.Font("��Բ", 2, 18)); // NOI18N
	        exitButton.setText("�˳�");

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(265, 265, 265)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addComponent(changeUserPasswordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addGap(46, 46, 46)
	                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(23, 23, 23))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addComponent(changeUserNameButton)
	                        .addContainerGap())))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(0, 0, Short.MAX_VALUE))
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(changeUserNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(changeUserPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap(12, Short.MAX_VALUE))
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(mainViewTabbedPane, javax.swing.GroupLayout.Alignment.LEADING))
	                .addGap(0, 0, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addGap(18, 18, 18)
	                .addComponent(mainViewTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
	        );

	        pack();
	   //*************************************************************************************************************     
	        //presentPanel
	        showPresentTextArea.setEditable(false);   
	        checkPresentButton.addActionListener(this);
	        sendPresentButton.addActionListener(this);
	        
	        //bookPanel
	        addBookButton.addActionListener(this);
	        deleteBookButton.addActionListener(this);
	        confirmChangeBookButton.addActionListener(this);
	        confirmChangeBookButton.setEnabled(false);
	        changeBookButton.addActionListener(this);
//	        bookIDTextField.setEditable(false);
	        
	        // orderPanel
	        updateOrderButton.addActionListener(this);
	        changeOrderButton.addActionListener(this);
	        orderTable.setEnabled(false);
       
	        //memberPanel
	        checkMemberInforButton.addActionListener(this);
	        memberInforTextArea.setEditable(false);
	        memberOrderTextArea.setEditable(false);
	        
	       //��������panel
	        userpo=mainViewController.getUserPO();
	        userNameLabel.setText(userpo.getUserName());
	        changeUserNameButton.addActionListener(this);
	        changeUserPasswordButton.addActionListener(this);
	        exitButton.addActionListener(this);
	        
	        jButton1.addActionListener(this);
	        jButton2.addActionListener(this);
	        jButton3.addActionListener(this);
	        
	        bookTypeList.setModel(new TypeListModel());
	        
	        this.setVisible(true);
	        
	        ArrayList<Present_Equivalent> present_EquivalentList=mainViewController.getPresent_EquivalentList();
		    ArrayList<Present_Coupon> present_CouponList=mainViewController.getPresent_CouponList();  
	        
		    if(   (present_EquivalentList!=null && present_EquivalentList.size() !=0)  ||
		    		(present_CouponList !=null && present_CouponList.size() !=0)     )
		    {
		    	JOptionPane.showMessageDialog(null, "�ܾ������ƶ��˴�Χ��������,������Ϊ���Ĺ˿�������ȯ��");
		    }
	        
	      
//	        ArrayList<String> bookTypeList=mainViewController.getTypeList();
//	        String[] typeStrings=new String[bookTypeList.size()];
//	        for(int i=0;i<bookTypeList.size();i++){
//	        	typeStrings[i]=bookTypeList.get(i);
//	        }
//	        typeComboBox.setModel(new DefaultComboBoxModel(typeStrings));
	        setTypeComboxModel();
	    }
//������*************************************************************************************************************

                   //	    private boolean checkPresentFirst=false;
	    
 //�¼���Ӧ    
	    public void actionPerformed(ActionEvent event){
	    	String isbn="";
//�鿴�ܾ����ƶ��Ĵ�Χ��������    	
	       if(event.getSource()==checkPresentButton){     
                   checkPresent();
	    	}
	    	
//��ȯ����
	    	else if(event.getSource()==sendPresentButton){	 
	    		ResultMessage result= mainViewController.sendPresent();
	    		if(result== ResultMessage.NOTEXIST)
	    	        JOptionPane.showMessageDialog(null, "�ܾ���δ�ƶ���ȯ �� ��ȯ�Ѿ�������ϣ�");
	    		else if(result ==ResultMessage.OVORTIME){
	    		   JOptionPane.showMessageDialog(null, "��ȯ������ϣ����ѽ����ڵ���ȯɾ����");
	    		}else if(result== ResultMessage.SUCCEED){
	    		   JOptionPane.showMessageDialog(null, "��ȯ������ϣ�");
	    		}
	    	}
	    	
//���ͼ��
	    	else if(event.getSource() == addBookButton){
	    		bookIDTextField.setEditable(true);
	    		if(bookInforTrue()){
	    		     BookPO bookPO=new BookPO(bookIDTextField.getText(), bookNameTextField.getText(), 
	    		    		                                         bookAutherTextField.getText(),bookPublishHouseTextField.getText(),
	    		    		                                         bookPublishYearField.getText(), (String) (typeComboBox.getSelectedItem()),
	    		    		                                         Double.parseDouble(bookPriceTextField.getText()),
	    		    		                                         Integer.parseInt(bookNumberTextField.getText())
	    		    		                                      );
	    		     if( mainViewController.addBook(bookPO) ==ResultMessage.FAILED ){
	    		    	 JOptionPane.showMessageDialog(null, "�������ͼ��ISBM�Ѿ����ڣ����������ã�");
	    		     }else{
	    		    	 JOptionPane.showMessageDialog(null, "���ͼ��ɹ���");
	    		     }
	    		}else {JOptionPane.showMessageDialog(null, "�������ͼ����Ϣ���� ���� �����ƣ����ȼ�飡");}
	    	}
	    	
//ɾ��ͼ��		
	    	else if(event.getSource()==deleteBookButton ){
	    		bookIDTextField.setEditable(true);
	    		String isbn2=JOptionPane.showInputDialog(null,"��������Ҫɾ����ͼ���ISBN��");
	    		if(isbn2==null){
	    			
	    		}else{
	    		if(mainViewController.deleteBook(isbn2) ==ResultMessage.SUCCEED)
	    			JOptionPane.showMessageDialog(null, "ɾ���ɹ���");
	    		else  	
	    			JOptionPane.showMessageDialog(null, "��Ҫɾ����ͼ�鲻���ڣ�");
	    		}
	    	}
	       
//�޸�ͼ��
	    	else if(event.getSource()==changeBookButton){
//	    		bookIDTextField.setEditable(false);
	    		isbn=JOptionPane.showInputDialog(null,"��������Ҫ�޸ĵ�ͼ���ISBN��");
	    		if(isbn==null){
	    			
	    		}else{
	    			if(mainViewController.getBookPO(isbn)==null){
	    				JOptionPane.showMessageDialog(null, "��Ҫ�޸ĵ�ͼ�鲻���ڣ�");
	    			}else{
	    				
	    				BookPO bookPO=mainViewController.getBookPO(isbn);
		    			bookAutherTextField.setText(bookPO.getAuthor());
		    			
		    			int typeIndex=findTypeIndex(bookPO.getType());
		    			if(typeIndex!=-1){
		    				typeComboBox.setSelectedIndex(typeIndex);
		    			}
//		    			bookCategoryTextField.setText(bookPO.getType());
		    			bookIDTextField.setText(bookPO.getISBN());
		    			bookNameTextField.setText(bookPO.getBookName());
		    			bookPriceTextField.setText(""+bookPO.getPrice());
		    			bookPublishHouseTextField.setText(bookPO.getPress());
		    			bookPublishYearField.setText(bookPO.getPublishDate());
		    			JOptionPane.showMessageDialog(null, "ϵͳ����ʾ��Ҫ�޸ĵ�ͼ����Ϣ,���ڽ������޸ģ�\n" 
		    					                                                   +"�޸���ɺ�������ȷ���޸İ�ť����");
      	    			bookIDTextField.setEditable(false);
		    			confirmChangeBookButton.setEnabled(true);
	    			}  			
	    		}
	    	}
	       
//ȷ���޸�ͼ��
	    	else if(event.getSource()== confirmChangeBookButton){
	    		 mainViewController.deleteBook(isbn);
	    		  BookPO bookPO=new BookPO(bookIDTextField.getText(), bookNameTextField.getText(), 
                          bookAutherTextField.getText(),bookPublishHouseTextField.getText(),
                          bookPublishYearField.getText(), (String)typeComboBox.getSelectedItem(),
                          Double.parseDouble(bookPriceTextField.getText()), Integer.parseInt(bookNumberTextField.getText())
                       );
	    	   mainViewController.addBook(bookPO);		
	    		
    			confirmChangeBookButton.setEnabled(false);
    			bookIDTextField.setEditable(true);
	    	}
	       
//�鿴�˿���Ϣ
	    	else if(event.getSource()== checkMemberInforButton){
	    		memberInforTextArea.setText("");
	    		memberOrderTextArea.setText("");
	    		if(memberIDTextField.getText().equals("")){
	    			JOptionPane.showMessageDialog(null, "��������˿͵�ID��");
	    		}else{
	    		      MemberPO memberPO= mainViewController.getMemberPO(memberIDTextField.getText());
	    		      if(memberPO == null){
	    		    	  JOptionPane.showMessageDialog(null, "�Բ�����Ҫ�鿴�Ĺ˿Ͳ����ڣ�");
	    		      }else{
	    		    	  memberInforTextArea.append("���: "+memberPO.getUserID()+
	    		    			                                          "\n����: "+memberPO.getUserName()+
	    		    			                                          "\n����: "+memberPO.getPoints()+
	    		    			                                          "\n�ȼ�: "+memberPO.getRank()
	    		    			                                           );
	    		    	  for(int i=0;i<memberPO.getEquivalentList().size(); i++){
	    		    		  memberInforTextArea.append("ӵ�еȼ�ȯ:  "+memberPO.getEquivalentList().get(i).toString());
	    		    	  }
	    		    	  for(int j=0;j<memberPO.getCouponList().size(); j++){
	    		    		  memberInforTextArea.append("ӵ�д���ȯ:  "+memberPO.getCouponList().get(j).toString());
	    		    	  }
	    		    	  if(memberPO.getOrderList().size()== 0){
	    		    		  memberOrderTextArea.append("�ù˿���δ�����κι�����");
	    		    	  }else{
	    		    	           for(int k=0;k<memberPO.getOrderList().size(); k++){
	    		    	                memberOrderTextArea.append(memberPO.getOrderList().get(k).toString()+"\n");
	    		    	            }
	    		    	  }
	    		      }    		      
	    		}
	    	}
	       
//����δ��ɵĶ���
	    	else if(event.getSource()== updateOrderButton){
	    		updateUncompletedOrder();	    	
	    	}
	       
//�޸Ķ���״̬
	    	else if(event.getSource() ==changeOrderButton){
	    		int selectedRow=orderTable.getSelectedRow();
	    		if(selectedRow != -1){
	    			OrderPO orderPO=uncompletedOrderList.get(selectedRow);
	    			if(orderedRadioButton.isSelected()){
	    				   JOptionPane.showMessageDialog(null, "���޸ĵĶ���״̬������");
	    			}else if(distributionRadioButton.isSelected()){
	    				    if(orderPO.getOrderState() ==OrderState.ORDERDED){
	    				    	uncompletedOrderList.get(selectedRow).setOrderState(OrderState.DISTRIBUTION);
	    				    	mainViewController.writeUncompletedOrderPOList(orderPO);
	    				    	mainViewController.updateMember_Order(
	    				    			    orderPO.getMemberID(),orderPO.getOrderState(),orderPO.getOrderNum());
	    				    }else  JOptionPane.showMessageDialog(null, "���޸ĵĶ���״̬������");		
	    			}else if(transportRadioButton.isSelected()){
	    				   if(orderPO.getOrderState() ==OrderState.DISTRIBUTION){
	    					   uncompletedOrderList.get(selectedRow).setOrderState(OrderState.TRASPORTATION);
	    					   mainViewController.writeUncompletedOrderPOList(orderPO);
	    					   mainViewController.updateMember_Order(
   				    			    orderPO.getMemberID(),orderPO.getOrderState(),orderPO.getOrderNum());
	    				    }else  JOptionPane.showMessageDialog(null, "���޸ĵĶ���״̬������");
	    			}else if(signedRadioButton.isSelected()){
	    				   if(orderPO.getOrderState() ==OrderState.TRASPORTATION){
	    					   uncompletedOrderList.get(selectedRow).setOrderState(OrderState.SIGNED);
	    					   mainViewController.writeUncompletedOrderPOList(orderPO);
	    					   mainViewController.updateMember_Order(
   				    			    orderPO.getMemberID(),orderPO.getOrderState(),orderPO.getOrderNum());
	    				    }else  JOptionPane.showMessageDialog(null, "���޸ĵĶ���״̬������");
	    			}else{
	    				JOptionPane.showMessageDialog(null, "������'����״̬'һ����ѡ������Ҫ���ĳ�Ϊ�Ķ���״̬��");
	    			}
	    			
	    			updateUncompletedOrder();
	    		}else{
	    			JOptionPane.showMessageDialog(null, "�������ڱ����ѡ��ĳһ��δ��ɵĶ�����");
	    		}
	    	}
	      
	     //�޸��û���
			else if(event.getSource()== changeUserNameButton){
				changeUserNameControllerInterface controller=new changeUserNameController(userpo) ;
                 userNameLabel.setText(userpo.getUserName());
			}
	
	//�޸��û�����
			else if(event.getSource()== changeUserPasswordButton){
                 changePasswordControllerInterface controller=new changePasswordController(userpo);
			}
	//�˳�
			else if(event.getSource()== exitButton){
				System.exit(1);			
			}
	//����ͼ�����
			else if(event.getSource()==jButton1){
				String newType=JOptionPane.showInputDialog("�������µ�ͼ�����");
				if(newType==null){
					return;
				}
				ResultMessage result=mainViewController.addBookType(newType);
				if(result==ResultMessage.SUCCEED){
					JOptionPane.showMessageDialog(null, "��ӳɹ���");
					bookTypeList.setModel(new TypeListModel());
					setTypeComboxModel();
//					***
				}else {
					JOptionPane.showMessageDialog(null, "���ʧ�ܣ�");
				}
			}
	       
	//ɾ��ͼ�����
			else if(event.getSource()==jButton2){
				int index=bookTypeList.getSelectedIndex();
				if(index==-1){
					JOptionPane.showMessageDialog(null, "��ѡ��һ��ͼ�����");
					return;
				}
				
				String deleteType=(String) bookTypeList.getSelectedValue();
				ResultMessage result=mainViewController.changeBookType(deleteType, "����");
				if(result==ResultMessage.SUCCEED){
					JOptionPane.showMessageDialog(null, "ɾ���ɹ���");
					bookTypeList.setModel(new TypeListModel());
					setTypeComboxModel();
//					***
				}else{
					JOptionPane.showMessageDialog(null, "ɾ��ʧ�ܣ�");
				}
			}
	       
	//�޸�ͼ�����
			else if(event.getSource()==jButton3){
				int index=bookTypeList.getSelectedIndex();
				if(index==-1){
					JOptionPane.showMessageDialog(null, "��ѡ��һ��ͼ�����");
					return;
				}
				String oldType=(String)bookTypeList.getSelectedValue();
				String newType=JOptionPane.showInputDialog("�������޸ĺ��ͼ�����");
				if(newType==null){
					return;
				}
				
				ResultMessage result=mainViewController.changeBookType(oldType, newType);
				if(result==ResultMessage.SUCCEED){
					JOptionPane.showMessageDialog(null,"�޸ĳɹ���");
					bookTypeList.setModel(new TypeListModel());
					setTypeComboxModel();
//					***
				}else{
					JOptionPane.showMessageDialog(null,"�޸�ʧ�ܣ�");
				}
			}

	    }//�¼�����
	    
//��������
//	    �鿴�ܾ����ƶ��Ĵ�Χ��������
	   private void checkPresent(){
		   showPresentTextArea.setText("");
		    ArrayList<Present_Equivalent> present_EquivalentList=mainViewController.getPresent_EquivalentList();
		    ArrayList<Present_Coupon> present_CouponList=mainViewController.getPresent_CouponList();  
		     
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
//		    	  String equivalent[][];
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


//�ж�bookPanel�����ϵ������Ƿ���ȫ
	   private boolean bookInforTrue(){
		   if(
				   bookIDTextField.getText().equals("") || bookAutherTextField.getText().equals("") || 
			   bookPublishYearField.getText().equals("") ||
			  bookNameTextField.getText().equals("") || bookPublishHouseTextField.getText().equals("") || 
			  ! stringToDouble(bookPriceTextField.getText()) || ! StringToInt(bookNumberTextField.getText())
			  )
			   return false;
		   else return true;
	   }
	   
//String �Ƿ����ת����Double
	   private boolean stringToDouble(String s){
		   try{
			   double d=Double.parseDouble(s);
			   return true;
		   }catch(Exception e){
			   e.printStackTrace();
			   return false;
		   }
	   }
//
	   private boolean StringToInt(String s){
		   try {
			   int n=Integer.parseInt(s);
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

//
	   private String orderStateToString(OrderState State){
		   if(State==OrderState.ORDERDED){
			   return "���µ�";
		   }else if(State== OrderState.DISTRIBUTION){
			   return "�ֿ����";
		   }else if(State== OrderState.TRASPORTATION){
			   return "��������";
		   }else {
			   return "��ǩ��";
		   }
	   }
	   
//	   ����δ��ɵĶ���
	   private void updateUncompletedOrder(){
			uncompletedOrderList=mainViewController.getUncompletedOrderPOList();
    		
    		if(uncompletedOrderList== null || lineOfUncompletedOrder==0){
    	    	JOptionPane.showMessageDialog(null, "û��δ��ɵĶ�����");
    	    }else{
    	    	  orderTable.setEnabled(true);
    	    	  lineOfUncompletedOrder=uncompletedOrderList.size();
    	    	 
    	    	  
    	    	  String [] columnNames={"������", "�µ�ʱ��", "�ܼ�", "�˿ͱ��", "����״̬"};
    		      String [][] tableValue=new String[lineOfUncompletedOrder][5];
    		       tableModel=new DefaultTableModel(tableValue,columnNames); 
    		       orderTable.setModel(tableModel);
    		       
    	    	for(int i=0;i<lineOfUncompletedOrder;i++){
    	    		OrderPO orderPO=uncompletedOrderList.get(i);
    	    		tableModel.setValueAt(""+orderPO.getOrderNum(), i, 0);
    	    		tableModel.setValueAt(CalToStr(orderPO.getDate()), i, 1);
    	    		tableModel.setValueAt(""+orderPO.getTotalPrice(), i, 2);
    	    		tableModel.setValueAt(orderPO.getMemberID(), i, 3);
    	    		tableModel.setValueAt(orderStateToString(orderPO.getOrderState()), i, 4);
    	    	}//for(i)	    	
    	    }//else 	
	   }
	   
	   private int findTypeIndex(String type){
		   ArrayList<String> typeList=mainViewController.getTypeList();
		   for(int i=0;i<typeList.size();i++){
			   if(typeList.get(i).equals(type)){
				   return i;
			   }
		   }
		   return -1;
	   }
	   
	  private void setTypeComboxModel(){
	        ArrayList<String> bookTypeList=mainViewController.getTypeList();
	        String[] typeStrings=new String[bookTypeList.size()];
	        for(int i=0;i<bookTypeList.size();i++){
	        	typeStrings[i]=bookTypeList.get(i);
	        }
	        typeComboBox.setModel(new DefaultComboBoxModel(typeStrings));
	  }
	   
	   class TypeListModel extends AbstractListModel{
		   ArrayList<String> typeLsit=mainViewController.getTypeList();
		   
		@Override
		public int getSize() {
			// TODO Auto-generated method stub
			return typeLsit.size();
		}

		@Override
		public Object getElementAt(int index) {
			// TODO Auto-generated method stub
			return typeLsit.get(index);
		}
		   
	   }
	   
	   
}
