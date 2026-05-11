class Find_Pivot_Index_724 {
    public static void main(String[] args) {
        System.out.print(pivotIndex(new int[]{1,7,3,6,5,6}));
    }

    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
       
        for (int x : nums) {
            totalSum += x;
        }
        
       
        for (int i = 0; i < nums.length; i++) 
        {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        
        return -1;
    }
}