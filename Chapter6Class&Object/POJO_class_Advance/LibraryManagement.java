/*
Q1. Create a class called Library to hold:
 accession number,title of the book,author name,price of the book
 and write a menu driven program in java that implements the working of a library :
		The menu options should be: 
		1. Add Book Details.
		2. Display All Book Details.
		3. Display List of all book of given author.
		4. Display list the title of specified book.
		5. Display list count of the book in the library.
		6. Display list the books in the ascending order of accession number.
		7. Update book details by title of book.
		8. Delete book details by price.
		9. Display the price range between 100 to 500.
		10. Exit The Code.
*/
import java.util.*;
public class LibraryManagement
{
	public static void main(String x[])
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the book count");
		int count=sc.nextInt();
		Library l[]=new Library[count]; 
		do
		{
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("\n1. Add Book Details");
			System.out.println("2. Display All Book Details");
			System.out.println("3. Display List of all book of given author");
			System.out.println("4. Display list the title of specified book");
			System.out.println("5. Display list count of the book in the library");
			System.out.println("6. Display list the books in the ascending order of accession number");
			System.out.println("7. Update book details by title of book");
			System.out.println("8. Delete book details by price");
			System.out.println("9. Display the price range between 100 to 500");
			System.out.println("10. Exit The Code");
			System.out.println("-----------------------------------------------------------------------");
			
			int ch=sc.nextInt();sc.nextLine();
			
			switch(ch)
			{
				case 1:
			System.out.println("-----------------------------------------------------------------------");
				
					for (int i = 0; i< l.length; i++) 
					{
						l[i] = new Library();
						System.out.println("\nEnter details of "+(i+1)+" Book " );

						System.out.print((i+1)+" Book ID: ");
						l[i].setId(sc.nextInt());sc.nextLine();
						
						System.out.print((i+1)+" Book Title/Name: ");
						l[i].setTitle(sc.nextLine());

						System.out.print((i+1)+" Book Author name:");
						l[i].setAuthor(sc.nextLine());

						System.out.print((i+1)+" Book price: ");
						l[i].setPrice(sc.nextInt());sc.nextLine();
			System.out.println("-----------------------------------------------------------------------");
						
					}
					break;
				case 2:
			System.out.println("-----------------------------------------------------------------------");
				
					System.out.println("Books Detail:-");
					for (int i = 0; i< l.length; i++) 
					{
						System.out.printf("\nId: %d \tTitle: %s \tAuthor: %s \tPrice: %d\n",l[i].getId(),l[i].getTitle(),l[i].getAuthor(),l[i].getPrice());
					}
					break;
				case 3:
					System.out.println("Name of Author for search the books");
					String tmAuthor=sc.nextLine();
					System.out.println("List of all book of : "+tmAuthor);
					boolean flag=false;
					for(int i=0;i<l.length;i++)
					{
						if(l[i].getAuthor().toLowerCase().contains(tmAuthor.toLowerCase()))
						{
							System.out.println("Book Name: "+l[i].getTitle());
							flag=true;
						}
					}
					if(!flag)
					{
							System.out.println("Author not found .!");
					}
			System.out.println("-----------------------------------------------------------------------");
					
					break;
				case 4:
			System.out.println("-----------------------------------------------------------------------");
				
					System.out.println("Enter the Book ID");
					int tId=sc.nextInt();sc.nextLine();
					
				flag=false;
					System.out.println("Title of specified book of id : "+tId);
					for(int i=0;i<l.length;i++)
						{
							if(tId==l[i].getId())
							{
								System.out.println("Book Title: "+l[i].getTitle());
								flag=true;
							}
						}
						if(!flag)
					{
							System.out.println("ID not found .!");
					}
			System.out.println("-----------------------------------------------------------------------");
					
					break;
				case 5:
			System.out.println("-----------------------------------------------------------------------");
				
					System.out.println("\nlist count of the book in the library: "+l.length);
			System.out.println("-----------------------------------------------------------------------");
					
					break;
				case 6:
			System.out.println("-----------------------------------------------------------------------");
				
					System.out.println("list the books in the ascending order their id: \n");
					for(int i=0;i<l.length;i++)//12,3,10
					{
						for(int j=i;j<l.length-1;j++)
						{
							if(l[j].getId()>l[j+1].getId())
							{
								Library tem=l[j];
								l[j]=l[j+1];
								l[j+1]=tem;
							}
						}
						System.out.printf("\nId: %d \tTitle: %s \tAuthor: %s \tPrice: %d\n",l[i].getId(),l[i].getTitle(),l[i].getAuthor(),l[i].getPrice());
					}
			System.out.println("-----------------------------------------------------------------------");
					
					break;
				case 7:
			System.out.println("-----------------------------------------------------------------------");
										
					System.out.println("Enter old title of book ");
					String tmptitle=sc.nextLine();
					
					System.out.println("Enter new id of book");
					int tmpNewId=sc.nextInt();sc.nextLine();
					
					System.out.println("Enter New title of book");
					String tmpNewtitle=sc.nextLine();
					
					System.out.println("Enter new Author of book");
					String tmpNewAuthor=sc.nextLine();
					
					System.out.println("Enter new Price of book");
					int tmpNewPrice=sc.nextInt();sc.nextLine();
					
					
					for(int i=0;i<l.length;i++)
					{
						if(tmptitle.toLowerCase().contains(l[i].getTitle().toLowerCase()))
						{
							l[i].setId(tmpNewId);
							l[i].setTitle(tmpNewtitle);
							l[i].setAuthor(tmpNewAuthor);
							l[i].setPrice(tmpNewPrice);
						}
					}
			System.out.println("-----------------------------------------------------------------------");

				
					break;
				case 8:
			System.out.println("-----------------------------------------------------------------------");
						
						System.out.println("Enter book price: ");
						int tmpPrice=sc.nextInt();sc.nextLine();
						flag=false;
						int t=0;
						for(int i=0;i<l.length-1;i++)
						{
							if(tmpPrice==l[i].getPrice())
							{
								l[i]=l[i+1];
								t++;
								flag=true;
							}
							else if(flag)
							{
								l[i]=l[i+1];
							}
							else{}
						}
						if(flag)
						{
							System.out.println("Books Detail:-");
							for (int i = 0; i< l.length-t; i++) 
							{
								System.out.printf("\nId: %d \tTitle: %s \tAuthor: %s \tPrice: %d\n",l[i].getId(),l[i].getTitle(),l[i].getAuthor(),l[i].getPrice());
							}
						}
						else
						{
							System.out.println("Books Not found");
						}
			System.out.println("-----------------------------------------------------------------------");
						
					
					break;
				case 9:
			System.out.println("-----------------------------------------------------------------------");
				
						System.out.println("books name and price between range of 100r to 500r \n");
						for(int i=0;i<l.length-1;i++)
						{
							if(100<=l[i].getPrice()&&500>=l[i].getPrice())
							{
								System.out.println("\nBook Name: "+l[i].getTitle()+"\t Price: "+l[i].getPrice());
							}
						}
			System.out.println("-----------------------------------------------------------------------");
				
					break;
					
				default:
					return;
			}
			
		}while(true);
	}
}
class Library
{
    private int id;
    private String title;
    private String author;
    private int price;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
	
	