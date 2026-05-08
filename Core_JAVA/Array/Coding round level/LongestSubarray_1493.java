class LongestSubarray_1493 {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int zeros = 0;
        int right;

        for (right = 0; right < nums.length; right++) {
            // If we hit a 0, increment our zero counter
            if (nums[right] == 0) {
                zeros++;
            }

            // If we have more than one zero, "shift" the window 
            // by moving the left pointer
            if (zeros > 1) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }
        }

        // The result is the window size minus 1 
        // (because we MUST delete one element)
        return right - left - 1;
    }
}