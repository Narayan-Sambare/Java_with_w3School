class Find_the_Highest_Altitude_1732
{
    public static void main(String[] args)
    {
        System.out.print(largestAltitude(new int[]{-5,1,5,0,-7}));
    }

    public static int largestAltitude(int[] gain) {
        int max=0;
        int temp=0;
        for(int i: gain)
        {   temp+=i;
            if(max<temp)
            {
                max=temp;
            }
        }
        return max;
    }
}