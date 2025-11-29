/*
 A B C D
 A B C
 A B
 A
 */

public class P6 
{
    public static void main(String x[])
    {
        int n=4;
        for(int i=0;i<n;i++)
        {   char ch='A';
            for(int j=0;j<n;j++)
            {   
                if(i<=j) System.out.print(ch++);
            }
            System.out.println();
        } 
    }
}
