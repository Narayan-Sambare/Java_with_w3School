package lambda;
import java.util.function.*;

public class PredicateWithAnd {

	public static void main(String[] args) {
		System.out.println(((Predicate<Integer>)t->t>=18).and(t->t<65).test(12)?"Your can drive the vehical":"you can't drive the vehical");
		}

}
