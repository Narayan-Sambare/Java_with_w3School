import java.util.Scanner;
public class StringRev 
{
    public static void main(String[] args) 
    {
       System.out.println("Enter the sentence");
        String str= new Scanner(System.in).nextLine();
        Reverse r=new child();
        r.rev(str);

    }
}
interface Reverse
{
    
    void rev(String str);
}
class child implements Reverse
{
    
    public void rev(String str)
    {
        String tem[]= child.arry(str);
        for(int i=0;i<tem.length;i++)
        {
            if(tem[i] != null && !tem[i].equals(""))
            {
                 System.out.print(reverseString(tem[i])+" ");
            }
        }
        
    }
    public static String reverseString(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }
    public static String [] arry(String str)
    {
        String tem[]=new String[str.length()];

        int j=0;
        String t=" ";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == ' ')
            {
                  tem[j++]=t;
                  t=" ";
            }
            else{
               t+=str.charAt(i);
            }
        }
        if(!t.equals(" "))  // Add the last word
            {
                tem[j++] = t;
            }   
            String newarr[] =new String[j];
            for(int i=0;i<j;i++)
            {
                newarr[i]=tem[i];
            }

        return newarr;
    }
}