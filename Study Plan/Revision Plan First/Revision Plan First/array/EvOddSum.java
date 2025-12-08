//8. Count Even and Odd Numbers in an Array
public class EvOddSum{
	public static void main(String x[]){
		int []a = {1,2,3,4,5,78,3};
		int even=0 ,odd=0;
		for(int i=0 ; i<(a.length);i++){
			if(a[i] %2==0){
				even++;
			}else{
				odd++;
			}
		}
		
			System.out.println("Even :" + even );	
			System.out.println("Odd :" + odd );
		
		
	}
}