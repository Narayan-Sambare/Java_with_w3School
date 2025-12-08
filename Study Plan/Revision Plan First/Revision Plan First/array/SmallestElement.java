//2. Find the Smallest Element in an Array
public class SmallestElement{
	public static void main(String x[]){
		int []a = {9,2,3,4,5,78,3};
		int min =a[0];
		for(int i=0 ; i<a.length ;i++){
			if(a[i]<min){
				min = a[i];
			}
		}
		
		System.out.println(min);
	}
}