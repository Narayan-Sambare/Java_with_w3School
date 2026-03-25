//Q10.Write program to group words by their length using HashMap.
//Input:
//cat dog elephant tiger lion
//Output:
//3 → cat dog
//4 → lion
//5 → tiger
//8 → elephant


package Test_23_March;

import java.util.*;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> set= new HashMap();
//		System.out.println("Enter Size of Array :");
//		String s=sc.nextLine();
		String s="cat dog elephant tiger lion";
		
		String arr[]=s.split(" ");
		
		for(String i:arr)
		{
			int n=i.length();
			if(set.get(n) != null) // check data present or not 
			{
				String newStr=set.get(n);
				set.put(n, (newStr+" "+i));
			}else {
			set.put(n, i);   // for new time data add 
			}
		}
		
		
		for(Map.Entry<Integer,String> obj:set.entrySet())
		{
				System.out.println(obj.getKey()+" : "+obj.getValue());
		
		}
		

	}

}
