/*
3. Move All Zeros to End
Approach: Two Pointers
Example: arr = [0,1,0,3,12] → [1,3,12,0,0]
*/
public class Q3{
	public static void main(String []x){
		int a[] ={0,1,0,3,12};
	int s=0;
	for(int i=0 ; i<a.length ;i++){
		if(a[i] !=0){
			int temp = a[s];
			a[s] = a[i];
			a[i] = temp;
			s++;
		}
	}
	
	for(int i=0 ; i<a.length ;i++){
	System.out.print(a[i]+",");
	}
	}
}