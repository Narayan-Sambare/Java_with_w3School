// Q5.Write a menu-driven program using switch and do-while to perform:
// 1.Enter product price and quantity, calculate total bill
// 2.Apply discount (10% if bill > ₹1000)
// 3.Calculate GST on bill amount (18%)
// 4.Compare final bill amount with a given value
// 5.Exit the program

import java.util.*;
public class Q5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int price,quantity;
        float tbill=0,dic10,gst,fbill,finalbill=0;
        System.out.println("Enter product price and quantity");
        price=sc.nextInt();
        quantity=sc.nextInt();
        do
        {
           System.out.println("\nChoose the one number:-"); 
           System.out.println("1.calculate total bill"); 
           System.out.println("2.Apply discount (10% if bill > 1000)"); 
           System.out.println("3.Calculate GST on bill amount (18%)"); 
           System.out.println("4.Compare final bill amount with a given value"); 
           System.out.println("5.Exit the program\n"); 
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1: System.out.println("\nThis code for calculate total bill\n"); 
                    tbill=price*quantity;
                    System.out.println("Total bill-->"+tbill);
                    break;

                case 2: System.out.println("\nThis code for Apply discount (10% if bill > ₹1000)\n");
                    if(tbill>1000)
                    {
                        dic10=tbill*0.1f;
                        tbill=tbill-dic10;
                        System.out.println("10% dicount-->"+dic10);
                        System.out.println("final bill after 10% discount -->"+tbill);
                    }
                    else
                    {
                    System.out.println("total bill is less than 1000"); 
                    }                  
                    break;
                    
                case 3: System.out.println("\nThis code for Calculate GST on bill amount (18%)\n");
                    gst=tbill*0.18f;
                    finalbill=gst+tbill;
                    System.out.println("18%  GST "+gst);
                    System.out.println("Total bill after 18%  GST "+finalbill);
                    break;

                case 4: System.out.println("\nThis code for Compare final bill amount with a given value\n"); 
                    if(tbill>finalbill)
                    {
                        System.out.println("total bill is greater");
                    }
                    else{
                        System.out.println("total bill is less than final bill");
                    }
                    break;
                case 5: 
                    return;
            }
        }while(true);

        
    }
    
}

