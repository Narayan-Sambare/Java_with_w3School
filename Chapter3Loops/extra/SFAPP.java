import java.util.*;
public class SFAPP
{   public static void main(String x[])
	{ Scanner xyz  = new Scanner(System.in);
	   int no,p,temp,count=0;
	   System.out.println("Enter number from keyboard");
	   no=xyz.nextInt();
	   temp=no;
	   System.out.println("Before swap  "+no);
	   while(no!=0)
	   {
	     ++count;
		 no  = no /10;
	   }
	   no=temp;
	   p=(int)Math.pow(10,--count);	  //calcualte power 
	   no=( ( no%10 ) * p)+( ( (no%p) / 10)*10) + (no/p);                  
	   System.out.printf("AFter swap %d\n",no);
	}
}

