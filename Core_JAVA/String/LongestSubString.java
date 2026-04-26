
import java.util.*;
public class LongestSubString {
    public static void main(String[] args) {
        String s="abcabcdb";//abc bca cab abcd b;
        Set<Character> set=new LinkedHashSet();
        String temp="";
        int l=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            while(set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(l));
                l++;                
            }
            set.add(s.charAt(i));
            if(max<(i-l+1)){
                max=i-l+1;
                temp="";
                temp=set.toString();
            }
        }
        System.out.println("longest sub String length is "+max);
        System.out.println("Longest sub String is "+temp);
    }
}