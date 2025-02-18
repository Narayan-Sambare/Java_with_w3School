package com.multithreading;

public class Multithreading1{
	public static void main(String[]args) {
		Thread t=Thread.currentThread();
		t.setName("sanket");
		t.setPriority(10);
		System.out.println(t);
		fun();
	}
	static void fun() {
		Thread t=Thread.currentThread();
		t.setName("ram");
		t.setPriority(10);
		System.out.println(t);
	}
}