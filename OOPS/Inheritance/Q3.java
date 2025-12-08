/*
3. Question:
 Create a base class Product with fields id, name, and price. Create subclasses Electronics (10% discount) and Clothing (20% discount).
 Write a program to calculate and print final prices after applying discounts.
Explanation:
 This tests constructor chaining and method overriding for price calculation.

 */
public class Q3 {
    public static void main(String x[])
    {
        Electronics e=new Electronics(1,"tv",200);
		double price=e.calculateFinalPrice();
        
        System.out.println("Final price of electronics :"+price);
		
		Clothing c=new Clothing(2,"joger",400);
		 price=c.calculateFinalPrice();
            System.out.println("Final price of clothing :"+price);
		
    }
}
class Product{
    int id ;
    String name;
    double price;

    Product(int id, String name ,double price)
    {
        this.id=id;
        this.name=name;
        this.price=price;
    }
    double calculateFinalPrice()
    {
        return price;
    }

}
class Electronics extends Product
{
    Electronics(int id ,String name, double price)
    {
        super(id, name, price);
    }
	double calculateFinalPrice()
	{
		return price-=(price*0.10);
	}
}
class Clothing extends Product
{
    Clothing(int id ,String name, double price)
    {
        super(id, name, price);
    }
	double calculateFinalPrice()
	{
		return price-=(price*0.20);
	}
}
