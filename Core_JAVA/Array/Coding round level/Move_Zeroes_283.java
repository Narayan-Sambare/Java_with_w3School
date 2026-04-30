class Move_Zeroes_283 {
    public static void main(String[] args) {
        int nums[]=new int[]{1,2,0,3,0,5};
        moveZeroes(nums);
        for(int i:nums)
        {
            System.out.print(i+" ");
        }
    }
    
    public static void moveZeroes(int[] nums) {
        int l=0;
        int r=0;
       while(l<nums.length)
        {
            if(r<nums.length && nums[r]!=0)
            {
                nums[l++]=nums[r];
            }
            
            if(l<nums.length && r>=nums.length-1)
            {
                nums[l++]=0;
            }
            r++;
            
        }

       
    }
}