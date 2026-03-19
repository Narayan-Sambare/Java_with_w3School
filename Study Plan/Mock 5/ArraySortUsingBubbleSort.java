public class ArraySortUsingBubbleSort {
    public static void main(String[] args) {
        int a[]=new int[]{1,8,6,2,3,7};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i:a)System.out.println(i);
    }
}
