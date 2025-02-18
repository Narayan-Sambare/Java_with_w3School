package com.multithreading;

public class DeamonThreadApp {

	public static void main(String[] args) throws InterruptedException {
		Bath bath= new Bath();
		Thread t1 = new Thread(bath);
		Thread t2 = new Thread(bath);
		Thread t3 = new Thread(bath);
		
		t1.setName("Sanket");
		t2.setName("narayan");
		t3.setName("golu");
		
		t1.start();
		t1.join();
		t2.start();
		t1.join();
		t3.start();

	}

}

class Bath implements Runnable {
	public void run() {
		String  tname = Thread.currentThread().getName();
		try{
			System.out.println(tname+"is Entering in the Bathroom");
		
		Thread.sleep(2000);
		System.out.println(tname+"is using the Bathroom");
		Thread.sleep(2000);
		System.out.println(tname+" is exiting the Bathroom");
		Thread.sleep(2000);
		}catch(Exception e) {
			
		}
	}
	
	
}
