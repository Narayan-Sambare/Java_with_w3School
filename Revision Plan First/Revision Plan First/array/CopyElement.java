//6. Copy One Array into Another
public class CopyElement{
	public static void main(String x[]){
		int []a = {1,2,3,4,5,78,3};
		int []e = new int[a.length];
		for(int i=0 ; i<a.length ;i++){
			e[i] = a[i];
		}
		for(int i:e){
			System.out.println(i);
		}
		
	}
}