/*
        A
      B A B
    C B A C D
  D C B A E F G
E D C B A H I J K

*/

public class pattern12{
	public static void main(String x[]){
	int n=64 , m = 66;
		for(int i=1 ; i<=5 ; i++){
					n=n+i;
			for(int j=1 ; j<=9 ; j++){
				if(i<=5 && j>=6-i && j<=4+i){
					if(j<=5){
						System.out.print((char)n+" ");
						n--;
					}else {
						System.out.print((char)m+" ");
						m++;
					}
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}