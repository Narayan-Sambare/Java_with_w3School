/*
    1
   212
  32123
 4321234
543212345
*/

public class pattern7{
	public static void main(String x[]){
		
		for(int i=1 ; i<=5 ; i++){
			int n=1, m=i;
			for(int j=1 ; j<=9 ; j++){
				
				if(j>=6-i && j<=4+i){
				
					if(j<=5){
						
						System.out.print(m);
						m--;
					}else{
						n++;
						System.out.print(n);
						
					}
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}