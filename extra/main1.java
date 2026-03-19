class main1 {
    public static void main(String[] args) {
        int a=5; 
        int b=6;
        int c=10;
        if(a++==b || b++ == c && a + 4 == c)
        {
            System.out.println("a = "+a);
             System.out.println("b = "+b);
              System.out.println("c = "+c);
        }
    }
}