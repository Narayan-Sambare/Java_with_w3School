public class finalValueAfterOperation{
    public static void main(String x[])
    {
        String str[]={"--X","X++","X++"};
        String str2[]={"++X","++X","X++"};
        System.out.println(finalValueAfterOperations(str));
        System.out.println(finalValueAfterOperations(str2));
    } 



    static public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String op : operations) {
            if (op.contains("+")) {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
}