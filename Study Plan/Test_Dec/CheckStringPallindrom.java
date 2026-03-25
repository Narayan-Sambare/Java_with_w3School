public class CheckStringPallindrom {
    public static void main(String[] args) {
        String s="madomodam";
        int f=0,l=s.length()-1;
        boolean flg=true;
        while (f<l) 
        {
            if(s.charAt(f++)!=s.charAt(l--))
            {
                flg=false;
                break;
            }
        }
        if(flg)
        {
            System.out.println("String is pallindrom");
        }
        else{
            System.out.println("String is not pallindrom");
        }
    }
}
