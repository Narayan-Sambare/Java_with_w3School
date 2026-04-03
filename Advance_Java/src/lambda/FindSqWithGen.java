package lambda;
import java.util.*;
public class FindSqWithGen {

	public static void main(String[] args) {
//		Sq<Integer> s=(a)->a*a;
//		System.out.print(s.getSq(5));
		
		
		System.out.println(((Sq<Integer>)a->a*a).getSq(50));
	}

}

interface Sq<T>{
	T getSq(T n);
}
