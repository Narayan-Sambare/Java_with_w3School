public class AddStrings_415 {
    public static void main(String x[])
    {
        System.out.print(addStrings("123", "100"));
    }
    public static String addStrings(String num1, String num2) {
        StringBuffer str=new StringBuffer ();
         if(num1==null) return num2;
        if(num2==null) return num1;
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
       
        while(i>=0 || j>=0)
        {
            int n1=0,n2=0,sum=0;
            
            if(i>=0)
            {
                n1=num1.charAt(i--)-'0';
            }
            if(j>=0)
            {
                n2=num2.charAt(j--)-'0';
            }
            sum=n1+n2+carry;
            carry=0;
            if(sum>=10)
            {
                carry=sum/10;
                str.append(sum%10);
            }else
            {
                str.append(sum);
            }
            if(!(i>=0 || j>=0) && carry!=0) str.append(carry);
            
        }
        return str.reverse().toString();

//         String result=String.valueOf(Long.parseLong(num1)+Long.parseLong(num2));
// return result;        
    }
}