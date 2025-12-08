/*
2. Remove Duplicates from Sorted Array
   Approach: Two Pointers (slow/fast)
   Example: arr = [1,1,2,2,3] → [1,2,3]
*/
public class Q2{
	public static void main(String x[]){
		int a[] = {1,1,2,2,3 ,3 ,3 , 3,4 ,6 ,6};
	
		int i=0 , s=i+1;
		while(s<a.length){
			if(a[i] == a[s]){
				a[s]=-1;
			}else{
				i=s;
			}
			s++;
		}
		
		for(int j=0 ; j<a.length ;j++){
			if(a[j] >0){
			System.out.print(a[j]+",");
			}
	}
	
		
	}
}