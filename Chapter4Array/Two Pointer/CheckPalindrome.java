// Q2. Check Palindrome Using Two Pointers
// Check if a string is a palindrome using the two-pointer approach.


import java.util.*;
public class CheckPalindrome
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int a[]=new int[n];
		
        System.out.print("Enter "+n+" Array element\n");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
        boolean flag=false;
        int L=0,R=a.length-1;
		 while(L<a.length)
		 { 
			 if(a[L]==a[R])
			 {
				L++;
                R--;
                flag=true;				 
			 }
             else{
                flag=false;
                break;
             }    		
		 }
         if(flag)
         {
                System.out.print("Array is palindrom");
        }
        else{
                System.out.print("Array is not palindrom");
             }
        
    }
}