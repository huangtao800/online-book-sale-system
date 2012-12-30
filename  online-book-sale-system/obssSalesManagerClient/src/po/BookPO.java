package po;
//ÓÈ¼Ñç÷
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.BreakIterator;
import java.util.Date;

public class BookPO implements PO{
    private String ISBN,bookName,author,press,publishDate;
    private String type,briefIntroduction;
    private double price;
    private int numOfBook;
    private byte[] image;
    
    public BookPO(){
    	
    }
    
    public BookPO(String ISBN,String bookName,String author,String press,
    		String publishDate,String type,double price,int numOfBook,byte[] image,String briefIntroduction){
    	this.ISBN = ISBN;
    	this.bookName = bookName;
    	this.author = author;
    	this.press = press;
    	this.publishDate = publishDate;
    	this.type = type;
    	this.price = price;
    	this.numOfBook = numOfBook;
    	this.image = image;
    	this.briefIntroduction = briefIntroduction;
    }
    
    public int getNumOfBook(){
    	return numOfBook;
    }
    
    public void setNumOfBook(int num){
    	numOfBook = num;
    }
    
    public String getType(){
    	return type;
    }
    
    public void setType(String tString){
    	type = tString;
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
    
    public String getBriefIntroduction(){
    	return briefIntroduction;
    }
    
    public void setBriefIntroduction(String bi){
    	briefIntroduction = bi;
    }
    
    public byte[] getImage(){
    	return image;
    }
    
    public void setImage(byte[] img){
    	image = img;
    }
}
