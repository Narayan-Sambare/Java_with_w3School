// Q1. Write program to create class name as Factorial with two functions
//        void setValue(int x): this function accept number as parameter
//       int getFactorial(): this function can calculate factorial of number and return it.

public class Q1 {
    public static void main(String x[]) {
        Factorial fact = new Factorial();
        fact.setValue(5);
        System.out.println("Factorial: " + fact.getFactorial());
    }

}
class Factorial {
    private int number;

    void setValue(int x) {
        this.number = x;
    }

    int getFactorial() {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
