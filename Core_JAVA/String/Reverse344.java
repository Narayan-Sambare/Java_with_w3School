public class Reverse344 {
    public static void main(String[] args) {
        System.out.println(reverseString(new char[]{'a','b','v','d','z'}));
    }
    public static char[] reverseString(char[] s) {
        
        int l=0,r=s.length-1;
        while(l<r)
        {
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
        return s;
    }
}