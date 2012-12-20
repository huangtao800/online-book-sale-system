package database.book;
//尤佳琪
import java.awt.print.Book;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import po.BookPO;
import po.PO;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;

import database.init.InitDatabase;
import databaseService.book.BookDatabaseService;
import databaseService.init.InitDatabaseService;

//代理
public class BookDatabase extends UnicastRemoteObject implements BookDatabaseService{
	private BookDatabaseService bookDatabaseService;
	private static BookDatabase instance=null;


	protected BookDatabase() throws RemoteException{
		super();
		
	}

	
	public static BookDatabase getInstance(){
		if(instance==null){
			try {
				instance=new BookDatabase();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return instance;
	}


	@Override
	public ResultMessage insert(PO po){
		BookPO bookPO = (BookPO)po;
		ArrayList<BookPO> bookList = readFile();
		int index = isExist(bookPO, bookList);
		
		if(index!=-1){     //图书存在
			int oldNum = bookList.get(index).getNumOfBook();
			int newNum = oldNum + bookPO.getNumOfBook();
			bookList.get(index).setNumOfBook(newNum);
		}else{             //图书不存在
		    bookList.add(bookPO);
		}
		
		
		return writeFile(bookList);

	}

	private ResultMessage writeFile(ArrayList<BookPO> arrayList){
		try {
			FileOutputStream outputStream=new FileOutputStream("book.ser");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
			objectOutputStream.writeObject(arrayList);
		    outputStream.close();
			objectOutputStream.close();
			return ResultMessage.SUCCEED;
		} catch (Exception e) {
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
		
	}
	
	private int isExist(BookPO bookPO,ArrayList<BookPO> bookList){
        int index = -1;//-1表示图书不存在
        for(int i=0;i<bookList.size();i++){
            if(bookPO.getISBN().equals(bookList.get(i).getISBN())){
        		index = i;
        	}
        }
        
        return index;
	}

	@Override
	public ResultMessage delete(PO po) {
		BookPO bookPO = (BookPO)po;
        ArrayList<BookPO> bookList = readFile();
        int index = isExist(bookPO, bookList);
        
        if((index!=-1)&&(bookList.get(index).getNumOfBook()!=0)){  // 图书存在，则删除就是将图书数量设为0
			bookList.get(index).setNumOfBook(0);
			return writeFile(bookList);
	    }else{
	   	    return ResultMessage.NOTEXIST;
	    }
    }


	@Override
	//用于修改
	public ResultMessage update(PO po) {
		
		BookPO bookPO = (BookPO)po;
		ArrayList<BookPO> bookList = readFile();
		int index = isExist(bookPO, bookList);
		//book的ISBN不可以修改
		if(index!=-1){
			bookList.get(index).setAuthor(bookPO.getAuthor());
    		bookList.get(index).setBookName(bookPO.getBookName());
    		bookList.get(index).setNumOfBook(bookPO.getNumOfBook());
    		bookList.get(index).setPress(bookPO.getPress());
    		bookList.get(index).setPrice(bookPO.getPrice());
    		bookList.get(index).setPublishDate(bookPO.getPublishDate());
    		bookList.get(index).setType(bookPO.getType());
    		return writeFile(bookList);
		}else{
			return ResultMessage.FAILED;
		}
       
	}
	
	public BookPO findThroughISBN(String isbn) {
		ArrayList<BookPO> bookList = readFile();
	    BookPO bookPO = null;
	    for(int i=0;i<bookList.size();i++){
	    	if(bookList.get(i).getISBN().equals(isbn)){
	    		bookPO = bookList.get(i);
	    	}
	    }
	    
		return bookPO;
	}
	
	//根据关键字返回相应的图书列表
	public ArrayList<BookPO>  findByKey(String name,String author,String press,
		     String publishDate) throws RemoteException{ 
		ArrayList<BookPO> arrayList = readFile();
		ArrayList<BookPO> bookList = new ArrayList<BookPO>();
		for(int i=0;i<arrayList.size();i++){
			if((arrayList.get(i).getBookName().contains(name)||name.equals(""))&&
			   (arrayList.get(i).getAuthor().equals(author)||author.equals(""))&&
			   (arrayList.get(i).getPress().equals(press)||press.equals(""))&&
			   (arrayList.get(i).getPublishDate().equals(publishDate)||publishDate.equals(""))&&
			   (arrayList.get(i).getNumOfBook()!=0)){
				   bookList.add(arrayList.get(i));
			   }
		}
		
		return bookList;
	}
		
	//通过图书类型查找返回相应的图书列表
	public ArrayList<BookPO> findByType(String type)  {
		ArrayList<BookPO> arrayList = readFile();
		ArrayList<BookPO> bookList = new ArrayList<BookPO>();
		for(int i=0;i<arrayList.size();i++){
			if(arrayList.get(i).getType().equals(type)&&
					(arrayList.get(i).getNumOfBook()!=0)){
				   bookList.add(arrayList.get(i));
			}
		}
		
		return bookList;
	}
	
	@Override
	public ArrayList<BookPO> readFile(){
		FileInputStream inputStream;
		ArrayList<BookPO> bookList = new ArrayList<BookPO>();
		
		try {
		    inputStream=new FileInputStream("book.ser");
			ObjectInputStream objInput=new ObjectInputStream(inputStream);
			bookList = (ArrayList<BookPO>)objInput.readObject();
			inputStream.close();
			objInput.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bookList;
	}
	
	//对图书类别的处理
	public ArrayList<String> getBookType() throws RemoteException{
		FileInputStream inputStream;
		ArrayList<String> bookTypeList = new ArrayList<String>();
		
		try {
		    inputStream=new FileInputStream("bookType.ser");
			ObjectInputStream objInput=new ObjectInputStream(inputStream);
			bookTypeList= (ArrayList<String>)objInput.readObject();
			inputStream.close();
			objInput.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		bookTypeList = sortBookType(bookTypeList);
		return bookTypeList;
	}
	
	private ResultMessage writeBookType(ArrayList<String> arrayList) throws RemoteException{
		FileOutputStream fileOutputStream;
		
		try {
			fileOutputStream = new FileOutputStream("bookType.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(arrayList);
			objectOutputStream.close();
			fileOutputStream.close();
			return ResultMessage.SUCCEED;
		} catch (Exception e) {
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}
	
	public ResultMessage addBookType(String type) throws RemoteException{
		ArrayList<String> arrayList = getBookType();
		int index = isBookTypeExist(arrayList, type);
		if(index==-1){       //该类型不存在
			arrayList.add(type);
			return writeBookType(arrayList);
		}else{
			return ResultMessage.EXIST;
		}
		
		
	}
		
	
	public ResultMessage changeBookType(String beforeType,String afterType)throws RemoteException{
		ArrayList<String> typeList = getBookType();
		ArrayList<BookPO> bookList = readFile();
		int oldIndex = isBookTypeExist(typeList, beforeType);
		int newIndex = isBookTypeExist(typeList,afterType);
		
		//原来就存在afterType图书类型
		if(newIndex!=-1){
		   for(int i=0;i<bookList.size();i++){
			   if(bookList.get(i).getType().equals(beforeType)){
				   bookList.get(i).setType(afterType);
			   }
		   }
		   typeList.remove(oldIndex);
		   writeFile(bookList);
		   return writeBookType(typeList);
	    }else{     //不存在afterType类型的图书
	    	typeList.remove(oldIndex);
			typeList.add(afterType);
			return writeBookType(typeList);
		}
	}
	
	//判断原类型是否存在
	private int isBookTypeExist(ArrayList<String> typeList,String afterType){
		int index = -1;
        for(int i=0;i<typeList.size();i++){
        	if(typeList.get(i).equals(afterType)){
        		index = i;
        	}
        }
        return index;
	}
	
	//实现图书类型的排序
	private ArrayList<String> sortBookType(ArrayList<String> arrayList){
		 ArrayList<String> sortList = new ArrayList<String>();
		 int index = -1;
		 for(int i=0;i<arrayList.size();i++){
			 if(arrayList.get(i).equals("其他")){
				 index = i;
			 }
		 }
		 //有其他这一类型
		 if(!(index==-1)){   
			 arrayList.remove(index);
		 }
		 
		 String[] arr = new String[arrayList.size()];
		 for(int i=0;i<arrayList.size();i++){
			 arr[i]=arrayList.get(i);
		 }
		 Comparator cmp = Collator.getInstance(java.util.Locale.CHINA);
         Arrays.sort(arr, cmp);
		 for(int i=0;i<arr.length;i++){
			 sortList.add(arr[i]);
		 }
		 //有其他这一类型
		 if(!(index==-1)){   
			 sortList.add("其他");
		 }
		 
		 return sortList;
	}
	
}

