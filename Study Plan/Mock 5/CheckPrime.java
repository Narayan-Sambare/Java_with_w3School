public class CheckPrime {
    public static void main(String[] args) {
        int n=4;
        boolean f=false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                f=true;
                break;
            }
        }
        if(f)
        {
            System.out.println("number is not prime ");
        }else{
             System.out.println("number is prime");
        }
       
    }
}
