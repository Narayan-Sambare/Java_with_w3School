/*2. Check for Triplets with Zero Sum
Problem:
Check if any three elements in the array sum to 0.
Example:
Input: [-1, 0, 1, 2, -1, -4]  
Output: (-1, 0, 1), (-1, -1, 2)
*/
import java.util.*;
class Prathamcode{
	public static void main(String x[]){
		Scanner sc= new Scanner(System.in);
		int a[]={-1,0,1,2,-1,-4};
		boolean flag=true;
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				int sum=0;
				int k;
				for( k=j+1;k<a.length;k++){
					sum=a[i]+a[j]+a[k];
					if(sum==0){
						System.out.print("("+a[i]+" "+a[j]+" "+a[k]+")");
					}
					else{
						flag=false;
					}
				}
			}
		}
		if(flag){
			System.out.println("NOO");
		}
	}
}