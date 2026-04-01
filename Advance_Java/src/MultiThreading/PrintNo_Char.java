//Question 3: Write a Java program to create two threads where one prints numbers and another prints alphabets.
//
//Create two separate threads. The first thread prints numbers from 1–5 and the second thread prints characters from A–E.
//Input:
//No input required
//
//Output:
//Numbers Thread: 1 2 3 4 5
//Alphabet Thread: A B C D E
//
//Explanation:
//Multiple threads execute concurrently, allowing parallel execution of different tasks. Create separate Runnable implementations for each task and start multiple Thread objects. Both threads execute independently and may interleave their output due to scheduling. Demonstrates concurrent execution of independent operations.

package MultiThreading;

public class PrintNo_Char {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		NO2 n1=new NO2(5);
		n1.start();
		n1.join();
		Char1 c1=new Char1('E');
		c1.start();
	}

}

class NO2 extends Thread{
	int n;
	NO2(int n){
		this.n=n;
	}
	public void run()
	{
		System.out.print("Number : ");
		try {
			for(int i=1;i<=n;i++)
			{
				System.out.print(i+" ");
				Thread.sleep(1000);	
			}
		}catch(Exception e) {
			System.out.print(e);
		}
	}
}
class Char1 extends Thread{
	char n;
	Char1(char n){
		this.n=n;
	}
	public void run()
	{
		System.out.print("\nCharactor : ");
		
		try {
			for(char i='A';i<='E';i++)
			{
				System.out.print(i+" ");
				Thread.sleep(1000);	
			}
		}catch(Exception e) {
			System.out.print(e);
		}
	}
}