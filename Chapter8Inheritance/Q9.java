/*
9. Question:
 Create base class Product with fields id, name, and basePrice.
LuxuryProduct adds 20% tax.


EssentialProduct adds 5% tax.
 Write a program to print final price using polymorphism.


Explanation:
 Tests inheritance where logic changes depending on product type.
 */
  
import java.util.*;
public class Q9
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Enter product id");
		int id =sc.nextInt();sc.nextLine();
		System.out.println("Enter product name");
		String name =sc.nextLine();
		System.out.println("Enter product basePrice");
		int basePrice =sc.nextInt();
		
		
		
		LuxuryProduct lp=new LuxuryProduct(id,name,basePrice);
		double tax=lp.tax();
		lp.show();
		System.out.println("tax includ price : "+(tax+basePrice));
		
		EssentialProduct ep=new EssentialProduct(id,name,basePrice);
		tax=ep.tax();
		ep.show();
		System.out.println("tax includ price : "+(tax+basePrice));	
	}
}
class Product
{
	int id;
	String name;
	int basePrice;
	
	public double tax()
	{
		return basePrice;
	}
	void show()
	{
		System.out.print("product id :"+id);
		System.out.print("\tproduct name :"+name);
		System.out.println("\tproduct basePrice :"+basePrice);
	}
}
class LuxuryProduct extends Product
{
	LuxuryProduct(int id ,String name,int basePrice)
	{
		this.id=id;
		this.name=name;
		this.basePrice=basePrice;
	}
	public double tax()
	{	
		return (basePrice*20)/100;
	}
}
class EssentialProduct extends Product
{
	EssentialProduct(int id ,String name,int basePrice)
	{
		this.id=id;
		this.name=name;
		this.basePrice=basePrice;
	}
	public double tax()
	{	
		return (basePrice*5)/100;
	}
}


	