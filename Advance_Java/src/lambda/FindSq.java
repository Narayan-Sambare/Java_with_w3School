package lambda;

public class FindSq {

	public static void main(String[] args) {
	
		Square s=(a)->a*a;
			int r=s.getSquare(53);
			System.out.println(r);
			
			System.out.println( ( (Square) a-> a*a ).getSquare(10) );
	}
}
interface Square{
	int getSquare(int n);
}