    import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {

        System.out.println("This is Vector class");

        Scanner sc = new Scanner(System.in);

        List<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        System.out.println("Initial Vector: " + v);
        do{
            System.out.println("1. Add element");
            System.out.println("2. Remove element");
            System.out.println("3. update element");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter element to add:");
                    int n = sc.nextInt();
                    v.add(n);
                    System.out.println("Updated Vector: " + v);
                    break;
                case 2:
                    System.out.println("Enter element to remove:");
                    n = (Integer)sc.nextInt();
                     if(v.contains(n)){
                        v.remove(v.indexOf(n));
                        System.out.println("Value removed successfully !");
                        System.out.println("Updated Vector: " + v);
                    } else {
                        System.out.println("Invalid value this value is not present in the vecotor");
                    }
                    break;
                case 3:
                    System.out.println("Enter old element:");
                    n = sc.nextInt();
                    System.out.println("Enter new element:");
                    int newElement = sc.nextInt();
                    if(v.contains(n)){
                        v.set(v.indexOf(n), newElement);
                        System.out.println("Updated Vector: " + v);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        } while (true);  
    }
}
