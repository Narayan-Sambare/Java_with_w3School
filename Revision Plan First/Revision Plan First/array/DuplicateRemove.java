//10. Remove Duplicate Elements from Array
public class DuplicateRemove{
	public static void main(String x[]){
		int a[] = {1,1,2,2,3 ,3 ,3 , 3,4 ,6 ,6};
		int e=1 , s=0;
		while(e<a.length){
			if(a[e] == a[s]){
				a[e]=-1;
			}else{
				s=e;
			}
			e++;
		}
		
		for(int i=0 ; i<a.length;i++){
			if(a[i]!=-1){
				System.out.println(a[i]);
			}
		}
		
		
		}
	}