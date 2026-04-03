package lambda;
public class RunnableLambda {

	public static void main(String[] args)
	{
//		Runnable r = new Runnable(){
//		public void run() {
//			try {
//				for(int i=1;i<=10;i++)
//				{
//					System.out.println(i);
//					Thread.sleep(1000);
//				}
//			}catch(Exception e)
//			{
//				System.out.print(e);
//			}
//			}
//		};
//		Thread t=new Thread(r);
//		t.start();
		
//		Runnable r = ()-> {
//			try {
//				for(int i=1;i<=10;i++)
//				{
//					System.out.println(i);
//					Thread.sleep(1000);
//				}
//			}catch(Exception e)
//			{
//				System.out.print(e);
//			}
//			
//		};
//		Thread t=new Thread(r);
//		t.start();
		
		
//		Thread t= new Thread(()-> {
//			try {
//				for(int i=1;i<=10;i++)
//				{
//					System.out.println(i);
//					Thread.sleep(1000);
//				}
//			}catch(Exception e)
//			{
//				System.out.print(e);
//			}
//			
//		});
//		t.start();
		
//		new Thread(()-> {
//			try {
//				for(int i=1;i<=10;i++)
//				{
//					System.out.println(i);
//					Thread.sleep(1000);
//				}
//			}catch(Exception e)
//			{
//				System.out.print(e);
//			}
//			
//		}).start();
		
		new Thread(()-> {
			try {
				for(int i=1;i<=10;i++)
				{
					System.out.println(i);
					Thread.sleep(1000);
				}
			}catch(Exception e)
			{
				System.out.print(e);
			}
			
		}).start();
	}

}
