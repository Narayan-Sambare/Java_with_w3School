import java.util.*;
class Map_Entry{
    public static void main(String[] args) {
       HashMap map=new HashMap();
       map.put(1,"sanket");
       map.put(2,"narayan");
       map.put(3,"ram");
       map.put(4,"sham");
       Set<Map.Entry> set= map.entrySet();
       for(Map.Entry s:set)
       {
           System.out.println(s.getKey()+" is key and "+s.getValue()+" is value");
       }
    }
}