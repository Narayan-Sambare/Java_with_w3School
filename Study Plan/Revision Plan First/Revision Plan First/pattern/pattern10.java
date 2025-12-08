public class pattern10{
	public static void main(String x[]){
		for(int i=0 ; i<=5 ; i++){
			int n=1;
			for(int j=0 ; j<=5 ; j++){
				if(j>=6-i){
				
                System.out.print(n + " ");
                n = n * (i - j) / (j + 1);
            
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}