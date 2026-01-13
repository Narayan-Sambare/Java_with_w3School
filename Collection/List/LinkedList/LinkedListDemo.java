import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        System.out.println("This is LinkedList class");

        Scanner sc = new Scanner(System.in);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        System.out.println("Initial LinkedList: " + linkedList);
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
                    linkedList.add(n);
                    System.out.println("Updated LinkedList: " + linkedList);
                    break;
                case 2:
                    System.out.println("Enter element to remove:");
                    n = (Integer)sc.nextInt();
                     if(linkedList.contains(n)){
                        linkedList.remove(linkedList.indexOf(n));
                        System.out.println("Value removed successfully !");
                        System.out.println("Updated LinkedList: " + linkedList);
                    } else {
                        System.out.println("Invalid value this value is not present in the LinkedList");
                    }
                    break;
                case 3:
                    System.out.println("Enter old element:");
                    n = sc.nextInt();
                    System.out.println("Enter new element:");
                    int newElement = sc.nextInt();
                    if(linkedList.contains(n)){
                        linkedList.set(linkedList.indexOf(n), newElement);
                        System.out.println("Updated LinkedList: " + linkedList);
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
