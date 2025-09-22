// 16. Generate Multiplication Table
// Create a class MultiplicationTable with a method printTable to print the table of a given number.
// Explanation: Explains nested loops and formatted printing.


import java.util.*;
public class  MulTable
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        MultiplicationTable p=new MultiplicationTable();
        p.printTable(n);
        
    }
}
class MultiplicationTable
{
    void printTable(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }

}