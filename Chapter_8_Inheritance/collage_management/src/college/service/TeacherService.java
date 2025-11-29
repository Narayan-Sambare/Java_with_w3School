package college.service;

import college.model.Teacher;
import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers = new ArrayList<>();

    public void addTeacher(Teacher t) {
        teachers.add(t);
        System.out.println("✅ Teacher added successfully!");
    }

    public void displayAll() {
        if (teachers.isEmpty()) {
            System.out.println("No teachers found!");
            return;
        }
        for (Teacher t : teachers) {
            System.out.println("----------------------------");
            t.displayInfo();
        }
    }

    public Teacher findById(int id) {
        for (Teacher t : teachers) {
            if (t.getId() == id)
                return t;
        }
        return null;
    }

    public void updateTeacher(int id, double newSalary) {
        Teacher t = findById(id);
        if (t != null) {
            t.setSalary(newSalary);
            System.out.println("✅ Teacher salary updated successfully!");
        } else {
            System.out.println("❌ Teacher not found!");
        }
    }

    public void deleteTeacher(int id) {
        Teacher t = findById(id);
        if (t != null) {
            teachers.remove(t);
            System.out.println("🗑️ Teacher deleted successfully!");
        } else {
            System.out.println("❌ Teacher not found!");
        }
    }
}
