// 9. Convert Celsius to Fahrenheit
// Create a class TemperatureConverter with a method convertToFahrenheit that converts a Celsius value to Fahrenheit.
// Explanation: Demonstrates unit conversion logic.
import java.util.*;
public class CelsiusToFahrenheit
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  temperature in celsius");   
        int t=sc.nextInt();
        TemperatureConverter tem=new TemperatureConverter();
        double f=tem.convertToFahrenheit(t);
        System.out.println("Fahrenheit : "+f);
    }
}
class TemperatureConverter
{
    double convertToFahrenheit(double t)
    {
        double f= t*(1.8+32);
        return f;
    }
}