//1. Find the Largest Element in an Array
public class LargeElement{
	public static void main(String x[]){
		int []a = {1,2,3,4,5,78,3};
		int max =0;
		for(int i=0 ; i<a.length ;i++){
			if(a[i]>max){
				max = a[i];
			}
		}
		
		System.out.println(max);
	}
}