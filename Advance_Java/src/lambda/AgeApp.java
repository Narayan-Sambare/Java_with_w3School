package lambda;

public class AgeApp {

	public static void main(String[] args) {
//		Age a=((age)->(age>=18)?true:false);
//		
//		System.out.print(a.isValid(18));
		
		System.out.print( ( (Age)age->age>=18 ).isValid(18) );
	}
}
interface Age{
	boolean isValid(int age );
}