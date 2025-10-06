/*
 A B C D
 a b c
 A B
 a
 */

public class P7
{
    public static void main(String x[])
    {
        int n=4;
        for(int i=0;i<n;i++)
        {   char ch='A';
            for(int j=0;j<n;j++)
            {   
                if(i%2==0 && i<=j)
                { 
                    System.out.print(ch++);
                }
                else if(i%2!=0 && i<=j) 
                {
                    System.out.print((char)((int)ch+32));
                    ch++;
                }
                else{}
            }
            System.out.println();
        } 
    }
}
