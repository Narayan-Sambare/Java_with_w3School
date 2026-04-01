package MultiThreading;

public class CreateTable {

	public static void main(String[] args) {
		
NO3 n=new NO3(5);
n.start();
	}

}
class NO3 extends Thread {
	int n;
	NO3(int n)
	{
		this.n=n;
	}
	public void run()
	{
		try {
			for(int i=1;i<=10;i++)
			{
				System.out.println(n+" * "+i+" = "+n*i);
				Thread.sleep(1000);
			}
			
		}catch(Exception e) {
			System.out.print(e);
		}
	}
}