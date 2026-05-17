//Question 11: Write a Java program where two threads print odd and even numbers separately.
//
//Create two threads. One prints odd numbers and another prints even numbers from 1 to N.
//Input:
//Enter limit: 10
//
//Output:
//Odd Thread: 1 3 5 7 9
//Even Thread: 2 4 6 8 10
//
//Explanation:
//Two separate threads execute independently to print different number ranges. First thread checks i%2!=0 for odd, second checks i%2==0 for even. Threads run concurrently, allowing parallel number processing. Output order may vary due to thread scheduling, but both complete independent tasks.
//
//
package MultiThreading;

public class EvenOdd {

	public static void main(String[] args) throws InterruptedException {
		Even e=new Even(10);
		Odd o=new Odd(20);
		o.start();
		o.join();
		e.start();
	
	}
}
class Even extends Thread{
	int n;
	Even(int n)
	{
		this.n=n;
	}
	
	public void run() {
		System.out.print("\nEven : ");
		try {
			for(int i=2;i<=n;i+=2) {
				System.out.print(i+" ");
			}
		}catch(Exception e) {
			System.out.print(e);
		}
	}
}
class Odd extends Thread{
	int n;
	Odd(int n)
	{
		this.n=n;
	}
	
	public void run() {
		System.out.print("\nOdd : ");
		try {
			for(int i=1;i<=n;i+=2) {
				System.out.print(i+" ");
			}
		}catch(Exception e) {
			System.out.print(e);
		}
	}
}