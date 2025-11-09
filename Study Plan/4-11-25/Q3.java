// Write program to create class name as FindMax with two functions
//        void setArray(int a[]): this function is used for accept array as parameter
//        int getMax(): this function can find the max value from array and return it.

public class Q3 {
    public static void main(String x[]) 
    {
        FindMax findMax = new FindMax();
        int[] arr = {3, 5, 7, 2, 8};
        findMax.setArray(arr);
        System.out.println("Maximum value: " + findMax.getMax());
    }
}
class FindMax 
{
    private int array[] ;

    void setArray(int a[]) 
    {
        this.array = a;
    }

    int getMax() 
    {
        int max = 0;
        for (int num : array)
        {
            if (num > max) 
            {
                max = num;
            }
        }
        return max;
    }
}