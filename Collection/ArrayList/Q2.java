/*
Q2. Create two ArrayLists containing integers.
 Merge them into a new ArrayList but avoid adding repeated numbers.
What you practice:
Merging lists
Checking for duplicates (contains)
Building logical flow to avoid sets
*/
import java.util.*;
public class Q2 {
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList arr1=new ArrayList<>();
        ArrayList arr2=new ArrayList<>();
        ArrayList arr3=new ArrayList<>();
        
        System.out.println("Enter value for 1 arrayList==========\n");
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter "+(i+1)+" value for arrayList");
            arr1.add(sc.nextInt());
        }

        System.out.println("Enter value for 2 arrayList============\n");
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter "+(i+1)+" value for arrayList");
            arr2.add(sc.nextInt());
        }

        System.out.println("merge arrayList");
        Iterator lt=arr1.iterator();

        while(lt.hasNext())
        {
            int n=(int)lt.next();
           boolean yes= check(arr3, n);
           if(!yes) arr3.add(n);
        }
        lt=arr2.iterator();
        while(lt.hasNext())
        {
            int n=(int)lt.next();
            boolean yes= check(arr3, n);
            if(!yes) arr3.add(n);
        }
        System.out.println(arr3);
    }
    public static boolean check(ArrayList i,int n)
    {   
        
        Iterator lt=i.iterator();
        while (lt.hasNext())
        {
            if((int)lt.next()==n)
            {
                return true;
            }
        }
        return false;

    }
}