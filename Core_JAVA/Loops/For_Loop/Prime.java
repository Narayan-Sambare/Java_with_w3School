package For_Loop;
// WJP to find prime number 1 to nth

import java.util.*;
public class Prime{

public static void main(String x[]){

Scanner sc=new Scanner(System.in);

System.out.println("enter the number");
int n =sc.nextInt();

for(int i=1;i<=n;i++)
{
         
    if(n%i==0 && i%i==0)
     {
         System.out.println(i);
     }
    
}
}
}