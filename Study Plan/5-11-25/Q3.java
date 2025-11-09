//Q3. Write Program create class name as ArrSum with method void setValue(int arr[]) 
//you have to create child class name as GetSum with method int getArrSum() 
//you have to accept array values from ArrSum and calculate its sum and return it
import java.util.*;
public class Q3
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 elements of array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
       
       
        GetSum gs = new GetSum();
        gs.setValue(arr);
        System.out.println("Sum of array elements: " + gs.getArrSum());
    }
}
class Arrsum
{
    int a[] = new int[5];
    void setValue(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            a[i]=arr[i];
        }
    }
}
class GetSum extends Arrsum
{
    int sum=0;
    int getArrSum()
    {
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            
        }
        return sum;
    }
}