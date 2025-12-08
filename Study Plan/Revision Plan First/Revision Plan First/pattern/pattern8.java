/*
        1
      2 3
    4 5 6
  7 8 9 10
11 12 13 14 15

*/

public class pattern8{
	public static void main(String x[]){
		int n=1;
		for(int i=1 ; i<=5 ; i++){
			for(int j=1 ; j<=9 ; j++){
				
				if(j>=11-(i+i)){
					if(j%2==1){
						System.out.print(n);
						n++;
					}else{
						System.out.print(" ");
					}
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}