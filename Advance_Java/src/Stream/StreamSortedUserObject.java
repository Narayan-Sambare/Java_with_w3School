package Stream;
import java.util.*;
import java.util.function.*;
public class StreamSortedUserObject {

	public static void main(String[] args) {
		List<Employee> list= new ArrayList();
		list.add(new Employee(1,"sanket",50000));
		list.add(new Employee(2,"narayan",40000));
		list.add(new Employee(3,"abhi",60000));
		
		System.out.println("Before Sorting");
		
		list.forEach(t->System.out.println("ID : "+t.getId()+"\tName : "+t.getName()+"\tSalary : "+t.getSal()));
		
		System.out.println("After Sorting");
		list.stream().sorted(Comparator.comparing(Employee::getSal)).forEach(t->System.out.println("ID : "+t.getId()+"\tName : "+t.getName()+"\tSalary : "+t.getSal()));
	}

}
