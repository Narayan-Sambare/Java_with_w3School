package college.ui;

import college.model.Student;
import college.service.StudentService;
import java.util.*;

public class CollegeManagementSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        int choice;
        do {
            System.out.println("\n========= COLLEGE MANAGEMENT SYSTEM =========");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Course");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    Student s = new Student(id, name, age, dept, course);
                    service.addStudent(s);
                    break;

                case 2:
                    List<Student> list = service.getAllStudents();
                    if (list.isEmpty()) {
                        System.out.println(" No students found!");
                    } else {
                        System.out.println("\n------ Student List ------");
                        for (Student st : list) {
                            System.out.println("ID: " + st.getStudentId());
                            System.out.println("Name: " + st.getName());
                            System.out.println("Age: " + st.getAge());
                            System.out.println("Department: " + st.getDepartment());
                            System.out.println("Course: " + st.getCourse());
                            System.out.println("---------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to Update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Course Name: ");
                    String newCourse = sc.nextLine();

                    service.updateStudent(uid, newCourse);
                    break;

                case 4:
                    System.out.print("Enter Student ID to Delete: ");
                    int did = sc.nextInt();
                    sc.nextLine();

                    service.deleteStudent(did);
                    break;

                case 5:
                    System.out.println(" Exiting System... Goodbye!");
                    break;

                default:
                    System.out.println(" Invalid choice. Try again!");
            }

        } while (choice != 5);

        sc.close();
    }
}
