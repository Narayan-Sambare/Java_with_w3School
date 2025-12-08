/*Q5. Transportation Booking System – Fare Calculation
Parent class: Transport
Fields: distance, baseFare
Child classes:
Bus
Fare = baseFare + (distance × 5)
If AC = true → add 20%
Train
Fare = baseFare + (distance × 4)
If sleeper → add 15%
Flight
Fare = baseFare + (distance × 10)
Add airport tax = ₹750
If businessClass → add 40%
Task:
Create 10 bookings.
Calculate final fare via overriding.
Print:
total revenue
Bookings where fare > 20,000
Count bookings of each type
Concepts
Polymorphism
Multiple child classes
Logical filtering
Summation operations 
 */ 
import java.util.*;
public class Transportation_Booking_System
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Total booking number");
        int n=sc.nextInt();
        Transport t[]=new Transport[n];
        for(int i=0;i<t.length;i++)
        {
            System.out.println("distance :");
            double distance=sc.nextDouble();
            System.out.println("baseFare :");
            int bf=sc.nextInt();
            System.out.println("1.Bus\n2.Train\n3.Flight");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Ac : (yes:1 or no:0");
                    boolean ac;
                    int ch1=sc.nextInt();
                     
                    if(ch1==1) 
                    {
                        ac=true;
                    }
                    else
                    {
                        ac=false;
                    }  
                    
                    String type="Bus";
                    t[i]=new Bus(distance,bf,ac,type);
                    break;
                case 2:
                    System.out.println("SLeeper : (yes:1 or no:0");
                    ch1=sc.nextInt();
                    boolean sleeper;  
                    if(ch1==1) 
                    {
                        sleeper=true;
                    }
                    else
                    {
                        sleeper=false;
                    }  
                   
                    type="Train";
                    t[i]=new Train(distance,bf,sleeper,type);
                    break;
                case 3:
                    System.out.println("Business Class : (yes:1 or no:0");
                    boolean bc;
                    
                    ch1=sc.nextInt();
                    
                    if(ch1==1) 
                    {
                        bc=true;
                    }
                    else
                    {
                        bc=false;
                    }  
                    type="Flight";
                    t[i]=new Flight(distance,bf,bc,type);
                    break;
                default :
                    System.out.println("Enter valid input");
                    break;
            }
        }
        System.out.println("=============Total revenue================");
            double tr = 0;
            for(int i=0;i<t.length;i++)
            {
                double revenue=t[i].revenue();
                tr+=revenue;
            }
            System.out.println("Toatal Revenue : "+tr);

        System.out.println("===============Bookings where fare > 20,000=================");
            int bus=0,train=0,flight=0;
        for(int i=0;i<t.length;i++)
        {
                double revenue=t[i].revenue();
                String type=t[i].getType();
                if(revenue>20000)
                {  
                    System.out.println(type+" Revenue : "+revenue);
                }
                if(type.equals("Bus"))
                {
                    bus++;
                }
                if(type.equals("Train"))
                {
                    train++;
                }
                if(type.equals("Flight"))
                {
                    flight++;
                }
        }
            System.out.println("===============Count bookings of each type============");
            System.out.println("Bus : "+bus);
            System.out.println("Train : "+train);
            System.out.println("Flight : "+flight);
    }   
}
class Transport{
    private double distance;
    private int baseFare;
    private String type;
    
    void setDistance(double d)
    {
        this.distance=d;
    }
    void setBD(int bf)
    {
        this.baseFare=bf;
    }
    
    double getDistance()
    {
        return distance;
    }
    int getBF()
    {
        return baseFare;
    }
    
    String getType()
    {
        return type;
    }
    
    void setType(String type)
    {
        this.type=type;
    }

    double revenue()
    {
        return baseFare;
    }

}
class Bus extends Transport{
    private boolean ac;

    Bus(double distance,int bf,boolean ac,String type)
    {
        setDistance(distance);
        setBD(bf);
        this.ac=ac;
        setType(type);
    }
    
    double revenue(){
        double revenue=getBF()+(getDistance()*5);
        if(ac)
        {
           revenue+=revenue*0.20;
        }
        return revenue;
    }
}
class Train extends Transport{
    private boolean sleeper;

    Train(double distance, int bf, boolean sleeper, String type)
    {
        setDistance(distance);
        setBD(bf);
        setType(type);
        this.sleeper=sleeper;
    }
    double revenue(){
        double revenue=getBF()+(getDistance()*4);
        if(sleeper)
        {
            revenue+=revenue*0.15;
        }
        return revenue;
    }
}
class Flight extends Transport{
        private boolean businessClass;
        private double airportTax=750;
        
    Flight(double distance,int bf,boolean businessClass, String type)
    {
        setDistance(distance);
        setBD(bf);
        this.businessClass=businessClass;
        setType(type);
    }
    double revenue(){
        double revenue=getBF()+(getDistance()*10)+airportTax;
        if(businessClass)
        {
            revenue+=revenue*0.40;
        }
        return revenue;
    }
}
