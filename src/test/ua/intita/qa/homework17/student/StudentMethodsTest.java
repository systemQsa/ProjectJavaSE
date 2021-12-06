package ua.intita.qa.homework17.student;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentMethodsTest {
    private final Util util = new Util();
    @Test
    public void deleteStudent() {
        StudentMethods testerClass;
        List<Student> list = new ArrayList<>();
        List<Student> expect = new ArrayList<>();

        list.add(util.getStudent1());
        list.add(util.getStudent2());
        list.add(util.getStudent3());
        list.add(util.getStudent4());
        list.add(util.getStudent5());
        list.add(util.getStudent6());

        expect.add(util.getStudent1());
        expect.add(util.getStudent2());
        expect.add(util.getStudent3());
        expect.add(util.getStudent5());

        testerClass = new StudentMethods(list);
        List<Student> res = testerClass.deleteStudent();
        assertEquals(expect, res);

    }

    @Test
    public void printStudents() {
        List<Student> expected = new ArrayList<>();
        List<Student> list = new ArrayList<>();

        list.add(util.getStudent1());
        list.add(util.getStudent2());
        list.add(util.getStudent3());
        list.add(util.getStudent4());
        list.add(util.getStudent5());
        list.add(util.getStudent6());

        expected.add(list.get(0));
        expected.add(list.get(3));
        expected.add(list.get(5));

        StudentMethods testClass = new StudentMethods(list);
        List<Student> result = testClass.printStudents(list, 2);
        assertEquals(expected,result);
    }
}