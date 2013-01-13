package presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import po.BookPO;
import po.CouponPO;
import po.EquivalentPO;
import po.FavorityPO;
import po.CustomerPO;
import po.OrderPO;
import po.ResultMessage;
import presentationController.Sales.OrderVO;
import presentationController.customer.CustomerViewService;
import presentationController.start.StartController;
import vo.CouponVO;
import vo.EquivalentVO;
import vo.FavorityVO;
import vo.KeywordVO;
import vo.CustomerVO;
import vo.NewOrderVO;


import bussinessLogic.controller.*;
import bussinessLogicService.StartBLService;

import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.Box;

public class CustomerView extends JFrame {

//	private MemberPO memberPO;
	private CustomerVO customerVO;

	public void setMemberVO(CustomerVO customerVO) {
		this.customerVO = customerVO;
	}

	private javax.swing.JButton changeAddressButton;
	private javax.swing.JButton removeFavorityButton;
	private javax.swing.JButton changeNameButton;
	private javax.swing.JButton putInCartButton;
	private javax.swing.JButton keywordSearchButton;
	private javax.swing.JButton typeSearchButton;
	private javax.swing.JComboBox typeComboBox;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel addressLabel;
	private javax.swing.JLabel bookNameLabel;
	private javax.swing.JLabel authorLabel;
	private javax.swing.JLabel publisherLabel;
	private javax.swing.JLabel publisherYearLabel;
	private javax.swing.JLabel ID;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel idLabel;
	private javax.swing.JLabel nameLabel;
	private javax.swing.JLabel pointLabel;
	private javax.swing.JLabel rankLabel;
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
	private javax.swing.JTable favorityTable;
	private javax.swing.JTable equivalentTable;
	private javax.swing.JTable orderTable;
	private javax.swing.JTextField bookNameField;
	private javax.swing.JTextField authorField;
	private javax.swing.JTextField publisherField;
	private javax.swing.JTextField publisherYearField;

	private CustomerViewService memberViewController;
	private JTable couponTable;
	private JButton enterCartButton;
	private JButton freshOrderButton;
	private JButton orderDetailButton;
	private JButton changeToAnotherCustomer;
	private JButton button;

	// /**
	// * Launch the application.
	// */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// MemberView frame = new MemberView(null,new MemberPO(null, null,
	// null,null));
	// frame.setVisible(true);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// });
	// }

	public CustomerView(CustomerViewService memberViewController,
			CustomerVO customerVO, CustomerPO customerPO) {
		this.memberViewController = memberViewController;
//		this.memberPO = memberPO;
		this.customerVO = new CustomerVO(customerPO);
		initComponents();
//		bookNameField.requestFocus();
	}

