/*
Q2. Animal Sound System – Abstract Behavior
Abstract class: Animal
Methods:
    abstract void sound()
    abstract String category()
Child classes:
    Dog → sound: "Bark", category: "Pet"
    Lion → sound: "Roar", category: "Wild"
    Snake → sound: "Hiss", category: “Reptile”
Task:
    Store 10 animals (mixed types).
    Print sound + category for each.
    Count how many animals belong to category “Pet”.
Explanation:
Tests:
Abstract methods needing compulsory override
Multiple child classes
Logical counting based on return values
Runtime polymorphism
*/
import java.util.*;
public class Animal_Sound_System{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter count");
        int n=sc.nextInt();
        Animal[] a = new Animal[10];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("1.Dog\n2.Lion\n3.Snack");
            int ch =sc.nextInt();
            switch (ch) {
                case 1:
                    a[0] = new Dog();
                    break;
                case 2:
                    a[0] = new Lion();
                    break;
                case 3:
                    a[0] = new Snake();
                    break;
            
                default:
                    System.out.println("Enter valid input");
                    i--;
                    break;
            }
        }
            
            int petCount = 0;
            for (Animal ani : a)
            {
                ani.sound();
                System.out.println("Category: " + ani.category());
                if (ani.category().equals("Pet")) {
                    petCount++;
                }
            }
            System.out.println("Number of Pet animals: " + petCount);
        }
}
abstract class Animal{
    abstract void sound();
    abstract String category();
}
class Dog extends Animal{
    void sound() {
        System.out.println("Sound: Bark");
    }
    String category() {
        return "Pet";
    }
}

class Lion extends Animal {

    void sound() {
        System.out.println("Sound: Roar");
    }

    String category() {
        return "Wild";
    }
}

class Snake extends Animal {

    void sound() {
        System.out.println("Sound: Hiss");
    }

    String category() {
        return "Reptile";
    }
}