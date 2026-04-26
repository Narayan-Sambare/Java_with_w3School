class Reverse_Words_in_a_String_151 {
    public static void main(String x[])
    {
        String res=reverseWords("sanket is good person");
        System.out.print(res);
    }
    public static  String reverseWords(String s) {
        
        String str[]=s.trim().split("\\s+");
        int l=0,r=str.length-1;
        while(l<r)
        {
            String temp=str[l];
            str[l++]=str[r];
            str[r--]=temp;
        }
        return String.join(" ",str);
    }
}