	private void initComponents() {
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
				String bookName = bookNameField.getText();
				String author = authorField.getText();
				String publisher = publisherField.getText();
				String yearString = publisherYearField.getText();

				if (bookName.equals("") && author.equals("")
						&& publisher.equals("") && yearString.equals("")) {
					JOptionPane.showMessageDialog(null, "请至少输入一项查询内容！");
					return;
				}

				if (!yearString.equals("")) {
					try {
						Integer.parseInt(yearString);
					} catch (NumberFormatException e2) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "出版年份输入错误！");
						return;
					}
				}

				KeywordVO keywordVO = new KeywordVO(bookName, author,
						publisher, yearString);
				memberViewController.searchKeyword(keywordVO);

			}
		});
		jPanel8 = new javax.swing.JPanel();
		typeComboBox = new javax.swing.JComboBox();
		typeSearchButton = new javax.swing.JButton();
		typeSearchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String type = (String) typeComboBox.getSelectedItem();
				memberViewController.searchType(type);
				// System.out.println(type);
			}
		});
		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		ID = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		idLabel = new javax.swing.JLabel();
		nameLabel = new javax.swing.JLabel();
		pointLabel = new javax.swing.JLabel();
		rankLabel = new javax.swing.JLabel();
		changeNameButton = new javax.swing.JButton();
		changeNameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newName = JOptionPane.showInputDialog("请输入新的用户名:");
				if (newName == null) {
					return;
				}
				if(newName.equals("")){
					JOptionPane.showMessageDialog(null, "名称不能为空！");
					return;
				}
				ResultMessage message = memberViewController
						.changeName(newName);
				if (message == ResultMessage.SUCCEED) {
					JOptionPane.showMessageDialog(null, "修改成功！");
					nameLabel.setText(newName);
					customerVO.userName = newName;
				} else {
					JOptionPane.showMessageDialog(null, "抱歉！该用户名已被使用！");
				}
			}
		});

		jLabel1 = new javax.swing.JLabel();
		addressLabel = new javax.swing.JLabel();
		changeAddressButton = new javax.swing.JButton();
		changeAddressButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newAddress = JOptionPane.showInputDialog("请输入新的地址:");
				if (newAddress == null) {
					return;
				}
				ResultMessage result = memberViewController
						.changeAddress(newAddress);

				if (result == ResultMessage.SUCCEED) {
					JOptionPane.showMessageDialog(null, "修改成功！");
					customerVO.address = newAddress;
					addressLabel.setText(newAddress);
				}
			}
		});
		jPanel3 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		favorityTable = new javax.swing.JTable();
		favorityTable.setRowHeight(30);
		removeFavorityButton = new javax.swing.JButton();

		removeFavorityButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = favorityTable.getSelectedRow();

				if (selectedRow == -1) {
					JOptionPane.showMessageDialog(null, "请选择一本图书！");
				} else {
//					BookPO bookPO = memberPO.getFavority().getFavorities()
//							.get(selectedRow);
					ResultMessage message = memberViewController
							.removeFavority(selectedRow);
					if (message == ResultMessage.SUCCEED) {
						freshTableModel(favorityTable);
						JOptionPane.showMessageDialog(null, "移除成功！");
					}
				}
			}
		});

		putInCartButton = new javax.swing.JButton();
		putInCartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (favorityTable.getSelectedRow() == -1) {
					JOptionPane.showMessageDialog(null, "请选择一本图书！");
				} else {
					int selectedRow = favorityTable.getSelectedRow();
//					BookPO bookPO = memberPO.getFavority().getFavorities()
//							.get(favorityTable.getSelectedRow());

					String numberString = JOptionPane
							.showInputDialog("请输入购买数量：");
					if (numberString == null) {
						return;
					}

					int number = 0;
					try {
						number = Integer.parseInt(numberString);
						if(number==0){
							return;
						}
					} catch (Exception ex) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "输入错误！");
						return;
					}

					ResultMessage result = memberViewController.putInCart(
							selectedRow, number);

					if (result == ResultMessage.SUCCEED) {
						JOptionPane.showMessageDialog(null, "添加成功！");
					}else if(result==ResultMessage.NOTPREPARED){
						JOptionPane.showMessageDialog(null, "抱歉！您购买的数量已超出本站库存！");
					}
				}
			}
		});

		jPanel4 = new javax.swing.JPanel();
		jPanel9 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		equivalentTable = new javax.swing.JTable();
		jPanel10 = new javax.swing.JPanel();
		jPanel10.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "  \u6211\u7684\u6253\u6298\u5238  ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		jPanel5 = new javax.swing.JPanel();
		jScrollPane3 = new javax.swing.JScrollPane();
		orderTable = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("会员");

		jPanel7.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "\u5173\u952E\u5B57\u67E5\u8BE2", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		bookNameLabel.setText("书名：");

		authorLabel.setText("作者：");

		publisherLabel.setText("出版社：");

		publisherYearLabel.setText("出版年份：");

		keywordSearchButton.setText("查询");

		javax.swing.GroupLayout gl_jPanel7 = new javax.swing.GroupLayout(
				jPanel7);
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
					.addPreferredGap(ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
					.addGroup(gl_jPanel7.createParallelGroup(Alignment.LEADING)
						.addComponent(publisherYearLabel, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
						.addComponent(authorLabel, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jPanel7.createParallelGroup(Alignment.LEADING)
						.addComponent(authorField, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
						.addComponent(publisherYearField, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
					.addGap(44))
				.addGroup(gl_jPanel7.createSequentialGroup()
					.addContainerGap(380, Short.MAX_VALUE)
					.addComponent(keywordSearchButton, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addGap(324))
		);
		gl_jPanel7.setVerticalGroup(
			gl_jPanel7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel7.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_jPanel7.createParallelGroup(Alignment.BASELINE)
						.addComponent(authorField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(bookNameLabel)
						.addComponent(bookNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(authorLabel, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
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

		jPanel8.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "\u5206\u7C7B\u67E5\u8BE2", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		ArrayList<String> typeList = memberViewController.getBookType();
		String[] typeString = new String[typeList.size()];
		for (int i = 0; i < typeList.size(); i++) {
			typeString[i] = typeList.get(i);
		}

		typeComboBox.setModel(new javax.swing.DefaultComboBoxModel(typeString));

		typeSearchButton.setText("查询");

		javax.swing.GroupLayout gl_jPanel8 = new javax.swing.GroupLayout(
				jPanel8);
		gl_jPanel8.setHorizontalGroup(
			gl_jPanel8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel8.createSequentialGroup()
					.addGap(138)
					.addComponent(typeComboBox, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
					.addGap(41)
					.addComponent(typeSearchButton, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(329, Short.MAX_VALUE))
		);
		gl_jPanel8.setVerticalGroup(
			gl_jPanel8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel8.createSequentialGroup()
					.addGap(46)
					.addGroup(gl_jPanel8.createParallelGroup(Alignment.BASELINE)
						.addComponent(typeComboBox, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(typeSearchButton, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		jPanel8.setLayout(gl_jPanel8);

		enterCartButton = new JButton("\u8FDB\u5165\u8D2D\u7269\u8F66");
		enterCartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memberViewController.enterCart();
			}
		});

		javax.swing.GroupLayout gl_jPanel6 = new javax.swing.GroupLayout(
				jPanel6);
		gl_jPanel6.setHorizontalGroup(
			gl_jPanel6.createParallelGroup(Alignment.LEADING)
				.addComponent(jPanel8, GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
				.addGroup(gl_jPanel6.createSequentialGroup()
					.addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_jPanel6.createSequentialGroup()
					.addContainerGap(396, Short.MAX_VALUE)
					.addComponent(enterCartButton, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
					.addGap(327))
		);
		gl_jPanel6.setVerticalGroup(
			gl_jPanel6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel6.createSequentialGroup()
					.addContainerGap()
					.addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
					.addComponent(enterCartButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(36))
		);
		jPanel6.setLayout(gl_jPanel6);

		jTabbedPane1.addTab("       \u9996\u9875       ", jPanel6);

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createEtchedBorder(), "我的信息"));

//		ID.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
		ID.setText("ID：");

//		jLabel3.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
		jLabel3.setText("名称：");

//		jLabel4.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
		jLabel4.setText("积分：");

//		jLabel5.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
		jLabel5.setText("等级：");

//		idLabel.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
		// idLabel.setText("XXX");
//		idLabel.setText(memberPO.getUserID());
		idLabel.setText(customerVO.userID);

//		nameLabel.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
		// nameLabel.setText("XXX");
//		nameLabel.setText(memberPO.getUserName());
		nameLabel.setText(customerVO.userName);

//		pointLabel.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
		// pointLabel.setText("XXX");
//		pointLabel.setText(memberPO.getPoints() + "");
		pointLabel.setText(customerVO.points + "");

//		rankLabel.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
		// rankLabel.setText("XXX");
//		rankLabel.setText(memberPO.getRank().toString());
		rankLabel.setText(customerVO.rank);

		changeNameButton.setText("\u4FEE\u6539\u540D\u79F0");

//		jLabel1.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
		jLabel1.setText("常用地址:");

//		addressLabel.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
		// addressLabel.setText("XXX");
//		addressLabel.setText(memberPO.getAddress());
		addressLabel.setText(customerVO.address);

		changeAddressButton.setText("修改地址");

		JButton changePasswordButton = new JButton("\u4FEE\u6539\u5BC6\u7801");
		changePasswordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChangePasswordFrame(memberViewController).setVisible(true);

				// String oldPassword=JOptionPane.showInputDialog("请输入原始密码：");
				// if(oldPassword==null){
				// return;
				// }
				//
				// if(!memberViewController.checkPassword(oldPassword)){
				// JOptionPane.showMessageDialog(null, "抱歉！密码输入错误！");
				// }else{
				// String password1=JOptionPane.showInputDialog("请输入新密码：");
				// if(password1==null){
				// return;
				// }
				//
				// String password2=JOptionPane.showInputDialog("请再次输入新密码：");
				// if(password2==null){
				// return;
				// }
				//
				// if(password1.equals(password2)){
				// ResultMessage
				// message=memberViewController.changePassword(password1);
				// if(message==ResultMessage.SUCCEED){
				// JOptionPane.showMessageDialog(null, "修改成功！");
				// }
				// }else{
				// JOptionPane.showMessageDialog(null, "密码输入不一致！");
				// }
				//
				// }
			}
		});

		JButton freshPointButton = new JButton("\u5237\u65B0\u79EF\u5206");
		freshPointButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				freshMemberPO(customerVO.userID);
//				pointLabel.setText("" + memberPO.getPoints());
				pointLabel.setText("" + customerVO.points);
			}
		});

//		freshPointButton.setFont(new Font("微软雅黑", Font.PLAIN, 14));

		javax.swing.GroupLayout gl_jPanel2 = new javax.swing.GroupLayout(
				jPanel2);
		gl_jPanel2.setHorizontalGroup(
			gl_jPanel2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel2.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jPanel2.createSequentialGroup()
							.addComponent(jLabel1)
							.addGap(587))
						.addGroup(gl_jPanel2.createSequentialGroup()
							.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_jPanel2.createSequentialGroup()
									.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_jPanel2.createSequentialGroup()
											.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING)
												.addComponent(ID, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
											.addGap(59)
											.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_jPanel2.createSequentialGroup()
													.addComponent(pointLabel, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED, 375, Short.MAX_VALUE)
													.addComponent(freshPointButton, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_jPanel2.createSequentialGroup()
													.addGroup(gl_jPanel2.createParallelGroup(Alignment.TRAILING)
														.addComponent(nameLabel)
														.addComponent(idLabel)
														.addComponent(rankLabel))
													.addPreferredGap(ComponentPlacement.RELATED, 389, Short.MAX_VALUE)
													.addGroup(gl_jPanel2.createParallelGroup(Alignment.TRAILING)
														.addComponent(changeNameButton, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
														.addComponent(changePasswordButton, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)))
												.addGroup(gl_jPanel2.createSequentialGroup()
													.addComponent(addressLabel, GroupLayout.PREFERRED_SIZE, 477, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(changeAddressButton, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))))
										.addComponent(jLabel3))
									.addGap(180))
								.addComponent(jLabel5))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(253))
		);
		gl_jPanel2.setVerticalGroup(
			gl_jPanel2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel2.createSequentialGroup()
					.addGap(13)
					.addGroup(gl_jPanel2.createParallelGroup(Alignment.BASELINE)
						.addComponent(ID)
						.addComponent(idLabel)
						.addComponent(changePasswordButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_jPanel2.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel3)
						.addComponent(nameLabel)
						.addComponent(changeNameButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addGroup(gl_jPanel2.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel5)
						.addComponent(rankLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel2.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(pointLabel)
						.addComponent(freshPointButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_jPanel2.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel1)
						.addComponent(addressLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(changeAddressButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(160, Short.MAX_VALUE))
		);
		jPanel2.setLayout(gl_jPanel2);

		javax.swing.GroupLayout gl_jPanel1 = new javax.swing.GroupLayout(
				jPanel1);
		gl_jPanel1.setHorizontalGroup(
			gl_jPanel1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel1.createSequentialGroup()
					.addContainerGap()
					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 902, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(78, Short.MAX_VALUE))
		);
		gl_jPanel1.setVerticalGroup(
			gl_jPanel1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel1.createSequentialGroup()
					.addContainerGap()
					.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel1.setLayout(gl_jPanel1);

		jTabbedPane1.addTab("      \u6211\u7684\u4FE1\u606F      ", jPanel1);

		favorityTable.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null }, }, new String[] {
				"\u56FE\u4E66\u540D\u79F0", "\u4F5C\u8005", "ISBN",
				"\u51FA\u7248\u793E", "\u51FA\u7248\u5E74\u4EFD" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});

		// favorityTable.setModel(new FavorityTableModel());
		favorityTable.setModel(new FavorityVOTableModel());

		jScrollPane1.setViewportView(favorityTable);

//		removeFavorityButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
		removeFavorityButton.setText("移除");

//		putInCartButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
		putInCartButton.setText("\u653E\u5165\u8D2D\u7269\u8F66");

		JButton freshFavorityButton = new JButton("\u5237\u65B0\u5217\u8868");
		freshFavorityButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				freshTableModel(favorityTable);
			}
		});
