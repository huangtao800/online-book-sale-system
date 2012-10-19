package po;
//ÓÈ¼Ñç÷
import java.util.Date;

public class BookPO implements PO{
    private String ISBN,bookName,author,press;
    private Date publishDate;
    private double price;
    
    public BookPO(){
    	
    }
    
    public BookPO(String isbn,String name,String a,String p,Date date,double m){
    	ISBN = isbn;
    	bookName = name;
    	author = a;
    	press = p;
    	publishDate = date;
    	price = m;
    }
    
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
}
