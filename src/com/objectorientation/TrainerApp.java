package com.objectorientation;
//without polymorphysm 
public class TrainerApp {
	public static void main(String[] args) {
		AptiTrainer apt = new AptiTrainer();
		JavaTrainer	jt = new JavaTrainer();
		TastingTrainer TT= new TastingTrainer();
	}
	
}
class Trainer{
	void teach() {
	}
}
class AptiTrainer extends Trainer{

	void teach() {
		System.out.println("Apti trainer teach Aptitude");
	}
	}
class JavaTrainer extends Trainer{
	void teach() {
		System.out.println("javati trainer teach Aptitude");
	}
}

class TastingTrainer extends Trainer{
	void teach() {
		System.out.println("Aptesting trainer teach Aptitude");
	}
}

