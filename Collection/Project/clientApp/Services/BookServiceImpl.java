package Services;
import Model.Book;
import Repository.*;

public class BookServiceImpl implements BookService{
	
	BookRepo bookRepo = new BookRepoImp();

	
	public boolean isAddBook(Book book) {
		
		return bookRepo.isAddBook(book);
	}

}
