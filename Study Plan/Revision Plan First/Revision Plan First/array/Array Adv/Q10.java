/*
10. Minimum Size Subarray with Sum ≥ Target

Approach: Sliding Window
Example: arr = [2,3,1,2,4,3], target = 7 → Length: 2 ([4,3])
*/
public class Q10{
	public static void main(String x[]){
	int a[] = {2,3,1,2,4,3};
	int s=0 , c=0 ,sum=0, minc=a.length , k=7;
	for(int i=0 ; i<a.length ; i++){
		sum = sum + a[i];
	
		while(sum >= k){
			c = i-s+1;
			sum= sum-a[s];
			s++;
			if(c!=0 && c<minc){
			minc=c;
			}
		}
		
		
	}
	System.out.println(minc);

	}
}