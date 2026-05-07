class LeetCode_1493
{
    public static void main(String[] args) {
        System.out.print(longestSubarray(new int []{1,2,3,4,5,6,7,8}));
    }
    public static int longestSubarray(int[] nums) {
        int left = 0;
        int zeros = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            // If we find a 0, count it
            if (nums[right] == 0) {
                zeros++;
            }

            // If we have more than one 0, shrink the window from the left
            while (zeros > 1) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            // The window size is (right - left + 1)
            // But we MUST delete one element, so we use (right - left)
            maxLen = Math.max(maxLen, right - left);
        }

        return maxLen;
    }
}