package Stream;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class StreamFlatMap {

	public static void main(String[] args) {
		
		List< List<String> > list= Arrays.asList(Arrays.asList("A","B"),Arrays.asList("A","B"));		  
		Stream< List<String> > s1=list.stream();
			  
			  Function< List<String>,Stream<String> > f= new Function < List<String >, Stream<String> > () {
					public Stream<String> apply(List<String> innerList)
					{
						 return innerList.stream();
					}
			  };
			  
			  Stream<String> s2=s1.flatMap(f);
			  s2.forEach((t)->System.out.println(t));
		  
			}
		}

