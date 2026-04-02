package File_handling;

import java.io.*;
public class SerializationApplication {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		 //Serialization
		 FileOutputStream fout= new FileOutputStream("C:\\Users\\Chetan M Dhamgunde\\Desktop\\test\\new_file_handling\\test.txt");
		 ObjectOutputStream out=new ObjectOutputStream(fout);
		 
		 Employee emp1 = new Employee();
		   emp1.setId(1);
		   emp1.setName("ABC");
		   emp1.setSal(10000);
		   out.writeObject(emp1);
		   out.close();
		   fout.close();
		   System.out.println("save...");
		   
		 //DeSerialization
		   FileInputStream fin= new FileInputStream("C:\\Users\\Chetan M Dhamgunde\\Desktop\\test\\new_file_handling\\test.txt");
		   ObjectInputStream in=new ObjectInputStream(fin);
		   Object obj = in.readObject();
		   Employee e=(Employee)obj;
		   System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		   System.out.println("save...");

	}
}

class Employee implements Serializable{
	private int id;
	private String name;
	private int sal;
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
	

}
