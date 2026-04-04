package lambda;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierInfDate {

	public static void main(String[] args) {
//		Supplier<Date> date=new Supplier<Date>()
//				{
//					public Date get() {
//						return new Date();
//					}
//				};
//				System.out.println(date.get());

//		Supplier<Date> date=()-> {
//				return new Date();
//		};
//		System.out.println(date.get());
	
		
//		Supplier<Date> date=()-> new Date();
//		System.out.println(date.get());
		
		System.out.println(((Supplier<Date>)()-> new Date()).get());
	
	}

}
