package week1.homeAssignment;

public class Library {
	
	public String addBook(String bookTitle)
	{
		System.out.println(bookTitle + " Book Added Successfully");
		return bookTitle;  
	}

	public void issueBook()
	{
		System.out.println("Book issued Successfully");
	}
	
	public static void main(String[] args)
	{
		Library book = new Library();
		book.addBook("Core Java");
		book.issueBook();
	}
		
}


