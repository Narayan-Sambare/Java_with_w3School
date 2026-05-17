
// Example : WAP to create collection and store values in it and find the even values and display it.

package Stream;

import java.util.*;
import java.util.function.*;


public class StreamFilter 
{

	public static void main(String[] args) 
	{
		List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,9);
		Predicate<Integer> p=t->t%2==0;
		Consumer<Integer> c=t->System.out.println(t);
		list.stream()
				.filter(p)
					.forEach(c);
		
//		List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,9);
//		Predicate<Integer> p=t->t%2==0;
//		(list.stream()
//				.filter(p)
//					).forEach(t->System.out.println(t));
		
//		List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,9);
//		(list.stream()
//				.filter((Integer t)->t%2==0)
//					).forEach(t->System.out.println(t));
		
//		(Arrays.asList(1,2,3,4,5,6,7,8,9).stream()
//			.filter((Integer t)->t%2==0)
//				).forEach(t->System.out.println(t));
		
	}

}
