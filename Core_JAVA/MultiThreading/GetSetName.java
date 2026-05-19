package MultiThreading;

public class GetSetName {

	public static void main(String[] args) {
		
		
		Thread c=Thread.currentThread();
		System.out.println("New Name : "+c.getName());
		c.setName("New worker");
		System.out.println("New Name : "+c.getName());

	}
}
