//Question 2: Write a Java program to create a thread using Runnable interface and display even numbers.

//Create a class that implements Runnable interface. Print even numbers between given ranges using run() method.
//Input:
//Enter limit: 10

//Output:
//Even numbers are:
//2 4 6 8 10

//Explanation:
//Runnable interface is preferred way to create threads as it avoids single inheritance limitation. Implement Runnable, override run() method, and pass instance to Thread constructor. This allows class to extend other classes while implementing Runnable. Provides better design and flexibility compared to extending Thread class directly.


package MultiThreading;

public class DisplayEvenRunnable {

	public static void main(String[] args) {
		NO1 n=new NO1(50);
		Thread t=new Thread(n);
		t.start();

	}

}
class NO1 implements Runnable{
int n;
NO1(int n){
	this.n=n;
}
	public void run() {
		try {
			for(int i=2;i<=n;i+=2)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
			
		}catch(Exception e)
		{
			System.out.print(e);
		}
	}
	
}
