/*
Q3. E-Commerce Order Billing – Abstract Billing Class
Abstract class: Order
    Fields: id, price
Method:
    abstract double finalPrice()
Child classes:
ElectronicsOrder
    GST = 18%
    If price > 50,000 → add luxury tax = 5%
GroceryOrder
    GST = 5%
    If member = true → 3% discount
FashionOrder
    GST = 12%
    If price > 5,000 → discount = 10%
Task:
Create 9 orders.
Calculate final price of each.
Print: total bill order with minimum final price
Explanation:
Uses :
Abstract class with only one abstract method
Complex logical conditions inside child implementations
Summation and min-value detection
*/
import java.util.*;
public class E_Commerce_Order_Billing{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the count");
        int n=sc.nextInt();
        Order od[]=new Order[n];
        for(int i=0;i<od.length;i++)
        {

            System.out.println("Enter id");
            int id=sc.nextInt();
            System.out.println("Enter price");
            double price=sc.nextDouble();
            System.out.println("\t1.Electronics Order\n\t2.Grocery Order\n\t3.FAshion Order");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    od[i]=new ElectronicsOrder(id,price);
                    break;
                case 2:
                    System.out.println(" Member Status (yes : 1 / NO : AnyKey )");
                    int mem=sc.nextInt();
                    boolean member;
                    if(mem==1)
                    {
                        member=true;
                    }
                    else{
                        member=false;
                    }
                    od[i]=new GroceryOrder(id,price,member);
                    break;
                case 3:
                    od[i]=new FashionOrder(id,price);
                    break;
            }
        }
        System.out.println("=============== Final price of each ===============\n");
        double bill=0;
        Order mini=od[0];
        for(Order i: od)
        {
            double result = i.finalPrice();
            bill+=result;
            System.out.println("ID : "+i.id+" \tprice : "+i.price+" \tFinal price : "+result);
            if(mini.finalPrice()>result)
            {
                mini=i;
            }
        }
        
        System.out.println("\n=====Total bill : "+bill);     
        System.out.println("\nID : "+mini.id+" \t price : "+mini.price+" \t Final price : "+mini.finalPrice());
        
    }
}
abstract class Order{
    int id;
    double price;
    Order(int id, double price)
    {
        this.id=id;
        this.price=price;
    }
    abstract double finalPrice();
}
class ElectronicsOrder extends Order{
    ElectronicsOrder(int id,double price){
        super(id,price);
    }
    public double finalPrice(){
        float gst=(float)price*0.18f;
        float lxt=0.05f;
        double finalPrice=price+gst;
        if(price>50000)
        { 
            finalPrice+=price*lxt;
            return finalPrice;
        }
        return (float)finalPrice;
    }
}

class GroceryOrder extends Order{
    boolean member;
    GroceryOrder(int id,double price,boolean member){
        super(id,price);
        this.member=member;
    }
    public double finalPrice(){
        float gst=(float)price*0.05f;
        float discount=0.03f;
        double finalPrice=price+gst;
        if(member)
        { 
            finalPrice-=price*discount;
            return finalPrice;
        }
        return (float)finalPrice;
    }
}
class FashionOrder extends Order{

    FashionOrder(int id,double price){
        super(id,price);
    }
    public double finalPrice(){
        float gst=(float)price*0.12f;
        float discount=0.10f;
        double finalPrice=price+gst;
        if(price>5000) 
        {
            finalPrice-=price*discount;
            return finalPrice;
        }
        return (float)finalPrice;
    }
}