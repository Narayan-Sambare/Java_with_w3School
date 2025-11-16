public class Bus extends Vehicle
{
   private int noOfPassenger;
    
    Bus(String model, String registrationNumber,double speed, double fuelCapacity, double fuelConsumption,int noOfPassenger)
    {
        super(model,registrationNumber,speed,fuelCapacity,fuelConsumption);
        this.noOfPassenger=noOfPassenger;
    }
    public void setPass(int p)
    {
        this.noOfPassenger=p;
    }
    public int getPass()
    {
        return noOfPassenger;
    }
     public void display()
    {
        super.display();
        System.out.println("Number of passenger: "+getPass());
    }
}
