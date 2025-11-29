package college.model;

public class Student {
    private int studentId;
    private String name;
    private int age;
    private String department;
    private String course;

    public Student(int studentId, String name, int age, String department, String course) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.department = department;
        this.course = course;
    }

    public int getStudentId() { return studentId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
    public String getCourse() { return course; }

    public void setCourse(String course) { this.course = course; }
}
