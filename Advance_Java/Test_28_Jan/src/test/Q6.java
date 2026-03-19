//Q6. Create class name as ArrayOperation with method name assetArray() and create its Two child
//classes name as CeilFloor, Matrix. We need to inherit the ArrayOperation classin CeilFloor, Matrix
//and create method. and write the logic.
//1. CeilFloor Class: -
//Expected Output :
//The given array is: 1 3 5 7 8 9
//Number: 0 ceiling is: 1 floor is: -1
//Number: 1 ceiling is: 1 floor is: 1
//Number: 2 ceiling is: 3 floor is: 1
//Number: 3 ceiling is: 3 floor is: 3
//Number: 4 ceiling is: 5 floor is: 3
//Number: 5 ceiling is: 5 floor is: 5
//Number: 6 ceiling is: 7 floor is: 5
//Number: 7 ceiling is: 7 floor is: 7
//Number: 8 ceiling is: 8 floor is: 8
//Number: 9 ceiling is: 9 floor is: 9
//Number: 10 ceiling is: -1 floor is: 9
//2. Matrix class:-
//Enter 9 elementsforthe 3x3 matrix:
//10 25 40
//50 15 20
//30 35 45
//Expected Output :
//Second max in column 1: 30
//Second max in column 2: 25
//Second max in column 3: 40
package test;

import java.util.*;

public class Q6 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	CeilFloor ao=new CeilFloor();
	ao.setArray();
	ao.CeilFloor();

	
	
//	Matrix m=new Matrix();
//	m.setArray();
//	m.display();
//	m.secMax();
	}

}
class ArrayOperation{
	
	void setArray()
	{
		
	}
}
class CeilFloor extends ArrayOperation{
	int a[];
	static Scanner sc=new Scanner(System.in);
	void setArray()
	{
		System.out.println("enter size of array");
		int n=sc.nextInt();
		System.out.println("Enter values in array");
		a=new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	void CeilFloor()
	{
		Arrays.sort(a);
		
		for(int k=0;k<11;k++ )
		{
			
				for(int i=0;i<a.length;i++)
				{
				if(k==a[i])
				{	
					System.out.println("Number: "+k+" ceiling is: "+k+" floor is: "+k);
					break;
				}
				else {
					System.out.print("Number :"+k);
					if(k+1==a[i+1])
					{
						System.out.print("ceiling is :"+a[i+1]);
					}
					else if(k>a[i-1])
					{
						System.out.print(" floor is : "+(-1));
					}
					else{
							System.out.print(" floor is : "+a[i-1]);
						}
					}
				System.out.println();
			}
			
		}
	}
}
	
class Matrix extends ArrayOperation
{
	static Scanner sc=new Scanner(System.in);
	int a[][];
	void display()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	void setArray()
	{
		System.out.println("enter size of array");
		int n=sc.nextInt();
		System.out.println("Enter value is array");
		a=new int [n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	
	}
	void secMax() {
		
		for(int i=0;i<a.length;i++)
		{
			int max=0;
			int secMax=0;
			for(int j=0;j<a.length;j++)
			{
				if(max<a[j][i])
				{
					secMax=max;
					max=a[j][i];
				}
					if(secMax<a[j][i]&&max>a[j][i])
					{
						secMax=a[j][i];
					}
				
			}
			System.out.println("Second max in column"+ (i+1)+" : "+secMax);
		}
		
	}
	
}
