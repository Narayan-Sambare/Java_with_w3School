/*
Q5. Problem  
Write a java to Create class name as Food with using data memberfid,fname,fprice, fcategory using do while and switch case.
create array of object of size 5 ,store the food details in it and perform following operations.
	
	1 : Add All Food details.
	2 : Display All Food details.
	3 : Display Bill Details :
		1 :  Bill Without Gst.
		2 : Bill With 18% Gst.
*/
import java.util.*;
public class  hotel
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the food count");
		int count=sc.nextInt();			
		Food f[] = new Food[count];	
		do{
			System.out.println("\n1.Add all Food details:\n2.Display all food details:\n3.Display bill details:\n4.Exit\n");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					
					for (int i = 0; i< f.length; i++) 
					{
						f[i] = new Food();
						System.out.println("\nEnter details of "+(i+1)+" Food " );

						System.out.print("Food ID: ");
						f[i].setFid(sc.nextInt());

						System.out.print("Food Name: ");
						f[i].setFname(sc.next());

						System.out.print("Food Price:");
						f[i].setFprice(sc.nextDouble());

						System.out.print("Food Catagery: ");
						f[i].setFcategory(sc.next());
					}
					break;
				case 2:
				if(f[0]==null)
				{
					System.out.print("\nAdd food first.. !\n---------------------------Thank you--------------\n");

					break;
				}
				System.out.println("---------------------------------Food Detail------------------------------\n");
					for (int i = 0; i < f.length; i++) 
					{
						System.out.printf("\nId: %d \t Food Name: %s \t Food Price: %f \t Food Catagery: %s \n",f[i].getFid(),f[i].getFname(),f[i].getFprice(),f[i].getFcategory());
					}
					break;
				case 3:
					if(f[0]==null)
					{
						System.out.print("\nAdd food first.. !\n---------------------------Thank you--------------\n");
						break;
					}
					System.out.print("\t\t1.Bill Without Gst\n\t\t2.Bill With 18% Gst\n\t\t3.Exit\n");
					int ch1=sc.nextInt();
					switch(ch1)
					{	
						case 1:
						System.out.println("------------------------------------Bill without GST------------------------------\n");
						double total=0;
						for (int i = 0; i < f.length; i++) 
						{
							total+=f[i].getFprice();
							System.out.printf("\nId: %d\tFood Name: %s\tFood Price: %f\tFood Catagery: %s \n",f[i].getFid(),f[i].getFname(),f[i].getFprice(),f[i].getFcategory());
						}
						System.out.printf("-------------------------------------------------------------------------------\n");
						System.out.printf("\t\t\t\t\t\t\tTatal bill:%f \n",total);
						System.out.printf("------------------------------------------------------------------------------\n\n");
						
						System.out.printf("--------------------------------------------Thank you --------------------------------\n\n");
						
							break;
						case 2:
						System.out.println("------------------------------------Bill with GST------------------------------\n");

						 double totalgst=0;
						for (int i = 0; i < f.length; i++) 
						{
							totalgst+=f[i].getFprice();
							System.out.printf("\nId: %d\tFood Name: %s\tFood Price: %f\tFood Catagery: %s \n",f[i].getFid(),f[i].getFname(),f[i].getFprice(),f[i].getFcategory());
						}
						totalgst=totalgst+(totalgst*18)/100;
						System.out.printf("-----------------------------------------------------------------------------------------------\n");
						
						System.out.printf("\t\t\t\t\tTatal bill with 18 Persent GST :%f \n",totalgst);
						System.out.printf("----------------------------------------------------------------------------------------------\n");
						
						System.out.printf("--------------------------------------------Thank you ---------------------------------------\n\n");
						
							break;z
									
						default:
							return;
					}
					break;
					
				default:
					return;
			}
		}while(true);
		
	}
}
	
class Food
{
	private int fid;
	private String fname;
	private double fprice;
	private String fcategory;

	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}

	public double getFprice() {
		return fprice;
	}
	public void setFprice(double fprice) {
		this.fprice = fprice;
	}

	public String getFcategory() {
		return fcategory;
	}
	public void setFcategory(String fcategory) {
		this.fcategory = fcategory;
	}	
}
