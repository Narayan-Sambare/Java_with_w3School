package Stream;

import java.util.*;
import java.util.function.*;

public class StreamMap {

	public static void main(String[] args)
	{
//		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
//		Stream<Integer> st= list.stream();
//		Function<Integer,Integer> f= new Function<Integer,Integer>()
//				{
//					public Integer apply(Integer t) 
//					{
//						return t*t;
//					}
//				};
//				Stream<Integer> st2=st.map(f);
//				Consumer<Integer> c=new Consumer<Integer>() {
//					public void accept(Integer t) 
//					{
//						System.out.println(t);
//					}
//				};
//				st2.forEach(c);
				
//				List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
//				Stream<Integer> st= list.stream();
//				
//				Function<Integer,Integer> f= (Integer t)-> {								
//								return t*t;
//						};
//						Stream<Integer> st2=st.map(f);
//						Consumer<Integer> c=new Consumer<Integer>() {
//							public void accept(Integer t) {
//								System.out.println(t);
//							}
//						};
//						st2.forEach(c);
		
//		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
//		Stream<Integer> st= list.stream();
//		
//		Function<Integer,Integer> f= (Integer t)->t*t;
//		Stream<Integer> st2=st.map(f);
//		Consumer<Integer> c=(Integer t) ->System.out.println(t);
//				st2.forEach(c);
		
//		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
//		Stream<Integer> st= list.stream();
//		Stream<Integer> st2=st.map((Function<Integer,Integer> ) (Integer t)->t*t);
//		Consumer<Integer> c=(Integer t) ->System.out.println(t);
//				st2.forEach(c);
		
//		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
//		Stream<Integer> st2=list.stream().map((Function<Integer,Integer>)(Integer t)->t * t);
//		Consumer<Integer> c=(Integer t) ->System.out.println(t);
//				st2.forEach(c);
		
//		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
//		Stream<Integer> st2=list.stream().map((Function<Integer,Integer>)(Integer t)->t * t);
//		st2.forEach((Integer t) ->System.out.println(t));
		
//		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
//		(list.stream().map((Function<Integer,Integer>)(Integer t)->t * t)).forEach((Integer t) ->System.out.println(t));

		
		(Arrays.asList(1,2,3,4,5,6,7,8).stream()
				.map((Function<Integer,Integer>)(Integer t)->t * t))
				.forEach((Integer t) ->System.out.println(t));			
		}
}
