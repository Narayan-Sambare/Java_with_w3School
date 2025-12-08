/*
Q13. Remove Duplicate Elements from Array
Class: ArrayRemoveDuplicate
Functions:
void inputArray(int arr[])
int[] removeDuplicate()
Logic: Use nested loop, copy only unique elements to new array.
*/

import java.util.*;
public class ArrayRemoveDuplicate{
		
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String x[]){
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int [n];
		
		ArrayRemoveDuplicate s=new ArrayRemoveDuplicate();
		s.inputArray(arr);
		
		int na[]=s.removeDuplicate(arr);
		
		System.out.println("display new array");
		for(int i=0;i<na.length;i++)
		{
			System.out.print(na[i]+"");
		}

	}
	void inputArray(int arr[]){
		System.out.println("enter the elemnt in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	
	int[] removeDuplicate(int arr[]){//1 2 3 2 1
		int newSize=0;
		int temp[]=new int [arr.length];
		
		for(int i=0;i<arr.length;i++)
		{	boolean isDuplicate = false;
			// check if arr[i] already exists in temp
            for (int j = 0; j < newSize; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // if not duplicate, store it
            if (!isDuplicate) {
                temp[newSize] = arr[i];
                newSize++;
            }
        }

        // copy only unique elements to final array
        int result[] = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            result[i] = temp[i];
        }

        return result;
	}
	
	

}
