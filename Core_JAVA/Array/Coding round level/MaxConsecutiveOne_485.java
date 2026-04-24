class MaxConsecutiveOne_485 {

    public static void main(String[] args) 
    {
        System.out.print(findMaxConsecutiveOnes(new int[]{1,1,1,1,0,1,1,1,0,1,1,1,1,1}));
    }
    public static int findMaxConsecutiveOnes(int[] nums) 
    {
        int max=0,len=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                len++;
            }
            else{
                len=0;
            }
            if(max<len) max=len;
        }
        return max;
    }
}