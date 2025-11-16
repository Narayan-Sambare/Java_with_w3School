package college.controller;

import java.util.*;
import college.model.*;
import college.service.*;

public class CollegeManagementSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();
        TeacherService teacherService = new TeacherService();
        CourseService courseService = new CourseService();

        int choice;
        do {
            System.out.println("\n==============================");
            System.out.println("🎓 College Management System");
            System.out.println("==============================");
            System.out.println("1. Manage Students");
            System.out.println("2. Manage Teachers");
            System.out.println("3. Manage Courses");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    manageStudents(sc, studentService);
                    break;
                case 2:
                    manageTeachers(sc, teacherService);
                    break;
                case 3:
                    manageCourses(sc, courseService);
                    break;
                case 0:
                    System.out.println("👋 Exiting system... Goodbye!");
                    break;
                default:
                    System.out.println("❌ Invalid choice! Try again.");
            }
        } while (choice != 0);
        sc.close();
    }

    // ====================== STUDENT MENU ======================
    public static void manageStudents(Scanner sc, StudentService service) {
        int ch;
        do {
            System.out.println("\n📘 Student Management");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    System.out.print("Enter Year: ");
                    int year = sc.nextInt();
                    System.out.print("Enter CGPA: ");
                    double cgpa = sc.nextDouble();

                    Student s = new Student(id, name, email, phone, course, year, cgpa);
                    service.addStudent(s);
                    break;

                case 2:
                    service.displayAll();
                    break;

                case 3:
                    System.out.print("Enter Student ID to update: ");
                    int sid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new Course: ");
                    String newCourse = sc.nextLine();
                    System.out.print("Enter new CGPA: ");
                    double newCgpa = sc.nextDouble();
                    service.updateStudent(sid, newCourse, newCgpa);
                    break;

                case 4:
                    System.out.print("Enter Student ID to delete: ");
                    int did = sc.nextInt();
                    service.deleteStudent(did);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("❌ Invalid choice!");
            }
        } while (ch != 0);
    }

    // ====================== TEACHER MENU ======================
    public static void manageTeachers(Scanner sc, TeacherService service) {
        int ch;
        do {
            System.out.println("\n📗 Teacher Management");
            System.out.println("1. Add Teacher");
            System.out.println("2. View All Teachers");
            System.out.println("3. Update Salary");
            System.out.println("4. Delete Teacher");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    Teacher t = new Teacher(id, name, email, phone, dept, salary);
                    service.addTeacher(t);
                    break;

                case 2:
                    service.displayAll();
                    break;

                case 3:
                    System.out.print("Enter Teacher ID to update salary: ");
                    int tid = sc.nextInt();
                    System.out.print("Enter new Salary: ");
                    double newSalary = sc.nextDouble();
                    service.updateTeacher(tid, newSalary);
                    break;

                case 4:
                    System.out.print("Enter Teacher ID to delete: ");
                    int did = sc.nextInt();
                    service.deleteTeacher(did);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("❌ Invalid choice!");
            }
        } while (ch != 0);
    }

    // ====================== COURSE MENU ======================
    public static void manageCourses(Scanner sc, CourseService service) {
        int ch;
        do {
            System.out.println("\n📙 Course Management");
            System.out.println("1. Add Course");
            System.out.println("2. View All Courses");
            System.out.println("3. Delete Course");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter Course ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Course Name: ");
                    String cname = sc.nextLine();
                    System.out.print("Enter Credits: ");
                    int credits = sc.nextInt();

                    Course c = new Course(cid, cname, credits);
                    service.addCourse(c);
                    break;

                case 2:
                    service.displayAll();
                    break;

                case 3:
                    System.out.print("Enter Course ID to delete: ");
                    int did = sc.nextInt();
                    service.deleteCourse(did);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("❌ Invalid choice!");
            }
        } while (ch != 0);
    }
}
