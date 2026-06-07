package lambda;
import java.util.Random;
import java.util.function.*;
public class SupplierWithRandomNu {

	public static void main(String[] args) {
//		Supplier<Integer> number=new Supplier<Integer>() {
//			public Integer get() {
//				return new Random().nextInt(6);
//			}
//		};
//		System.out.print(number.get());
		
		
//		Supplier<Integer> number=()->new Random().nextInt(6);
//		System.out.print(number.get());
		
	
		
		for(int i=0;i<10;i++)
		{
			System.out.println(((Supplier<Integer>)()->new Random().nextInt(6)+1).get());
		}
	}

}
