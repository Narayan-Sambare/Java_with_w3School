package com.objectorientation;

public class SpecialForceApp {

	public static void main(String[] args) {
		SecurityForce sf=new SecurityForce();
		 Arrmy a=new Arrmy();
		 Navy n=new Navy();
		 AirForce af=new AirForce();
		 
		System.out.println("Array");
		a.job();
		a.protect();
		
		System.out.println("Navy");
		n.job();
		n.protect();
		System.out.println("AirForce");
		af.job();
		af.protect();

	}

}
class SecurityForce {
	void job() {
		System.out.println("protect the nation");	
	}
	void protect() {
		System.out.println("protect to country with various weapon ");
	}
}
class Arrmy extends SecurityForce {
	void protect() {
	System.out.println("Arrmy use tank to protect the Nation");
}
}
class Navy extends SecurityForce{
	void protect() {
		System.out.println("Navy use Ships to protect the Nation");
	}
	
}
class AirForce extends SecurityForce{
	public AirForce() {
		System.out.println("AirForce use jets to protect the Nation");
	}
	
}