import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5};
        int b[]=new int[]{4,5,11,22,33,55};
        int c[]=new int [a.length+b.length];
        int ai=0,bi=0;
        for(int i=0;i<c.length;i++)
        {
            if(a[ai]<=b[bi]&& ai<a.length-1)
            {
                c[i]=a[ai++];
            }
            else{
                c[i]=b[bi++];
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i:a) System.out.print(i+" ");
        for(int i:b) System.out.print(i+" ");
        for(int i:c) System.out.println(i+" ");
    }
}
