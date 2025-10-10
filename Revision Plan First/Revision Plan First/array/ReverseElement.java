//5. Reverse an Array
public class ReverseElement{
	public static void main(String x[]){
		int []a = {1,2,3,4,5,78,3};
		int e=a.length-1;
		for(int i=0 ; i<(a.length)/2 ;i++){
			int temp = a[i];
			a[i] = a[e];
			a[e]=temp;
			e--;
		}
		for(int i:a){
			System.out.println(i);
		}
		
	}
}