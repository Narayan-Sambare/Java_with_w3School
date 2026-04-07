// Example: WAP to create a collection and store 
// 5 employee data in it and fetch employee data whose salary is greater than 10000


package Stream;
import java.util.*;
import java.util.function.*;

public class SalaryGreater {
	public static void main(String[] args)
	{
//		List<Employee> list= new ArrayList();
//		list.add(new Employee(1,"sanket",5000));
//		list.add(new Employee(2,"narayan",40000));
//		list.add(new Employee(3,"abhi",60000));
//		Predicate<Employee> p= new Predicate<Employee>() {
//			public boolean test(Employee t) {
//				if(t.getSal()>1000)
//				{
//					return true;
//				}
//				return false;
//			}
//		};
//		Consumer<Employee> c=new Consumer<Employee>() {
//			public void accept(Employee t) {
//				System.out.println("ID : "+t.getId()+"\tName : "+t.getName()+"\tSalary : "+t.getSal());
//			}	
//		};
//		
//		list.stream().filter(p).forEach(c);
		
//		List<Employee> list= new ArrayList();
//		list.add(new Employee(1,"sanket",5000));
//		list.add(new Employee(2,"narayan",40000));
//		list.add(new Employee(3,"abhi",60000));
//		Predicate<Employee> p= (Employee t)->(t.getSal()>1000)? true:false;
//		Consumer<Employee> c=(Employee t)->{
//				System.out.println("ID : "+t.getId()+"\tName : "+t.getName()+"\tSalary : "+t.getSal());
//		};
//		list.stream().filter(p).forEach(c);
		
		List<Employee> list= new ArrayList();
		list.add(new Employee(1,"sanket",5000));
		list.add(new Employee(2,"narayan",40000));
		list.add(new Employee(3,"abhi",60000));
		
		list.stream().filter(t->(t.getSal()>1000)? true:false)
			.forEach(t->System.out.println("ID : "+t.getId()+"\tName : "+t.getName()+"\tSalary : "+t.getSal()));
	}
}
class Employee{
	private int id;
	private String name;
	private int sal;
	
	Employee(int id,String name, int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSal() {
		return sal;
	}
	
}