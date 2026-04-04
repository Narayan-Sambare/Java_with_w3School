package lambda;
import java.util.function.*;
public class FunctionInf {
	public static void main(String[] args) {
//		Function<Integer,Integer> f=new Function<Integer,Integer>() {
//			@Override
//			public Integer apply(Integer t) {	
//				return t*t;
//			}
//		};
//		System.out.println(f.apply(15));
		
//		Function<Integer,Integer> f=(Integer t)->t*t;
//		System.out.println(f.apply(15));
		
		System.out.println(((Function<Integer,Integer>)(Integer t)->t*t).apply(15));
	}
}
