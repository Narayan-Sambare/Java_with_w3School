/*
Q15.Find Intersection of Two Arrays
Class: ArrayIntersection
Functions:
void inputArrays(int arr1[], int arr2[])
void findIntersection()
Logic:
Compare elements of arr1 with arr2.
If common element found, print it (but avoid duplicates).
*/
import java.util.*;
public class ArrayIntersection{
	static Scanner sc=new Scanner(System.in);
	int a11[];
	int a22[];
	public static void main(String x[]){
		ArrayIntersection s=new ArrayIntersection();
		s.inputArray();	
		s.findIntersection();		
	}
	void inputArray(){
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int a1[]=new int [n];
		int a2[]=new int [n];
		System.out.println("enter the elemnt in 1st array");
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("enter the elemnt in 2nd array");
		for(int i=0;i<a2.length;i++)
		{
			a2[i]=sc.nextInt();
		}
		a11=a1;
		a22=a2;
		
	}
	void findIntersection(){
		
		int tem=0;
		for(int i=0;i<a11.length;i++)
		{	for(int j=0;j<a22.length;j++)
			{	if(a11[i]==a22[j])
				{
					boolean alreadyPrinted = false;
					for (int k = 0; k < i; k++) {
                        if (a11[i] == a11[k]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }
					if (!alreadyPrinted) {
                        System.out.print(a11[i] + " ");
                    }
                    break;
					
				}
			}
		}
	}

}
