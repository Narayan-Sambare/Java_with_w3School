package com.multithreading;

public class MethodThread {

	public static void main(String[] args)throws InterruptedException {
		KodEditor t1=new KodEditor();
		KodEditor t2=new KodEditor();
		KodEditor t3=new KodEditor();
		
		
		t2.setName("spell");
		t2.setDaemon(true);
		t2.setPriority(2);
		
		t3.setName("save");
		t3.setDaemon(true);
		t3.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
class KodEditor extends Thread{
	public void run() {
		String t_name=Thread.currentThread().getName();
		if(t_name.equals("type")) {
			type();
			}else if(t_name.equals("save")) {
				save();
				}else {
					spell();
				}
		}
	
	public void type() {
		
		for(int i = 0; i<=10; i++) {
			System.out.println("Type....");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
		
	}
	public void spell() {
		while(true) {
			System.out.println("spell....");
		
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
	public void save() {
		for(; ; ) {
			System.out.println("save....");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
	}
	
}
