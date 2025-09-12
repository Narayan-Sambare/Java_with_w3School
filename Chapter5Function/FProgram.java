import java.util.*;
public class FProgram
	static Scanner sc=new Scanner(System.in);
{   public static void main(String x[])
	{	
		do
		{ 
			System.out.println("1.calculator for 2 number");
			System.out.println("2.Calculator for 3 number");
			
			
			System.out.println("0.Exit");
			int ch=sc.nextInt();
			
			
		}while(true);
		
	}	//calculator------------------------------------------>
	public static void()
	{
		switch(ch)
			{
			case 1: 
				do{
					System.out.println("1.Addition of 2 number");
					System.out.println("2.Subtraction of 2 number");
					System.out.println("3.Multiplication of 2 number");
					System.out.println("4.Division of 2 number");
					System.out.println("5.Modulo of 2 number");
				
				
					System.out.println("02.Exit");
					int c2=sc.nextInt();
					switch(c2)
					{
						case 1:
							System.out.println("Addition-->"+Add());
							break;
						case 2:
							System.out.println("Subtraction-->"+Sub());
							break;
						case 3:
							System.out.println("Multiplication-->"+Mul());
							break;
						case 4:
							System.out.println("Division-->"+Div());
							break;
						case 5:
							System.out.println("Modulo-->"+Mod());
							break;
						case 02:
							return;
					}	
				}while(true);
			break;
			
				
			case 2: 
				do{
					System.out.println("1.Addition of 3 number");
					System.out.println("2.Subtraction of 3 number");
					System.out.println("3.Multiplication of 3 number");
					System.out.println("4.Division of 3 number");
					System.out.println("5.Modulo of 3 number");
				
				
					System.out.println("01.Exit");
					int c3=sc.nextInt();
					switch(c3)
					{
						case 1:
							System.out.println("Addition-->"+Add());
							break;
						case 2:
							System.out.println("Subtraction-->"+Sub());
							break;
						case 3:
							System.out.println("Multiplication-->"+Mul());
							break;
						case 4:
							System.out.println("Division-->"+Div());
							break;
						case 5:
							System.out.println("Modulo-->"+Mod());
							break;
						case 01:
							return;
					}	
				}while(true);
					break;
			case 0:
				return;
			}
	}
		public static int Add()
		{	
			System.out.println("Enter the 1st Value");
			int a=sc.nextInt();
			System.out.println("Enter the 2st Value");
			int b=sc.nextInt();
			return (a+b);
			
		}
		public static int Sub()
		{	
			System.out.println("Enter the 1st Value");
			int a=sc.nextInt();
			System.out.println("Enter the 2st Value");
			int b=sc.nextInt();
			return (a-b);
			
		}
		public static int Mul()
		{	
			System.out.println("Enter the 1st Value");
			int a=sc.nextInt();
			System.out.println("Enter the 2st Value");
			int b=sc.nextInt();
			return (a*b);
		}
		public static int Div()
		{	
			System.out.println("Enter the 1st Value");
			int a=sc.nextInt();
			System.out.println("Enter the 2st Value");
			int b=sc.nextInt();
			return (a/b);
		}
		public static int Mod()
		{	
			System.out.println("Enter the 1st Value");
			int a=sc.nextInt();
			System.out.println("Enter the 2st Value");
			int b=sc.nextInt();
			return (a%b);
		}
}
		
