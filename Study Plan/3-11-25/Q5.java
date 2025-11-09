// 5.Right Rotate an Array by 1 or K Positions
// Concept: Shift elements to the right and bring the last to front.
//  Use Case: Buffer manipulation.
// Input: arr = [10, 20, 30, 40, 50]
// Right rotated array by 2 positions: [40, 50, 10, 20, 30]
public class Q5 
{
    public static void main(String x[]) 
    {
        int a[] = {10, 20, 30, 40, 50};
        int k = 2; // Number of positions to rotate
        if(k==0 || k>=a.length)
        {
            System.out.print("Invalid rotation count");
            return;
        }
        rightRotateArray(a, k);
        System.out.print("Right rotated array by " + k + " positions: ");
        for (int i=0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void rightRotateArray(int a[], int k)
    {
       
        
        for (int i = 0; i < k; i++)
        {
            int last = a[a.length - 1];
            for (int j = a.length - 1; j > 0; j--)
            {
                a[j] = a[j - 1];
            }
            a[0] = last;
        }
    }
}