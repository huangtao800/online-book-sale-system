package presentation;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import po.BookPO;
import presentationController.searchBookView.SearchBookService;
import presentationController.searchBookView.SearchBookViewController;

/**
 *
 * @author YJQ
 */
public class SearchBookView extends javax.swing.JFrame {

    public SearchBookView() {
    	searchBookController = SearchBookViewController.getInstance();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("图书ISBN：");

        jButton1.setText("查询");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String isbn = jTextField1.getText().trim();
                
                if(isbn.equals("")){
                	JOptionPane.showMessageDialog(null, "请输入图书ISBN！");
                }else{
                	BookPO bookPO = searchBookController.searchBook(isbn);
                	if(bookPO==null){
                		rowData = new Vector<Vector>();
            			DefaultTableModel dtm=new DefaultTableModel(rowData, columnNames);
                        jTable1.setModel(dtm);
            			JOptionPane.showMessageDialog(null, "未找到相应图书！");
                	}else{
                		rowData = new Vector<Vector>();
                        Vector<String> row = new Vector<String>();
                        row.add(bookPO.getBookName());
                        row.add(bookPO.getISBN());
                        row.add(bookPO.getType());
                        row.add(bookPO.getPress());
                        row.add(bookPO.getAuthor());
                        row.add(bookPO.getPublishDate());
                        row.add(String.valueOf(bookPO.getPrice()));
                        row.add(String.valueOf(bookPO.getNumOfBook()));
                        rowData.add(row);
                        DefaultTableModel dtm=new DefaultTableModel(rowData, columnNames);
                        jTable1.setModel(dtm);
                	}
                    
                }
                
            }
        });

        jButton2.setText("图书概览");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	ArrayList<BookPO> bookList = searchBookController.getAllBook();
            	rowData = new Vector<Vector>();
        		for(int i = 0; i < bookList.size(); i++){
               		    Vector<String> row = new Vector<String>();
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
            }
        });

        columnNames = setColumnNames();
        rowData = new Vector<Vector>();
        jTable1 = new JTable(rowData, columnNames);
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("查询结果：");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(42, 42, 42)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
            .addComponent(jSeparator1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchBookView().setVisible(true);
            }
        });
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
    
    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private Vector<Vector> rowData;
    private Vector<String> columnNames;
    private SearchBookService searchBookController;
    
    // End of variables declaration
}
