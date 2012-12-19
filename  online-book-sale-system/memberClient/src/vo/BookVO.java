package vo;

import po.BookPO;

public class BookVO {
	public String ISBN, bookName, author, press, publishDate;
	public String type;
	public double price;
	public int numOfBook;

	public BookVO(BookPO bookPO) {
		ISBN = bookPO.getISBN();
		bookName = bookPO.getBookName();
		author = bookPO.getAuthor();
		press = bookPO.getPress();
		publishDate = bookPO.getPublishDate();
		type = bookPO.getType();
		price = bookPO.getPrice();
		numOfBook = bookPO.getNumOfBook();
	}
}
