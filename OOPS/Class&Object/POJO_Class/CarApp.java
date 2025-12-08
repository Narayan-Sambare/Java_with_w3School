/*
Q3. Problem:
Create a POJO class Car with fields: carId, model, fuelConsumed, and distanceTravelled. 
Store details of 5 cars using an array of objects. Perform the following operations:
Calculate the mileage of each car (mileage = distanceTravelled / fuelConsumed).
Find the car with the best mileage.
Display cars whose mileage is above the average mileage of all cars.
Why?
 Here you apply formula-based computation + comparison + filtering, just like the employee salary example, but with a different real-world scenario.
 */
import java.util.*;
public class CarApp
{
	public static void main(String x[])
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car count");
		int count=sc.nextInt();
        Car cars[] = new Car[count];

        for (int i = 0; i < cars.length; i++) 
		{
            cars[i] = new Car();
            System.out.println("\nEnter details of "+ (i + 1)+" Car " );

            System.out.print("Car ID: ");
            cars[i].setCarId(sc.nextInt());

            System.out.print("Model: ");
            cars[i].setModel(sc.next());

            System.out.print("Fuel Consumed (litres): ");
            cars[i].setFuelConsumed(sc.nextDouble());

            System.out.print("Distance Travelled (km): ");
            cars[i].setDistanceTravelled(sc.nextDouble());
        }
		
        double totalMileage = 0;
        double bestMileage = 0;
        int bestIndex = 0;

        System.out.println("\n----- Mileage of Each Car----");
        for (int i = 0; i < cars.length; i++) 
		{
            double mileage = cars[i].getMileage();
            System.out.println("CarId: " + cars[i].getCarId() +" Model: " + cars[i].getModel() +" Mileage: " + mileage + " km/l");

            totalMileage += mileage;

            if (mileage > bestMileage) {
                bestMileage = mileage;
                bestIndex = i;
            }
        }

        // Best Mileage Car
        System.out.println("\n=== Car with Best Mileage ===");
        System.out.println("CarId: " + cars[bestIndex].getCarId() +" Model: " + cars[bestIndex].getModel() +" Mileage: " + bestMileage + " km/l");

        // Average Mileage
        double avgMileage = totalMileage / cars.length;

        // Cars below average
        System.out.println("\n=== Cars with Mileage Below Average (" + avgMileage + " km/l) ===");
        for (int i = 0; i < cars.length; i++) 
		{
            if (cars[i].getMileage() < avgMileage)
			{
                System.out.println("CarId: " + cars[i].getCarId() +" Model: " + cars[i].getModel() +" Mileage: " + cars[i].getMileage() + " km/l");
            }
        }
    }
}


class Car {
    private int carId;
    private String model;
    private double fuelConsumed;       
    private double distanceTravelled; 

    public int getCarId() {
        return carId;
    }
    public void setCarId(int carId) {
        this.carId = carId;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getFuelConsumed() {
        return fuelConsumed;
    }
    public void setFuelConsumed(double fuelConsumed) {
        this.fuelConsumed = fuelConsumed;
    }
    public double getDistanceTravelled() {
        return distanceTravelled;
    }
    public void setDistanceTravelled(double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public double getMileage() {
        if (fuelConsumed == 0) return 0;  // prevent divide by zero
        return distanceTravelled / fuelConsumed;
    }
}


