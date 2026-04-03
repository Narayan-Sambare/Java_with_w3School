//Consumer interface
//Consumer interface is basically functional interface 
//which contain abstract method void accept(T t)  
//so this method can accept parameter and 
//developer can write logic in that method 


package lambda;
import java.util.function.Consumer;

public class ConsumerInf {
	public static void main(String[] args) 
	{
//		Consumer<Integer> s = new Consumer<Integer>()
//		{
//			public void accept(Integer t)
//			{
//				if(t>=18) 
//				{
//					System.out.print("U Are Iligeble for vote !");
//				}else
//				{
//					System.out.print("U Are not Iligeble for Vote !");
//				}
//			}
//		};
//		s.accept(22);
		
//		Consumer<Integer> s = (Integer t)->
//			{
//				if(t>=18) 
//				{
//					System.out.print("U Are Iligeble for vote !");
//				}else
//				{
//					System.out.print("U Are not Iligeble for Vote !");
//				}
//			
//		};
//		s.accept(22);
		
		Consumer<Integer> s = t -> {
			if(t >= 18) 
			{
				System.out.println("U Are Iligeble for vote !");
			}else{
				System.out.print("U Are not Iligeble for Vote !");
			}
		};		
		s.accept(22);
		
	}

}