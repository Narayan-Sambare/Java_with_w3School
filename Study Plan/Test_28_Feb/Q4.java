package Test_28_Feb;

//Q4. Store N strings in an ArrayList. Reverse each string manually and store in another Arraylist.
//Input: 3
//java
//code
//list
//Output : Reversed List: avaj edoc tsil
//Description:
//Traverse each string character by character in reverse order. Do not use StringBuilder reverse()
//or inbuilt reverse methods.

import java.util.*;
public class Q4 {
public static void main(String x[]) {
	
	Scanner sc=new Scanner(System.in);
	
	ArrayList <String> st= new ArrayList<String>(); //String collection 
	
	ArrayList <String> revString= new ArrayList<String>(); // reverse string collection
	System.out.print("Enter size of array : ");
	int n=sc.nextInt();  // size stored
	sc.nextLine();		// remove space
	
	
	// user input
	for(int i=0;i<n;i++){
		System.out.print("Enter "+(i+1)+" word : ");
		st.add(sc.nextLine());
	}
	
	String word=""; // strore each word
	for(String obj: st)
	{
		for(int i=obj.length()-1;i>=0;i--)// revers the word
		{
			char temp=obj.charAt(i);		
			word=word+temp;
		}
		revString.add(word);// add reverse word inside the main string
		word=""; // reinitialise word
	}
	System.out.print("Reversed List: ");
	for(String obj: revString)
	{
		System.out.print(obj+" ");
	}
}


	
}
