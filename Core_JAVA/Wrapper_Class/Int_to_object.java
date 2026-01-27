import java.util.*;
class Int_to_object{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		Integer a=n;
		System.out.println("Number : "+n);
		System.out.println(typeOf(a));
	}
}
