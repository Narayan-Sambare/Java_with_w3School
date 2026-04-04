package lambda;
import java.util.*;
import java.util.function.*;

public class FindEven {
	public static void main(String x[])
	{
//		List<Integer>list=Arrays.asList(12,2,3,4,5,6,8);
//		Predicate<Integer> p1=t->t%2==0;
//		Consumer<Integer> c=t->System.out.print(p1.test(t)?t+" ":"");
//		list.forEach(c);
		
		List.of(12,2,3,4,5,6,8)
			.forEach((Integer t)->
			{
				if(((Predicate <Integer>)(Integer val)->val%2==0).test(t))
				{
					System.out.print(t+" ");
				}
				}
			);
	}
}
