package week1.day2;

public class Library {

	String addBook(String bookTitle){
		return bookTitle;
	}
	void issueBook() {
		System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		Library libo=new Library();
		String bookTitle=libo.addBook("Chetan bhagat books");
		System.out.println(bookTitle);
		libo.issueBook();
		
	}
	}

