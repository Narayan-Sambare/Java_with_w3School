/*
Q4. Area Calculator – Geometric Shapes
Interface: Shape
Method:
    double area()
Implementing Classes:
    Circle → π × r²
    Rectangle → l × b
    Triangle → ½ × base × height
Task:
    Create 9 shapes (3 of each type).
    Print area of each.
    Find shape with maximum area.
Explanation:
Strengthens:
    Interface polymorphism
    Math logic per shape
    Maximum value logic using loops
    Usage of interface array
*/
import java.util.*;
public class Area_Calculator
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter count");
        int n=sc.nextInt();
        Shape s[]=new Shape[n];
        for(int i=0;i<s.length;i++)
        {
            System.out.println("1.Circle\n2.Rectangle\n3.Triangle");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the radius");
                    float r=sc.nextFloat();
                    s[i]=new Circle(r);
                    break;
                case 2:
                    System.out.println("Enter length");
                    float l=sc.nextFloat();
                    System.out.println("Enter breadth");
                    float b=sc.nextFloat();
                    s[i]=new Rectangle(l,b);
                    break;
                case 3:
                    System.out.println("Enter base");
                    float ba=sc.nextFloat();
                    System.out.println("Enter hight");
                    float h=sc.nextFloat();
                    s[i]=new Triangle(ba,h);
                    break;
                default :
                System.out.println("Enter valid input");
                i--;
                break;
            }
        }
        System.out.println("==================== Display Area ================");
        int mxi=0;
        double mx=0;
        for(int i=0;i<s.length;i++)
        {
            System.out.println("Area of "+s[i].getType()+" \t: "+s[i].area());
            double temp=s[i].area();
            if(temp>mx)
            {
                mx=temp;
                mxi=i;
            }
        }
        System.out.println("=================== Display maximum area ================");
        System.out.println("Area of "+s[mxi].getType()+" \t: "+s[mxi].area());
    }
}

interface Shape{
    double area();
    String getType();
}
class Circle implements Shape{
    float r;
    String type="Circle     ";
    public String getType()
    {
        return type;
    }
    Circle(float r)
    {
        this.r=r;
    }
    public double area(){
        float pi=3.14f;
        
        return pi*(r*r);
    }
}
class Rectangle implements Shape{
    float b;
    float l;
    String type="Rectangle";
    public String getType()
    {
        return type;
    }
    Rectangle(float l,float b)
    {
        this.l=l;
        this.b=b;
    }
    public double area(){     
        return l*b;
    }
}

class Triangle implements Shape{
    float b;
    float h;
    String type="Triangle";
    public String getType()
    {
        return type;
    }
    Triangle(float b,float h)
    {
        this.b=b;
        this.h=h;
    }
    public double area(){
        return 0.5f*(b*h);
    }
}