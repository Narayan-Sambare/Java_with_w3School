package Test_28_Feb;


//Q8. tore N words in a HashMap. Group all anagrams together without using sort().
//Input: 6
//listen , silent , cat , act , dog , god
//Output:
//Anagram Groups:
//listen silent
//cat act
//dog god
//Description:
//Store the given words in a HashMap.
//Do not use:
//• Arrays.sort()
//• Collections.sort()
//• Any built-in anagram checking methods
//Finally, traverse the Map and print groups containing more than one word.

import java.util.*;
public class Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList <String> st= new ArrayList<String>(); //String collection 
		
		Map <String,Integer> revString= new HashMap<String,Integer>(); 
		
		System.out.print("Enter size of array");
//		int n=sc.nextInt();  // size stored
//		sc.nextLine();		// remove space
//		// user input
//		for(int i=0;i<n;i++){
//			System.out.print("Enter "+(i+1)+" word");
//			st.add(sc.nextLine());
//		}
		   
		st.add("listen");
		  st.add("silent");
		  st.add("cat");
		  st.add("act");
		  st.add("dog");
		  st.add("god");
		  
		
		ArrayList f=new ArrayList();
		ArrayList sec=new ArrayList();
		for(int i=0;i<st.size()-1;i++)
		{
			f.add(st.get(i));
			boolean flag =false;
			for(int j=i+1;j<st.size();j++)
			{
				sec.add(st.get(j));
				
				if(f.size()==sec.size())
				{
					for(int k=0;k<f.size();k++)
					{
						if(!f.contains(sec.get(k) ) )
 						{
							flag=true;
						}
					}
					if(!flag)
					{
						System.out.print(f+ ""+sec);
					}
				}
			}
		}
		

	}

}
