class Max_Number_of_K_Sum_Pairs_1679{
    public static void main(String[] args) {
        System.out.println(maxOperations(new int []{1,2,3,4}, 5));
    }
    public static int maxOperations(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>k)
            {
                continue;
            }
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==k)
                {
                    nums[j]=Integer.MAX_VALUE;
                    nums[j]=Integer.MAX_VALUE;
                    count++;
                    break;
                }
            }
            
        }
        return count;
    }
}