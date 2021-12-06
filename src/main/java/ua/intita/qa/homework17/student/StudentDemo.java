package ua.intita.qa.homework17.student;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        Util util = new Util();
        List<Student> students = new ArrayList<>();
        students.add(util.getStudent1());
        students.add(util.getStudent2());
        students.add(util.getStudent3());
        students.add(util.getStudent4());
        students.add(util.getStudent5());
        students.add(util.getStudent6());
        StudentMethods s = new StudentMethods(students);
        s.deleteStudent();
        System.out.println(s);
        s.printStudents(students, 2);
    }
}
