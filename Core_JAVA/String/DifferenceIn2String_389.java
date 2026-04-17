
import java.util.*;
class DifferenceIn2String_389 {
    public static void main(String[] args) {
        System.out.print(findTheDifference("sanket","ssanket"));
    }
    public static char findTheDifference(String s, String t) {

        
        List <Character> set= new ArrayList<Character>();
        
        for(int i=0;i<s.length();i++)
        {
            set.add(s.charAt(i));
        }

        for(int i=0;i<t.length();i++)
        {
            if(set.contains(t.charAt(i)))
            {
                int idx=set.indexOf(t.charAt(i));
                set.remove(idx);
            }else{
               return t.charAt(i);
            }
        }
        
        return set.get(0);
    }
}