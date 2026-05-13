import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Unique_Number_of_Occurrences_1207 
{
    public static void main(String[] args) 
    {
        System.out.print(uniqueOccurrences(new int[]{1,1,1,2,2,3,}));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i: arr)
        {
           map.put(i, map.getOrDefault(i, 0)+1);
        }
            Set<Integer> set= new HashSet<>();

        for(Integer i : map.keySet())
        {
            if(!set.add(map.get(i)))
            {
                return false;
            }
        }
        return true;
    }
}