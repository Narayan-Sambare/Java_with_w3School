/*
Q4. Problem:
 Create a class Product with fields id, name, and price.
 Implement:
1.A parameterized constructor to initialize product details.
2.A copy constructor to copy data from another object.
 Display both objects to confirm the copy works.
Hint:
 Use Product(Product p) to copy fields.
Explanation:
 This question checks understanding of how to duplicate object data using a copy constructor.
*/

class Product
{
    int id;
    String name;
    double price;
    Product(int id, String name, double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    Product(Product p)
    {
        this.id=p.id;
        this.name=p.name;
        this.price=p.price;
        
        // Product p1=p;
        // System.out.println("Details of Object p");
        // System.out.println("id ("+p.id+")\nName ("+p.name+")\nPrice ("+p.price+")");
        // System.out.println("====================\nDetails of Object p1");
        // System.out.println("id ("+p1.id+")\nName ("+p1.name+")\nPrice ("+p1.price+")");
    }
    void display()
    {
        System.out.println("id ("+id+")\nName ("+name+")\nPrice ("+price+")");
    }

}
public class Q4{
    public static void main(String x[])
    {
        Product p=new Product(1,"T.V",24500);
        Product p1=new Product(p);  
        System.out.println("Original Product:");
        p.display();
        System.out.println("Copied Product:");
        p1.display();      
    }
}