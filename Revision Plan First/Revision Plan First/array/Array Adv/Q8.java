/*
8. Longest Subarray with Sum ≤ K

Approach: Sliding Window
Example: arr = [1,2,1,0,1,1,0], k = 4 → Length: 5
*/
public class Q8{
	public static void main(String x[]){
	int a[] = {1,2,1,0,1,1,0};
	
	int k=4 , len = 0,newlen=a.length , s =0 , e=0, sum=0; 
	
	while(e<a.length){
		
		sum = sum+a[e]; 
		if(sum<=k){
			newlen=e-s+1;
			s++;
		}else{
			e++;
		}
		if(len < newlen) len = newlen;
	}
	
	System.out.println(len);
	}
}