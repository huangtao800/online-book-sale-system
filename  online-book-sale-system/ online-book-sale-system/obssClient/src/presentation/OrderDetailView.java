package presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import po.LineItemPO;
import po.OrderPO;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderDetailView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	private OrderPO orderPO;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					OrderDetailView frame = new OrderDetailView();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	public OrderDetailView(OrderPO orderPO){
		this.orderPO=orderPO;
		initComponent();
	}
	
	/**
	 * Create the frame.
	 */
	public void initComponent() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 643, 191);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"\u5546\u54C1\u6807\u53F7", "ISBN", "\u56FE\u4E66\u540D\u79F0", "\u4F5C\u8005", "\u51FA\u7248\u793E", "\u51FA\u7248\u5E74\u4EFD", "\u5355\u4EF7", "\u6570\u91CF", "\u5355\u9879\u603B\u4EF7"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		table.setModel(new OrderDetailTableModel(orderPO));
		scrollPane.setViewportView(table);
		
		JLabel label = new JLabel("\u8BA2\u5355\u603B\u4EF7\uFF1A");
		label.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label.setBounds(57, 207, 113, 32);
		contentPane.add(label);
		
		JLabel priceLabel = new JLabel("New label");
		priceLabel.setText(""+orderPO.getTotalPrice());
		priceLabel.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		priceLabel.setBounds(180, 210, 86, 26);
		contentPane.add(priceLabel);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		button.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		button.setBounds(449, 208, 113, 30);
		contentPane.add(button);
	}
	
	class OrderDetailTableModel extends AbstractTableModel{

		private OrderPO orderPO;
		
		public OrderDetailTableModel(OrderPO orderPO){
			this.orderPO=orderPO;
		}
		
		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return orderPO.getProductList().size();
		}

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return 9;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			ArrayList<LineItemPO> productList=orderPO.getProductList();
			switch (columnIndex) {
			case 0:
				return rowIndex+1;
			case 1:
				return productList.get(rowIndex).getBook().getISBN();
			case 2:
				return productList.get(rowIndex).getBook().getBookName();
			case 3:
				return productList.get(rowIndex).getBook().getAuthor();
			case 4:
				return productList.get(rowIndex).getBook().getPress();
			case 5:
				return productList.get(rowIndex).getBook().getPublishDate();
			case 6:
				return productList.get(rowIndex).getBook().getPrice();
			case 7:
				return productList.get(rowIndex).getNumber();
			default:
				return productList.get(rowIndex).getSumPrice();
			}
		}
		
		public String getColumnName(int c) {

			switch (c) {
			case 0:
				return "商品编号";
			case 1:
				return "ISBN";
			case 2:
				return "图书名称";
			case 3:
				return "作者";
			case 4:
				return "出版社";
			case 5:
				return "出版年份";
			case 6:
				return "单价";
			case 7:
				return "数量";
			default:
				return "单项总价";
			}
		}
		
	}
}
