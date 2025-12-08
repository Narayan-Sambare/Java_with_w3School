/*
Q1. Create a system to calculate bills for different types of customers:
Requirements
Create an abstract class Customer with:
    name
    customerId
    abstract method: double calculateBill(int units)

Create an interface Discountable with:
    method: double applyDiscount(double bill)

Create three child classes:
    ResidentialCustomer
    CommercialCustomer
    IndustrialCustomer
Bill calculation logic:
    Residential → 5₹ per unit
    Commercial → 8₹ per unit
    Industrial → first 100 units → 10₹   above 100 → 12₹
Some customers get discount:
    Residential → 5%
    Commercial → 8%
    Industrial → no discount
Perform:
    Input customer type
    Input units
    Calculate bill
    Apply discount if applicable
    Show final bill
Explanation
This problem checks:
Abstract method overriding
Interface implementation
Conditional billing logic
Multiple child behavior
*/
import java.util.*;
public class Billing {
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Customer> c=new ArrayList<>();
        System.out.println("Enter number of customers");
        int n=sc.nextInt();sc.next();
        for(int i=0;i<n;i++)
        {
           
            System.out.println("Enter name of customers");
            String name=sc.nextLine();
            System.out.println("Enter id of customers");
            int id=sc.nextInt();
            System.out.println("Enter unit of customers");
            int unit=sc.nextInt();
            System.out.println("Enter type of customers\n1.Residental Customer\n2.Commercial Customer\n3.Industrial Customer");
            int ch=sc.nextInt();
            if(ch==1)
            {
                c.add(new ResidentialCustomer(name, id, unit));
            }
            else if(ch==2)
            {
                c.add(new CommercialCustomer(name, id, unit));
            }
            else if(ch==3)
            {
                c.add(new IndustrialCustomer(name, id, unit));
            }
            else{
                System.out.print("Invalid input\n\t User data was delete \n \tplease try again thank you !");
                i--;
            }
        }
        System.out.println("============Display Final bill============");
        for(Customer i:c)
        {
            double bill=i.calculateBill(i.unit)
        }
    }
}
abstract class Customer{
    String name;
    int customerId;
    Customer(String name,int id)
    {
         this.name=name;
        this.customerId=id;
    }
    abstract double calculateBill(int unit);
}
interface Discountable {
    double applyDiscount(double bill);    
}
class ResidentialCustomer extends Customer implements Discountable {
    int unit;
    ResidentialCustomer(String name,int id,int unit){
       super(name, id);
        this.unit=unit;
    }
    public double calculateBill(int unit){
        return unit*5;
    }
    public double applyDiscount(double bill){
        return bill-(bill*0.05f);
    }    
}
class CommercialCustomer extends Customer implements Discountable {
    int unit;
    CommercialCustomer(String name,int id,int unit){
        super(name, id);
        this.unit=unit;
    }
    public double calculateBill(int unit){
        return unit*8;
    }
    public double applyDiscount(double bill){
        return bill-(bill*0.08f);
    }    
}
class IndustrialCustomer extends Customer implements Discountable {
    int unit;
    IndustrialCustomer(String name,int id,int unit){
        super(name, id);
        this.unit=unit;
    }
    public double calculateBill(int unit){
        double bill;
        if(unit>100)
        {
            bill=100*10;
            unit-=100;
        }
        bill=unit*12;
        return bill;
        // if(unit<=100)
        // {
        //     return unit*10;
        // }else{
        //     return(100*10)+(unit-100)*12;
        // }
    }
    public double applyDiscount(double bill){
        return bill;
    }    
}