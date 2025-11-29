/*
1 2 3 4 5
  2 3 4 5
    3 4 5
      4 5
        5
 */

public class P5 {
    public static void main(String x[])
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i<=j)
                {
                    System.out.print(j);
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
