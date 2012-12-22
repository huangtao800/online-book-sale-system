package presentation;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import po.LineItemPO;

public class OrderView extends javax.swing.JFrame {
	
	private static final long serialVersionUID = 1L;
	public OrderView(ArrayList<LineItemPO> productList) {
        initComponents(productList);
        addListener();
    }

    private void initComponents(ArrayList<LineItemPO> productList) {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jLabel1.setText("订单编号：");

        jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jLabel2.setText("日期：");

        jLabel3.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jLabel3.setText("会员编号：");

        jLabel4.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jLabel4.setText("订单状态：");

        jLabel5.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jLabel5.setText("总价格：");

        jLabel6.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jLabel6.setText("订单详情");

        jTable1.setModel(new ProductTableModel(productList));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jButton1.setText("确认");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(17, 17, 17))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(24, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

	class ProductTableModel extends AbstractTableModel {
		private static final long serialVersionUID = 1L;
		ArrayList<LineItemPO> productList;

		public ProductTableModel(ArrayList<LineItemPO> productList) {
			this.productList = productList;	
		}

		@Override
		public int getRowCount() {
			return productList.size();
		}

		@Override
		public int getColumnCount() {
			return 8;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			switch (columnIndex) {
			case 0:
				return productList.get(rowIndex).getBook().getISBN();
			case 1:
				return productList.get(rowIndex).getBook().getBookName();
			case 2:
				return productList.get(rowIndex).getBook().getAuthor();
			case 3:
				return productList.get(rowIndex).getBook().getPress();
			case 4:
				return productList.get(rowIndex).getBook().getPublishDate();
			case 5:
				return productList.get(rowIndex).getBook().getPrice();
			case 6:
				return productList.get(rowIndex).getNumber();
			case 7:
				return productList.get(rowIndex).getSumPrice();
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
	
	private void addListener(){
		jButton1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
	}


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    	
    }
    public void initText(String orderNum, String memberID, String date, 
    		String orderState, String totalPrice, String address){
    	jLabel1.setText(orderNum);
    	jLabel2.setText(date);
    	jLabel3.setText(memberID);
    	jLabel4.setText(orderState);
    	jLabel5.setText(totalPrice);
    	jLabel6.setText(address);
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;//订单编号
    private javax.swing.JLabel jLabel2;//订单日期
    private javax.swing.JLabel jLabel3;//会员编号
    private javax.swing.JLabel jLabel4;//订单状态
    private javax.swing.JLabel jLabel5;//总价格
    private javax.swing.JLabel jLabel6;//收货地址
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration
}
