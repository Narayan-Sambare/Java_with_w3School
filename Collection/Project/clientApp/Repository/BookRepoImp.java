package Repository;
import Model.Book;
import java.util.*;

public class BookRepoImp implements BookRepo{

	ArrayList al = new ArrayList();

	public boolean isAddBook(Book book){
		Book b=getBookById(book.getId());
		return b==null?al.add(book):false;
	}

	private Book getBookById(int bookId) {
		Boolean flag=false;
		Book b=null;
		for(Object obj:al)
		{
			b=(Book)obj;
			if(b.getId()==bookId)
			{
				flag=true;
				break;
			}
		}
		return flag ? b :null;
	}
	
}
