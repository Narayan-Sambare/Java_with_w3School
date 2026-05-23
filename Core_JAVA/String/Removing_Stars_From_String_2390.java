public class Removing_Stars_From_String_2390
{
    public static void main(String[] args) {
        System.out.print(removeStars("Sanket**etsam***"));
    }
    public static String removeStars(String s) {
       StringBuilder str = new StringBuilder();
       int count=0;
        for(int i=0;i<s.length();i++)
        {   
            char ch=s.charAt(i);
            if(ch == '*')
            {
                str.deleteCharAt(str.length() - 1);
            }
            else{
               str.append(ch);                
            }
           
        }
        return str.toString();
    }
}