package com.multithreading;

public class DemoApp {
		public static void main(String[] args) {
			Type t1= new Type();
			Spell t2= new Spell();
			Save t3= new Save();
                t1.start();
                t2.start();
                t3.start();
		}
	}

	class Type extends Thread{
		public void run() {
			for(int i=0; i<10; i++) {
				System.out.println("Type....");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	class Spell extends Thread{
		public void run() {
			for(int i=0; i<10; i++) {
				System.out.println("Spell Check....");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	class Save extends Thread{
		public void run() {
			for(int i=0; i<10; i++) {
				System.out.println("Save....");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}		