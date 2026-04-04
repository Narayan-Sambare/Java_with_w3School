package lambda;

import java.util.function.Function;

public class FunctionWithAndThen {

	public static void main(String[] args) {
		
//		Function<Integer,Integer> f1=new Function<Integer,Integer>(){
//
//			public Integer apply(Integer t) {
//				
//				return t/2;
//			}
//		};
//		Function<Integer,Integer> f2=new Function<Integer,Integer>(){
//
//			public Integer apply(Integer t) {
//				return t*t;
//			}
//		};
//		Function<Integer, Integer> r=f1.andThen(f2);
//		System.out.println(r.apply(15));
		
		
//		Function<Integer,Integer> f1=(Integer t)->t/2;
//		Function<Integer,Integer> f2=(Integer t) ->t*t;
//		Function<Integer, Integer> r=f1.andThen(f2);
//		System.out.println(r.apply(15));
		
//		Function<Integer,Integer> f1=(Integer t)->t/2;
//		Function<Integer,Integer> f2=(Integer t) ->t*t;
//		System.out.println(((Function<Integer, Integer>)f1.andThen(f2)).apply(15));

		
//		System.out.println(((Function<Integer,Integer>)((Function<Integer,Integer>)(Integer t)->t/2).andThen((Function<Integer,Integer>)(Integer t)->t*t)).apply(15));

		System.out.println(((Function<Integer,Integer>)(t->t/2)).compose((Function<Integer,Integer>)t->t*t).apply(15));
		
	}

}
