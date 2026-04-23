import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("sanket","ketan"));
    }

    static public boolean isAnagram(String s, String t)
    {
        if(s.length()!=t.length()) return false;

        ArrayList<Character> set= new ArrayList();

            for(int i=0;i<s.length();i++)
            {
                set.add(s.charAt(i));
            }
            for(int i=0;i<s.length();i++)
            {
                set.remove(Character.valueOf(t.charAt(i)));
            }
            if(set.size()==0)
            {
                return true;
            }
            else{
                return false;
            }
    }
}