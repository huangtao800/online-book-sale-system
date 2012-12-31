package presentation;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.colorchooser.ICC_CMYKColorSliderModel;


import po.BookPO;
import po.LineItemPO;
import po.ResultMessage;
import presentationController.book.BookViewService;
import vo.KeywordVO;

/**
 *
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
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton9 = new javax.swing.JButton();
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
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jButton10 = new javax.swing.JButton();
        
        jList3 = new javax.swing.JList();
        jList4 = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        jScrollPane6 = new javax.swing.JScrollPane();

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
        
       
        javax.swing.GroupLayout gl_jPanel3 = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(gl_jPanel3);
        gl_jPanel3.setHorizontalGroup(
            gl_jPanel3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        gl_jPanel3.setVerticalGroup(
            gl_jPanel3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " ", " ", " ", " ", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        jButton9.setText("查看详情");
        jButton9.addActionListener(this);

        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "  ", " ", " ", " ", "       暂无封面" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel3)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addGap(59, 59, 59))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 76, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 41, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5)
                    .addComponent(jButton9))
                .addGap(26, 26, 26))
        );
        jTabbedPane1.addTab("通过关键词查找图书", jPanel1);

        jLabel6.setText("图书类型：");


        ArrayList<String> typeList=bookViewController.getBookType();
		String[] typeString=new String[typeList.size()];
		for(int i=0;i<typeList.size();i++){
			typeString[i]=typeList.get(i);
		}
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(typeString));
        jComboBox1.setSelectedItem(type);
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        

        jButton3.setText("查找图书");
        jButton3.addActionListener(this);
        
        jTable2 = new JTable(rowData, columnNames);
        jTable2.setRowHeight(30);
        jScrollPane2.setViewportView(jTable2);
        
        jLabel7.setText("查找结果：");

        jButton4.setText("进入购物车");

        jButton7.setText("添加到收藏夹");
        jButton7.addActionListener(this);

        jButton8.setText("添加到购物车");
        jButton8.addActionListener(this);

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " ", " ", " ", " ", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
       
        jScrollPane4.setViewportView(jList2);

        jButton10.setText("查看详情");
        jButton10.addActionListener(this);

        
        jList4.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " ", "", "", "", "     暂无封面" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(jList4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(64, 64, 64)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 92, Short.MAX_VALUE)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
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
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton10))
                .addContainerGap())
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

        if(index==0){                       //关键字查询
        	jTabbedPane1.setSelectedIndex(0);
        	actionDo(0);
        }else if(index==1){                 //类型查询
        	jTabbedPane1.setSelectedIndex(1);
        	actionDo(1);
        }
    }
    
    public void actionPerformed(ActionEvent e) {
    	Object obj=e.getSource();
    	
    	
    	if(obj==jButton1){            //通过关键字查找
    		actionDo(0);
    	}else if(obj==jButton3){        //通过图书类型查找图书
    		actionDo(1);
    	}else if(obj==jButton2){      //进入购物车
            actionDo(2);
    	}else if(obj==jButton4){      //进入购物车
            actionDo(3);
        }else if(obj==jButton5){      //添加到收藏夹
    		actionDo(4);
    	}else if(obj==jButton6){      //添加到购物车
    		actionDo(5);
    	}else if(obj==jButton7){      //添加到收藏夹
    		actionDo(6);
        }else if(obj==jButton8){      //添加到购物车
    		actionDo(7);
    	}else if(obj==jButton9){
    		actionDo(8);
    	}else if(obj==jButton10){
    		actionDo(9);
    	}
    	
    }
    
    public void actionDo(int doIndex) {
    	ArrayList<BookPO> bookList = new ArrayList<BookPO>();
    	LineItemPO lineItemPO;
    	String name = jTextField1.getText().trim();
    	String press = jTextField2.getText().trim();
    	String author = jTextField4.getText().trim();
    	String publishDate = jTextField5.getText().trim();
    	
    	
    	if(doIndex==0){            //通过关键字查找
    		bookList = bookViewController.findByKeyword(name, author, press, publishDate);
    		if(bookList.size()==0){
    			rowData = new Vector<Vector>();
    			DefaultTableModel dtm=new DefaultTableModel(rowData, columnNames);
                jTable1.setModel(dtm);
    			JOptionPane.showMessageDialog(null, "未找到相应图书！");
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
    	
    	}else if(doIndex==1){        //通过图书类型查找图书
    		String t = jComboBox1.getSelectedItem().toString();
    		bookList = bookViewController.fineByType(t);
    		if(bookList.size()==0){
    			rowData = new Vector<Vector>();
    			DefaultTableModel dtm=new DefaultTableModel(rowData, columnNames);
                jTable2.setModel(dtm);
    			JOptionPane.showMessageDialog(null, "未找到相应图书！");
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
    		  
    	}else if(doIndex==2){      //进入购物车

    		bookViewController.enterCart();
    		
    	}else if(doIndex==3){      //进入购物车

    		bookViewController.enterCart();
    		
    	}else if(doIndex==4){      //添加到收藏夹
    		
    		if(jTable1.getSelectedRow()==-1){
				JOptionPane.showMessageDialog(null, "请选择一本图书！");
			}else{
				bookList = bookViewController.findByKeyword(name, author, press, publishDate);
			
				BookPO bookPO = bookList.get(jTable1.getSelectedRow());
				
				ResultMessage result= bookViewController.putIntoFavorities(bookPO);
				if(result==ResultMessage.SUCCEED){
					JOptionPane.showMessageDialog(null, "添加成功！");
				}else if(result==ResultMessage.FULL){
                    JOptionPane.showMessageDialog(null,"收藏夹已满！");
				}else{
					JOptionPane.showMessageDialog(null,"系统错误，请稍后重试！");
				}
			}
    		
    	}else if(doIndex==5){      //添加到购物车
    		if(jTable1.getSelectedRow()==-1){
				JOptionPane.showMessageDialog(null, "请选择一本图书！");
			}else{
				bookList = bookViewController.findByKeyword(name, author, press, publishDate);
	    	    
				BookPO bookPO = bookList.get(jTable1.getSelectedRow());
				int number=0;
				try{
					number = Integer.parseInt(JOptionPane.showInputDialog("请输入购买本数："));
				}catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "输入错误！");
				}
				
				if(number==0){
					return;
				}
//	    		lineItemPO = new LineItemPO(bookPO, number);
	    		
				ResultMessage result= bookViewController.putIntoCart(bookPO,number);
				if(result==ResultMessage.SUCCEED){
					JOptionPane.showMessageDialog(null, "添加成功！");
			    }else if(result==ResultMessage.NOTPREPARED){
			    	JOptionPane.showMessageDialog(null, "购买本数超过库存！");
			    }else{
			    	JOptionPane.showMessageDialog(null, "系统错误，请稍后重试！");
			    }
			}
    		
    	}else if(doIndex==6){      //添加到收藏夹
    		if(jTable2.getSelectedRow()==-1){
				JOptionPane.showMessageDialog(null, "请选择一本图书！");
			}else{
				String t = jComboBox1.getSelectedItem().toString();
				bookList = bookViewController.fineByType(t);
				BookPO bookPO = bookList.get(jTable2.getSelectedRow());
				ResultMessage result= bookViewController.putIntoFavorities(bookPO);
				if(result==ResultMessage.SUCCEED){
					JOptionPane.showMessageDialog(null, "添加成功！");
				}else if(result==ResultMessage.FULL){
                    JOptionPane.showMessageDialog(null,"收藏夹已满！");
				}else{
					JOptionPane.showMessageDialog(null,"系统错误，请稍后重试！");
				}
			}
    		
    	}else if(doIndex==7){      //添加到购物车
    		if(jTable2.getSelectedRow()==-1){
				JOptionPane.showMessageDialog(null, "请选择一本图书！");
			}else{
				String t = jComboBox1.getSelectedItem().toString();
				bookList = bookViewController.fineByType(t);
				BookPO bookPO = bookList.get(jTable2.getSelectedRow());
				int number=0;
				try{
					number = Integer.parseInt(JOptionPane.showInputDialog("请输入购买本数："));
				}catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "输入错误！");
				}
				
				if(number==0){
					return;
				}
//	    		lineItemPO = new LineItemPO(bookPO, number);
	    		
				ResultMessage result= bookViewController.putIntoCart(bookPO,number);
				if(result==ResultMessage.SUCCEED){
					JOptionPane.showMessageDialog(null, "添加成功！");
			    }else if(result==ResultMessage.NOTPREPARED){
			    	JOptionPane.showMessageDialog(null, "购买本数超过库存！");
			    }else{
			    	JOptionPane.showMessageDialog(null, "系统错误，请稍后重试！");
			    }
			}
		}else if(doIndex==8){        //查看详情
	    		bookList = bookViewController.findByKeyword(name, author, press, publishDate);
	    	    BookPO bookPO = bookList.get(jTable1.getSelectedRow());
	    	    getSpecificInfo(bookPO, 1);
	    }else if(doIndex==9){
	    		String t = jComboBox1.getSelectedItem().toString();
				bookList = bookViewController.fineByType(t);
				BookPO bookPO = bookList.get(jTable2.getSelectedRow());
				getSpecificInfo(bookPO, 2);
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
    
  //index用来确认是哪个table
    private void getSpecificInfo(BookPO bookPO,int i){
    	ImageIcon icon = new ImageIcon(bookPO.getImage());
    	
    	DefaultListModel<String> txtListModel = new DefaultListModel<String>();
    	txtListModel.addElement("\n"+bookPO.getBriefIntroduction());
    	
    	DefaultListModel<Icon> imageListModel = new DefaultListModel<Icon>();
    	imageListModel.addElement(icon);
    	if(i==1){
    		jList1 = new JList<String>(txtListModel);
    		jScrollPane3.setViewportView(jList1);
    		jList3 = new JList<Icon>(imageListModel);
    		jList3.setCellRenderer(new MyCellRender(icon));//使用自己的CellRenderer  
    		jList3.setPreferredSize(deDimension);
    	    jScrollPane5.setViewportView(jList3); 
    		
    		
    	}else{
    		jList2 = new JList<>(txtListModel);
            jScrollPane4.setViewportView(jList2);
            jList4 = new JList<Icon>(imageListModel);
            jList4.setCellRenderer(new MyCellRender(icon));//使用自己的CellRenderer  
            jList4.setPreferredSize(deDimension);
    	    jScrollPane6.setViewportView(jList4); 
    	}
    }
    


    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
   
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JList jList4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
 
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
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
    private final Dimension deDimension  = new Dimension(210, 220);
 
    // End of variables declaration
}

class MyCellRender extends JLabel implements ListCellRenderer {  
    Icon icon;  
    public MyCellRender(){};  
    public MyCellRender(Icon icon) {  
        this.icon=icon;  
    }  
    @Override  
    public Component getListCellRendererComponent(JList list, Object value,  
    		int index, boolean isSelected, boolean cellHasFocus) {  
         String s = value.toString();  
         setText(s);  
         setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));//加入宽度为5的空白边框  

         setIcon(icon);//设置图片   
         return this; 
    }  

}  
 