//		freshFavorityButton.setFont(new Font("微软雅黑", Font.PLAIN, 14));

		JButton enterCartNewButton = new JButton(
				"\u8FDB\u5165\u8D2D\u7269\u8F66");
		enterCartNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memberViewController.enterCart();
			}
		});
//		enterCartNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 14));

		javax.swing.GroupLayout gl_jPanel3 = new javax.swing.GroupLayout(
				jPanel3);
		gl_jPanel3.setHorizontalGroup(gl_jPanel3
				.createParallelGroup(Alignment.LEADING)
				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 827,
						Short.MAX_VALUE)
				.addGroup(
						gl_jPanel3
								.createSequentialGroup()
								.addGap(112)
								.addComponent(removeFavorityButton,
										GroupLayout.PREFERRED_SIZE, 125,
										GroupLayout.PREFERRED_SIZE)
								.addGap(31)
								.addComponent(putInCartButton,
										GroupLayout.PREFERRED_SIZE, 130,
										GroupLayout.PREFERRED_SIZE)
								.addGap(35)
								.addComponent(freshFavorityButton,
										GroupLayout.PREFERRED_SIZE, 112,
										GroupLayout.PREFERRED_SIZE)
								.addGap(38)
								.addComponent(enterCartNewButton,
										GroupLayout.PREFERRED_SIZE, 117,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(127, Short.MAX_VALUE)));
		gl_jPanel3
				.setVerticalGroup(gl_jPanel3
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_jPanel3
										.createSequentialGroup()
										.addComponent(jScrollPane1,
												GroupLayout.PREFERRED_SIZE,
												249, GroupLayout.PREFERRED_SIZE)
										.addGap(115)
										.addGroup(
												gl_jPanel3
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																removeFavorityButton,
																GroupLayout.PREFERRED_SIZE,
																37,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																putInCartButton,
																GroupLayout.DEFAULT_SIZE,
																37,
																Short.MAX_VALUE)
														.addComponent(
																freshFavorityButton,
																GroupLayout.PREFERRED_SIZE,
																38,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																enterCartNewButton,
																GroupLayout.PREFERRED_SIZE,
																37,
																GroupLayout.PREFERRED_SIZE))
										.addContainerGap(52, Short.MAX_VALUE)));
		jPanel3.setLayout(gl_jPanel3);

		jTabbedPane1.addTab("      \u6536\u85CF\u5939      ", jPanel3);

		jPanel9.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "\u6211\u7684\u7B49\u4EF7\u5238", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		equivalentTable.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "\u7B49\u4EF7\u5238\u7F16\u53F7",
						"\u7B49\u4EF7\u5238\u9762\u989D/\u5143",
						"\u622A\u6B62\u65E5\u671F",
						"\u6700\u4F4E\u6D88\u8D39/\u5143" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		equivalentTable.getColumnModel().getColumn(1).setPreferredWidth(95);
		equivalentTable.getColumnModel().getColumn(3).setPreferredWidth(94);
		// equivalentTable.setModel(new EquivalentTableModel());
		equivalentTable.setModel(new EquivalentVOTableModel());
		equivalentTable.setRowHeight(30);
		jScrollPane2.setViewportView(equivalentTable);

		javax.swing.GroupLayout gl_jPanel9 = new javax.swing.GroupLayout(
				jPanel9);
		jPanel9.setLayout(gl_jPanel9);
		gl_jPanel9.setHorizontalGroup(gl_jPanel9.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE));
		gl_jPanel9.setVerticalGroup(gl_jPanel9.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE));

		JScrollPane scrollPane = new JScrollPane();

		javax.swing.GroupLayout gl_jPanel10 = new javax.swing.GroupLayout(
				jPanel10);
		gl_jPanel10.setHorizontalGroup(gl_jPanel10.createParallelGroup(
				Alignment.LEADING).addComponent(scrollPane, Alignment.TRAILING,
				GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE));
		gl_jPanel10.setVerticalGroup(gl_jPanel10.createParallelGroup(
				Alignment.TRAILING).addGroup(
				Alignment.LEADING,
				gl_jPanel10
						.createSequentialGroup()
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE,
								156, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(48, Short.MAX_VALUE)));

		couponTable = new JTable();
		couponTable.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null }, }, new String[] {
				"\u6253\u6298\u5238\u7F16\u53F7", "\u6253\u6298\u7387",
				"\u622A\u6B62\u65E5\u671F" }));
		// couponTable.setModel(new CouponTableModel());
		couponTable.setModel(new CouponVOTableModel());
		couponTable.setRowHeight(30);
		scrollPane.setViewportView(couponTable);
		jPanel10.setLayout(gl_jPanel10);

		JButton freshButton = new JButton("\u5237\u65B0\u5217\u8868");
		freshButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				freshMemberPO(customerVO.userID);
				couponTable.setModel(new CouponVOTableModel());
				equivalentTable.setModel(new EquivalentVOTableModel());
			}
		});
