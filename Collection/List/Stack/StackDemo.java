import java.util.*;

public class StackDemo {
    public static void main(String[] args) {

        System.out.println("This is Stack class");

        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        System.out.println("Initial Stack: " + stack);
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
                    stack.push(n);
                    System.out.println("Updated Stack: " + stack);
                    break;
                case 2:
                    Object c=stack.pop();
                    if(c!=null){
                            System.out.println("Value removed successfully : "+c);
                            System.out.println("Updated Stack: " + stack);
                    } else {
                        System.out.println("Stack is empty ");
                    }
                    break;
                case 3:
                    System.out.println("Enter old element:");
                    n = (Integer)sc.nextInt();
                    System.out.println("Enter new element:");
                    int newElement = (Integer)sc.nextInt();
                    if(stack.contains(n)){
                        stack.set(stack.indexOf(n), newElement);
                        System.out.println("Updated Stack: " + stack);
                    } else {
                        System.out.println("Invalid value this value is not present in the stack");
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
