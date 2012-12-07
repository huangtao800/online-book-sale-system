package presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import po.CouponPO;
import presentationController.Member.KeywordVO;
import presentationController.Member.MemberViewService;

import bussinessLogicService.MemberManagerBLService;
import bussinessLogic.controller.*;
import bussinessLogic.domain.MemberManager;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class MemberView extends JFrame {

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton keywordSearchButton;
    private javax.swing.JButton typeSearchButton;
    private javax.swing.JComboBox typeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel bookNameLabel;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JLabel publisherLabel;
    private javax.swing.JLabel publisherYearLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField bookNameField;
    private javax.swing.JTextField authorField;
    private javax.swing.JTextField publisherField;
    private javax.swing.JTextField publisherYearField;
	
	private MemberViewService memberViewController;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberView frame = new MemberView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MemberView(MemberViewService memberViewController){
		this();
		this.memberViewController=memberViewController;
	}
	/**
	 * Create the frame.
	 */
	public MemberView() {
		
		initComponents();
	}
	
	private void initComponents(){
	       jTabbedPane1 = new javax.swing.JTabbedPane();
	        jPanel6 = new javax.swing.JPanel();
	        jPanel7 = new javax.swing.JPanel();
	        bookNameField = new javax.swing.JTextField();
	        bookNameLabel = new javax.swing.JLabel();
	        authorLabel = new javax.swing.JLabel();
	        authorField = new javax.swing.JTextField();
	        publisherLabel = new javax.swing.JLabel();
	        publisherField = new javax.swing.JTextField();
	        publisherYearLabel = new javax.swing.JLabel();
	        publisherYearField = new javax.swing.JTextField();
	        keywordSearchButton = new javax.swing.JButton();
	        keywordSearchButton.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		String bookName=bookNameField.getText();
	        		String author=authorField.getText();
	        		String publisher=publisherField.getText();
	        		String yearString=publisherYearField.getText();
	        		int year=0;
	        		
	        		try {
	        			year=Integer.parseInt(yearString);
	        			
	        			KeywordVO keywordVO=new KeywordVO(bookName, author, publisher, yearString);
					} catch (NumberFormatException e2) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "出版年份输入错误！");
					}
	        		
	        	}
	        });
	        jPanel8 = new javax.swing.JPanel();
	        typeComboBox = new javax.swing.JComboBox();
	        typeSearchButton = new javax.swing.JButton();
	        typeSearchButton.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		String type=(String)typeComboBox.getSelectedItem();
	        		System.out.println(type);
	        	}
	        });
	        jPanel1 = new javax.swing.JPanel();
	        jPanel2 = new javax.swing.JPanel();
	        idLabel = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        jLabel4 = new javax.swing.JLabel();
	        jLabel5 = new javax.swing.JLabel();
	        jLabel6 = new javax.swing.JLabel();
	        jLabel7 = new javax.swing.JLabel();
	        jLabel8 = new javax.swing.JLabel();
	        jLabel9 = new javax.swing.JLabel();
	        jButton3 = new javax.swing.JButton();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel10 = new javax.swing.JLabel();
	        jButton1 = new javax.swing.JButton();
	        jPanel3 = new javax.swing.JPanel();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        jTable1 = new javax.swing.JTable();
	        jButton2 = new javax.swing.JButton();
	        jButton4 = new javax.swing.JButton();
	        jPanel4 = new javax.swing.JPanel();
	        jPanel9 = new javax.swing.JPanel();
	        jScrollPane2 = new javax.swing.JScrollPane();
	        jTable2 = new javax.swing.JTable();
	        jPanel10 = new javax.swing.JPanel();
	        jPanel10.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "  \u6211\u7684\u6253\u6298\u5238  ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	        jPanel5 = new javax.swing.JPanel();
	        jScrollPane3 = new javax.swing.JScrollPane();
	        jTable3 = new javax.swing.JTable();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setTitle("会员");

	        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "关键字查询"));

	        bookNameLabel.setText("书名：");

	        authorLabel.setText("作者：");

	        publisherLabel.setText("出版社：");

	        publisherYearLabel.setText("出版年份：");

	        keywordSearchButton.setText("查询");

	        javax.swing.GroupLayout gl_jPanel7 = new javax.swing.GroupLayout(jPanel7);
	        gl_jPanel7.setHorizontalGroup(
	        	gl_jPanel7.createParallelGroup(Alignment.TRAILING)
	        		.addGroup(gl_jPanel7.createSequentialGroup()
	        			.addGap(49)
	        			.addGroup(gl_jPanel7.createParallelGroup(Alignment.LEADING)
	        				.addComponent(bookNameLabel)
	        				.addComponent(publisherLabel))
	        			.addGap(31)
	        			.addGroup(gl_jPanel7.createParallelGroup(Alignment.LEADING)
	        				.addComponent(publisherField, 193, 193, 193)
	        				.addComponent(bookNameField, 193, 193, 193))
	        			.addPreferredGap(ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
	        			.addGroup(gl_jPanel7.createParallelGroup(Alignment.TRAILING)
	        				.addComponent(publisherYearLabel, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(authorLabel))
	        			.addGap(18)
	        			.addGroup(gl_jPanel7.createParallelGroup(Alignment.LEADING)
	        				.addComponent(authorField, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(publisherYearField, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
	        			.addGap(44))
	        		.addGroup(gl_jPanel7.createSequentialGroup()
	        			.addContainerGap(330, Short.MAX_VALUE)
	        			.addComponent(keywordSearchButton, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
	        			.addGap(267))
	        );
	        gl_jPanel7.setVerticalGroup(
	        	gl_jPanel7.createParallelGroup(Alignment.LEADING)
	        		.addGroup(gl_jPanel7.createSequentialGroup()
	        			.addGap(24)
	        			.addGroup(gl_jPanel7.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(authorLabel)
	        				.addComponent(authorField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(bookNameLabel)
	        				.addComponent(bookNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        			.addGap(37)
	        			.addGroup(gl_jPanel7.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(publisherYearLabel, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(publisherYearField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(publisherLabel)
	        				.addComponent(publisherField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        			.addGap(18)
	        			.addComponent(keywordSearchButton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
	        			.addContainerGap(20, Short.MAX_VALUE))
	        );
	        jPanel7.setLayout(gl_jPanel7);

	        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "分类查询"));

	        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "文学", "历史", "计算机", "经济" }));

	        typeSearchButton.setText("查询");

	        javax.swing.GroupLayout gl_jPanel8 = new javax.swing.GroupLayout(jPanel8);
	        gl_jPanel8.setHorizontalGroup(
	        	gl_jPanel8.createParallelGroup(Alignment.LEADING)
	        		.addGroup(gl_jPanel8.createSequentialGroup()
	        			.addGap(168)
	        			.addComponent(typeComboBox, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
	        			.addGap(43)
	        			.addComponent(typeSearchButton, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
	        			.addContainerGap(191, Short.MAX_VALUE))
	        );
	        gl_jPanel8.setVerticalGroup(
	        	gl_jPanel8.createParallelGroup(Alignment.LEADING)
	        		.addGroup(gl_jPanel8.createSequentialGroup()
	        			.addGap(46)
	        			.addGroup(gl_jPanel8.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(typeSearchButton, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(typeComboBox, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
	        			.addContainerGap(89, Short.MAX_VALUE))
	        );
	        jPanel8.setLayout(gl_jPanel8);

	        javax.swing.GroupLayout gl_jPanel6 = new javax.swing.GroupLayout(jPanel6);
	        gl_jPanel6.setHorizontalGroup(
	        	gl_jPanel6.createParallelGroup(Alignment.LEADING)
	        		.addComponent(jPanel7, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
	        		.addComponent(jPanel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        gl_jPanel6.setVerticalGroup(
	        	gl_jPanel6.createParallelGroup(Alignment.LEADING)
	        		.addGroup(gl_jPanel6.createSequentialGroup()
	        			.addContainerGap()
	        			.addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        			.addGap(18)
	        			.addComponent(jPanel8, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
	        );
	        jPanel6.setLayout(gl_jPanel6);

	        jTabbedPane1.addTab("   首页   ", jPanel6);

	        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "我的信息"));

	        idLabel.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
	        idLabel.setText("ID：");

	        jLabel3.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
	        jLabel3.setText("名称：");

	        jLabel4.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
	        jLabel4.setText("积分：");

	        jLabel5.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
	        jLabel5.setText("等级：");

	        jLabel6.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
	        jLabel6.setText("XXX");

	        jLabel7.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
	        jLabel7.setText("XXX");

	        jLabel8.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
	        jLabel8.setText("XXX");

	        jLabel9.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
	        jLabel9.setText("XXX");

	        jButton3.setText("修改");


	        jLabel1.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
	        jLabel1.setText("常用地址:");

	        jLabel10.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
	        jLabel10.setText("XXX");

	        jButton1.setText("修改地址");

	        javax.swing.GroupLayout gl_jPanel2 = new javax.swing.GroupLayout(jPanel2);
	        gl_jPanel2.setHorizontalGroup(
	        	gl_jPanel2.createParallelGroup(Alignment.TRAILING)
	        		.addGroup(gl_jPanel2.createSequentialGroup()
	        			.addGap(33)
	        			.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING)
	        				.addGroup(gl_jPanel2.createSequentialGroup()
	        					.addComponent(jLabel1)
	        					.addGap(18)
	        					.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE))
	        				.addGroup(gl_jPanel2.createSequentialGroup()
	        					.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING, false)
	        						.addGroup(gl_jPanel2.createSequentialGroup()
	        							.addComponent(jLabel3)
	        							.addGap(18)
	        							.addComponent(jLabel7))
	        						.addGroup(gl_jPanel2.createSequentialGroup()
	        							.addComponent(idLabel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
	        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        							.addComponent(jLabel6)))
	        					.addGap(29)
	        					.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
	        					.addPreferredGap(ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
	        					.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING)
	        						.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(jLabel5))))
	        			.addGap(44)
	        			.addGroup(gl_jPanel2.createParallelGroup(Alignment.TRAILING)
	        				.addComponent(jLabel8)
	        				.addComponent(jLabel9))
	        			.addContainerGap(171, Short.MAX_VALUE))
	        		.addGroup(gl_jPanel2.createSequentialGroup()
	        			.addContainerGap(567, Short.MAX_VALUE)
	        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
	        			.addGap(25))
	        );
	        gl_jPanel2.setVerticalGroup(
	        	gl_jPanel2.createParallelGroup(Alignment.LEADING)
	        		.addGroup(gl_jPanel2.createSequentialGroup()
	        			.addGap(13)
	        			.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING)
	        				.addGroup(gl_jPanel2.createParallelGroup(Alignment.BASELINE)
	        					.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        					.addComponent(jLabel8))
	        				.addGroup(gl_jPanel2.createParallelGroup(Alignment.BASELINE)
	        					.addComponent(jLabel6)
	        					.addComponent(idLabel)))
	        			.addGap(57)
	        			.addGroup(gl_jPanel2.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(jLabel3)
	        				.addComponent(jLabel7)
	        				.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(jLabel5)
	        				.addComponent(jLabel9))
	        			.addGap(50)
	        			.addGroup(gl_jPanel2.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(jLabel1)
	        				.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
	        			.addGap(41)
	        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
	        			.addGap(99))
	        );
	        jPanel2.setLayout(gl_jPanel2);

	        javax.swing.GroupLayout gl_jPanel1 = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(gl_jPanel1);
	        gl_jPanel1.setHorizontalGroup(
	            gl_jPanel1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        gl_jPanel1.setVerticalGroup(
	            gl_jPanel1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );

	        jTabbedPane1.addTab("  我的信息  ", jPanel1);

	        jTable1.setModel(new DefaultTableModel(
	        	new Object[][] {
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
	        	},
	        	new String[] {
	        		"\u56FE\u4E66\u540D\u79F0", "\u4F5C\u8005", "ISBN", "\u51FA\u7248\u793E", "\u6536\u85CF\u65E5\u671F"
	        	}
	        ) {
	        	boolean[] columnEditables = new boolean[] {
	        		false, false, false, false, false
	        	};
	        	public boolean isCellEditable(int row, int column) {
	        		return columnEditables[column];
	        	}
	        });
	        jScrollPane1.setViewportView(jTable1);

	        jButton2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
	        jButton2.setText("移除");


	        jButton4.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
	        jButton4.setText("查看详情");

	        javax.swing.GroupLayout gl_jPanel3 = new javax.swing.GroupLayout(jPanel3);
	        gl_jPanel3.setHorizontalGroup(
	        	gl_jPanel3.createParallelGroup(Alignment.LEADING)
	        		.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
	        		.addGroup(gl_jPanel3.createSequentialGroup()
	        			.addGap(232)
	        			.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
	        			.addGap(47)
	        			.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
	        			.addGap(167))
	        );
	        gl_jPanel3.setVerticalGroup(
	        	gl_jPanel3.createParallelGroup(Alignment.LEADING)
	        		.addGroup(gl_jPanel3.createSequentialGroup()
	        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
	        			.addGap(52)
	        			.addGroup(gl_jPanel3.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(jButton4, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
	        			.addContainerGap(66, Short.MAX_VALUE))
	        );
	        jPanel3.setLayout(gl_jPanel3);

	        jTabbedPane1.addTab("  收藏夹  ", jPanel3);

	        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "  我的等价券  "));

	        jTable2.setModel(new DefaultTableModel(
	        	new Object[][] {
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
	        	},
	        	new String[] {
	        		"\u7B49\u4EF7\u5238\u9762\u989D/\u5143", "\u6570\u91CF/\u5F20", "\u5F00\u59CB\u65E5\u671F", "\u622A\u6B62\u65E5\u671F", "\u6700\u4F4E\u6D88\u8D39/\u5143"
	        	}
	        ) {
	        	boolean[] columnEditables = new boolean[] {
	        		false, false, false, false, false
	        	};
	        	public boolean isCellEditable(int row, int column) {
	        		return columnEditables[column];
	        	}
	        });
	        jScrollPane2.setViewportView(jTable2);

	        javax.swing.GroupLayout gl_jPanel9 = new javax.swing.GroupLayout(jPanel9);
	        jPanel9.setLayout(gl_jPanel9);
	        gl_jPanel9.setHorizontalGroup(
	            gl_jPanel9.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
	        );
	        gl_jPanel9.setVerticalGroup(
	            gl_jPanel9.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
	        );
	        
	        JScrollPane scrollPane = new JScrollPane();

	        javax.swing.GroupLayout gl_jPanel10 = new javax.swing.GroupLayout(jPanel10);
	        gl_jPanel10.setHorizontalGroup(
	        	gl_jPanel10.createParallelGroup(Alignment.LEADING)
	        		.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
	        );
	        gl_jPanel10.setVerticalGroup(
	        	gl_jPanel10.createParallelGroup(Alignment.LEADING)
	        		.addGroup(Alignment.TRAILING, gl_jPanel10.createSequentialGroup()
	        			.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
	        			.addContainerGap(23, Short.MAX_VALUE))
	        );
	        
	        table = new JTable();
	        table.setModel(new DefaultTableModel(
	        	new Object[][] {
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
	        		{null, null, null, null, null},
	        		{null, null, null, null, null},
	        	},
	        	new String[] {
	        		"\u6253\u6298\u5238\u7F16\u53F7", "\u6253\u6298\u7387", "\u6570\u91CF/\u5F20", "\u622A\u6B62\u65E5\u671F", "\u6700\u4F4E\u6D88\u8D39"
	        	}
	        ));
	        scrollPane.setViewportView(table);
	        jPanel10.setLayout(gl_jPanel10);

	        javax.swing.GroupLayout gl_jPanel4 = new javax.swing.GroupLayout(jPanel4);
	        jPanel4.setLayout(gl_jPanel4);
	        gl_jPanel4.setHorizontalGroup(
	            gl_jPanel4.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        gl_jPanel4.setVerticalGroup(
	            gl_jPanel4.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(gl_jPanel4.createSequentialGroup()
	                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        jTabbedPane1.addTab("  我的礼券  ", jPanel4);

	        jTable3.setModel(new DefaultTableModel(
	        	new Object[][] {
	        		{null, null, null, null},
	        		{null, null, null, null},
	        		{null, null, null, null},
	        		{null, null, null, null},
	        	},
	        	new String[] {
	        		"Title 1", "Title 2", "Title 3", "Title 4"
	        	}
	        ) {
	        	boolean[] columnEditables = new boolean[] {
	        		false, false, false, false
	        	};
	        	public boolean isCellEditable(int row, int column) {
	        		return columnEditables[column];
	        	}
	        });
	        jScrollPane3.setViewportView(jTable3);

	        javax.swing.GroupLayout gl_jPanel5 = new javax.swing.GroupLayout(jPanel5);
	        gl_jPanel5.setHorizontalGroup(
	        	gl_jPanel5.createParallelGroup(Alignment.LEADING)
	        		.addComponent(jScrollPane3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
	        );
	        gl_jPanel5.setVerticalGroup(
	        	gl_jPanel5.createParallelGroup(Alignment.TRAILING)
	        		.addComponent(jScrollPane3, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
	        );
	        jPanel5.setLayout(gl_jPanel5);

	        jTabbedPane1.addTab(" 我的购买记录 ", jPanel5);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jTabbedPane1)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
	        );

	        pack();
	}
}
