package presentation;
//尤佳琪

import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import bussinessLogicService.BookBLService;

import po.BookPO;
import po.LineItemPO;
import po.ResultMessage;
import presentationController.Member.KeywordVO;
import presentationController.book.BookViewController;
import presentationController.book.BookViewService;

/**
 *
 * @author YJQ
 */
public class BookView extends javax.swing.JFrame implements ActionListener{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BookView() {
        initComponents();
    }
	
	public BookView (KeywordVO keywordVO,String type,BookViewService bookViewController) {
		this.keywordVO = keywordVO;
		this.type = type;
		if(type==null){
			this.index = 1;
		}else if(keywordVO==null){
			this.index = 0;
		}
		
		this.bookViewController=bookViewController;
		
		initComponents();
	}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("图书标题：");
        jLabel2.setText("出版社： ");
        jLabel3.setText("作者：");
        jLabel4.setText("出版年份：");
        
        if(keywordVO!=null){
        	jTextField1.setText(keywordVO.bookName);
            jTextField2.setText(keywordVO.publisher);
            jTextField4.setText(keywordVO.author);
            jTextField5.setText(keywordVO.publishYear);
        }else{
        	jTextField1.setText("");
            jTextField2.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
        }

        
        jButton1.setText("查找");
        jButton1.addActionListener(this);

        jButton2.setText("进入购物车");
        jButton2.addActionListener(this);

        jLabel5.setText("查找结果：");
        
        columnNames = setColumnNames();
        rowData = new Vector<Vector>();
        jTable1 = new JTable(rowData, columnNames);
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        jButton5.setText("添加到收藏夹");
        jButton5.addActionListener(this);

