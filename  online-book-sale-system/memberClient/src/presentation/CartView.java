package presentation;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
        
        jTable1.setModel(new CartTableModel());
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("΢���ź�", 0, 18)); // NOI18N
        jLabel1.setText("���ﳵ��");

        jLabel2.setFont(new java.awt.Font("΢���ź�", 0, 18)); // NOI18N
        jLabel2.setText("�ܼ۸�");

        jButton1.setFont(new java.awt.Font("΢���ź�", 0, 18)); // NOI18N
        jButton1.setText("���ӵ��ղؼ�");

        jButton2.setFont(new java.awt.Font("΢���ź�", 0, 18)); // NOI18N
        jButton2.setText("ɾ��");

        jButton3.setFont(new java.awt.Font("΢���ź�", 0, 18)); // NOI18N
        jButton3.setText("����");

        jButton4.setFont(new java.awt.Font("΢���ź�", 0, 18)); // NOI18N
        jButton4.setText("����");

        jButton5.setFont(new java.awt.Font("΢���ź�", 0, 18)); // NOI18N
        jButton5.setText("�޸�����");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(31, 31, 31)
                                        .addComponent(jButton2)
                                        .addGap(33, 33, 33)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(jButton4)
                                        .addGap(1, 1, 1)))))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>    
	
//ˢ�¹��ﳵ�б�
	private void freshTableModel(JTable table){
		table.setModel(new CartTableModel());
	}

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
				return "����";
			case 2:
				return "����";
			case 3:
				return "������";
			case 4:
				return "�������";
			case 5:
				return "����";
			case 6:
				return "����";
			case 7:
				return "�ܼ�";
			default:
				return "null";
			}
		}
	}

    private void addListener() {
		// TODO Auto-generated method stub
		jButton1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(salesViewController.getCartList().size() == 0)
					JOptionPane.showMessageDialog(null, "���ﳵΪ��");
				else{
					int i = getSeclectedLine();
				    if(salesViewController.addFavorities(i) == ResultMessage.SUCCEED)
				    	JOptionPane.showMessageDialog(null, "���ӳɹ�");
				    else
					    JOptionPane.showMessageDialog(null, "��ѡ��Ҫ�����ղؼе���Ʒ");
				}
			}
		});
		jButton2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(salesViewController.getCartList().size() == 0)
					JOptionPane.showMessageDialog(null, "���ﳵΪ��");
				else{
					int i = getSeclectedLine();
				    if(salesViewController.removeFromCart(i) == ResultMessage.SUCCEED)
					    freshTableModel(jTable1);
				    else
				    	JOptionPane.showMessageDialog(null, "��ѡ��Ҫɾ������Ʒ");
				}
			}
		});
		jButton3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(salesViewController.getCartList().size() == 0)
					JOptionPane.showMessageDialog(null, "δ������Ʒ");
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
					JOptionPane.showMessageDialog(null, "���ﳵΪ��");
				else{
					int i = jTable1.getSelectedRow();
					if(i == -1)
						JOptionPane.showMessageDialog(null, "��ѡ��Ҫ�޸���������Ʒ");
					else{
						int number=0;
						try{
							number = Integer.parseInt(JOptionPane.showInputDialog("�������޸ĺ�����"));
						}catch (Exception e1) {
							JOptionPane.showMessageDialog(null, "�������");
						}
						if(salesViewController.changeNumber(i, number) == ResultMessage.FAILED)
							JOptionPane.showMessageDialog(null, "�޸Ĵ���");
						freshTableModel(jTable1);
					}	
				}
			}
		});
			
	}
    
    public void refreshCartList(){
    	freshTableModel(jTable1);
    }
    
	public int getSeclectedLine(){
		jTable1.getSelectionModel().addListSelectionListener(
				new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent e) {
						int j = jTable1.getSelectedRow();
						index = j;
					}
				});
		return index;
	}

	public void refreshTotalPrice(double totalPrice) {
		jLabel2.setText("��Ʒ�ܼۣ�" + totalPrice + "Ԫ");
		setVisible(true);	
	}
    
    
// Variables declaration - do not modify
	private static final long serialVersionUID = 1L;
    private javax.swing.JButton jButton1;//���ӵ��ղؼ�
    private javax.swing.JButton jButton2;//ɾ��
    private javax.swing.JButton jButton3;//����
    private javax.swing.JButton jButton4;//����
    private javax.swing.JButton jButton5;//�޸�����
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;//�ܼ۸�
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private SalesViewService salesViewController;
    private int index;
    // End of variables declaration

}