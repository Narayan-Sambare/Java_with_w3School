// Q5. Write program to create class name as MergeTwoArray with parameterized constructor
//       MergeTwoArray(int [],int []): this constructor accept two array as parameter
//       int [] getMergeArray(): this function merge two array in third array and return new merged    array

public class Q5 {
    public static void main(String x[]) {
        int a1[] = {1, 3, 5};
        int a2[] = {2, 4, 6};

        MergeTwoArray mergeArray = new MergeTwoArray(a1, a2);
        int result[] = mergeArray.getMergeArray();

        System.out.print("Merged Array: ");
        for (int i : result) 
        {
            System.out.print(i + " ");
        }
    }
}
class MergeTwoArray {
    private int[] mergedArray;

    MergeTwoArray(int[] arr1, int[] arr2) 
    {
        mergedArray = new int[arr1.length + arr2.length];
        int index = 0;
        for (int i=0; i<arr1.length; i++)
        {  
            mergedArray[index++]=arr1[i];   
        }
        for (int i=0; i<arr2.length; i++)
        {  
            mergedArray[index++]=arr2[i];   
        }
    }

    int[] getMergeArray() {
        return mergedArray;
    }
}
