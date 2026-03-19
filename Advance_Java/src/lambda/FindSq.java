package lambda;

public class FindSq {

	public static void main(String[] args) {
	
			Square sq=(int a)-> a*a;
			int result=sq.getSquare(5);
			System.out.println(result);
	}
}

interface Square{
	 int getSquare(int a);
}