// Q1. Write a program to crate class name as Value with single function name as setValue(int,int) 
// and we have to create three child classes name as
// 1.Add with function int getAdd() ,
// 2.Mul with function getMul() and 
// 3.Div with function getDiv() and 
// getAdd() function return addition of two value which is inherited from Value class ,
// getMul() function return multiplication of two values which is inherited from Value class and
// gitDiv() function return division of two values which Is inherited from Value class.

class Value {
    int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
class Add extends Value {
    int getAdd() {
        return a + b;
    }
}
class Mul extends Value {
    int getMul() {
        return a * b;
    }
}
class Div extends Value {
    int getDiv() {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }
}
public class Q1 {
    public static void main(String x[] ) {
        Add addition = new Add();
        addition.setValue(10, 5);
        System.out.println("Addition: " + addition.getAdd());

        Mul multiplication = new Mul();
        multiplication.setValue(10, 5);
        System.out.println("Multiplication: " + multiplication.getMul());

        Div division = new Div();
        division.setValue(10, 5);
        System.out.println("Division: " + division.getDiv());
    }
}
