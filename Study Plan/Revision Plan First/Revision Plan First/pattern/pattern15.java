/*
A   B
 C D
  E
 F G
H   I
*/
public class pattern15{
	public static void main(String x[]){
		int n=65;
		for(int i=1 ; i<=5 ; i++){
			for(int j=1 ; j<=5 ; j++){
				if(j==i || j==6-i){
					System.out.print((char)n);
					n++;
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}