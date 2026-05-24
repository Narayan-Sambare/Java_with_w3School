import java.util.*;
import java.util.stream.Collectors;

class Find_the_Difference_of_Two_Arrays_2215 {

    public static void main(String x[])
    {
        System.out.print(findDifference(new int[]{1,2,3},new int[]{1,4,3}));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Step 1: Create Sets to store unique values from each array
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        // Step 2: Filter elements that are unique to each set
        List<Integer> diff1 = set1.stream()
            .filter(n -> !set2.contains(n))
            .collect(Collectors.toList());

        List<Integer> diff2 = set2.stream()
            .filter(n -> !set1.contains(n))
            .collect(Collectors.toList());

        // Step 3: Return as a list of lists
        return Arrays.asList(diff1, diff2);
    }
}