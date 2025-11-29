public class Truck extends Vehicle
{
    double carWeightLimit;

    Truck(String model, String registrationNumber,double speed, double fuelCapacity, double fuelConsumption,double carWeightLimit)
    {
        super(model,registrationNumber,speed,fuelCapacity,fuelConsumption);
        this.carWeightLimit = carWeightLimit;
    }
    public void setCarWeightLimit(double carWeightLimit)
    {
        this.carWeightLimit=carWeightLimit;
    }
    public double getCarWeightLimit()
    {
        return carWeightLimit;
    }
    public void display()
    {
        super.display();
        System.out.println("cargoWeightLimit: "+getCarWeightLimit());
    }
}
   