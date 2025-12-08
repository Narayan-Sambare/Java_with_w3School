// 10. Find the Area of a Circle
// Create a class CircleArea with a method findArea that calculates the area given the radius.

import java.util.*;
public class AreaOfCircle
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the radius :");
        int r=sc.nextInt();
        CircleArea c=new CircleArea();
        System.out.println("Area = "+c.findArea(r));
    }
}
class CircleArea
{
    double findArea(double r)
    {  
        return (3.14*r*r);
    }
}