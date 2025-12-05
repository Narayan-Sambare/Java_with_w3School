import java.util.*;
public class missingNo {
    public static void main(String x[])
    {
        System.out.println("Enter the length of array");
        int n= new Scanner(System.in).nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=new Scanner(System.in).nextInt();
        }
        missNo m=new child1();
        System.out.println("repeating : "+m.repValue(a));
        System.out.println("Missing : "+m.missingValue(a));
    }
}
interface missNo {

    int missingValue(int a[]);
    int repValue(int a[]);
}
class child1 implements missNo{

    public int missingValue(int a[])
    {
        int s=0,f=Integer.MAX_VALUE,l=0;
        for(int i=0;i<a.length;i++)
        {
            s+=a[i];
           
        }
        int ts=(a.length*(a.length+1))/2;
        
        return ts-s+repValue(a);
    }

    public int repValue(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    return a[i];
                }   
            }
        }
        return 0;
    }
}