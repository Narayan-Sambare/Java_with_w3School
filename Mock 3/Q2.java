//Q2. Write a java program to find the frequency of each digit in a given integer.
import java.util.*;
public class Q2
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int digit=sc.nextInt();//1523122222
    
        findFrq(digit);  
    }
    public static void findFrq(int digit)
    {
        for(int i=0;i<10;i++)
        {   
            int t=digit;
            int df=0;
            while(t>0)
            {  
                if(i==t%10)
                {
                    df++;
                }    
                t/=10;           
            }
            if(df!=0){ System.out.println(i+" = "+df); } 
        }
    }
}
