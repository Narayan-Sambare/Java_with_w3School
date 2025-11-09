// Q4. Write program to create class name as Area with constructor overloading
//        Area(float radius): this function can accept radius as input and calculate circle Area
//       Area(int len,int width): this function can accept len and width as input and calculate area of rectangle

public class Q4 
{
    public static void main(String x[]) 
    {
        Area circle = new Area(7.5f);
        System.out.println("Area of Circle: " + circle.getArea());

        Area rectangle = new Area(5, 10);
        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}
class Area {
    private float area;

    // Constructor for circle
    Area(float radius) {
        this.area = 3.14f * radius * radius;
    }

    // Constructor for rectangle
    Area(int len, int width) {
        this.area = len * width;
    }

    float getArea() {
        return area;
    }
}