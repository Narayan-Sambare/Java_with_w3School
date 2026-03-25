//Q10. Write a Java program that reads a sentence from the user and counts the frequency of each
//word using a HashMap.
//The program should:
//• Accept a sentence as input.
//• Split the sentence into words.
//• Use a HashMap to count how many times each word appears.
//• Display each word and its frequency.
//Input : Java is easy and Java is powerful
//Output : Word Frequencies: Java: 2 is: 2 easy: 1 and: 1 powerful: 1
package test;

import java.util.*;
import java.util.Map.Entry;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Object,Integer> set=new HashMap();
//		System.out.println("Enter the sentence");
//		String s=sc.nextLine();
		String s="Java is easy and Java is powerful";
		char c;
		String word="";
		
		for(int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			
			word=word+c;
			if(s.charAt(i)==' '|| i == s.length()-1)
			{
				
				if(set.containsKey(word))
				{
					Integer t =set.get(word);
					set.put(word, ++t);
					word="";
				}
				else {
				set.put(word, 1);
				word="";
				}
			}
		}
		
		
	       Set<Entry<Object, Integer>> dis= set.entrySet();
	       for(Map.Entry i:dis)
	       {
	           System.out.println(i.getKey()+" : "+i.getValue());
	       }
		

	}

}
