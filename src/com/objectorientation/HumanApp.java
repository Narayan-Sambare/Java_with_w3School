package com.objectorientation;

public class HumanApp {

	public static void main(String[] args) {
		Human hm = new Human();
		
		Student2 std2 = new Student2();
		
		Bike2 bike2 = new Bike2("Fz",150000);
		std2.BikehasA1(bike2);
		Book2 bk2 = new Book2("William Shakesphare", 400);
		std2.Book2hasA1(bk2);
		
		System.out.println(hm.ht.task());
		System.out.println(hm.ht.weight());
		System.out.println(hm.brn.task());
		System.out.println(hm.brn.weight());
		
		
	}
}


class Human{
	Heart1	ht = new Heart1("Pumping" , 200);
	Brain1 brn = new Brain1("Processing" , 400);
}


class Heart1{
	String task;
	int weight;
	public Heart1(String task, int weight){
		this.task = task;
		this.weight = weight;
	}
	String task() {
		return task;
	}
	int weight() {
		return weight;
	}
}


class Brain1{
	String task;
	int weight;
	public Brain1(String task,int weight){
		this.task = task;
		this.weight = weight;
	}
	
	String task() {
		return task;
	}
	int weight() {
		return weight;
	}
}


class Student2 extends Human{
	void BikehasA1(Bike2 B1){
		System.out.println(B1.brand);
		System.out.println(B1.cost);
	}
	void Book2hasA1(Book2 bk2){	
		System.out.println(bk2.author);
		System.out.println(bk2.cost);
	}
}

   
class Bike2{
	String brand;
	int cost;
	public Bike2(String brand, int cost){
		this.brand = brand;
		this.cost = cost;
	}
	
	String brand() {
		return brand;
	}
	
	int cost() {
		return cost;
	}
}


class Book2{
	String author;
	int cost;
	public Book2(String author, int cost){
		this.author = author;
		this.cost = cost;
	}
	String author() {
		return author;
	}
	
	int cost() {
		return cost;
	}
}

class Parent{
	Human hm = new Human();
	
	Human display() {
		return hm;
	}
	
}

class child extends Parent{
	Student2 std2 = new Student2();
	Student2 display() {
		return std2;
	}
	
}