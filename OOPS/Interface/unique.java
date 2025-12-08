// public class unique {
//     static int uniq[]=new int[10];
//     static int k=0;
//     public static void main(String[] x) {
//         int a[]={1,2,3,5,1,5,20,2,12,10};
//         isUnique(a);
//         for(int i=0;i<k;i++)
//         {
//             System.out.print(uniq[i]+" ");
//         }
//     }
//     public static void isUnique(int []a)
//     {   
//         for(int i=0;i<a.length;i++)
//         {
//            int c=0;
//            for(int j=0;j<a.length;j++)
//            {
//             if(a[i]==a[j])
//             {
//                 c++;
//             }
//            }
//            if(c==1)
//            {
//             uniq[k++]=a[i];
//            }
//         }
//     }
// }

public class unique 
{
    public static void main(String[] x) 
    {
        int a[] = { 1, 2, 3, 5, 1, 5, 20, 2, 12, 10 };
        UniqueFinder c = new child();
        int[] uniq = c.findUnique(a);
        System.out.print("Unique values in array : ");
        for(int v : uniq)
        {
            System.out.print(v + " ");
        }
    }
}

interface UniqueFinder 
{
    int[] findUnique(int[] a);
}

class child implements UniqueFinder 
{
    public int[] findUnique(int[] a) 
    {
        int temp[] = new int[a.length];
        int k = 0;
        for(int i = 0; i < a.length; i++) 
        {
            int c = 0;
            for(int j = 0; j < a.length; j++) 
            {
                if(a[i] == a[j])
                {  
                    c++;
                }
            }
            if(c == 1)
            {    
                temp[k++] = (a[i]);
            }
        }
        int uniq[] = new int[k];
        for(int i = 0; i < k; i++)
        {
            uniq[i] = temp[i];
        }
        return uniq;
    }
}