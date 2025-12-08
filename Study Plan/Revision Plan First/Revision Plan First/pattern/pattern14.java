/*
ABCDEFGHI
 ABCDEFG
  ABCDE
   ABC
    A
   ABC
  ABCDE
 ABCDEFG
ABCDEFGHI
*/

public class pattern14{
	public static void main(String x[]){
		
		for(int i=1 ; i<=9 ; i++){
			int n=65;
			for(int j=1 ; j<=9 ; j++){
				if((i<=5 && j>=i && j<=10-i)||(i>5 && j>=10-i && j<=i)){
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