        jButton6.setText("添加到购物车");
        jButton6.addActionListener(this);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField1))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel3)
                                        .addGap(35, 35, 35))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(jButton5)))
        );

        jTabbedPane1.addTab("通过关键词查找图书", jPanel1);

        jLabel6.setText("图书类型：");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "计算机", "化学", "历史", "艺术" }));
       
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        

        jButton3.setText("查找图书");
        jButton3.addActionListener(this);
        
        jTable2 = new JTable(rowData, columnNames);
        jTable2.setRowHeight(30);
        jScrollPane2.setViewportView(jTable2);

        jLabel7.setText("查找结果：");

        jButton4.setText("进入购物车");
        jButton4.addActionListener(this);

        jButton7.setText("添加到收藏夹");
        jButton7.addActionListener(this);

        jButton8.setText("添加到购物车");
        jButton8.addActionListener(this);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(564, 564, 564))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("通过类型查找图书", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        
        if(index==0){
        	jTabbedPane1.setSelectedIndex(1);
        }else if(index==1){
        	jTabbedPane1.setSelectedIndex(0);
        }
    }
    
   
    
    public void actionPerformed(ActionEvent e) {
    	ArrayList<BookPO> bookList = new ArrayList<BookPO>();
    	LineItemPO lineItemPO;
    	Object obj=e.getSource();
    	String name = jTextField1.getText().trim();
    	String press = jTextField2.getText().trim();
    	String author = jTextField4.getText().trim();
    	String publishDate = jTextField5.getText().trim();
    	String type = jComboBox1.getSelectedItem().toString();
    	
    	if(obj==jButton1){            //通过关键字查找
    		bookList = bookViewController.findByKeyword(name, author, press, publishDate);
//    		BookPO bookPO1=new BookPO("Java","11111",  "计算机","中国", "hjuang",  "2011", 10, 5);
    		
//    	    bookList.add(bookPO1);
    	
    	    Vector<String> row = new Vector<String>();
           	for(int i = 0; i < bookList.size(); i++){
                    row.add(bookList.get(i).getBookName());
                    row.add(bookList.get(i).getISBN());
                    row.add(bookList.get(i).getType());
                    row.add(bookList.get(i).getPress());
                    row.add(bookList.get(i).getAuthor());
                    row.add(bookList.get(i).getPublishDate());
                    row.add(String.valueOf(bookList.get(i).getPrice()));
                    row.add(String.valueOf(bookList.get(i).getNumOfBook()));
                    rowData.add(row);
        	}

     		DefaultTableModel dtm=new DefaultTableModel(rowData, columnNames);
            jTable1.setModel(dtm);
            
            
    		
    	}else if(obj==jButton3){        //通过图书类型查找图书
    		bookList = bookViewController.fineByType(type);
    		
    		Vector<String> row = new Vector<String>();
           	for(int i = 0; i < bookList.size(); i++){
                    row.add(bookList.get(i).getBookName());
                    row.add(bookList.get(i).getISBN());
                    row.add(bookList.get(i).getType());
                    row.add(bookList.get(i).getPress());
                    row.add(bookList.get(i).getAuthor());
                    row.add(bookList.get(i).getPublishDate());
                    row.add(String.valueOf(bookList.get(i).getPrice()));
                    row.add(String.valueOf(bookList.get(i).getNumOfBook()));
                    rowData.add(row);
        	}

     		DefaultTableModel dtm=new DefaultTableModel(rowData, columnNames);
            jTable2.setModel(dtm);
            
            
           
    		  
    	}else if(obj==jButton2){      //进入购物车
//    	    bookViewController = BookViewController.getInstance(keywordVO,type);
    		bookViewController.enterCart();
    		
    	}else if(obj==jButton4){      //进入购物车
//    		bookViewController = BookViewController.getInstance(keywordVO,type);
    		bookViewController.enterCart();
    		
    	}else if(obj==jButton5){      //添加到收藏夹
    		if(jTable1.getSelectedRow()==-1){
				JOptionPane.showMessageDialog(null, "请选择一本图书！");
			}else{
				bookList = bookViewController.findByKeyword(name, author, press, publishDate);
			
				BookPO bookPO = bookList.get(jTable1.getSelectedRow());
				
				ResultMessage result= bookViewController.putIntoFavorities(bookPO);
				if(result==ResultMessage.SUCCEED){
					JOptionPane.showMessageDialog(null, "添加成功！");
				}
			}
    		
    	}else if(obj==jButton6){      //添加到购物车
    		if(jTable1.getSelectedRow()==-1){
				JOptionPane.showMessageDialog(null, "请选择一本图书！");
			}else{
				bookList = bookViewController.findByKeyword(name, author, press, publishDate);
	    	    
				BookPO bookPO = bookList.get(jTable1.getSelectedRow());
				int number = Integer.parseInt(JOptionPane.showInputDialog("购买本书："));
	    		lineItemPO = new LineItemPO(bookPO, number);
	    		
				ResultMessage result= bookViewController.putIntoCart(lineItemPO);
				if(result==ResultMessage.SUCCEED){
					JOptionPane.showMessageDialog(null, "添加成功！");
			    }
			}
    		
    	}else if(obj==jButton7){      //添加到收藏夹
    		if(jTable2.getSelectedRow()==-1){
				JOptionPane.showMessageDialog(null, "请选择一本图书！");
			}else{
				bookList = bookViewController.fineByType(type);
				BookPO bookPO = bookList.get(jTable2.getSelectedRow());
				ResultMessage result= bookViewController.putIntoFavorities(bookPO);
				if(result==ResultMessage.SUCCEED){
					JOptionPane.showMessageDialog(null, "添加成功！");
				}
			}
    		
    	}else if(obj==jButton8){      //添加到购物车
    		if(jTable2.getSelectedRow()==-1){
				JOptionPane.showMessageDialog(null, "请选择一本图书！");
			}else{
				bookList = bookViewController.fineByType(type);
				BookPO bookPO = bookList.get(jTable2.getSelectedRow());
				int number = Integer.parseInt(JOptionPane.showInputDialog("购买本书："));
	    		lineItemPO = new LineItemPO(bookPO, number);
	    		
				ResultMessage result= bookViewController.putIntoCart(lineItemPO);
				if(result==ResultMessage.SUCCEED){
					JOptionPane.showMessageDialog(null, "添加成功！");
				}
			}
    	}
    	
    }
   
    private Vector<String> setColumnNames(){
    	Vector<String> column = new Vector<String>();
    	column.addElement("图书标题");
    	column.addElement("图书ISBN");
    	column.addElement("图书类别");
    	column.addElement("出版社");
    	column.addElement("作者");
    	column.addElement("出版时间");
    	column.addElement("单价");
    	column.addElement("库存");
    	
    	return column;
    }
    
//    public static void main(String args[]) {
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(BookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(BookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(BookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(BookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new BookView(keywordVO,type).setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private Vector<String> columnNames ;
    private Vector<Vector> rowData;
    private BookViewService bookViewController;
    private KeywordVO keywordVO;
    private String type;
    private int index;//用于判断跳转到那个panel
    // End of variables declaration
}

