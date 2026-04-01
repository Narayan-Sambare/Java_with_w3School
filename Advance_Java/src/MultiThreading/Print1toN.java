//Question 1: Write a Java program to create a thread using Thread class and display numbers from 1 to 10.
//
//Create a class that extends Thread. Override the run() method and print numbers from 1 to the given limit. Start the thread from the main method.
//Input:
//Enter limit: 10
//
//Output:
//Thread started
//1 2 3 4 5 6 7 8 9 10
//Thread finished
//
//Explanation:
//Creating threads using Thread class involves extending Thread and overriding run() method. The run() method contains the code to execute in thread. Call start() method to begin thread execution, not run() directly. Calling start() initializes thread state and calls run() internally, ensuring proper thread execution.
//
//Asked In Companies:
//Practice Assignment

package MultiThreading;

public class Print1toN {

	public static void main(String[] args) {
		
		Number e=new Number(50);
		e.start();

	}

}

class Number extends Thread{
	int n;
	Number(int n){
		this.n=n;
	}
	public void run()
	{
		try {
			for(int i=1;i<=n;i++)
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