//		freshButton.setFont(new Font("微软雅黑", Font.PLAIN, 14));

		javax.swing.GroupLayout gl_jPanel4 = new javax.swing.GroupLayout(
				jPanel4);
		gl_jPanel4
				.setHorizontalGroup(gl_jPanel4
						.createParallelGroup(Alignment.LEADING)
						.addComponent(jPanel9, Alignment.TRAILING,
								GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
						.addComponent(jPanel10, Alignment.TRAILING,
								GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
						.addGroup(
								Alignment.TRAILING,
								gl_jPanel4
										.createSequentialGroup()
										.addContainerGap(367, Short.MAX_VALUE)
										.addComponent(freshButton,
												GroupLayout.PREFERRED_SIZE,
												138, GroupLayout.PREFERRED_SIZE)
										.addGap(350)));
		gl_jPanel4.setVerticalGroup(gl_jPanel4.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_jPanel4
						.createSequentialGroup()
						.addComponent(jPanel9, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(jPanel10, GroupLayout.PREFERRED_SIZE,
								184, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(freshButton, GroupLayout.PREFERRED_SIZE,
								31, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(21, Short.MAX_VALUE)));
		jPanel4.setLayout(gl_jPanel4);

		jTabbedPane1.addTab("      \u6211\u7684\u793C\u5238      ", jPanel4);

		orderTable.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "\u8BA2\u5355\u7F16\u53F7",
						"\u8BA2\u5355\u603B\u4EF7", "\u8BA2\u5355\u72B6\u6001",
						"\u4E0B\u5355\u65E5\u671F" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});

//		orderTable.setModel(new OrderTableModel());
		orderTable.setModel(new OrderVOTableModel());
		jScrollPane3.setViewportView(orderTable);

		freshOrderButton = new JButton("\u5237\u65B0\u5217\u8868");
		freshOrderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				freshMemberPO(customerVO.userID);
				freshOrderTable(orderTable);
			}
		});
