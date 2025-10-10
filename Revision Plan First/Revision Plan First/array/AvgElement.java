//3. Calculate the Sum and Average of Elements

//3. Calculate the Sum and Average of Elements
public class AvgElement{
	public static void main(String x[]){
		int []a = {1,2,3,4,5,78,3};
		int sum =0;
		for(int i=0 ; i<a.length ;i++){
			sum = sum+a[i];
		}
		System.out.println(sum);
		double avg=(double)sum/a.length;
		System.out.println(avg);
	}
}