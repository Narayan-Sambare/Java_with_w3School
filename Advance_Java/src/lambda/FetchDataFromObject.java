package lambda;

import java.util.*;
import java.util.function.Consumer;

public class FetchDataFromObject {

	public static void main(String[] args){
		
		List<Employee> list=new ArrayList();
		list.add(new Employee(1,"Sanket",25000));
		list.add(new Employee(2,"Sham",26000));
		list.add(new Employee(3,"Soham",35000));
		list.add(new Employee(4,"Narayan",25500));	
	
			list.forEach((Employee e)-> 
			System.out.println("Id : "+e.getId()+"\tName : "+e.getName()+"\tSalary : "+e.getSal()));
		}
	
		
	}

class Employee{
	private int id;
	private String name;
	private int sal;
	
	Employee(int id, String name, int sal){
		this.name=name ;
		this.sal=sal;
		this.id=id;
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	 @Override
	    public String toString() {
	        return name + "-" + sal;
	    }
}
