package presentation;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import po.LineItemPO;
import po.ResultMessage;
import presentationController.Sales.SalesViewController;
import presentationController.Sales.SalesViewService;


public class CartView extends javax.swing.JFrame {

	public CartView(SalesViewController salesViewController) {
    	this.salesViewController = salesViewController;
        initComponents();
        addListener();
    }

	private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        
        jTable1.setModel(new CartTableModel());
        jScrollPane1.setViewportView(jTable1);

        //jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jLabel1.setText("购物车：");

        //jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jLabel2.setText("总价格：");

       // jButton1.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jButton1.setText("添加到收藏夹");

        //jButton2.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jButton2.setText("删除");

      //  jButton3.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jButton3.setText("结账");

       // jButton4.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jButton4.setText("返回");

      //  jButton5.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jButton5.setText("修改数量");

    //    jButton6.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jButton6.setText("刷新列表");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>    
	
//Table Model
	class CartTableModel extends AbstractTableModel {
		private static final long serialVersionUID = 1L;
		ArrayList<LineItemPO> cartList;

		public CartTableModel() {
			this.cartList = salesViewController.getCartList();	
		}

		@Override
		public int getRowCount() {
			return cartList.size();
		}

		@Override
		public int getColumnCount() {
			return 8;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			switch (columnIndex) {
			case 0:
				return cartList.get(rowIndex).getBook().getISBN();
			case 1:
				return cartList.get(rowIndex).getBook().getBookName();
			case 2:
				return cartList.get(rowIndex).getBook().getAuthor();
			case 3:
				return cartList.get(rowIndex).getBook().getPress();
			case 4:
				return cartList.get(rowIndex).getBook().getPublishDate();
			case 5:
				return cartList.get(rowIndex).getBook().getPrice();
			case 6:
				return cartList.get(rowIndex).getNumber();
			case 7:
				return cartList.get(rowIndex).getSumPrice();
			default:
				return null;
			}
		}

		public String getColumnName(int c) {
			switch (c) {
			case 0:
				return "ISBN";
			case 1:
				return "书名";
			case 2:
				return "作者";
			case 3:
				return "出版社";
			case 4:
				return "出版年份";
			case 5:
				return "单价";
			case 6:
				return "数量";
			case 7:
				return "总价";
			default:
				return "null";
			}
		}
	}

//Listener
    private void addListener() {
		// TODO Auto-generated method stub
		jButton1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(salesViewController.getCartList().size() == 0)
					JOptionPane.showMessageDialog(null, "购物车为空");
				else{
					int i = jTable1.getSelectedRow();
					if(i == -1)
						JOptionPane.showMessageDialog(null, "请选中要加入收藏夹的商品");
					else {
						if(salesViewController.addFavorities(i) == ResultMessage.SUCCEED)
					    	JOptionPane.showMessageDialog(null, "添加成功");
						else
							JOptionPane.showMessageDialog(null, "添加失败");
					}   
				}
			}
		});
		jButton2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(salesViewController.getCartList().size() == 0)
					JOptionPane.showMessageDialog(null, "购物车为空");
				else{
					int i = jTable1.getSelectedRow();
					if(i == -1)
						JOptionPane.showMessageDialog(null, "请选中要加入删除的商品");
					else {
						if(salesViewController.removeFromCart(i) == ResultMessage.SUCCEED)
					    	JOptionPane.showMessageDialog(null, "删除成功");
						else
							JOptionPane.showMessageDialog(null, "删除失败");
					}   
				}
			}
		});
		jButton3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(salesViewController.getCartList().size() == 0)
					JOptionPane.showMessageDialog(null, "未购买商品");
				else{ 
				    if(salesViewController.initPayFrame() == ResultMessage.SUCCEED)
				    	setVisible(false);
				}
			}
		});
		jButton4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		jButton5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(salesViewController.getCartList().size() == 0)
					JOptionPane.showMessageDialog(null, "购物车为空");
				else{
					int i = jTable1.getSelectedRow();
					if(i == -1)
						JOptionPane.showMessageDialog(null, "请选中要修改数量的商品");
					else{
						int number = -1;
						try{
							number = Integer.parseInt(JOptionPane.showInputDialog("请输入修改后本数："));
							if(salesViewController.changeLineItemNumber(i, number) == ResultMessage.FAILED)
								JOptionPane.showMessageDialog(null, "修改错误！");
						}catch (Exception e1) {
							JOptionPane.showMessageDialog(null, "输入错误！");
						}
						freshTableModel(jTable1);
					}	
				}
			}
		});
		jButton6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				salesViewController.refreshCartList();
			}
		});
	}
    
    public void refreshCartList(){
    	freshTableModel(jTable1);
    }

	public void refreshTotalPrice(double totalPrice) {
		jLabel2.setText("商品总价：" + totalPrice + "元");
		setVisible(true);	
	}
	
//refresh table
	private void freshTableModel(JTable table){
		table.setModel(new CartTableModel());
	}
    
// Variables declaration - do not modify
	private static final long serialVersionUID = 1L;
    private javax.swing.JButton jButton1;//添加到收藏夹
    private javax.swing.JButton jButton2;//删除
    private javax.swing.JButton jButton3;//结账
    private javax.swing.JButton jButton4;//返回
    private javax.swing.JButton jButton5;//修改数量
    private javax.swing.JButton jButton6;//刷新列表
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;//总价格
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private SalesViewService salesViewController;
    // End of variables declaration

}
