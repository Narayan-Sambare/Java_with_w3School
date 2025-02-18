package com.objectorientation;
public class Student1 {

	public static void main(String[] args) {
		PStudent pstd = new PStudent();
		Bike1 bike = new Bike1("Platina", 90000);
		pstd.BikehasA(bike);
		Book bk = new Book("SSBT", 500);
		pstd.BookhasA(bk);
		System.out.println(pstd.b.Task);
		System.out.println(pstd.b.weight);
//		System.out.println(pstd.h.Task);
		System.out.println(pstd.h.weight);

	}

}

class PStudent{
Brain b= new Brain("Processing", 200);
Heart1 h= new Heart1("Pumping",100);

void BookhasA(Book bk){
	System.out.println(bk.Author);
	System.out.println(bk.cost);
}

void BikehasA(Bike1 bike){
	System.out.println(bike.Brand);
	System.out.println(bike.cost);
}

	
}

class Heart2{
	String Task;
	int weight;
	public Heart2(String Task,int weight ) {
		this.Task = Task;
		this.weight = weight; 
	}
	
	String getTask() {
		return Task;
	}
	
	int weight() {
		return weight;
	}
}

class Bike1{
	String Brand;
	int cost;
	public Bike1(String Brand, int cost) {
		this.Brand = Brand;
		this.cost = cost; 
	}
	
	String getBrand() {
		return Brand;
	}
	
	int getCost() {
		return cost;
	}
}

class Book{
	String Author;
	int cost;
	public Book(String Author, int cost) {
		this.Author = Author;
		this.cost = cost;
	}
}

class Brain{
	String Task;
	int weight;
	public Brain(String Task,int weight){
		this.Task = Task;
		this.weight = weight;
	}
	String getTask() {
		return Task;
	}
	
	int getweight() {
		return weight;
	}
}