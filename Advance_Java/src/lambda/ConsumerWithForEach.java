package lambda;
import java.util.*;
import java.util.function.Consumer;
public class ConsumerWithForEach 
{
	public static void main(String[] args)
	{
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
//		Consumer<Integer> s=new Consumer<Integer>(){
//			public void accept(Integer t) 
//			{
//				System.out.println(t);
//			}
//		};
//		list.forEach(s);
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
//		Consumer<Integer> s=(Integer t)-> 
//			{
//				System.out.println(t);
//			
//		};
//		list.forEach(s);
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
//		Consumer<Integer> s=t->System.out.println(t);
//		list.forEach(s);
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
//		list.forEach((Consumer<Integer>)t->System.out.println(t));
		
//		List<Integer> list =Arrays.asList(1,2,3,4,5,6);
//		list.forEach((Integer t)->System.out.print(t));
		
		Arrays.asList(1,2,3,4,5,6,7).forEach((Integer t)->System.out.println(t));
	}

}
