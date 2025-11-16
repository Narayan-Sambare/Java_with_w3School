package college.service;

import college.model.Course;
import java.util.ArrayList;
import java.util.List;

public class CourseService {
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course c) {
        courses.add(c);
        System.out.println("✅ Course added successfully!");
    }

    public void displayAll() {
        if (courses.isEmpty()) {
            System.out.println("No courses found!");
            return;
        }
        for (Course c : courses) {
            System.out.println("----------------------------");
            c.displayInfo();
        }
    }

    public Course findById(int id) {
        for (Course c : courses) {
            if (c.getCourseId() == id)
                return c;
        }
        return null;
    }

    public void deleteCourse(int id) {
        Course c = findById(id);
        if (c != null) {
            courses.remove(c);
            System.out.println("🗑️ Course deleted successfully!");
        } else {
            System.out.println("❌ Course not found!");
        }
    }
}
