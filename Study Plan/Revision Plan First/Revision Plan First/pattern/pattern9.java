/*
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
 1 2 3 4
  1 2 3
   1 2
    1
	
*/

public class pattern9{
	public static void main(String x[]){
		
		for(int i=1 ; i<=9 ; i++){
			int n= 1;
			for(int j=1 ; j<=9 ; j++){
				if(( i<=5 && j>=6-i && j<= 4+i)||(i>5 && j>=i-4 && j<=14-i)){
					if(i%2==1 && j%2==1){
						System.out.print(n);
						n++;
					}else if(i%2==0 && j%2==0){
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

