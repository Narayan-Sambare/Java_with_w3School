/*
1. Library Book Management
Task:
Create a Book class with fields: title, author, and price.
In the main method:
Create two individual Book objects.
Compare the prices of the two books and print the title of the more expensive book.
Explanation:
 This task teaches object instantiation and accessing instance variables directly to perform comparisons.
*/
import java.util.*;
public class BookManagement
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number of item");
		int n=sc.nextInt();
		sc.nextLine();
		Book bk[]=new Book[n];
		
		
		for(int i=0;i<bk.length	;i++)
		{
			bk[i] = new Book();
			System.out.println("Enter the title of "+(i+1)+" book");
			String t=sc.nextLine();
			bk[i].setTitle(t);
			
			System.out.println("Enter the author of "+(i+1)+" book");
			String a=sc.nextLine();
			bk[i].setAuthor(a);
			
			System.out.println("Enter the price of "+(i+1)+" book");
			int p=sc.nextInt();
			bk[i].setPrice(p);
			sc.nextLine();
		}
		
		
	
		
		
	
		int ex=0;
		for(int i=0;i<bk.length-1;i++)
		{
			if(bk[i].getPrice()>bk[i+1].getPrice())
			{
				ex=i;
			}
			else
			{
				ex=i+1;
			}
		}
		System.out.println("Expensive book is : "+bk[ex].getTitle());
	
	
}
}

class Book
{
	private String title;
	private String author;
	private int price;
	
	public void setTitle(String title)
	{
	this.title=title;
	}
	public String getTitle()
	{ return title;
	}
	public void setAuthor(String author)
	{
	this.author=author;
	}
	public String getAuthor()
	{
	return author;
	}
	public void setPrice(int price)
	{
	this.price=price;
	}
	public int getPrice()
	{
	return price;
	}
	
}
