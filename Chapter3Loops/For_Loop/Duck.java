package For_Loop;
//WJP to find duck number 1 to nth

import java.util.*;
public class Duck{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        boolean f=false;
        for(int i=0;i<=n;i++)
        {
            int a = n % 10;
                 n= n/10;
            if(a==0)
            {
                f=true; 
            }
                 
                if(f==true)
                {
                     System.out.println("Duck number");
                      break;
                }            
                else
                {
                     System.out.println("not duck");  
                }
            
            
        
    }
}