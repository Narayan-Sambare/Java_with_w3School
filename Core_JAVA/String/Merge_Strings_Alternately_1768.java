public class Merge_Strings_Alternately_1768{
    public static void main(String x[])
    {
        System.out.println(mergeAlternately("Sne","akt"));
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuffer str=new StringBuffer();
        int l=0,r=0;
        while(l<word1.length() || r<word2.length())
        {
            if(l<word1.length())
            {
                str.append(word1.charAt(l++));
            }
            if(r<word2.length())
            {
                str.append(word2.charAt(r++));
            }
        }
        return str.toString();
    }
    
}
