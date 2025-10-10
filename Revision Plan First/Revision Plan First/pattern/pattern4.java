/*

*********
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*********

*/

public class pattern4{
	public static void main(String x[]){
		
		for(int i=1 ; i<=9 ; i++){
			for(int j=1 ; j<=9 ; j++){
				if(i==1 || i==9 || i==j || j==10-i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}