//		freshOrderButton.setFont(new Font("微软雅黑", Font.PLAIN, 14));

		orderDetailButton = new JButton("\u67E5\u770B\u8BE6\u60C5");
		orderDetailButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = orderTable.getSelectedRow();
				if (index == -1) {
					JOptionPane.showMessageDialog(null, "请选择一条订单！");
					return;
				}
				OrderDetailView orderDetailView = new OrderDetailView(customerVO
						.orderVOList.get(index));
				orderDetailView.setVisible(true);
			}
		});
//		orderDetailButton.setFont(new Font("微软雅黑", Font.PLAIN, 14));

		javax.swing.GroupLayout gl_jPanel5 = new javax.swing.GroupLayout(
				jPanel5);
		gl_jPanel5.setHorizontalGroup(gl_jPanel5
				.createParallelGroup(Alignment.LEADING)
				.addComponent(jScrollPane3, Alignment.TRAILING,
						GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
				.addGroup(
						gl_jPanel5
								.createSequentialGroup()
								.addGap(247)
								.addComponent(freshOrderButton,
										GroupLayout.PREFERRED_SIZE, 109,
										GroupLayout.PREFERRED_SIZE)
								.addGap(52)
								.addComponent(orderDetailButton,
										GroupLayout.PREFERRED_SIZE, 110,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(327, Short.MAX_VALUE)));
		gl_jPanel5.setVerticalGroup(gl_jPanel5.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_jPanel5
						.createSequentialGroup()
						.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE,
								359, GroupLayout.PREFERRED_SIZE)
						.addGap(44)
						.addGroup(
								gl_jPanel5
										.createParallelGroup(
												Alignment.TRAILING, false)
										.addComponent(orderDetailButton,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(freshOrderButton,
												GroupLayout.DEFAULT_SIZE, 40,
												Short.MAX_VALUE)).addGap(45)));
		jPanel5.setLayout(gl_jPanel5);

		jTabbedPane1.addTab("     \u6211\u7684\u8D2D\u4E70\u8BB0\u5F55     ",
				jPanel5);

		changeToAnotherCustomer = new JButton("\u5207\u6362\u7528\u6237");
		changeToAnotherCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memberViewController.changeToAnotherUser();
				StartBLService startController=new StartController();
			}
		});
