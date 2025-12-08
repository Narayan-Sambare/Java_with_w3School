public class ReplaceWithFact
{
    public static int fact(int n)
    {
       int f=n;
        for(int i=1;i<n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String x[])
    {
        int a[]={3,4,5};
       
        for(int i=0 ; i<a.length ; i++)
		{
            System.out.println(a[i]+" ");
        }
        /*
        System.out.println("----------------------------");
        for(int i=0;i<a.length;i++)
        {
            int f=a[i];
           for(int j=1;j<a[i];j++)
           {
            f=f*j;
           }
           a[i]=f;
        }
        System.out.println("----------------------------");
        */
        for(int i=0 ; i<a.length ; i++)
		{
            System.out.print(fact(a[i])+" ");
        }
    }
}