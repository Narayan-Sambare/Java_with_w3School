public class Vehicle {
    private String model;
    private String registrationNumber;
    private double speed ;
    private double fuelCapacity;
    private double fuelConsumption;
    Vehicle(String model, String registrationNumber,double speed, double fuelCapacity, double fuelConsumption)
    {
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumption = fuelConsumption;
    }
    void setModel(String m)
    {
        this.model = m;
    }
    public String getModel()
    {
        return model;
    }
    void setRegNo(String r)
    {
        this.registrationNumber = r;
    }
    public String getRegNo()
    {
        return registrationNumber;
    }
    void setSpeed(double s)
    {
        this.speed = s;
    }
    public double getSpeed()
    {
        return speed;
    }
    void setFuelCapacity(double fC)
    {
        this.fuelCapacity = fC;
    }
    public double getFuelCapacity()
    {
        return fuelCapacity;
    }
    void setFuelConsumption(double fCon)
    {
        this.fuelConsumption = fCon;
    }
    public double getFuelConsumption()
    {
        return fuelConsumption;
    }
    public float fuelNeeded(double distance)
    {
        return (float)(distance / fuelConsumption);
    }
    public int distanceCovered(double hours)
    {
        return (int)(speed * hours);
    }
    public void display()
    {
        System.out.println("\n======= Vehicle Details =======");
       System.out.println("Model: " +getModel());
        System.out.println("Registration Number: " + getRegNo());
        System.out.println("Speed: " + getSpeed()+ " km/h");
        System.out.println("Fuel Capacity: " + getFuelCapacity() + " liters");
        System.out.println("Fuel Consumption: " + getFuelConsumption() + " liters/100 km");
    }

}
