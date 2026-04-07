package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class StreamSorted {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,17,12,7);
		Consumer<Integer> c=new Consumer<Integer>(){
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		list.stream().sorted().forEach(c);
		
//		Consumer<Integer> c=new Consumer<Integer>(){
//			public void accept(Integer t) {
//				System.out.println(t);
//			}
//		};
//		List.of(10,17,12,7).stream().sorted().forEach(c);
		
//		Consumer<Integer> c=t->System.out.println(t);
//		List.of(10,17,12,7).stream().sorted().forEach(c);
		
//		List.of(10,17,12,7).stream().sorted().forEach(t->System.out.println(t));
	}

}
