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

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import po.BookPO;
import po.MemberPO;
import po.OrderPO;
import po.OrderState;
import po.PresentPO;
import po.ResultMessage;
import po.SalesManagerPO;
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
//	   SalesManagerModelInterface model;
	
	    private javax.swing.JButton addBookButton;
	    private javax.swing.JTextField bookAutherTextField;
	    private javax.swing.JTextField bookCategoryTextField;
	    private javax.swing.JTextField bookIDTextField;
	    private javax.swing.JTextField bookNameTextField;
	    private javax.swing.JTextField bookNumberTextField;
	    private javax.swing.JPanel bookPanel;
	    private javax.swing.JTextField bookPriceTextField;
	    private javax.swing.JTextField bookPublishHouseTextField;
	    private javax.swing.JTextField bookPublishYearField;
	    private javax.swing.ButtonGroup buttonGroup1;
	    private javax.swing.JButton changeBookButton;
	    private javax.swing.JButton changeOrderButton;
	    private javax.swing.JButton changeUserNameButton;
	    private javax.swing.JButton changeUserPasswordButton;
	    private javax.swing.JButton checkMemberInforButton;
	    private javax.swing.JButton checkPresentButton;
	    private javax.swing.JButton confirmChangeBookButton;
	    private javax.swing.JButton confirmChangePasswordButton;
	    private javax.swing.JButton confirmChangeUserNameButton;
	    private javax.swing.JButton deleteBookButton;
	    private javax.swing.JRadioButton distributionRadioButton;
	    private javax.swing.JPanel homePagePanel;
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
	    private javax.swing.JLabel jLabel26;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JLabel jLabel5;
	    private javax.swing.JLabel jLabel6;
	    private javax.swing.JLabel jLabel7;
	    private javax.swing.JLabel jLabel8;
	    private javax.swing.JLabel jLabel9;
	    private javax.swing.JScrollPane jScrollPane2;
	    private javax.swing.JScrollPane jScrollPane3;
	    private javax.swing.JScrollPane jScrollPane4;
	    private javax.swing.JScrollPane jScrollPane5;
	    private javax.swing.JSeparator jSeparator1;
	    private javax.swing.JTabbedPane mainViewTabbedPane;
	    private javax.swing.JTextField memberIDTextField;
	    private javax.swing.JTextArea memberInforTextArea;
	    private javax.swing.JTextArea memberOrderTextArea;
	    private javax.swing.JPanel memberPanel;
	    private javax.swing.JTextField newPWAgainTextField;
	    private javax.swing.JTextField newPWTextField;
	    private javax.swing.JTextField newUserNameTextField;
	    private javax.swing.JPanel orderPanel;
	    private javax.swing.JTable orderTable;
	    private javax.swing.JRadioButton orderedRadioButton;
	    private javax.swing.JTextField originalPWTextField;
	    private javax.swing.JTextField originalUserNameTextField;
	    private javax.swing.JPanel presentPanel;
	    private javax.swing.JPanel salesManagerPanel;
	    private javax.swing.JButton sendPresentButton;
	    private javax.swing.JTextArea showPresentTextArea;
	    private javax.swing.JRadioButton signedRadioButton;
	    private javax.swing.JRadioButton transportRadioButton;
	    private javax.swing.JButton updateOrderButton;
	    private javax.swing.JTextField userIDTextField;
	    // End of variables declaration
	    
	    public MainView(MainViewControllerInterface mainViewController){
	    	super("���۾����������");
	    	this.mainViewController=mainViewController;
	    }
	    
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
	        bookCategoryTextField = new javax.swing.JTextField();
	        bookNameTextField = new javax.swing.JTextField();
	        confirmChangeBookButton = new javax.swing.JButton();
	        jLabel13 = new javax.swing.JLabel();
	        bookPriceTextField = new javax.swing.JTextField();
	        jLabel14 = new javax.swing.JLabel();
	        bookNumberTextField = new javax.swing.JTextField();
	        salesManagerPanel = new javax.swing.JPanel();
	        changeUserNameButton = new javax.swing.JButton();
	        changeUserPasswordButton = new javax.swing.JButton();
	        jLabel11 = new javax.swing.JLabel();
	        jLabel12 = new javax.swing.JLabel();
	        confirmChangeUserNameButton = new javax.swing.JButton();
	        confirmChangePasswordButton = new javax.swing.JButton();
	        originalUserNameTextField = new javax.swing.JTextField();
	        newUserNameTextField = new javax.swing.JTextField();
	        jLabel16 = new javax.swing.JLabel();
	        jLabel17 = new javax.swing.JLabel();
	        jLabel18 = new javax.swing.JLabel();
	        jSeparator1 = new javax.swing.JSeparator();
	        originalPWTextField = new javax.swing.JTextField();
	        newPWTextField = new javax.swing.JTextField();
	        newPWAgainTextField = new javax.swing.JTextField();
	        jLabel26 = new javax.swing.JLabel();
	        userIDTextField = new javax.swing.JTextField();

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
	                .addContainerGap(192, Short.MAX_VALUE))
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
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
	                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(30, 30, 30))
	                    .addGroup(homePagePanelLayout.createSequentialGroup()
	                        .addGap(18, 18, 18)
	                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addContainerGap())))
	        );

	        mainViewTabbedPane.addTab("       ��ҳ       ", homePagePanel);

	        checkMemberInforButton.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
	        checkMemberInforButton.setForeground(new java.awt.Color(0, 51, 102));
	        checkMemberInforButton.setText("�鿴�˿���Ϣ");

	        jLabel8.setFont(new java.awt.Font("��Բ", 2, 14)); // NOI18N
	        jLabel8.setText("�˿ͱ�ţ�");

	        jLabel9.setFont(new java.awt.Font("��Բ", 0, 14)); // NOI18N
	        jLabel9.setText("������Ϣ");

	        jLabel10.setFont(new java.awt.Font("��Բ", 0, 14)); // NOI18N
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
	                        .addGap(26, 26, 26)
	                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(memberPanelLayout.createSequentialGroup()
	                        .addGap(275, 275, 275)
	                        .addComponent(checkMemberInforButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(memberPanelLayout.createSequentialGroup()
	                        .addGap(74, 74, 74)
	                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(160, 160, 160)
	                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap(101, Short.MAX_VALUE))
	            .addGroup(memberPanelLayout.createSequentialGroup()
	                .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(memberPanelLayout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(memberIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, memberPanelLayout.createSequentialGroup()
	                        .addGap(151, 151, 151)
	                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(186, 186, 186))
	        );
	        memberPanelLayout.setVerticalGroup(
	            memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(memberPanelLayout.createSequentialGroup()
	                .addGap(16, 16, 16)
	                .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(memberIDTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
	                .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(memberPanelLayout.createSequentialGroup()
	                        .addGap(32, 32, 32)
	                        .addComponent(checkMemberInforButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(41, 41, 41))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, memberPanelLayout.createSequentialGroup()
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(7, 7, 7)))
	                .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
	                    .addComponent(jScrollPane5))
	                .addContainerGap(24, Short.MAX_VALUE))
	        );

	        mainViewTabbedPane.addTab("    �˿���Ϣ��ѯ    ", memberPanel);

	        checkPresentButton.setFont(new java.awt.Font("��Բ", 1, 14)); // NOI18N
	        checkPresentButton.setForeground(new java.awt.Color(255, 102, 102));
	        checkPresentButton.setText("�鿴��ȯ������Ϣ");

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
	                .addContainerGap(148, Short.MAX_VALUE))
	        );
	        presentPanelLayout.setVerticalGroup(
	            presentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(presentPanelLayout.createSequentialGroup()
	                .addGap(24, 24, 24)
	                .addComponent(checkPresentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(32, 32, 32)
	                .addComponent(sendPresentButton, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
	                .addGap(25, 25, 25))
	        );

	        mainViewTabbedPane.addTab("      ��ȯ����      ", presentPanel);

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
	                .addContainerGap(173, Short.MAX_VALUE))
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
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
	                .addComponent(changeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(36, 36, 36))
	        );

	        mainViewTabbedPane.addTab("      ��������      ", orderPanel);

	        addBookButton.setFont(new java.awt.Font("��Բ", 1, 18)); // NOI18N
	        addBookButton.setText("���ͼ��");

	        deleteBookButton.setFont(new java.awt.Font("��Բ", 1, 18)); // NOI18N
	        deleteBookButton.setText("ɾ��ͼ��");

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

	        confirmChangeBookButton.setFont(new java.awt.Font("��Բ", 1, 18)); // NOI18N
	        confirmChangeBookButton.setForeground(new java.awt.Color(255, 0, 0));
	        confirmChangeBookButton.setText("ȷ���޸�");

	        jLabel13.setFont(new java.awt.Font("����", 0, 14)); // NOI18N
	        jLabel13.setText("�۸�/Ԫ��");

	        jLabel14.setFont(new java.awt.Font("����", 0, 14)); // NOI18N
	        jLabel14.setText("����/�᣺");

	        javax.swing.GroupLayout bookPanelLayout = new javax.swing.GroupLayout(bookPanel);
	        bookPanel.setLayout(bookPanelLayout);
	        bookPanelLayout.setHorizontalGroup(
	            bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookPanelLayout.createSequentialGroup()
	                .addContainerGap(281, Short.MAX_VALUE)
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
	                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookPanelLayout.createSequentialGroup()
	                                .addGap(31, 31, 31)
	                                .addComponent(jLabel4))
	                            .addGroup(bookPanelLayout.createSequentialGroup()
	                                .addGap(45, 45, 45)
	                                .addComponent(jLabel3))))
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
	                            .addGroup(bookPanelLayout.createSequentialGroup()
	                                .addComponent(bookAutherTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(25, 25, 25))
	                            .addGroup(bookPanelLayout.createSequentialGroup()
	                                .addComponent(bookPublishHouseTextField)
	                                .addGap(23, 23, 23)))
	                        .addGap(23, 23, 23)
	                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addComponent(jLabel13)
	                            .addComponent(jLabel6))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(bookCategoryTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
	                            .addComponent(bookPriceTextField)))
	                    .addComponent(bookNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap())
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
	                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(bookPanelLayout.createSequentialGroup()
	                                .addGap(25, 25, 25)
	                                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                        .addComponent(bookNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addComponent(bookPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                                .addGap(16, 16, 16))
	                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookPanelLayout.createSequentialGroup()
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookPanelLayout.createSequentialGroup()
	                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
	                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookPanelLayout.createSequentialGroup()
	                                        .addComponent(bookAutherTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addGap(17, 17, 17)))))
	                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addGroup(bookPanelLayout.createSequentialGroup()
	                                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                                    .addComponent(bookPublishYearField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(bookPublishHouseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(bookCategoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                .addGap(42, 42, 42)
	                                .addComponent(addBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookPanelLayout.createSequentialGroup()
	                                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                .addGap(73, 73, 73))))
	                    .addGroup(bookPanelLayout.createSequentialGroup()
	                        .addGap(41, 41, 41)
	                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(34, 34, 34)
	                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGap(43, 43, 43)
	                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(changeBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(confirmChangeBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(42, 42, 42)
	                .addComponent(deleteBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(62, 62, 62))
	        );

	        mainViewTabbedPane.addTab("     ͼ�����      ", bookPanel);

	        changeUserNameButton.setFont(new java.awt.Font("����", 1, 18)); // NOI18N
	        changeUserNameButton.setForeground(new java.awt.Color(102, 102, 102));
	        changeUserNameButton.setText("�޸��û���");

	        changeUserPasswordButton.setFont(new java.awt.Font("����", 1, 18)); // NOI18N
	        changeUserPasswordButton.setForeground(new java.awt.Color(102, 102, 102));
	        changeUserPasswordButton.setText("�޸�����");
	
	        jLabel11.setFont(new java.awt.Font("����", 2, 14)); // NOI18N
	        jLabel11.setText("�û�����");

	        jLabel12.setFont(new java.awt.Font("����", 2, 14)); // NOI18N
	        jLabel12.setText("���û�����");

	        confirmChangeUserNameButton.setFont(new java.awt.Font("����", 1, 18)); // NOI18N
	        confirmChangeUserNameButton.setForeground(new java.awt.Color(255, 0, 0));
	        confirmChangeUserNameButton.setText("ȷ���޸�");

	        confirmChangePasswordButton.setFont(new java.awt.Font("����", 1, 18)); // NOI18N
	        confirmChangePasswordButton.setForeground(new java.awt.Color(255, 0, 0));
	        confirmChangePasswordButton.setText("ȷ���޸�");

	        jLabel16.setFont(new java.awt.Font("����", 2, 14)); // NOI18N
	        jLabel16.setText("������ԭ���룺");

	        jLabel17.setFont(new java.awt.Font("����", 2, 14)); // NOI18N
	        jLabel17.setText("�����������룺");

	        jLabel18.setFont(new java.awt.Font("����", 2, 14)); // NOI18N
	        jLabel18.setText("���ٴ����������룺");

	        jLabel26.setFont(new java.awt.Font("����", 2, 14)); // NOI18N
	        jLabel26.setText("�û���ţ�");

	        javax.swing.GroupLayout salesManagerPanelLayout = new javax.swing.GroupLayout(salesManagerPanel);
	        salesManagerPanel.setLayout(salesManagerPanelLayout);
	        salesManagerPanelLayout.setHorizontalGroup(
	            salesManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(salesManagerPanelLayout.createSequentialGroup()
	                .addGroup(salesManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(salesManagerPanelLayout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(salesManagerPanelLayout.createSequentialGroup()
	                        .addGap(70, 70, 70)
	                        .addGroup(salesManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addComponent(jLabel18)
	                            .addGroup(salesManagerPanelLayout.createSequentialGroup()
	                                .addGroup(salesManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addGroup(salesManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                        .addComponent(changeUserNameButton, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
	                                        .addComponent(confirmChangeUserNameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                                    .addGroup(salesManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                        .addComponent(confirmChangePasswordButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                        .addComponent(changeUserPasswordButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
	                                .addGroup(salesManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addGroup(salesManagerPanelLayout.createSequentialGroup()
	                                        .addGap(113, 113, 113)
	                                        .addGroup(salesManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salesManagerPanelLayout.createSequentialGroup()
	                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                        .addGroup(salesManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                            .addComponent(jLabel26)
	                                            .addComponent(jLabel12)
	                                            .addComponent(jLabel11))
	                                        .addGap(15, 15, 15)))))
	                        .addGap(18, 18, 18)
	                        .addGroup(salesManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(originalPWTextField)
	                            .addComponent(newPWTextField)
	                            .addComponent(newPWAgainTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
	                            .addComponent(newUserNameTextField)
	                            .addComponent(originalUserNameTextField)
	                            .addComponent(userIDTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))))
	                .addGap(0, 31, Short.MAX_VALUE))
	        );
	        salesManagerPanelLayout.setVerticalGroup(
	            salesManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(salesManagerPanelLayout.createSequentialGroup()
	                .addGroup(salesManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(salesManagerPanelLayout.createSequentialGroup()
	                        .addGap(39, 39, 39)
	                        .addComponent(changeUserNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(0, 0, Short.MAX_VALUE))
	                    .addGroup(salesManagerPanelLayout.createSequentialGroup()
	                        .addGroup(salesManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(salesManagerPanelLayout.createSequentialGroup()
	                                .addGap(20, 20, 20)
	                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(0, 0, Short.MAX_VALUE))
	                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salesManagerPanelLayout.createSequentialGroup()
	                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(userIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                        .addGap(18, 18, 18)
	                        .addGroup(salesManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addComponent(originalUserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(15, 15, 15)))
	                .addGroup(salesManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(salesManagerPanelLayout.createSequentialGroup()
	                        .addComponent(confirmChangeUserNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(0, 7, Short.MAX_VALUE))
	                    .addComponent(newUserNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(26, 26, 26)
	                .addGroup(salesManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(changeUserPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(originalPWTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGroup(salesManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(salesManagerPanelLayout.createSequentialGroup()
	                        .addGap(37, 37, 37)
	                        .addGroup(salesManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(newPWTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(37, 37, 37)
	                        .addGroup(salesManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(newPWAgainTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addContainerGap(20, Short.MAX_VALUE))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salesManagerPanelLayout.createSequentialGroup()
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addComponent(confirmChangePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(77, 77, 77))))
	        );

	        mainViewTabbedPane.addTab("      ��������      ", salesManagerPanel);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(mainViewTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(mainViewTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
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
	        bookIDTextField.setEditable(false);
	        
	        // orderPanel
	        updateOrderButton.addActionListener(this);
	        changeOrderButton.addActionListener(this);
	        orderTable.setEnabled(false);
       
	        //memberPanel
	        checkMemberInforButton.addActionListener(this);
	        memberInforTextArea.setEditable(false);
	        memberOrderTextArea.setEditable(false);
	        
	       //��������panel
	        mainViewController.getUserPO();
	        userIDTextField.setText(userpo.getUserID());
	        originalUserNameTextField.setText(userpo.getUserName());
	        changeUserNameButton.addActionListener(this);
	        changeUserPasswordButton.addActionListener(this);
	        confirmChangeUserNameButton.addActionListener(this);
	        confirmChangePasswordButton.addActionListener(this);
			jLabel12.setEnabled(false); newUserNameTextField.setEnabled(false);
			jLabel16.setEnabled(false);  originalPWTextField.setEnabled(false);
			jLabel17.setEnabled(false);  newPWTextField.setEnabled(false);
			jLabel18.setEnabled(false);  newPWAgainTextField.setEnabled(false);
	         
	        
	        this.setVisible(true);
	      
	    }
//������*************************************************************************************************************

                   //	    private boolean checkPresentFirst=false;
	    private ArrayList<OrderPO> uncompletedOrderList;
 //�¼���Ӧ    
	    public void actionPerformed(ActionEvent event){
	    	String isbn="";
//�鿴�ܾ����ƶ��Ĵ�Χ��������    	
	       if(event.getSource()==checkPresentButton){     
	    	      showPresentTextArea.setText("");
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
	    		if(bookInforTrue()){
	    		     BookPO bookPO=new BookPO(bookIDTextField.getText(), bookNameTextField.getText(), 
	    		    		                                         bookAutherTextField.getText(),bookPublishHouseTextField.getText(),
	    		    		                                         bookPublishYearField.getText(), bookCategoryTextField.getText(),
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
	    		isbn=JOptionPane.showInputDialog(null,"��������Ҫ�޸ĵ�ͼ���ISBN��");
	    		if(isbn==null){
	    			
	    		}else{
	    			if(mainViewController.getBookPO(isbn)==null){
	    				JOptionPane.showMessageDialog(null, "��Ҫ�޸ĵ�ͼ�鲻���ڣ�");
	    			}else{
	    				BookPO bookPO=mainViewController.getBookPO(isbn);
		    			bookAutherTextField.setText(bookPO.getAuthor());
		    			bookCategoryTextField.setText(bookPO.getType());
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
                          bookPublishYearField.getText(), bookCategoryTextField.getText(),
                          Double.parseDouble(bookPriceTextField.getText()), Integer.parseInt(bookNumberTextField.getText())
                       );
	    	   mainViewController.addBook(bookPO);		
	    		
	    		bookIDTextField.setEditable(true);
    			confirmChangeBookButton.setEnabled(false);
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
				jLabel12.setEnabled(true);
				newUserNameTextField.setEnabled(true);
				JOptionPane.showMessageDialog(null, "����'���û���'�����������û�����������Ϻ��뵥��'ȷ���޸�' !");
				confirmChangeUserNameButton.setEnabled(true);
			}
	//ȷ���޸��û���
			else if(event.getSource()== confirmChangeUserNameButton){
				if(newUserNameTextField.getText().equals("")){
					JOptionPane.showMessageDialog(null, "���û�������Ϊ�գ�");
				}else {
					userpo.setUserName(newUserNameTextField.getText());
					
					if( mainViewController.changeUser(userpo.getUserName(),userpo.getUserID(),
							userpo.getUserPassword(),userpo.getUserRole())
							                                ==ResultMessage.SUCCEED){ 
					confirmChangeUserNameButton.setEnabled(false);
					jLabel12.setEnabled(false);
					newUserNameTextField.setEnabled(false);
					JOptionPane.showMessageDialog(null, "�޸��û����ɹ���");
					}else {
						JOptionPane.showMessageDialog(null, " �޸��û���ʧ�ܣ�");
					}
				}
			}
	//�޸��û�����
			else if(event.getSource()== changeUserPasswordButton){
				jLabel16.setEnabled(true);  originalPWTextField.setEnabled(true);
				jLabel17.setEnabled(true);  newPWTextField.setEnabled(true);
				jLabel18.setEnabled(true);  newPWAgainTextField.setEnabled(true);
				JOptionPane.showMessageDialog(null, "����������ԭ���룬�����룡");
				confirmChangePasswordButton.setEnabled(true);
			}
	//ȷ���޸�����
			else if (event.getSource()== confirmChangePasswordButton){
				if(! originalPWTextField.getText().equals(userpo.getUserPassword())){
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
					    		  userpo.setUserPassword(newPWTextField.getText());
					    		  if(  mainViewController.changeUser(userpo.getUserName(),userpo.getUserID(),
					    				  userpo.getUserPassword(),userpo.getUserRole()) ==
			                                ResultMessage.SUCCEED){
					    			  jLabel16.setEnabled(false);  originalPWTextField.setEnabled(false);
										jLabel17.setEnabled(false);  newPWTextField.setEnabled(false);
										jLabel18.setEnabled(false);  newPWAgainTextField.setEnabled(false);
										confirmChangePasswordButton.setEnabled(false);
										JOptionPane.showMessageDialog(null, "�޸�����ɹ���");
					    		  }else{
					    			  JOptionPane.showMessageDialog(null, "�Բ����޸�����ʧ�ܣ�");
					    		  }	
					    	  }
					      }
					      }
				}		
			}      
	       
	       
	    	
	    }//�¼�����
	    
//��������
//	    �鿴�ܾ����ƶ��Ĵ�Χ��������
	   private void checkPresent(){
		   ArrayList<PresentPO> presentPOList=mainViewController.getPresentPOList();
		      
		      if(  presentPOList== null ){
		    	  showPresentTextArea.append("�ܾ�����δ�ƶ���ȯ!");
		      }
		      else if( presentPOList.size() == 0){
		    	  showPresentTextArea.append("�ܾ���δ�ƶ���ȯ �� ��ȯ�Ѿ�������ϣ�");
		      }
		      else{
		    	  PresentPO presentPO;
		    	  String equivalent[][];
		    	  //private String equivalent[][]=new String [line][column4];
		    	  //10��,ÿ��ֱ��ʾ:�ȼ�ȯ��ȣ���������Ч��ֹ���ڣ�������� 
		    	 
		    	  for(int i=0;i<presentPOList.size(); i++){
		    		  presentPO=presentPOList.get(i);
		    		  equivalent=presentPO.getEquivalent();
		    		  
		    		  showPresentTextArea.append(presentPO.getVipLevel_String()+"\n");
		    		  
		    		  for(int j=0;j<equivalent.length;j++){
		    			  if( (Double.parseDouble(equivalent[j][0]) - 0.0)>0.000001  ){//�Ƿ��ж�һ���Ƿ��й��ڵ�?����
		    				  showPresentTextArea.append ("\t"+"�ȼ�ȯ"+"\t"+"���/Ԫ:"+"\t"+equivalent[j][0]+"\t"+"����/��:"+"\t"+equivalent[j][1]
		    				  +"\t"+"�������:"+"\t"+equivalent[j][3]+"\t"+"��Ч��ֹ����:"+"\t"+equivalent[j][2]+"\n");
		    			  } 
		    		  }//for(j)
		    		   		    		  
		    		  if( (presentPO.getDiscount() - 0.0) > 0.000001 ){//����//�Ƿ��ж�һ���Ƿ��й��ڵġ���
		    		         showPresentTextArea.append("\t"+"����ȯ"+"\t"+"������:"+"\t"+presentPO.getDiscount()+"\t"+"����/��:"+"\t"+
		    		                  presentPO.getAmountOfCoupon()+"\t"+"��Ч��ֹ����"+"\t"+presentPO.getEndDateOfCoupon()+"\n");
		    		  }
		    		  
		    		  showPresentTextArea.append("\n");
		    	  }//for(i)
		    	  
		      }//else	
	   }


//�ж�bookPanel�����ϵ������Ƿ���ȫ
	   private boolean bookInforTrue(){
		   if(
				   bookIDTextField.getText().equals("") || bookAutherTextField.getText().equals("") || 
			  bookCategoryTextField.getText().equals("") || bookPublishYearField.getText().equals("") ||
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
	   private String CalendarToString(Calendar cal){
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
    	    		tableModel.setValueAt(CalendarToString(orderPO.getDate()), i, 1);
    	    		tableModel.setValueAt(""+orderPO.getTotalPrice(), i, 2);
    	    		tableModel.setValueAt(orderPO.getMemberID(), i, 3);
    	    		tableModel.setValueAt(orderStateToString(orderPO.getOrderState()), i, 4);
    	    	}//for(i)	    	
    	    }//else 	
	   }
	   
}
