// Q2. WAP to create create matrix of 3 x 3 and sort the column data and display it

import java.util.*;
public class ColumnSort
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of matrix");
        int ms=sc.nextInt();
        int a[][]=new int [3][3];

        System.out.println("Enter the element in matrix");
        for(int i=0;i<ms;i++)
        {
            for(int j=0;j<ms;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Display the original matrix");
        for(int i=0;i<ms;i++)
        {
            for(int j=0;j<ms;j++)
            {
                System.out.print(a[i][j]+" ");
            } System.out.println();
        }
        
        for(int cl=0;cl<ms;cl++)
        {
            for(int i=0;i<ms-1;i++)
            {
                for(int j=i+1;j<ms;j++)
                {  
                     int tem=0;
                    if(a[i][cl]>a[j][cl])
                    {
                        tem=a[j][cl];
                        a[j][cl]=a[i][cl];
                        a[i][cl]=tem;
                    }
                }
            }
        }
                
                    
        System.out.println("Display the sort matrix");
        for(int i=0;i<ms;i++)
        {
            for(int j=0;j<ms;j++)
            {
               System.out.print(a[i][j]+" ");
            } System.out.println();
        }

    }
}