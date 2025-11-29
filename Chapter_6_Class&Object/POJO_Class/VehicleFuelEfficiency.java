/*
8. Vehicle Fuel Efficiency
Task:
 Create a Vehicle class with fields: model, mileage, and fuelCapacity.
 In the main method:
Create a Vehicle object.
Calculate how far the vehicle can travel (mileage * fuelCapacity) and print the result.
Explanation:
 This reinforces using object fields for calculations.
 */
 import java.util.*;
 public class VehicleFuelEfficiency
 {	
	 public static void main(String x[])
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of Vehicles");
		int count=sc.nextInt();
		
		Vehicle v[]=new Vehicle[count];
		System.out.println("Enter model name,Mileage,fuelCapacity :");
		for(int i=0;i<v.length;i++)
		{
			v[i]=new Vehicle();
			v[i].setModel(sc.next());	
			v[i].setMileage(sc.nextDouble());
			v[i].setFuelCapacity(sc.nextFloat());			
		}
		for(int i=0;i<v.length;i++)
		{
			float avg=(float)v[i].getMileage()* v[i].getFuelCapacity();
				System.out.printf("\n%s : %f KM far the vehicle can travel\n\n",v[i].getModel(),avg);
		}
	 }
 } 
 
 class Vehicle 
 {
    private String model;
    private double mileage;
    private float fuelCapacity;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double getMileage() {
        return mileage;
    }
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public float getFuelCapacity() {
        return fuelCapacity;
    }
    public void setFuelCapacity(float fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