//		changeToAnotherCustomer.setFont(new Font("微软雅黑", Font.PLAIN, 14));

		button = new JButton("\u8FDB\u5165\u8D2D\u7269\u8F66");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memberViewController.enterCart();
			}
		});
//		button.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		
				JButton cancelButton = new JButton("\u6CE8\u9500");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String password = JOptionPane.showInputDialog("请输入密码：");
						if (password == null) {
							return;
						}
						ResultMessage resultMessage = memberViewController
								.cancel(password);

						if (resultMessage == ResultMessage.ERROR) {
							JOptionPane.showMessageDialog(null, "密码输入错误！");
						} else if (resultMessage == ResultMessage.NOTPREPARED) {
							JOptionPane.showMessageDialog(null, "抱歉，您有尚未签收的订单，暂时无法注销！");
						} else if (resultMessage == ResultMessage.SUCCEED) {
							JOptionPane.showMessageDialog(null, "注销成功！");
							System.exit(0);
						} else {
							System.out.println(resultMessage);
						}
					}
				});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap(475, Short.MAX_VALUE)
					.addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
					.addGap(41)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(changeToAnotherCustomer, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(60))
				.addComponent(jTabbedPane1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
						.addComponent(changeToAnotherCustomer, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
					.addGap(13)
					.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 540, Short.MAX_VALUE))
		);
		getContentPane().setLayout(layout);

		bookNameField.requestFocus();
		pack();
		bookNameField.requestFocus();
	}

	// 刷新收藏夹列表
	private void freshTableModel(JTable table) {
		memberViewController.freshMemberPO(customerVO.userID);
		table.setModel(new FavorityVOTableModel());
	}

	private void freshOrderTable(JTable table) {
		table.setModel(new OrderVOTableModel());
	}

	private void freshMemberPO(String memberID) {
		memberViewController.freshMemberPO(memberID);

	}

	class FavorityVOTableModel extends AbstractTableModel {
		FavorityVO favorityVO = customerVO.favorityVO;

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return favorityVO.bookVOList.size();
		}

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return 6;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			switch (columnIndex) {
			case 0:
				return favorityVO.bookVOList.get(rowIndex).bookName;
			case 1:
				return favorityVO.bookVOList.get(rowIndex).author;
			case 2:
				return favorityVO.bookVOList.get(rowIndex).ISBN;
			case 3:
				return favorityVO.bookVOList.get(rowIndex).press;

			case 4:
				return favorityVO.bookVOList.get(rowIndex).publishDate;
			default:
				return favorityVO.bookVOList.get(rowIndex).numOfBook;
			}
		}

		public String getColumnName(int c) {

			switch (c) {
			case 0:
				return "图书名称";
			case 1:
				return "作者";
			case 2:
				return "ISBN";
			case 3:
				return "出版社";

			case 4:
				return "出版年份";
			default:
				return "现有库存";
			}
		}

	}

	// class FavorityTableModel extends AbstractTableModel {
	// FavorityPO favorityPO;
	//
	// public FavorityTableModel() {
	// // TODO Auto-generated constructor stub
	// this.favorityPO = memberPO.getFavority();
	// }
	//
	// @Override
	// public int getRowCount() {
	// // TODO Auto-generated method stub
	// return memberPO.getFavority().getSize();
	// }
	//
	// @Override
	// public int getColumnCount() {
	// // TODO Auto-generated method stub
	// return 5;
	// }
	//
	// @Override
	// public Object getValueAt(int rowIndex, int columnIndex) {
	// // TODO Auto-generated method stub
	// switch (columnIndex) {
	// case 0:
	// return favorityPO.getFavorities().get(rowIndex).getBookName();
	// case 1:
	// return favorityPO.getFavorities().get(rowIndex).getAuthor();
	// case 2:
	// return favorityPO.getFavorities().get(rowIndex).getISBN();
	// case 3:
	// return favorityPO.getFavorities().get(rowIndex).getPress();
	//
	// default:
	// return favorityPO.getFavorities().get(rowIndex)
	// .getPublishDate();
	// }
	// }
	//
	// public String getColumnName(int c) {
	//
	// switch (c) {
	// case 0:
	// return "\u56FE\u4E66\u540D\u79F0";
	// case 1:
	// return "\u4F5C\u8005";
	// case 2:
	// return "ISBN";
	// case 3:
	// return "\u51FA\u7248\u793E";
	//
	// default:
	// return "\u51FA\u7248\u5E74\u4EFD";
	// }
	// }
	//
	// }

	class EquivalentVOTableModel extends AbstractTableModel {

		ArrayList<EquivalentVO> equivalentVOList = customerVO.equivalentVOList;

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return equivalentVOList.size();
		}

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return 4;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			switch (columnIndex) {
			case 0:
				return equivalentVOList.get(rowIndex).id;
			case 1:
				return equivalentVOList.get(rowIndex).deno;
			case 2:

				return equivalentVOList.get(rowIndex).endDate;
			default:
				return equivalentVOList.get(rowIndex).min;
			}
		}

		public String getColumnName(int c) {

			switch (c) {
			case 0:
				return "等价券编号";
			case 1:
				return "等价券面额/元";
			case 2:
				return "截止日期";
			default:
				return "最低消费/元";
			}
		}

	}

	// class EquivalentTableModel extends AbstractTableModel {
	// ArrayList<EquivalentPO> equivalentList = memberPO.getEquivalentList();
	//
	// @Override
	// public int getRowCount() {
	// // TODO Auto-generated method stub
	// return equivalentList.size();
	// }
	//
	// @Override
	// public int getColumnCount() {
	// // TODO Auto-generated method stub
	// return 4;
	// }
	//
	// @Override
	// public Object getValueAt(int rowIndex, int columnIndex) {
	// // TODO Auto-generated method stub
	// switch (columnIndex) {
	// case 0:
	// return equivalentList.get(rowIndex).getID();
	// case 1:
	// return equivalentList.get(rowIndex).getDeno();
	// case 2:
	// Calendar endDate = equivalentList.get(rowIndex).getEndDate();
	// return endDate.get(Calendar.YEAR) + "年"
	// + (endDate.get(Calendar.MONTH) + 1) + "月"
	// + endDate.get(Calendar.DATE) + "日";
	// default:
	// return equivalentList.get(rowIndex).getMin();
	// }
	// }
	//
	// public String getColumnName(int c) {
	//
	// switch (c) {
	// case 0:
	// return "等价券编号";
	// case 1:
	// return "等价券面额/元";
	// case 2:
	// return "截止日期";
	// default:
	// return "最低消费/元";
	// }
	// }
	// }

	class CouponVOTableModel extends AbstractTableModel {

		ArrayList<CouponVO> couponVOList = customerVO.couponVOList;

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return couponVOList.size();
		}

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return 3;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			switch (columnIndex) {
			case 0:
				return couponVOList.get(rowIndex).id;
			case 1:
				return couponVOList.get(rowIndex).rate;
			default:
				return couponVOList.get(rowIndex).date;
			}
		}

		public String getColumnName(int c) {

			switch (c) {
			case 0:
				return "打折券编号";
			case 1:
				return "打折率";
			default:
				return "截止日期";
			}
		}
	}

	// class CouponTableModel extends AbstractTableModel {
	// ArrayList<CouponPO> couponList = memberPO.getCouponList();
	//
	// @Override
	// public int getRowCount() {
	// // TODO Auto-generated method stub
	// return couponList.size();
	// }
	//
	// @Override
	// public int getColumnCount() {
	// // TODO Auto-generated method stub
	// return 3;
	// }
	//
	// @Override
	// public Object getValueAt(int rowIndex, int columnIndex) {
	// // TODO Auto-generated method stub
	// switch (columnIndex) {
	// case 0:
	// return couponList.get(rowIndex).getID();
	// case 1:
	// return couponList.get(rowIndex).getRate();
	// default:
	// Calendar endDate = couponList.get(rowIndex).getEndDate();
	// return endDate.get(Calendar.YEAR) + "年"
	// + (endDate.get(Calendar.MONTH) + 1) + "月"
	// + endDate.get(Calendar.DATE) + "日";
	// }
	// }
	//
	// public String getColumnName(int c) {
	//
	// switch (c) {
	// case 0:
	// return "打折券编号";
	// case 1:
	// return "打折率";
	// default:
	// return "截止日期";
	// }
	// }
	// }

	class OrderVOTableModel extends AbstractTableModel {
		ArrayList<NewOrderVO> orderVOList = customerVO.orderVOList;

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return orderVOList.size();
		}

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return 5;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			switch (columnIndex) {
			case 0:
				return orderVOList.get(rowIndex).orderNum;
			case 1:
				return orderVOList.get(rowIndex).totalPrice;
			case 2:
				return orderVOList.get(rowIndex).state.toString();
			case 3:
				return orderVOList.get(rowIndex).date;
			default:
				return orderVOList.get(rowIndex).address;
			}
		}
		
		public String getColumnName(int c) {

			switch (c) {
			case 0:
				return "订单编号";
			case 1:
				return "订单总价";
			case 2:
				return "订单状态";
			case 3:
				return "下单日期";
			default:
				return "送货地址";
			}
		}

	}
}
