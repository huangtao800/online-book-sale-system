package presentation;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import po.BookPO;
import po.CustomerPO;
import po.OrderPO;
import po.OrderState;
import po.Present_Coupon;
import po.Present_Equivalent;
import po.ResultMessage;
import po.SalesManagerPO;
import presentationController.SalesManagerView.SalesManagerViewService;
import presentationController.changePasswordView.changePasswordController;
import presentationController.changePasswordView.changePasswordControllerInterface;
import presentationController.changeUserNameView.changeUserNameController;
import presentationController.changeUserNameView.changeUserNameControllerInterface;
import presentationController.searchBookView.SearchBookService;
import presentationController.searchBookView.SearchBookViewController;


/**
 *
 * @author YJQ
 */
public class SalesManagerView extends javax.swing.JFrame {
	
    public SalesManagerView(SalesManagerViewService salesManagerViewController) {
    	this.salesManagerViewController = salesManagerViewController;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    public void createSalesManagerView() {

        jPanel1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        changeUserNameButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        changeUserPasswordButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        memberIDTextField = new javax.swing.JTextField();
        checkMemberInfoButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        memberInfoTextArea = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        memberOrderTextArea = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        checkPresentButton = new javax.swing.JButton();
        sendPresentButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        showPresentTextArea = new javax.swing.JTextArea();
        orderPanel = new javax.swing.JPanel();
        updateOrderButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        orderedRadioButton = new javax.swing.JRadioButton();
        distributionRadioButton = new javax.swing.JRadioButton();
        transportRadioButton = new javax.swing.JRadioButton();
        changeOrderButton = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        signedRadioButton = new javax.swing.JRadioButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        bookIDTextField = new javax.swing.JTextField();
        bookNameTextField = new javax.swing.JTextField();
        bookAuthorTextField = new javax.swing.JTextField();
        bookPublishHouseTextField = new javax.swing.JTextField();
        bookPublishYearField = new javax.swing.JTextField();
        bookNumTextField = new javax.swing.JTextField();
        bookPriceTextField = new javax.swing.JTextField();
        typeComboBox = new javax.swing.JComboBox();
        addBookButton = new javax.swing.JButton();
        deleteBookButton  = new javax.swing.JButton();
        confirmChangeBookButton = new javax.swing.JButton();
        checkAllBookButton = new javax.swing.JButton();
        changeBookButton = new javax.swing.JButton();
        bookTypejPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        bookTypeList = new javax.swing.JList() ;
        jLabel23 = new javax.swing.JLabel();
        addBookTypeButton = new javax.swing.JButton();
        changeBookTypeButton = new javax.swing.JButton();
        deleteBookTypeButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        userpo=salesManagerViewController.getUserPO();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("用户名：");

        userNameLabel.setText(userpo.getUserName());

        changeUserNameButton.setText("修改用户名");
        changeUserNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	changeUserNameControllerInterface controller=new changeUserNameController(userpo,salesManagerViewController) ;
            }
        });

        jLabel6.setText("功能：");

        jLabel7.setText("修改密码");

        changeUserPasswordButton.setText("密码修改");
        changeUserPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	changePasswordControllerInterface controller=new changePasswordController(userpo,salesManagerViewController);
            }
        });

        jLabel8.setText("查询顾客信息");

        jLabel9.setText("赠送礼券");

        jLabel10.setText("管理订单");

        jLabel11.setText("管理图书");

        jLabel12.setText("设置图书类别");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(48, 48, 48)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameLabel)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(changeUserNameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(changeUserPasswordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel7))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(userNameLabel)
                    .addComponent(changeUserNameButton))
                .addGap(35, 35, 35)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(changeUserPasswordButton))
                .addGap(39, 39, 39)
                .addComponent(jLabel8)
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addGap(35, 35, 35)
                .addComponent(jLabel10)
                .addGap(29, 29, 29)
                .addComponent(jLabel11)
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addGap(139, 139, 139))
        );

        jPanel1.addTab(" 首页    ", jPanel8);

        jLabel13.setText("顾客ID：");

        checkMemberInfoButton.setText("查看顾客信息");
        checkMemberInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	memberInfoTextArea.setText("");
	    		memberOrderTextArea.setText("");
	    		if(memberIDTextField.getText().trim().equals("")){
	    			JOptionPane.showMessageDialog(null, "请先输入顾客的ID！");
	    		}else{
	    		      CustomerPO customerPO= salesManagerViewController.getMemberPO(memberIDTextField.getText().trim());
	    		      if(customerPO == null){
	    		    	  JOptionPane.showMessageDialog(null, "对不起，您要查看的顾客不存在！");
	    		      }else{
	    		    	  memberInfoTextArea.append("编号: "+customerPO.getUserID()+
	    		    			                                          "\n名称: "+customerPO.getUserName()+
	    		    			                                          "\n积分: "+customerPO.getPoints()+
	    		    			                                          "\n等级: "+customerPO.getRank()
	    		    			                                           );
	    		    	  for(int i=0;i<customerPO.getEquivalentList().size(); i++){
	    		    		  memberInfoTextArea.append("拥有等价券:  "+customerPO.getEquivalentList().get(i).toString());
	    		    	  }
	    		    	  for(int j=0;j<customerPO.getCouponList().size(); j++){
	    		    		  memberInfoTextArea.append("拥有打折券:  "+customerPO.getCouponList().get(j).toString());
	    		    	  }
	    		    	  if(customerPO.getOrderList().size()== 0){
	    		    		  memberOrderTextArea.append("该顾客尚未进行任何购买活动！");
	    		    	  }else{
	    		    	           for(int k=0;k<customerPO.getOrderList().size(); k++){
	    		    	                memberOrderTextArea.append(customerPO.getOrderList().get(k).toString()+"\n");
	    		    	            }
	    		    	  }
	    		      }    		      
	    		}
            }
        });

        memberInfoTextArea.setColumns(20);
        memberInfoTextArea.setRows(5);
        jScrollPane1.setViewportView(memberInfoTextArea);

        jLabel14.setText("个人信息：");

        jLabel15.setText("购买记录：");

        memberOrderTextArea.setColumns(20);
        memberOrderTextArea.setRows(5);
        jScrollPane2.setViewportView(memberOrderTextArea);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(66, 66, 66)
                         .addComponent(memberIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(checkMemberInfoButton)
                        .addGap(100, 100, 100))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2))
                        .addContainerGap())))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(memberIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkMemberInfoButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.addTab("顾客信息查询", jPanel9);

        checkPresentButton.setText("查看礼券信息");
        checkPresentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	checkPresent();
            }
        });

        sendPresentButton.setText("赠送礼券");
        sendPresentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	ResultMessage result= salesManagerViewController.sendPresent();
	    		if(result== ResultMessage.NOTEXIST){
	    			 showPresentTextArea.setText("尚无礼券！");
	    	         JOptionPane.showMessageDialog(null, "总经理未制定礼券 或 礼券已经赠送完毕！");       
	    		}
	    		else if(result ==ResultMessage.OVORTIME){
	    			 showPresentTextArea.setText("礼券赠送完毕！");
	    		     JOptionPane.showMessageDialog(null, "礼券赠送完毕！且已将过期的礼券删除！");		  
	    		}else if(result== ResultMessage.SUCCEED){
	    			showPresentTextArea.setText("礼券赠送完毕！");
	    		    JOptionPane.showMessageDialog(null, "礼券赠送完毕！");
	    		}
            }
        });

        jLabel1.setText("查看结果：");

        showPresentTextArea.setColumns(20);
        showPresentTextArea.setRows(5);
        jScrollPane3.setViewportView(showPresentTextArea);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                    		.addComponent(checkPresentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sendPresentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkPresentButton)
                    .addComponent(sendPresentButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.addTab("礼券赠送  ", jPanel10);

        updateOrderButton.setText("更新未完成的订单");
        updateOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	hasUpdateUncompleteOrder=true;
	    		updateUncompletedOrder();	
            }
        });

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
                "订单号", "下单时间", "总价", "顾客编号", "订单状态"
            }
        ));
        jScrollPane5.setViewportView(orderTable);
        orderTable.getColumnModel().getColumn(0).setResizable(false);
        orderTable.getColumnModel().getColumn(1).setResizable(false);
        orderTable.getColumnModel().getColumn(2).setResizable(false);
        orderTable.getColumnModel().getColumn(4).setResizable(false);

        jLabel24.setText("订单状态：");

        orderedRadioButton.setText("刚下单");

        distributionRadioButton.setText("仓库配货");

        transportRadioButton.setText("物流配送");
        
        signedRadioButton.setText("已签收");

        changeOrderButton.setText("修改订单状态");
        changeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	if(! hasUpdateUncompleteOrder){
	    			  JOptionPane.showMessageDialog(null, "请先查看未完成的订单！");
	    			  return ;
	    		}
	    		if(uncompletedOrderList==null || uncompletedOrderList.size()==0){
	    			 JOptionPane.showMessageDialog(null, "暂无未完成的订单！");
	    			return;
	    		}
	    		
	    		int selectedRow=orderTable.getSelectedRow();
	    		if(selectedRow != -1){
	    			OrderPO orderPO=uncompletedOrderList.get(selectedRow);
	    			if(orderedRadioButton.isSelected()){
	    				   JOptionPane.showMessageDialog(null, "您修改的订单状态不合理！");
	    			}else if(distributionRadioButton.isSelected()){
	    				    if(orderPO.getOrderState() ==OrderState.ORDERDED){
	    				    	orderPO.setOrderState(OrderState.DISTRIBUTION);
	    				    	uncompletedOrderList.get(selectedRow).setOrderState(OrderState.DISTRIBUTION);
	    				    	salesManagerViewController.writeUncompletedOrderPOList(orderPO);
	    				    	salesManagerViewController.updateMember_Order(
	    				    			    orderPO.getMemberID(),orderPO.getOrderState(),orderPO.getOrderNum());
	    				    }else  JOptionPane.showMessageDialog(null, "您修改的订单状态不合理！");		
	    			}else if(transportRadioButton.isSelected()){
	    				   if(orderPO.getOrderState() ==OrderState.DISTRIBUTION){
	    					   orderPO.setOrderState(OrderState.TRASPORTATION);
	    					   uncompletedOrderList.get(selectedRow).setOrderState(OrderState.TRASPORTATION);
	    					   salesManagerViewController.writeUncompletedOrderPOList(orderPO);
	    					   salesManagerViewController.updateMember_Order(
 				    			    orderPO.getMemberID(),orderPO.getOrderState(),orderPO.getOrderNum());
	    				    }else  JOptionPane.showMessageDialog(null, "您修改的订单状态不合理！");
	    			}else if(signedRadioButton.isSelected()){
	    				   if(orderPO.getOrderState() ==OrderState.TRASPORTATION){
	    					   orderPO.setOrderState(OrderState.SIGNED);
	    					   uncompletedOrderList.get(selectedRow).setOrderState(OrderState.SIGNED);
	    					   salesManagerViewController.writeUncompletedOrderPOList(orderPO);
	    					   salesManagerViewController.updateMember_Order(
 				    			    orderPO.getMemberID(),orderPO.getOrderState(),orderPO.getOrderNum());
	    				    }else  JOptionPane.showMessageDialog(null, "您修改的订单状态不合理！");
	    			}else{
	    				JOptionPane.showMessageDialog(null, "请先在'订单状态'一栏中选中您想要更改成为的订单状态！");
	    			}
	    			
	    			updateUncompletedOrder();
	    		}else{
	    			JOptionPane.showMessageDialog(null, "请首先在表格中选择某一项未完成的订单！");
	    		}
            }
        });

        jLabel25.setText("订单列表：");

        javax.swing.GroupLayout orderPanelLayout = new javax.swing.GroupLayout(orderPanel);
        orderPanel.setLayout(orderPanelLayout);
        orderPanelLayout.setHorizontalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(orderPanelLayout.createSequentialGroup()
                        .addComponent(updateOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(changeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(orderPanelLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(orderPanelLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(36, 36, 36)
                        .addComponent(orderedRadioButton)
                        .addGap(63, 63, 63)
                        .addComponent(distributionRadioButton)
                        .addGap(63, 63, 63)
                        .addComponent(transportRadioButton)
                        .addGap(63, 63, 63)
                        .addComponent(signedRadioButton)))
                .addContainerGap())
        );
        orderPanelLayout.setVerticalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(orderedRadioButton)
                    .addComponent(distributionRadioButton)
                    .addComponent(transportRadioButton)
                    .addComponent(signedRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateOrderButton)
                    .addComponent(changeOrderButton))
                .addContainerGap())
        );

        jPanel1.addTab("订单管理  ", orderPanel);

        jLabel2.setText("图书编号：");

        jLabel16.setText("图书名称：");

        jLabel17.setText("作者：");

        jLabel18.setText("出版社：");

        jLabel19.setText("出版时间：");

        jLabel20.setText("数量/册：");

        jLabel21.setText("单价/元：");

        jLabel22.setText("图书类别：");


        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        setTypeComboxModel();

        addBookButton.setText("增加图书");
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                     bookIDTextField.setEditable(true);
	    		     if(bookInforTrue()){
	    		          BookPO bookPO=new BookPO(bookIDTextField.getText().trim(), bookNameTextField.getText().trim(), 
	    		    		          bookAuthorTextField.getText().trim(),bookPublishHouseTextField.getText().trim(),
                                      bookPublishYearField.getText().trim(), (String) (typeComboBox.getSelectedItem()),
	    		    		          Double.parseDouble(bookPriceTextField.getText().trim()),Integer.parseInt(bookNumTextField.getText().trim()));
	    		     
	    		         if( salesManagerViewController.addBook(bookPO) == ResultMessage.EXIST){
	    		    	         JOptionPane.showMessageDialog(null, "您输入的图书ISBN已经存在，请另行设置！");
	    		          }else if(salesManagerViewController.addBook(bookPO)==ResultMessage.FAILED){
	    		    	          JOptionPane.showMessageDialog(null, "系统异常请稍后重试！");
	    		          }else{
	    		    	         JOptionPane.showMessageDialog(null, "添加图书成功！");
	    		          }
	    		     }else {JOptionPane.showMessageDialog(null, "请首先确认以上您输入的图书信息完整、合理！");}
            }
        });

        deleteBookButton .setText("删除图书");
        deleteBookButton .addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	bookIDTextField.setEditable(true);
	    		String isbn2=JOptionPane.showInputDialog(null,"请输入您要删除的图书的ISBN：");
	    		if(isbn2==null){
	    			JOptionPane.showMessageDialog(null, "输入ISBN有误，请重新输入！");
	    		}else{
	    			BookPO  bookPO=null;
	    			bookPO=salesManagerViewController.getBookPO(isbn2);
	    			if(bookPO==null){
	    				JOptionPane.showMessageDialog(null, "您要删除的图书不存在！");
	    			}else if(bookPO.getNumOfBook()==0){
	    				JOptionPane.showMessageDialog(null, "该本图书的库存已经为0！");
	    			}else{
	    			
	    				bookAuthorTextField.setText(bookPO.getAuthor());			
		    			int typeIndex=findTypeIndex(bookPO.getType());
		    			if(typeIndex!=-1){
		    				typeComboBox.setSelectedIndex(typeIndex);
		    			}
		    			bookIDTextField.setText(bookPO.getISBN());
		    			bookNameTextField.setText(bookPO.getBookName());
		    			bookPriceTextField.setText(""+bookPO.getPrice());
		    			bookNumTextField.setText(""+bookPO.getNumOfBook());
		    			bookPublishHouseTextField.setText(bookPO.getPress());
		    			bookPublishYearField.setText(bookPO.getPublishDate());
		    			
	    				 int choice=JOptionPane.showConfirmDialog(null, "您确定要删除此书吗？");
	    				 if(choice==JOptionPane.YES_OPTION){
		    					bookAuthorTextField.setText("");
				    			typeComboBox.setSelectedIndex(0);
				    			bookIDTextField.setText("");
				    			bookNameTextField.setText("");
				    			bookPriceTextField.setText("");
				    			bookNumTextField.setText("");
				    			bookPublishHouseTextField.setText("");
				    			bookPublishYearField.setText("");
				 
				    			if(salesManagerViewController.deleteBook(isbn2) ==ResultMessage.SUCCEED){
				    				 JOptionPane.showMessageDialog(null, "删除成功！");
				    			}else{
				    				JOptionPane.showMessageDialog(null, "删除失败！");
				    			}
	    				 }else{
		    					bookAuthorTextField.setText("");
				    			typeComboBox.setSelectedIndex(0);
				    			bookIDTextField.setText("");
				    			bookNameTextField.setText("");
				    			bookPriceTextField.setText("");
				    			bookNumTextField.setText("");
				    			bookPublishHouseTextField.setText("");
				    			bookPublishYearField.setText("");
	    				 }
	    			}  				    			
	    		}
            }
        });

        confirmChangeBookButton.setText("确认修改");
        confirmChangeBookButton.setEnabled(false);
        confirmChangeBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	//图书的ISBN不可以修改
	    		if(! bookInforTrue()){
	    			 JOptionPane.showMessageDialog(null, "您修改后的图书信息有误 或者 不完善，请先检查！");
	    			 return;
	    		}
	    		
                BookPO bookPO=new BookPO(bookIDTextField.getText().trim(), bookNameTextField.getText().trim(), 
                          bookAuthorTextField.getText().trim(),bookPublishHouseTextField.getText().trim(),
                          bookPublishYearField.getText().trim(), (String)typeComboBox.getSelectedItem(),
                          Double.parseDouble(bookPriceTextField.getText().trim()), Integer.parseInt(bookNumTextField.getText().trim())
                       );
	    		  
	    		 confirmChangeBookButton.setEnabled(false);
	    		 bookIDTextField.setEditable(true);
	    	     
	    		 ResultMessage resultMessage = salesManagerViewController.changeBookPO(bookPO);
	    		 if(resultMessage==ResultMessage.SUCCEED){
	    			  JOptionPane.showMessageDialog(null, "修改成功！");
	    		 }else{
	    			  JOptionPane.showMessageDialog(null, "系统异常，请重试！");
	    		 }
	    	    
            }
        });

        checkAllBookButton.setText("浏览图书");
        checkAllBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	SearchBookService searchBookController = SearchBookViewController.getInstance();
				searchBookController.init();
            }
        });

        changeBookButton.setText("修改图书");
        changeBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	String isbn=JOptionPane.showInputDialog(null,"请输入您要修改的图书的ISBN：");
	    		if(isbn==null){
	    			JOptionPane.showMessageDialog(null, "输入有误，请重试！");
	    		}else{
	    			if(salesManagerViewController.getBookPO(isbn)==null){
	    				JOptionPane.showMessageDialog(null, "您要修改的图书不存在！");
	    			}else{
	    				BookPO bookPO=salesManagerViewController.getBookPO(isbn);
		    			bookAuthorTextField.setText(bookPO.getAuthor());
		    			
		    			int typeIndex=findTypeIndex(bookPO.getType());
		    			if(typeIndex!=-1){
		    				typeComboBox.setSelectedIndex(typeIndex);
		    			}
//		    			bookCategoryTextField.setText(bookPO.getType());
		    			bookIDTextField.setText(bookPO.getISBN());
		    			bookNameTextField.setText(bookPO.getBookName());
		    			bookPriceTextField.setText(""+bookPO.getPrice());
		    			bookNumTextField.setText(""+bookPO.getNumOfBook());
		    			bookPublishHouseTextField.setText(bookPO.getPress());
		    			bookPublishYearField.setText(bookPO.getPublishDate());
		    			JOptionPane.showMessageDialog(null, "系统已显示您要修改的图书信息,请在界面上修改！\n注意：图书ISBN不可以修改！\n" 
		    					                                                   +"修改完成后请点击‘确认修改’按钮。");
      	    			bookIDTextField.setEditable(false);
		    			confirmChangeBookButton.setEnabled(true);
	    			}  			
	    		}
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addBookButton)
                        .addGap(58,58,58)
                        .addComponent(deleteBookButton )
                        .addGap(58,58,58)
                        .addComponent(changeBookButton)
                        .addGap(58,58,58)
                        .addComponent(confirmChangeBookButton)
                        .addGap(58,58,58)
                        .addComponent(checkAllBookButton))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel2)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookIDTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookAuthorTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookPublishHouseTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookPublishYearField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookNumTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookPriceTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bookIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(bookNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(bookAuthorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(bookPublishHouseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(bookPublishYearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(bookNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(bookPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBookButton)
                    .addComponent(deleteBookButton )
                    .addComponent(changeBookButton)
                    .addComponent(confirmChangeBookButton)
                    .addComponent(checkAllBookButton))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.addTab("图书管理  ", jPanel12);


        bookTypeList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(bookTypeList);
        
        bookTypeList.setModel(new TypeListModel());
        
        jLabel23.setText("图书类别：");

        addBookTypeButton.setText("增加图书类别");
        addBookTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	String newType=JOptionPane.showInputDialog("请输入新的图书类别：");
				if(newType==null){
					return;
				}
				ResultMessage result=salesManagerViewController.addBookType(newType);
				if(result==ResultMessage.SUCCEED){
					bookTypeList.setModel(new TypeListModel());
					setTypeComboxModel();
					JOptionPane.showMessageDialog(null, "添加成功！");
				
				}else if(result==ResultMessage.EXIST){
					JOptionPane.showMessageDialog(null, "该类型已经存在！");
				}else{
					JOptionPane.showMessageDialog(null, "添加失败！");
				}
            }
        });

        changeBookTypeButton.setText("修改图书类别");
        changeBookTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	int index=bookTypeList.getSelectedIndex();
				if(index==-1){
					JOptionPane.showMessageDialog(null, "请选择一个图书类别！");
					return;
				}
				String oldType=(String)bookTypeList.getSelectedValue();
				String newType=JOptionPane.showInputDialog("请输入修改后的图书类别");
				if(newType==null){
					return;
				}
				
				ResultMessage result=salesManagerViewController.changeBookType(oldType, newType);
				if(result==ResultMessage.SUCCEED){
					bookTypeList.setModel(new TypeListModel());
					setTypeComboxModel();
					JOptionPane.showMessageDialog(null,"修改成功！");
					

				}else{
					JOptionPane.showMessageDialog(null,"修改失败！");
				}
            }
        });

        deleteBookTypeButton.setText("删除图书类别");
        deleteBookTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	int index=bookTypeList.getSelectedIndex();
				if(index==-1){
					JOptionPane.showMessageDialog(null, "请选择一个图书类别！");
					return;
				}
				
				String deleteType=(String) bookTypeList.getSelectedValue();
				ResultMessage result=salesManagerViewController.changeBookType(deleteType, "其他");
				if(result==ResultMessage.SUCCEED){
					bookTypeList.setModel(new TypeListModel());
					setTypeComboxModel();
					JOptionPane.showMessageDialog(null, "删除成功！");
			    }else{
					JOptionPane.showMessageDialog(null, "删除失败！");
				}
            }
        });

        javax.swing.GroupLayout bookTypejPanelLayout = new javax.swing.GroupLayout(bookTypejPanel);
        bookTypejPanel.setLayout(bookTypejPanelLayout);
        bookTypejPanelLayout.setHorizontalGroup(
            bookTypejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookTypejPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(bookTypejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookTypejPanelLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bookTypejPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addGroup(bookTypejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(changeBookTypeButton)
                            .addComponent(addBookTypeButton)
                            .addComponent(deleteBookTypeButton))
                        .addGap(119, 119, 119))))
        );
        bookTypejPanelLayout.setVerticalGroup(
            bookTypejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookTypejPanelLayout.createSequentialGroup()
                .addGroup(bookTypejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookTypejPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bookTypejPanelLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(addBookTypeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(changeBookTypeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(deleteBookTypeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel1.addTab(" 设置图书类别", bookTypejPanel);

        jLabel3.setText("销售经理客户端");

        exitButton.setText("退出");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	System.exit(1);	
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton))
            .addComponent(jPanel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(exitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1))
        );

        pack();
    }// </editor-fold>

    
   //    查看总经理制定的大范围促销规则
   private void checkPresent(){
	    showPresentTextArea.setText("");
	    ArrayList<Present_Equivalent> present_EquivalentList=salesManagerViewController.getPresent_EquivalentList();
	    ArrayList<Present_Coupon> present_CouponList=salesManagerViewController.getPresent_CouponList();  
	     
	    if(  (present_EquivalentList== null  && present_CouponList==null) || 
	    		  (present_EquivalentList.size()==0 &&  present_CouponList.size()==0 ) ||
	    		  (present_EquivalentList== null  && present_CouponList.size()==0)   ||
	    		  ( present_EquivalentList.size()==0 && present_CouponList==null)  ){
	    	  showPresentTextArea.setText("总经理尚未制定礼券,或礼券已经赠送完毕!");
	     }else{
	    	  Present_Equivalent present_Equivalent;
	    	  Present_Coupon present_Coupon;
              //	    	  String equivalent[][];
	    	  //private String equivalent[][]=new String [line][column4];
	    	  //10组,每组分别表示:等价券额度，张数，有效截止日期，最低消费 
	    	  if( present_EquivalentList!= null && present_EquivalentList.size()!=0 ){
	    		  showPresentTextArea.append("                         ********************等价券********************\n");
	    		  for(int i=0;i<present_EquivalentList.size(); i++){
	    			  present_Equivalent=present_EquivalentList.get(i);
	    			  showPresentTextArea.append("会员等级:"+present_Equivalent.getVIPRank_String() 
	    			  +"  面额:"+present_Equivalent.getDeno()+"元  "+"最低消费:"+
	    			  present_Equivalent.getMin()+"元  "+"数量:"+present_Equivalent.getAmount()
	    			  +"张  "+"有效截止日期:"+CalToStr(present_Equivalent.getEndDate()) +"\n"
	    			  );			  
	    		  }	  
	    	  }
	    	  if( present_CouponList!= null && present_CouponList.size()!=0 ){
	    		  showPresentTextArea.append("                         ********************打折券********************\n");
	    		  for(int j=0;j<present_CouponList.size(); j++){
	    			  present_Coupon=present_CouponList.get(j);
	    			  showPresentTextArea.append("会员等级:"+present_Coupon.getVIPRank_String()
	    			    +"  打折率:"+present_Coupon.getRate()*10+"折  "+"数量:"+present_Coupon.getAmount()
	    			    +"张  "+"有效截止日期:"+CalToStr(present_Coupon.getEndDate())+"\n"		    					  );
	    		  }   		  
	    	  }   	  
	      }//else	
     }


     //判断bookPanel界面上的数据是否填全
     private boolean bookInforTrue(){
	   if(
			   bookIDTextField.getText().trim().equals("") || bookAuthorTextField.getText().trim().equals("") || 
		   bookPublishYearField.getText().trim().equals("") ||
		  bookNameTextField.getText().trim().equals("") || bookPublishHouseTextField.getText().trim().equals("") || 
		  ! stringToDouble(bookPriceTextField.getText().trim()) || ! StringToInt(bookNumTextField.getText().trim())
		  )
		   return false;
	   else return true;
     }
   
     //String 是否可以转换成Double
     private boolean stringToDouble(String s){
	   try{
		   @SuppressWarnings("unused")
		double d=Double.parseDouble(s);
		   return true;
	   }catch(Exception e){
		   return false;
	   }
     }
   
     //
     private boolean StringToInt(String s){
	   try {
		   @SuppressWarnings("unused")
		int n=Integer.parseInt(s);
		   return true;
		
	  } catch (Exception e) {
	
		 return false;
	  }
     }
   
     //Calendar 转换成String
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
		   return "刚下单";
	   }else if(State== OrderState.DISTRIBUTION){
		   return "仓库配货";
	   }else if(State== OrderState.TRASPORTATION){
		   return "物流配送";
	   }else {
		   return "已签收";
	   }
      }
   
      //   更新未完成的订单
      private void updateUncompletedOrder(){
		uncompletedOrderList=salesManagerViewController.getUncompletedOrderPOList();
	     
		if(uncompletedOrderList== null || uncompletedOrderList.size()==0){
	    	JOptionPane.showMessageDialog(null, "现在已无未完成的订单！");
	    	for(int k=0;k<lineOfUncompletedOrder;k++)
	    		for(int h=0;h<5;h++)
	    		   orderTable.setValueAt(null, k, h);
	    	
	    	orderTable.setEnabled(false); 
	    }else{
	    	  orderTable.setEnabled(true); 
	    	  lineOfUncompletedOrder=uncompletedOrderList.size();
	    	  
	    	  String [] columnNames={"订单号", "下单时间", "总价", "顾客编号", "订单状态"};
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
	   ArrayList<String> typeList=salesManagerViewController.getTypeList();
	   for(int i=0;i<typeList.size();i++){
		   if(typeList.get(i).equals(type)){
			   return i;
		   }
	   }
	   return -1;
      }
   
      @SuppressWarnings({ "rawtypes", "unchecked" })
      private void setTypeComboxModel(){
        ArrayList<String> bookTypeList=salesManagerViewController.getTypeList();
        String[] typeStrings=new String[bookTypeList.size()];
        for(int i=0;i<bookTypeList.size();i++){
        	typeStrings[i]=bookTypeList.get(i);
        }
        typeComboBox.setModel(new DefaultComboBoxModel(typeStrings));
      }
   
      @ SuppressWarnings({ "rawtypes" })
      class TypeListModel extends AbstractListModel{
	       ArrayList<String> typeLsit=salesManagerViewController.getTypeList();
	   
	       @Override
	       public int getSize() {
	
		        return typeLsit.size();
	       }

	       @Override
	       public Object getElementAt(int index) {
		         return typeLsit.get(index);
	       }
	   
       }

       public void freshName(String name) {
	
	         userpo.setUserName(name);
	         userNameLabel.setText(name);
        }
       
        public void freshPassword(String newPW){
	          userpo.setUserPassword(newPW);
        }
        
        
    // Variables declaration - do not modify
    private javax.swing.JTextField bookAuthorTextField;
    private javax.swing.JTextField bookIDTextField;
    private javax.swing.JTextField bookNameTextField;
    private javax.swing.JTextField bookNumTextField;
    private javax.swing.JTabbedPane jPanel1;
    private javax.swing.JTextField bookPublishHouseTextField;
    private javax.swing.JTextField bookPriceTextField;
    private javax.swing.JTextField bookPublishYearField;
    private javax.swing.JButton checkPresentButton;
    private javax.swing.JButton checkAllBookButton;
    private javax.swing.JButton changeBookButton;
    private javax.swing.JButton addBookTypeButton;
    private javax.swing.JButton changeBookTypeButton;
    private javax.swing.JButton deleteBookTypeButton;
    private javax.swing.JButton updateOrderButton;
    private javax.swing.JButton changeOrderButton;
    private javax.swing.JButton sendPresentButton;
    private javax.swing.JButton addBookButton;
    private javax.swing.JButton changeUserNameButton;
    private javax.swing.JButton changeUserPasswordButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton checkMemberInfoButton;
    private javax.swing.JButton deleteBookButton ;
    private javax.swing.JButton confirmChangeBookButton;
    private javax.swing.JComboBox typeComboBox;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel orderPanel;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel bookTypejPanel;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton orderedRadioButton;
    private javax.swing.JRadioButton distributionRadioButton;
    private javax.swing.JRadioButton transportRadioButton;
    private javax.swing.JRadioButton signedRadioButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable orderTable;
    private javax.swing.JList bookTypeList;
    private javax.swing.JTextField memberIDTextField;
    private javax.swing.JTextArea memberInfoTextArea;
    private javax.swing.JTextArea memberOrderTextArea;
    private javax.swing.JTextArea showPresentTextArea;
    
    private SalesManagerViewService salesManagerViewController;
	private int lineOfUncompletedOrder=11;//初始为11
	private DefaultTableModel tableModel;
	private SalesManagerPO userpo;
	private ArrayList<OrderPO> uncompletedOrderList;
	private boolean hasUpdateUncompleteOrder= false;
    // End of variables declaration
}

