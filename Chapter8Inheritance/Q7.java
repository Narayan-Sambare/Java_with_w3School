/*
7. Question:
 Create a class Ticket with method calculatePrice().
MovieTicket has 18% GST.


BusTicket has 5% GST.
 Print ticket price including tax using overridden methods.


Explanation:
 Tests method overriding with percentage-based calculations.
*/
import java.util.*;
public class Q7
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Enter the Price of ticket");
		int ticket =sc.nextInt();
		
		MovieTicket mt=new MovieTicket(ticket);
		double price=mt.calculatePrice();
		System.out.println("ticket price including GST :"+price);
		
		BusTicket bt=new BusTicket(ticket);
		price=bt.calculatePrice();
		System.out.println("ticket price including GST :"+price);

		
		
	}
}
class Ticket
{
	double Ticket ;
	
	public double calculatePrice()
	{
		return Ticket;
	}
}
class MovieTicket extends Ticket
{
	MovieTicket(double Ticket)
	{
		this.Ticket=Ticket;
	}
	public double calculatePrice()
	{
		return Ticket+(Ticket*18)/100;
	}
}
class BusTicket extends Ticket
{
	BusTicket(double Ticket)
	{
		this.Ticket=Ticket;
	}
	public double calculatePrice()
	{
		return Ticket+(Ticket*5)/100;
	}
}


	