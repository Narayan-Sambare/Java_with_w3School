/*
6. Maximum Sum Subarray of Size K

Approach: Sliding Window
Example: arr = [1,4,2,10,2,3,1,0,20], k = 4 → 24
*/
public class Q6{
	public static void main(String x[]){
		int a[] = {1,4,2,10,2,3,1,0,20};
		int sum =0 , maxsum=-1,k=4,s=0;
		for(int i=0 ; i<a.length ; i++)
		{
							
			sum = sum +a[i];
			
			if(i>=k-1){
				if(sum>maxsum){
					maxsum=sum;
				}
				sum = sum - a[i-(k-1)];
			}
		}
		System.out.println(maxsum);
	}
}