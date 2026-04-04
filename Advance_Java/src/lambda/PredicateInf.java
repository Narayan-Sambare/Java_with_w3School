package lambda;

import java.util.function.Predicate;

public class PredicateInf {

	public static void main(String[] args) {
		int age=20;
		System.out.println(((Predicate<Integer>)t->(t>=18)?true:false).test(age));	
		System.out.println(((Predicate<Integer>) n-> (n%2==0)?true:false).test(6)?"This is Even Number" : "This is Odd Number");	
	}
}
