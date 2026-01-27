public class MyGenClassApplication {
	public static void main(String[] args) {
		Employee emp = new Employee();
		  emp.setId(1);
		  emp.setName("RAM");
		  emp.setSal(10000);
		  String str=emp.toString();
		 System.out.println(str);//emp.toString() internally
	}
}
class Employee {
	private int id;
	private String name;
	private long sal;
	
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
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	
	public String toString() {
		return "["+name+","+id+","+sal+"]";
	}
}