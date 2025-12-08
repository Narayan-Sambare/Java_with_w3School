//4. Search for an Element in an Array
public class SearchElement{
	public static void main(String x[]){
		int []a = {1,2,3,4,5,78,3};
		int s =5;
		boolean f=false;
		for(int i=0 ; i<a.length ;i++){
			if(a[i]==s){
				System.out.println("Element found at index "+ i);
				
				f=true;
				break;
			}
		}
		if(!f){
			System.out.println("Not Found");
		}
	}
}