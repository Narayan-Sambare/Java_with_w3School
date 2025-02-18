package com.multithreading;

public class SynchroniseApp {

		public static void main(String[] args) throws InterruptedException {
			Bath1 bath= new Bath1();
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

	class Bath1 implements Runnable {
		synchronized public void run() {
			try{ String  tname = Thread.currentThread().getName();
			
			
			System.out.println(tname+"is Entering in the Bathroom");
			Thread.sleep(1000);
			System.out.println(tname+"is using the Bathroom");
			Thread.sleep(1000);
			System.out.println(tname+" is exiting the Bathroom");
			
			Thread.sleep(1000);
			System.out.println("-----------------------------");
			}catch(Exception e) {
				
			}
		}
		
		
	}


