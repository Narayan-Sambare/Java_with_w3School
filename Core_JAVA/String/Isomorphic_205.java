import java.util.*;
public class Isomorphic_205
{
    public static void main(String x[])
    {
        System.out.println(isIsomorphic("egg","ttt"));
    }

    public static boolean isIsomorphic(String s, String t)
    {
        if(s.length()!= t.length()) return false;

        HashMap<Character,Character> mapS = new HashMap<Character,Character>();
        HashMap<Character,Character> mapT = new HashMap<Character,Character>();

        for(int i=0;i<s.length();i++)
        {
            char c1=s.charAt(i);
            char c2=t.charAt(i);

           if (mapS.containsKey(c1)){
                if(mapS.get(c1) != c2) return false;
            }else{
                mapS.put(c1, c2);
            }
            
            if (mapT.containsKey(c2))
            {
                if(mapT.get(c2)!=c1) return false;
            }
            else{
            mapT.put(c2, c1);
            }
        }
        return true;
    }
}