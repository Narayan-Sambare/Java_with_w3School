package college.model;

public class Teacher extends Person {
    private String department;
    private double salary;

    public Teacher(int id, String name, String email, String phone, String department, double salary) {
        super(id, name, email, phone);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }
}
