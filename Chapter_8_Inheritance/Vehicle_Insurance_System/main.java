import java.util.*;
public class main {
    public static void main(String x[]) {
        Scanner sc=new Scanner(System.in);
        Vehicle v[]=new Vehicle[2];
        Vehicle vh=new Vehicle();
        for(int i=0;i<v.length;i++)
        {
            System.out.println("1 for Bike \n2 for Car");
            int ch =sc.nextInt();
            switch(ch)
            {
                case 1:
                    Bike b=new Bike();
                    System.out.println("Enter the bike model :");
                    sc.nextLine();  
                    b.setModel(sc.nextLine());

                    System.out.println("Enter the bike Brand :");
                    b.setBrand(sc.nextLine());
                
                    System.out.println(" Enter Bick Base Price :");
                    b.setBasePrice(sc.nextDouble());

                    System.out.println("Bick has ABS ( True or False ) :");
                    b.setABS(sc.nextBoolean());
                    v[i]=b;       
                    break;

                case 2:
                    Car c=new Car();
                    System.out.println("Enter the car model :");
                    sc.nextLine();  
                    c.setModel(sc.nextLine());

                    System.out.println("Enter the car Brand :");
                    c.setBrand(sc.nextLine());
                
                    System.out.println(" Enter car Base Price :");
                    c.setBasePrice(sc.nextDouble());
                    
                    System.out.println("car has AirBag ( True or False ) :");
                    c.setAirBag(sc.nextBoolean());
                    v[i]=c;
                    
                    break;

                default :
                    System.out.println("Enter the valid input");
                    i--;
                    break;
            }  
        }

        vh.display(v);

        System.out.println("===============Premium ===========");
       for(int i=0;i<v.length;i++)
       {
            double d=vh.calPremium(v[i].getBasePrice());
            System.out.println("Premium for moedel ( "+v[i].getModel()+" ) : "+d);
       }
        System.out.println("===============highest insurance premium ===========");
    }
}


class Vehicle
{
    private String brand;
    private String model;
    private double basePrice;

    void setBrand(String br)
    {
        this.brand=br;
    }
    void setModel(String m)
    {
        this.model=m;
    }
    void setBasePrice(double bp)
    {
        this.basePrice=bp;
    }
    String getBrand()
    {
        return brand;
    }
    String getModel()
    {
        return model;
    }
    double getBasePrice()
    {
        return basePrice;
    }
    
    double calPremium(double basePrice)
    {
        return basePrice*0.05;
    }
    void display(Vehicle[] v)
    {
        System.out.println("=====================Vehicle Details=================");
        for(int i=0;i<v.length;i++)
        {
            System.out.println("Brand : "+v[i].getBrand()+"\tModel : "+v[i].getModel()+"\tBasePrice : "+v[i].getBasePrice());
        }
    }
}

class Car extends Vehicle {
    
    private boolean airBag;

    void setAirBag(boolean airBag)
    {
        this.airBag=airBag;
    }
    boolean getAirBag()
    {
        return airBag;
    }

    void HigInsurence(Vehicle []a)
        {       double high=0;
                int hidx=0;
            for(int i=0;i<a.length;i++)
            {
               
                double d=calPremium(a[i].getBasePrice());
                if(high<d)
                {
                    high=d;
                    hidx=i;
                }
            }
            System.out.println("highest insurance premium");
            System.out.println("Brand : "+a[hidx].getBrand()+"\tModel : "+a[hidx].getModel()+"\t BasePrice : "+a[hidx].getBasePrice()+"\n vhighest insurance premium : "+high);
        }

    double calPremium(Double baseprice,String airBag)
    {
        if(airBag.equals("Yes"))
        {
            return baseprice*=0.12;
        }
        else
            {
                return baseprice*=0.05;
            } 
    }
}

class Bike extends Vehicle {
    
       private boolean ABS;

        void setABS(boolean ABS)
        {
            this.ABS=ABS;
        }
        boolean getABS()
        {
            return ABS;
        }

        void HigInsurence(Vehicle []a)
        {       
            double high=0;
            int hidx=0;
            for(int i=0;i<a.length;i++)
            {
                double d=calPremium(a[i].getBasePrice());
                if(high<d)
                {
                    high=d;
                    hidx=i;
                }
            }
            System.out.println("highest insurance premium");
            System.out.println("Brand : "+a[hidx].getBrand()+"\tModel : "+a[hidx].getModel()+"\t BasePrice : "+a[hidx].getBasePrice()+"\n vhighest insurance premium : "+high);
        }
        double calPremium(Double baseprice)
        {
            if(ABS)
            {
                return baseprice*=0.08;
            }
            else
            {
                return baseprice*=0.03;
            } 
        }

    }

