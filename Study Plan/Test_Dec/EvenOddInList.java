import java.util.ArrayList;

public class EvenOddInList {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
         ArrayList<Integer> Evenlist= new ArrayList<Integer>();
          ArrayList<Integer> Oddlist= new ArrayList<Integer>();
          for(int i:list)
          {
            if(i%2==0)
            {
                Evenlist.add(i);
            }
            else{
                Oddlist.add(i);
            }
          }
        System.out.println("Even list: "+Evenlist);
        System.out.println("odd list: "+Oddlist);
         

    }
}
