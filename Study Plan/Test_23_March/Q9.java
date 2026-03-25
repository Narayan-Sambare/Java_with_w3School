//Q9. Write a Java program to find all anagram pairs.
//Description: Find anagram pairs from list.
//Input: Enter words: cat tac act dog god
//Output:
//cat tac
//cat act
//tac act
//dog god

package Test_23_March;

import java.util.*;

public class Q9 {

	public static void main(String[] args) {
		
		ArrayList <String> st= new ArrayList<String>(); //String collection 
		
		HashMap <String,Integer> revString= new HashMap<String,Integer>(); 
		
//		System.out.print("Enter size of array");
//		int n=sc.nextInt();  // size stored
//		sc.nextLine();		// remove space
//		// user input
//		for(int i=0;i<n;i++){
//			System.out.print("Enter "+(i+1)+" word");
//			st.add(sc.nextLine());
//		}
		   
		  st.add("cat");
		  st.add("tac");
		  st.add("act");
		  st.add("running");
		  st.add("dog");
		  st.add("god");

		  String f,sec;
		for(int i=0;i<st.size();i++)
		{
			f=st.get(i);
//			System.out.print(st.get(i)+" ");
			
			for(int j=i+1;j<st.size();j++)
			{
				boolean flag =false; //for final check anagram or not
				sec=st.get(j);

				if(f.length()==sec.length()) // check size of both word 
				{
					
					for(int p=0; p<f.length(); p++)
					{
						char fl=f.charAt(p); //get first letter in first word 
						for(int q=0;q<sec.length();q++)
						{
							if(fl==sec.charAt(q))// compare first letter of first word with each letter of sec word
							{
								flag=true;
								break;
							}
						}	
					}
					
					if(flag) // true means its anagram print both words 
					{
						System.out.println(f+" "+sec);
					}
				}
			}
		}
		

	}

}
