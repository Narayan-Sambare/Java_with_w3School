//9. Merge Two Arrays
public class MergeArray{
	public static void main(String x[]){
		int []a = {1,2,3,4};
		int  []b ={5,78,5,3};
		int []k = new int[a.length+b.length];
		for(int i=0 ; i<(a.length);i++){
			k[i] = a[i];
			k[i+a.length]=b[i];
		}
		for(int i:k){
			System.out.println(i);
		}
		
	}
}