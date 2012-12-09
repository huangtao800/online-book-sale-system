package po;

import java.util.Date;

public class BookPO implements PO{
    private String ISBN,bookName,author,press,publishDate;
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
    
    public String getPublishDate(){
    	return publishDate;
    }
    
    public void setPublishDate(String date){
    	publishDate = date;
    }
    
    public double getPrice(){
    	return price;
    }
    
    public void setPrice(double m){
    	price = m;
    }
}
