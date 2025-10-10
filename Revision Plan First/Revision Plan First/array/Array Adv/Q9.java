/*
9. Count Subarrays of Size K with Avg ≥ Target

Approach: Sliding Window
Example: arr = [2,1,3,4,1,2], k = 3, avg = 2 → Count: 2
*/
public class Q9{
	public static void main(String x[]){
		int a[] = {2,1,3,4,1,2};
		int k=3 ,sum=0	, avg = 2, count =0 ;
		
		for(int i=0 ; i<a.length ; i++){
			sum = sum+a[i];
			if(i>=k){
				sum = sum-a[i-k];
			}
			
			if(i>=k-1){
				double avg1 =(double) sum/k;
			
			if(avg1==avg) count++;
		}
		}
		System.out.println(count);
	}
}