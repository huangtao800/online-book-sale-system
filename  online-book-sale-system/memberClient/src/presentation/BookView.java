package presentation;
//�ȼ���

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
import presentationController.book.BookViewController;
import presentationController.book.BookViewService;
import vo.KeywordVO;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;

/**
 * @author YJQ
 */
public class BookView extends javax.swing.JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	public BookView() {
        initComponents();
    }
	
	public BookView (KeywordVO keywordVO,String type,BookViewService bookViewController) {
		this.keywordVO = keywordVO;
		this.type = type;
		if(type==null){
			this.index = 0;
		}else if(keywordVO==null){
			this.index = 1;
		}
		
		this.bookViewController=bookViewController;
	
		initComponents();
	}

    
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

        jLabel1.setText("ͼ����⣺");
        jLabel2.setText("�����磺 ");
        jLabel3.setText("���ߣ�");
        jLabel4.setText("������ݣ�");
        
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

        
        jButton1.setText("\u67E5\u627E");
        jButton1.addActionListener(this);

        jButton2.setText("���빺�ﳵ");
        jButton2.addActionListener(this);

        jLabel5.setText("���ҽ����");
        
        columnNames = setColumnNames();
        rowData = new Vector<Vector>();
        jTable1 = new JTable(rowData, columnNames);
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        jButton5.setText("��ӵ��ղؼ�");
        jButton5.addActionListener(this);

        jButton6.setText("��ӵ����ﳵ");
        jButton6.addActionListener(this);

        javax.swing.GroupLayout gl_jPanel1 = new javax.swing.GroupLayout(jPanel1);
        gl_jPanel1.setHorizontalGroup(
        	gl_jPanel1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_jPanel1.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_jPanel1.createSequentialGroup()
        					.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel1)
        						.addComponent(jLabel2))
        					.addGap(14)
        					.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
        						.addComponent(jTextField2)
        						.addComponent(jTextField1)))
        				.addGroup(gl_jPanel1.createSequentialGroup()
        					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_jPanel1.createSequentialGroup()
        					.addGap(36)
        					.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING)
        						.addGroup(gl_jPanel1.createSequentialGroup()
        							.addComponent(jLabel3)
        							.addGap(35))
        						.addGroup(gl_jPanel1.createSequentialGroup()
        							.addComponent(jLabel4)
        							.addPreferredGap(ComponentPlacement.RELATED)))
        					.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
        						.addComponent(jTextField5, 226, 226, 226)
        						.addComponent(jTextField4, 226, 226, 226)))
        				.addGroup(gl_jPanel1.createSequentialGroup()
        					.addGap(35)
        					.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)))
        			.addContainerGap())
        		.addGroup(gl_jPanel1.createSequentialGroup()
        			.addGap(53)
        			.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
        			.addGap(51)
        			.addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(47, Short.MAX_VALUE))
        		.addGroup(gl_jPanel1.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE))
        		.addGroup(gl_jPanel1.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel5)
        			.addContainerGap(581, Short.MAX_VALUE))
        );
        gl_jPanel1.setVerticalGroup(
        	gl_jPanel1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_jPanel1.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
        					.addComponent(jLabel1)
        					.addComponent(jLabel3, Alignment.TRAILING))
        				.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(jLabel4)
        				.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
        			.addGap(18)
        			.addComponent(jLabel5)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(jButton6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jButton5, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
        			.addContainerGap())
        );
        jPanel1.setLayout(gl_jPanel1);

        jTabbedPane1.addTab("ͨ���ؼ��ʲ���ͼ��", jPanel1);

        jLabel6.setText("ͼ�����ͣ�");

     
        ArrayList<String> typeList=bookViewController.getBookType();
		String[] typeString=new String[typeList.size()];
		for(int i=0;i<typeList.size();i++){
			typeString[i]=typeList.get(i);
		}
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(typeString));
        jComboBox1.setSelectedItem(type);
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        

        jButton3.setText("����ͼ��");
        jButton3.addActionListener(this);
        
        jTable2 = new JTable(rowData, columnNames);
        jTable2.setRowHeight(30);
        jScrollPane2.setViewportView(jTable2);

        jLabel7.setText("���ҽ����");

        jButton4.setText("���빺�ﳵ");
        jButton4.addActionListener(this);

        jButton7.setText("��ӵ��ղؼ�");
        jButton7.addActionListener(this);

        jButton8.setText("��ӵ����ﳵ");
        jButton8.addActionListener(this);

        javax.swing.GroupLayout gl_jPanel2 = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(gl_jPanel2);
        gl_jPanel2.setHorizontalGroup(
            gl_jPanel2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_jPanel2.createSequentialGroup()
                .addContainerGap()
                .addGroup(gl_jPanel2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gl_jPanel2.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gl_jPanel2.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gl_jPanel2.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(564, 564, 564))))
            .addGroup(gl_jPanel2.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        gl_jPanel2.setVerticalGroup(
            gl_jPanel2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_jPanel2.createSequentialGroup()
                .addContainerGap()
                .addGroup(gl_jPanel2.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gl_jPanel2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gl_jPanel2.createSequentialGroup()
                        .addComponent(jButton7)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("ͨ�����Ͳ���ͼ��", jPanel2);

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
        
        if(index==0){                       //�ؼ��ֲ�ѯ
        	jTabbedPane1.setSelectedIndex(0);
        	actionDo(0);
        }else if(index==1){                 //���Ͳ�ѯ
        	jTabbedPane1.setSelectedIndex(1);
        	actionDo(1);
        }
    }
    
   
    public void actionPerformed(ActionEvent e) {
    	Object obj=e.getSource();
    	
    	
    	if(obj==jButton1){            //ͨ���ؼ��ֲ���
    		actionDo(0);
    	}else if(obj==jButton3){        //ͨ��ͼ�����Ͳ���ͼ��
    		actionDo(1);
    	}else if(obj==jButton2){      //���빺�ﳵ
            actionDo(2);
    	}else if(obj==jButton4){      //���빺�ﳵ
            actionDo(3);
        }else if(obj==jButton5){      //��ӵ��ղؼ�
    		actionDo(4);
    	}else if(obj==jButton6){      //��ӵ����ﳵ
    		actionDo(5);
    	}else if(obj==jButton7){      //��ӵ��ղؼ�
    		actionDo(6);
        }else if(obj==jButton8){      //��ӵ����ﳵ
    		actionDo(7);
    	}
    	
    }
    
    public void actionDo(int doIndex) {
    	ArrayList<BookPO> bookList = new ArrayList<BookPO>();
    	LineItemPO lineItemPO;
    	String name = jTextField1.getText().trim();
    	String press = jTextField2.getText().trim();
    	String author = jTextField4.getText().trim();
    	String publishDate = jTextField5.getText().trim();
    	
    	
    	if(doIndex==0){            //ͨ���ؼ��ֲ���
    		bookList = bookViewController.findByKeyword(name, author, press, publishDate);
    		if(bookList.size()==0){
    			rowData = new Vector<Vector>();
    			DefaultTableModel dtm=new DefaultTableModel(rowData, columnNames);
                jTable1.setModel(dtm);
    			JOptionPane.showMessageDialog(null, "δ�ҵ���Ӧͼ�飡");
    		}else{
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
    	
    	}else if(doIndex==1){        //ͨ��ͼ�����Ͳ���ͼ��
    		String t = jComboBox1.getSelectedItem().toString();
    		bookList = bookViewController.fineByType(t);
    		if(bookList.size()==0){
    			rowData = new Vector<Vector>();
    			DefaultTableModel dtm=new DefaultTableModel(rowData, columnNames);
                jTable2.setModel(dtm);
    			JOptionPane.showMessageDialog(null, "δ�ҵ���Ӧͼ�飡");
    		}else{
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
                jTable2.setModel(dtm);
                
    		}
    		  
    	}else if(doIndex==2){      //���빺�ﳵ

    		bookViewController.enterCart();
    		
    	}else if(doIndex==3){      //���빺�ﳵ

    		bookViewController.enterCart();
    		
    	}else if(doIndex==4){      //��ӵ��ղؼ�
    		if(jTable1.getSelectedRow()==-1){
				JOptionPane.showMessageDialog(null, "��ѡ��һ��ͼ�飡");
			}else{
				bookList = bookViewController.findByKeyword(name, author, press, publishDate);
			
				BookPO bookPO = bookList.get(jTable1.getSelectedRow());
				
				ResultMessage result= bookViewController.putIntoFavorities(bookPO);
				if(result==ResultMessage.SUCCEED){
					JOptionPane.showMessageDialog(null, "��ӳɹ���");
				}
			}
    		
    	}else if(doIndex==5){      //��ӵ����ﳵ
    		if(jTable1.getSelectedRow()==-1){
				JOptionPane.showMessageDialog(null, "��ѡ��һ��ͼ�飡");
			}else{
				bookList = bookViewController.findByKeyword(name, author, press, publishDate);
	    	    
				BookPO bookPO = bookList.get(jTable1.getSelectedRow());
				int number = Integer.parseInt(JOptionPane.showInputDialog("�����빺������"));
	    		lineItemPO = new LineItemPO(bookPO, number);
	    		
				ResultMessage result= bookViewController.putIntoCart(lineItemPO);
				if(result==ResultMessage.SUCCEED){
					JOptionPane.showMessageDialog(null, "��ӳɹ���");
			    }
			}
    		
    	}else if(doIndex==6){      //��ӵ��ղؼ�
    		if(jTable2.getSelectedRow()==-1){
				JOptionPane.showMessageDialog(null, "��ѡ��һ��ͼ�飡");
			}else{
				String t = jComboBox1.getSelectedItem().toString();
				bookList = bookViewController.fineByType(t);
				BookPO bookPO = bookList.get(jTable2.getSelectedRow());
				ResultMessage result= bookViewController.putIntoFavorities(bookPO);
				if(result==ResultMessage.SUCCEED){
					JOptionPane.showMessageDialog(null, "��ӳɹ���");
				}
			}
    		
    	}else if(doIndex==7){      //��ӵ����ﳵ
    		if(jTable2.getSelectedRow()==-1){
				JOptionPane.showMessageDialog(null, "��ѡ��һ��ͼ�飡");
			}else{
				String t = jComboBox1.getSelectedItem().toString();
				bookList = bookViewController.fineByType(t);
				BookPO bookPO = bookList.get(jTable2.getSelectedRow());
				int number = Integer.parseInt(JOptionPane.showInputDialog("�����飺"));
	    		lineItemPO = new LineItemPO(bookPO, number);
	    		
				ResultMessage result= bookViewController.putIntoCart(lineItemPO);
				if(result==ResultMessage.SUCCEED){
					JOptionPane.showMessageDialog(null, "��ӳɹ���");
				}
			}
    	}
    	
    }
   
    private Vector<String> setColumnNames(){
    	Vector<String> column = new Vector<String>();
    	column.addElement("ͼ�����");
    	column.addElement("ͼ��ISBN");
    	column.addElement("ͼ�����");
    	column.addElement("������");
    	column.addElement("����");
    	column.addElement("����ʱ��");
    	column.addElement("����");
    	column.addElement("���");
    	
    	return column;
    }
    
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
    private int index;//�����ж���ת���Ǹ�panel
    // End of variables declaration
}

