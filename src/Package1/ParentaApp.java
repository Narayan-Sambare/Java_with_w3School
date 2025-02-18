package Package1;

public class ParentaApp {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.disp();
		Child c=new Child();
		Child.disp();
		Parent.disp();
	
	}
}
class Parent{
	public static void disp() {
		System.out.println("this is base method");
	}
}
class Child extends Parent{
	public static void disp() {
		System.out.println("this is overridden method");
	}
}