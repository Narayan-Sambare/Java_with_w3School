import java.util.*;
public class MaxValue{
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5,12};
        int max=0;
        int k=2;
        int mi=0;
        for(int j=0;j<k;j++)
        {
            max=0;
            for(int i=0;i<a.length;i++)
            {
                if(a[i]>max)
                {
                    max=a[i];
                    mi=i;
                }
            }
               a[mi]=0; 
        }
        System.out.println(max);
    }
}