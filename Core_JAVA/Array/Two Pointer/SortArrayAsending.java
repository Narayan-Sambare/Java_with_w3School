public class SortArrayAsending {
    public static void main(String[] args) {
        
        int a[]={1,9,3,4,5};
        int i=0;
        int j=i+1;
        while(i<a.length-1)
        {
            if(a[i]>a[j])
            {
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
            j++;
            if(j==a.length)
            {
                i++;
                j=i+1;
            }
        }
        for(i=0;i<a.length;i++)
        {
            System.err.println(a[i]);
        }
    }
}
