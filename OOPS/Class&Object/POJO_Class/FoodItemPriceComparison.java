/*
6. Food Item Price Comparison
Task:
Create a FoodItem class with fields: name and price.
In the main method:
Create two FoodItem objects.
Compare their prices and print the name of the cheaper food item.
Explanation:
This helps understand comparison logic with custom objects.
 */
 import java.util.*;
 public class FoodItemPriceComparison
 {
	 public static void main(SAAJMetaFactorytring x[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the item number");
		 int count=sc.nextInt();
		 sc.nextLine();
		FoodItem fi[]=new FoodItem[count];
		int cheaper=0;
		for(int i=0;i<fi.length;i++)
		{
			fi[i]=new FoodItem();
			System.out.println("Enter the name of food Item :");
			fi[i].setName(sc.next());
			System.out.println("Enter the price ");
			fi[i].setPrice(sc.nextInt());
			
			if(fi[i].getPrice()<fi[cheaper].getPrice())
			{
				cheaper=i;
			}
        }
		System.out.printf("cheaper food item:\n Name:%s\tPrice :%d",fi[cheaper].getName(),fi[cheaper].getPrice());
	 }
 }
 
 class FoodItem
 {
	 private String name;
	 private int price;
	 
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 public void setPrice(int price)
	 {
		 this.price=price;
	 }
	 public String getName(){ return name;} 
	 public int  getPrice(){ return price;}
	 
 }