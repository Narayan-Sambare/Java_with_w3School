/*
6. Question:
 Create a base class Order with fields orderId and amount.
Subclass CODOrder adds a fixed delivery charge of ₹50.

Subclass OnlinePaymentOrder adds no delivery charge but gives 5% cashback.
 Write a program to calculate the final bill amount using overridden methods.

Explanation:
 Tests overriding with additional logic and conditional calculations in subclasses.
*/
public class Q6
{
	public static void  main(String x[])
	{
		CODOrder cp=new CODOrder(1,120);
		
		double finalBill=cp.bill();
		System.out.println("Order ID : "+cp.getOrderId());
		System.out.println("Original Price : "+cp.getAmount());
		System.out.println("Final price : "+finalBill);
		
		OnlinePaymentOrder op=new OnlinePaymentOrder(3,120);
		
		finalBill=op.bill();
		System.out.println("Order ID : "+op.getOrderId());
		System.out.println("Original Price : "+op.getAmount());
		System.out.println("Final price : "+finalBill);
	}
}
class Order
{
	protected int orderId;
	protected int amount;
	
	Order(int orderId, int amount)
	{
		this.orderId=orderId;
		this.amount=amount;
	}
	 public int getOrderId()
	 {
		 return orderId;
	 } 
	 public int getAmount()
	 {
		 return amount;
	 }
	 
	double bill()
	{
		return amount;
	}
	
}

 
 class CODOrder extends Order
 {
	CODOrder(int orderId, int amount)
	{
		super(orderId,amount);
	}
	double bill()
	{
		return amount+50;
	}
	
 }
 
 class OnlinePaymentOrder extends Order
 {
	OnlinePaymentOrder(int orderId, int amount)
	{
		super(orderId,amount);
	}
	double bill()
	{
		return amount - (amount*5)/100;
	}
 }