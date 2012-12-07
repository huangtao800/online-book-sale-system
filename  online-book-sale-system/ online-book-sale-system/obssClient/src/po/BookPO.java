package po;
//ÓÈ¼Ñç÷
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class BookPO implements PO{
    private String ISBN,bookName,author,press;
    private Date publishDate;
    private double price;
    
    public String getISBN(){
    	return ISBN;
    }
    
    public void setISBN(String isbn){
    	ISBN = isbn;
    }
    
    public String getBookName(){
    	return bookName;
    }
    
    public void setBookName(String name){
    	bookName = name;
    }
   
    public String getAuthor(){
    	return author;
    }
    
    public void setAuthor(String a){
    	author = a;
    }
    
    public String getPress(){
    	return press;
    }
    
    public void setPress(String p){
    	press = p;
    }
    
    public Date getPublishDate(){
    	return publishDate;
    }
    
    public void setPublishDate(Date date){
    	publishDate =date;
    }
    
    public double getPrice(){
    	return price;
    }
    
    public void setPrice(double m){
    	price = m;
    }
    
    public void save(String isbn,String bookName,String author,String press,
    		Date publishDate,double price){
    	BookPO bookPO = new BookPO();
    	bookPO.setISBN(isbn);
    	bookPO.setBookName(bookName);
    	bookPO.setAuthor(author);
    	bookPO.setPress(press);
    	bookPO.setPublishDate(publishDate);
    	bookPO.setPrice(price);
    	
    	try{
    		FileOutputStream fs = new FileOutputStream("book.ser");
    		ObjectOutputStream os  = new ObjectOutputStream(fs);
    		os.writeObject(bookPO);
    		os.close();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
}
