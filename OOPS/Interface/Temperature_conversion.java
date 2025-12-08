import java.util.*;
public class Temperature_conversion {
    public static void main(String[] x){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ");
        int n1=sc.nextInt();
        Converter c[]=new Converter[n1];
        float result[]=new float[n1];
       for(int i=0;i<c.length;i++)
       {
            System.out.println("Enter the "+(i+1)+" number");
            int n=sc.nextInt();
            System.out.println("1.Celsius To Fahrenheit\n2.Fahrenheit To Celsius\n3.Celsius To Kelvin");
            int ch=sc.nextInt();
            switch (ch) 
            {
                case 1:
                    c[i]=new CelsiusToFahrenheit(n);
                     result[i] = c[i].convert(n);
                break;
                case 2:
                    c[i]=new FahrenheitToCelsius(n);
                     result[i] = c[i].convert(n);
                break;
                case 3:
                    c[i]=new CelsiusToKelvin(n);
                    result[i] = c[i].convert(n);
                break;

                default:
                    System.out.println("Enter the valid input");
                    i--;
                    break;
            }  
       }
       System.out.println("=================== conversions in tabular form ==================");
       for(int i=0;i<result.length;i++)
       {
             System.out.println("input : "+c[i].getValue()+"\t|  "+c[i].getType()+"\t|\tOutput : "+result[i]);
       }
       System.out.println("=================== highest converted value ==================");
       float high=result[0];
       for(int i=0;i<result.length;i++)
       {
            if(high<result[i])
            {
                high=result[i];
            }
        }
        System.out.println("highest converted value :"+high);
    }
}
interface Converter{
    float convert(float value);
    float getValue();
    String getType();
}

class CelsiusToFahrenheit implements Converter{
    String type="CelsiusToFahrenheit";
    float value;
    CelsiusToFahrenheit(float value)
    {
        this.value=value;
    }
    public float getValue()
    {
        return value;
    }
    public String getType()
    {
        return type;
    }
    public float convert(float value)
    {
        return  (value *(9.0f/5) + 32);
    }
}
class FahrenheitToCelsius implements Converter{
    String type="FahrenheitToCelsius";
    float value;
    FahrenheitToCelsius(float value)
    {
        this.value=value;
    }
    public float getValue()
    {
        return value;
    }
    public String getType()
    {
        return type;
    }
    public float convert(float value)
    {
        return ( (value-32) *(5.0f/9) );
    }
}
class CelsiusToKelvin implements Converter{
    String type="CelsiusToKelvin";
    float value;
    CelsiusToKelvin(float value)
    {
        this.value=value;
    }
    public float getValue()
    {
        return value;
    }
    public String getType()
    {
        return type;
    }
    public float convert(float value)
    {
        return  (value+273.15f);
    }
}