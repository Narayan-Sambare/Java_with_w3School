/*
    A
   A A
  A   A
 A     A
A       A
 A     A
  A   A
   A A
    A
	*/

public class pattern13{
	public static void main(String x[]){
		
		for(int i=1 ; i<=9 ; i++){
			for(int j=1 ; j<=9 ; j++){
				if((i<=5 &&(j==6-i || j==4+i)) || (i>5 &&(j==14-i || j==i-4))){
					System.out.print("A");
					
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}