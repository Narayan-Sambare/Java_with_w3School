
public class SetPriority {

	public static void main(String[] args) {
		Thread t1=new Thread();
		Thread t2=new Thread();
		Thread t3=new Thread();
		t1.setPriority(3);
		t2.setPriority(2);
		t3.setPriority(5);
		
		System.out.println("Thread1 Priority: "+t1.getPriority());
		System.out.println("Thread1 Priority: "+t2.getPriority());
		System.out.println("Thread1 Priority: "+t3.getPriority());
		System.out.println("is Alive status of t3: "+t3.isAlive());
		
	}

}
