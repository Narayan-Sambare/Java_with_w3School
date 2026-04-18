
import java.util.*;
public class SummaryRange_228 {

    public static void main(String[] args) {
        List res=summaryRanges(new int[]{0,1,2,4,5,7});
        System.out.print(res);
    }

    public static List<String> summaryRanges(int[] nums){

        // int start=0;
        // List<String> str= new ArrayList<String>();
        // boolean flag=true;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==nums[i+1]-1)
        //     {
        //         flag=true;
        //     }else
        //     {
        //         if(flag)
        //         {
        //             String f=String.valueOf(nums[start]);
        //             String sec=String.valueOf(nums[i]);
                    
        //             str.add(f+"->"+sec);
        //             start=i+1;
        //             flag= false;
        //         }
        //         else{
        //             str.add(String.valueOf(nums[start]));
        //             start=i+1;
        //             flag= false;
        //         }
        //     }
        // }
        // return str;


        
        List<String> str = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1)
            {
                i++;
            }
            
            if (start != nums[i]) {
                str.add(start + "->" + nums[i]);
            } else {
                str.add(String.valueOf(start));
            }
        }
        
        return str;
    }
}