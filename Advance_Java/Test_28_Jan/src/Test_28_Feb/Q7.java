package Test_28_Feb;

//Q7.Write a java program to store N integers in a HashMap. Find all Armstrong numbers.
//Input:
//6
//153 10 370 89 407 25
//Output:
//Armstrong Numbers: 153 370 407
//Description:
//Store the given integers in a HashMap where the key is the index and the value is the number.
//Traverse the Map values one by one.
//For each number:
//• Extract digits manually using % 10 and / 10.
//• Do not use Math.pow().

import java.util.*;
public class Q7 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		Map <Integer,Boolean> st= new HashMap<Integer,Boolean>();// create hashmap
		
		System.out.print("Enter size of HashMap : ");
		int n=sc.nextInt(); //catch size of hashmap from use
		
		for(int i=0;i<n;i++){
			System.out.print("Enter "+(i+1)+" element : ");
			st.put(sc.nextInt(),false); //  keys and values 
		}
		for(Map.Entry<Integer,Boolean> obj:st.entrySet())
		{
			int val=(int)obj.getKey(); //convert object to int
			int t=val;
			int count=0;
			int sum=0;
			while(t>0) //calculate  digit 
			{
				count++;
				t/=10;
			}
			
			t=val;
			while(t>0) 
			{	int fact=1;
				int temp=t%10;
				for(int i=0;i<count;i++) // calculate factor
				{
					fact*=temp;
				}
				t/=10;
				sum+=fact;// sum of factor 
			}
			if(sum==val) // check and mark as true
			{
				st.put(val,true);
			}
			
		}
		
		// print only Armstrong number
		System.out.print("Armstrong Numbers : ");
		for(Map.Entry<Integer,Boolean> obj:st.entrySet())
		{
			if(obj.getValue()==true)
			{
				System.out.print(obj.getKey()+" ");
			}
		}
		
		
	}

}
