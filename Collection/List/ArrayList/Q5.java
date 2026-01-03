/*
Q5. Take an integer array, store it in a Vector,
and determine the second largest number without sorting.
What you practice:
Max/second-max tracking
Using Vector get() method
Efficient single-pass logic
 */
import java.util.*;
public class Q5 {
    public static void main(String x[]){
        int a[]=new int[5];
        Vector v=new Vector();
        for(int i=0;i<a.length;i++)
        {   System.out.println((i+1)+" value");
            a[i]=new Scanner(System.in).nextInt();
        }
        for(int i:a)
        {
            v.add(i);
        }
        int max=0;
        int smax=0;
       for(Object i: v)
       {
            if((int)i<max && (int)i>smax)
            {
                 smax=(int)i;
            }
            if((int)i>max)
            {   smax=max;
                max=(int)i;
            }
           
       }
       System.out.println("max is "+max+" and second max is "+smax);
    }
}
