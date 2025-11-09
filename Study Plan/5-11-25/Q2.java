//Q2. Write program to create class name Area 
//with methods name as void setRadius(float   radius) and void setLengthWidth(int len,int wid) 
//and two child classes name as Circle and Rectangle 
//so you have to define float getCircleArea() method in Circle child class and calculate area of circle and return it and
// You have to define getRectArea() method in Rectangle class and calculate area of rectangle and return it
import java.util.*;
class area
{
    protected float radius;
    protected int length, width;
    public void setRadius(float r)
    {
        radius = r;
    }
    public void setlw(int l,int w)
    {
        length = l;
        width = w;
    }
}
class Circle extends area
{
    public float areaCircle()
    {
        return 3.14f * radius * radius;
    }
}
class Rectangle extends area
{
    public int areaRect()
    {
        return length * width;
    }
}
class Q2
{
    public static void Main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        c.setRadius(5.0f);
        System.out.println("Area of Circle: " + c.areaCircle());

        Rectangle r = new Rectangle();
        r.setlw(4, 6);
        System.out.println("Area of Rectangle: " + r.areaRect());
    }
}