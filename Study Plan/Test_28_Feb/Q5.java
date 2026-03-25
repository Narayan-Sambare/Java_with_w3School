package Test_28_Feb;

//Q5. Write a java program to store words in an ArrayList. Print words that start and end with the
//same character.
//Input: [level, cat, radar, java, madam]
//Output : level , radar , madam
//Description:
//Traverse each word and compare first and last character manually using charAt().

import java.util.*;
public class Q5 {
public static void main(String x[]) {
	
	Scanner sc=new Scanner(System.in);
	
	ArrayList <String> st= new ArrayList<String>();  
	
	ArrayList <String> revString= new ArrayList<String>();
	System.out.print("Enter size of array : ");
	int n=sc.nextInt();// user input size of array
	sc.nextLine();// remove space
	
	for(int i=0;i<n;i++){
		System.out.print("Enter "+(i+1)+" word : ");
		st.add(sc.nextLine()); // word input
	}
	

	for(String obj: st)
	{ 
		char first=obj.charAt(0); // catch first letter
		char last=obj.charAt(obj.length()-1); // catch last latter
		if(first==last) // compare  
		{
			System.out.print(obj+", "); 
		}
	}
	
}
}
	


