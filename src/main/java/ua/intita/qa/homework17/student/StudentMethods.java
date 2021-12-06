package ua.intita.qa.homework17.student;

import java.util.ArrayList;
import java.util.List;

public class StudentMethods {
    private final List<Student> students;

    public StudentMethods(List<Student> students) {
        this.students = students;
    }

    public List<Student> deleteStudent() {
        List<Student> list = new ArrayList<>();
        for (Student student : students) {
            if (student.getScore() < 3) {
                list.add(student);
            } else {
                int num = student.getCourse();
                student.setCourse(num + 1);
            }
        }
        students.removeAll(list);
        return students;
    }

    public List<Student> printStudents(List<Student> students, int course) {
        List<Student> list = new ArrayList<>();
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
                list.add(student);
            }
        }
        return list;
    }

    @Override
    public String toString() {
        return "" + students;
    }
}
