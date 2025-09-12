// Q1. WAP to create two matrix of 3 x3  and calculate addition of two matrix and store in third matrix

import java.util.*;
public class AdditionOf2Matrix
{   
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of matrix");
        int size=sc.nextInt();
        int a[][]=new int [3][3];
        int b[][]=new int [3][3];
        int c[][]=new int [3][3];

        // for 1st matrix
        System.out.println("enter the first matrix element");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        // for 2st matrix
        System.out.println("enter the first matrix element");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                 b[i][j]=sc.nextInt();
            }
        }

        System.out.println("Display 1st matrix");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Display 2st matrix");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(b[i][j]+" ");
            }
             System.out.println();
        }
        System.out.println("Sum of 2 matrix");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                
            }
        }
        System.out.println("Display 3st matrix");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(c[i][j]+" ");
            }
             System.out.println();
        }
    }
}