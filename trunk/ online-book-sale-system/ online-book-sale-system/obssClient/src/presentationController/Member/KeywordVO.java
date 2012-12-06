package presentationController.Member;

public class KeywordVO {
	public String bookName;
	public String author;
	public String publisher;
	public String publishYear;

	public KeywordVO(String bookName, String author, String publisher,
			String publisherYear) {
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.publishYear = publisherYear;
	}
}
