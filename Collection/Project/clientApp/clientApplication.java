
import Model.Book;
import Services.*;

import java.util.*;


public class clientApplication
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		 BookService bookService = new BookServiceImpl();
		
		do {
			System.out.println("1:Add New Book");
			System.out.println("2:View Book");
			System.out.println("3:Search Book");
			System.out.println("4: Delete book");
			System.out.println("5: update book");
			System.out.println("6: count number of books");
			System.out.println("7: count book by same price");
			System.out.println("8: count book by author name");
			System.out.println("Enter your choice\n");
			int ch = sc.nextInt();
			sc.nextLine();
			
			switch(ch)
			{
				case 1:
					// System.out.println("1:Add New Book");
					System.out.println("Enter book name :");
					String name=sc.nextLine();
					
					System.out.println("Enter book Author :");
					String author=sc.nextLine();

					System.out.println("Enter book id :");
					int id=sc.nextInt();

					System.out.println("Enter book name");
					int price=sc.nextInt();
					
					Book bookModel= new Book(name,author,id,price);
					boolean b=bookService.isAddBook(bookModel);
					
					System.out.println(b?"Book Added":"Book Not Added");		
					
					break;
				case 2:
					//System.out.println("2:View Book");
					
					break;
				case 3:
					System.out.println("3:Search Book");
					break;
				case 4:
					System.out.println("4: Delete book");
					break;
				case 5:
					System.out.println("5: update book");
					break;
				case 6:
					System.out.println("6: count number of books");
					break;
				case 7:
					System.out.println("7: count book by same price");
					break;
				case 8:
					System.out.println("8: count book by author name");
					break;
				default:
					System.out.println("Enter correct Choice : ");
					System.out.println("===============Thank you Try Again ! ==================");
					break;
			}
			
			
			
		}while(true);	
	}
}