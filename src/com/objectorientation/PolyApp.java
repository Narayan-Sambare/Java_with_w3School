package com.objectorientation;

public class PolyApp {

	public static void main(String[] args) {
		Arrmy ar = new Arrmy();
		duty(ar);
		Navy nv = new Navy();
		duty(nv);
		
		AirForce arf = new AirForce();
		duty(arf);
		
	}
	static void duty(SpecialForce sf) {
		sf.attact();
	}
	 
}
interface SpecialForce {
 void attact();
		
}
class Arrmy implements SpecialForce {
	public void attact() {
		System.out.println("arrmy");	
	}

}
class Navy implements SpecialForce {
	public void attact() {
		System.out.println("Nevy");	
	}
	
}
class AirForce implements SpecialForce {
	public void attact() {
		System.out.println("air force");	
	}
}