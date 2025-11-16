package college.service;

import java.util.*;
import college.model.Student;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    // Add new student
    public void addStudent(Student s) {
        students.add(s);
        System.out.println(" Student added successfully!");
    }

    // View all students
    public List<Student> getAllStudents() {
        return students;
    }

    // Update student course
    public void updateStudent(int id, String newCourse) {
        for (Student s : students) {
            if (s.getStudentId() == id) {
                s.setCourse(newCourse);
                System.out.println(" Course updated successfully!");
                return;
            }
        }
        System.out.println(" Student ID not found!");
    }

    // Delete student
    public void deleteStudent(int id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getStudentId() == id) {
                iterator.remove();
                System.out.println(" Student deleted successfully!");
                return;
            }
        }
        System.out.println(" Student ID not found!");
    }
}
