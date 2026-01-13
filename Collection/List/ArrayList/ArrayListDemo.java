import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        System.out.println("This is ArrayList class");

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Initial ArrayList: " + list);
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
                    list.add(n);
                    System.out.println("Updated ArrayList: " + list);
                    break;
                case 2:
                    System.out.println("Enter element to remove:");
                    n = (Integer)sc.nextInt();
                    if(list.contains(n)){
                        list.remove(list.indexOf(n));
                        System.out.println("Value removed successfully !");
                        System.out.println("Updated ArrayList: " + list);
                    } else {
                        System.out.println("Invalid value this value is not present in the list");
                    }
                    break;
                case 3:
                    System.out.println("Enter old element:");
                    n = sc.nextInt();
                    System.out.println("Enter new element:");
                    int newElement = sc.nextInt();
                    if(list.contains(n)){
                        list.set(list.indexOf(n), newElement);
                        System.out.println("Updated ArrayList: " + list);
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
