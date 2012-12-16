package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;

import po.BookPO;
import presentationController.CheckAllBook.CheckAllBookController;
import presentationController.CheckAllBook.CheckAllBookControllerInterface;

public class CheckAllBook extends JFrame implements ActionListener{
	
	    private javax.swing.JButton jButton1;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JTextArea jTextArea1;
	    private CheckAllBookControllerInterface controller;
	
	public CheckAllBook(CheckAllBookControllerInterface controller){
		this.controller=controller;
		initComponents();	
	}
	  private void initComponents() {

	        jPanel1 = new javax.swing.JPanel();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        jTextArea1 = new javax.swing.JTextArea();
	        jButton1 = new javax.swing.JButton();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jTextArea1.setColumns(20);
	        jTextArea1.setRows(5);
	        jScrollPane1.setViewportView(jTextArea1);

	        jButton1.setFont(new java.awt.Font("幼圆", 1, 24)); // NOI18N
	        jButton1.setForeground(new java.awt.Color(0, 153, 0));
	        jButton1.setText("完  成");

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(jScrollPane1))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(148, 148, 148)
	                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(0, 182, Short.MAX_VALUE)))
	                .addContainerGap())
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(19, Short.MAX_VALUE))
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );

	        pack();
	        
	        //******************************************************************************************
	        jButton1.addActionListener(this);
	        this.setLocation(300, 200);
	        showAllBook();
	        
	        this.setVisible(true);

	      
	  }
	
	
	public void actionPerformed(ActionEvent event){
		if(event.getSource()==jButton1){
			dispose();
		}
	}

	private void showAllBook(){
		 ArrayList<BookPO> bookList=controller.getBookList();
		 if(bookList ==null || bookList.size()==0){
			 jTextArea1.setText("库存中尚无图书！");
		 }else{
			 jTextArea1.setText("");
			 for(int i=0;i<bookList.size(); i++){
				 BookPO book=bookList.get(i);
				 jTextArea1.append("ISBN:"+book.getISBN()+"  书名:"+book.getBookName()+
						 "  作者:"+book.getAuthor()+"  出版社:"+book.getPress()+"  出版年份:"+
						 book.getPublishDate()+"  图书类别:"+book.getType()+"  价格/元:"+
						 book.getPrice()+"  库存/册:"+book.getNumOfBook()+"\n");
			 }
			 
		 }
		
	}
}
