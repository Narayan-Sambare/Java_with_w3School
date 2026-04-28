class Increasing_Triplet_Subsequence_334
 {
    public static void main(String[] args) {
        System.out.print(increasingTriplet(new int []{1,2,3,4,5,6}));
    }  
    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= first) {
                first = n;
            } else if (n <= second) {
                second = n;
            } else {
                return true;
            }
        }
        return false;
    }
}