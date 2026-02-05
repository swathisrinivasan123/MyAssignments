package week1.day2;

public class LibraryManagement {
	public static void main(String[] args) {
		Library libro=new Library();
				String bookName=libro.addBook("Sudha moorthy books");
		System.out.println(bookName);
		libro.issueBook();
	}

}
