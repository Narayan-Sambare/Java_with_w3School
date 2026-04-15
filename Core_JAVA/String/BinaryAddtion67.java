public class BinaryAddtion67 {
    public static void main(String[] args) {
        String result=addBinary("110011","101010");
        System.out.println(result);
    }


    public static String addBinary(String a, String b) {
        StringBuffer str=new StringBuffer();
        int n1=a.length()-1;

        int n2=b.length()-1;

        int c=0, sum=0;
        while(n1>=0 || n2>=0)
        {
            int t1=0,t2=0; 
            if(n1>=0) t1=a.charAt(n1--)-'0';
            if(n2>=0) t2=b.charAt(n2--)-'0';
            
            sum=t1+t2+c;
            str.append(sum % 2);
            c = sum / 2;
        }
        if(c==1) str.append(c);

       return str.reverse().toString();
    }
}