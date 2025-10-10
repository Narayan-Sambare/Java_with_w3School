/*
5. Reverse an Array In-place

Approach: Two Pointers from both ends
Example: arr = [1,2,3,4,5] → [5,4,3,2,1]
*/
public class Q5{
	public static void main(String x[]){
	int a[] = {1,2,3,4,5};
	int s=0 , e=a.length-1;
	while(e>=s){
		
		int temp = a[s];
		a[s] = a[e];
		a[e] = temp;
	
		e--;
		s++;
	}
	
	for(int i=0 ; i<a.length ;i++){
	System.out.print(a[i]);
	}
	}
}