/*
Q5. Transport_Ticket_Price – Abstract Fare System
Abstract class: Transport
    Fields:distance, baseFare
    Methods:abstract double calculateFare()
Child classes:
Bus
    Fare = baseFare + distance × 4
Train
    Fare = baseFare + distance × 3
    If sleeper = true → add 10%
Flight
    Fare = baseFare + distance × 10
    Extra airport charge = ₹500
Task:
    Store 7 transport bookings.
    Calculate fare for each.
Show:
    total revenue
    highest fare
Explanation:
Covers:
Abstract method overriding
Computation logic per child class
Summing and tracking max value
Good mix of arithmetic + conditions
*/
import java.util.*;
public class Transport_Ticket_Price{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the count");
        int n=sc.nextInt();
        Transport t[]=new Transport[n];
        for(int i=0;i<t.length;i++)
        {

            System.out.println("Enter distance");
            float d=sc.nextFloat();
            System.out.println("Enter base Fare");
            int bf=sc.nextInt();
            System.out.println("\t1.Bus\n\t2.Train\n\t3.Flight");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    t[i]=new Bus(d,bf);
                    break;
                case 2:
                    System.out.println(" Sleeper Status (yes : 1 / NO : AnyKey )");
                    int mem=sc.nextInt();
                    boolean sleeper;
                    if(mem==1)
                    {
                        sleeper=true;
                    }
                    else{
                        sleeper=false;
                    }
                    t[i]=new Train(d,bf,sleeper);
                    break;
                case 3:
                    t[i]=new Flight(d,bf);
                    break;
                default:
                    System.out.println("Enter valid input");
                    i--;
                    break;
            }
        }
        System.out.println("=============== fare of each Transport===============\n");
        double bill=0;
        Transport hf=t[0];
        for(Transport i: t)
        {
            double result = i.calculateFare();
            bill+=result;
            System.out.println("Distance : "+i.distance+" \tBase Fare : "+i.baseFare+" \tFinal bill : "+result);
            if(hf.calculateFare()<result)
            {
                hf=i;
            }
        }
        System.out.println();
        System.out.println("\n++++++++++++++Total reveue : "+bill);     
        System.out.println("\nID : "+hf.distance+" \t price : "+hf.baseFare+" \t hightest Fare : "+hf.calculateFare());
        
    }
}
abstract class Transport{
    float distance;
    float baseFare;
    Transport(float distance, float baseFare)
    {
        this.distance=distance;
        this.baseFare=baseFare;
    }
    abstract double calculateFare();
}
class Bus extends Transport{
    Bus(float distance, float baseFare){
        super(distance,baseFare);
    }
    public double calculateFare(){
       return baseFare+distance*4;
    }
}

class Train extends Transport{
    boolean sleeper;
    Train(float distance, float baseFare,boolean sleeper){
        super(distance,baseFare);
        this.sleeper=sleeper;
    }
    public double calculateFare(){
        double bill=baseFare+distance*3;
       if(sleeper){
        
        double f=bill+(bill*0.10);
        return f;
       }
        return bill;
    }
}
class Flight extends Transport{

    Flight(float distance, float baseFare){
        super(distance,baseFare);
    }
    public double calculateFare(){
        double bill=baseFare + distance * 0.10;
        return bill+500;
    }
}