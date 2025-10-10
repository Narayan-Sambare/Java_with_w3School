/*
7. First Negative Number in Every Window of Size K

Approach: Sliding Window with queue
Example: arr = [12, -1, -7, 8, -15, 30, 16, 28], k = 3
*/
import java.util.*;
public class Q7{
	public static void main(String x[]){
	int a[] = {12, -1, -7, 8, -15, 30, 16, 28};
	int k=3;
	int s=0 , e=0;
	
	Queue<Integer> q = new LinkedList<>();
	
	while(e<a.length){
		
		if(a[e]<0){
			q.add(a[e]);
		}
		if(e>=k-1){
			if (!q.isEmpty())
                    System.out.println(q.peek());
                else
                    System.out.println("0");
			q.remove(a[s]);
			s++;
		}
	
		e++;
	}
	
	}
}