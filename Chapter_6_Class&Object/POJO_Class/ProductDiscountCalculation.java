/*9. Product Discount Calculation
Task:
 Create a Product class with fields: name, price, and DiscountPersentage.
 In the main method:
Create a Product object.
Calculate the discounted price and print the result.
Explanation:
 This teaches applying percentages and using object fields.
 */
 import java.util.*;
 public class ProductDiscountCalculation
 {
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count");
		int count=sc.nextInt();
		Product p[]=new Product[count];
		System.out.println("Enter the name,price,DiscountPersentage");
		for(int i=0;i<p.length;i++)
		{
			p[i]=new Product();
			p[i].setName(sc.next());
			p[i].setPrice(sc.nextInt());
			p[i].setDisPer(sc.nextInt());	
		}
		
		for(int i=0;i<p.length;i++)
		{
			int discounted=p[i].getPrice()*p[i].getDisPer();
			System.out.printf("\n name : %s\t discounted price : %d\n ",p[i].getName(),p[i].getPrice()-discounted/100);	
		}
		
		
	}
 }
 
 class Product {
    private String name;
    private int price;
    private int DisPer;
	
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
	
    public int getDisPer() {
        return DisPer;
    }
    public void setDisPer(int DisPer) {
        this.DisPer = DisPer;
    }
}

