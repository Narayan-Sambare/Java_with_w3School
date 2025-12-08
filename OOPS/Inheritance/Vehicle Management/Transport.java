import java.util.*;
public class Transport
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("============ Enter the details truck ============");
        System.out.println("Enter model name :");
        String model=sc.nextLine();
        System.out.println("Enter Registration Number :");
        String  registrationNumber=sc.nextLine(); 
        System.out.println("Enter Speed :");
        double speed=sc.nextDouble(); 
        System.out.println("Enter fuel Capacity :");
        double fuelCapacity=sc.nextDouble(); 
        System.out.println("Enter fuel Consumption :");
        double fuelConsumption=sc.nextDouble(); 
        System.out.println("Enter carWeightLimit :");
        double carWeightLimit=sc.nextDouble(); 
       

        Truck t=new Truck(model, registrationNumber, speed, fuelCapacity, fuelConsumption,carWeightLimit);

        System.out.println("Fule need for Truck "+t.fuelNeeded(500));
        System.out.println("distance coverd by Truck "+t.distanceCovered(5));
        t.display();


         sc.nextLine();
        System.out.println("============== Enter the details of bus ==============");
        System.out.println("Enter model name :");
        String Bmodel=sc.nextLine();
        System.out.println("Enter Registration Number :");
        String  BregistrationNumber=sc.nextLine(); 
        System.out.println("Enter Speed :");
        double Bspeed=sc.nextDouble(); 
        System.out.println("Enter fuel Capacity :");
        double BfuelCapacity=sc.nextDouble(); 
        System.out.println("Enter fuel Consumption :");
        double BfuelConsumption=sc.nextDouble(); 
        System.out.println("Enter Number of passenger :");
        int noOfPassenger=sc.nextInt(); 

        Bus b=new Bus(Bmodel, BregistrationNumber,Bspeed, BfuelCapacity, BfuelConsumption,noOfPassenger);

        System.out.println("Fule need for bus "+b.fuelNeeded(500));
        System.out.println("distance coverd by bus "+b.distanceCovered(5));
        b.display();
    }   
}