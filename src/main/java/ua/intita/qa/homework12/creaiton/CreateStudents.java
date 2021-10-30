package ua.intita.qa.homework12.creaiton;

import ua.intita.qa.homework12.entiry.Student;
import ua.intita.qa.homework12.entiry.Subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateStudents {
    public static List<Student> createStudents(){
        List<Student> list = new ArrayList<>();
        Student student1 = new Student();
        student1.setName("Peter");
        student1.setSurname("Parker");
        student1.setGroup("A");
        student1.setFaculty(Subject.CHEMISTRY.getSubject());
        Map<String,Integer> map1 = new HashMap<>();
        map1.put(Subject.CHEMISTRY.getSubject(), 4);
        map1.put(Subject.BIO.getSubject(), 3);
        map1.put(Subject.MATH.getSubject(), 3);
        student1.setLessons(map1);

        Student student2 = new Student();
        student2.setName("David");
        student2.setSurname("Davidson");
        student2.setGroup("B");
        student2.setFaculty(Subject.LITERATURE.getSubject());
        Map<String,Integer> map2 = new HashMap<>();
        map2.put(Subject.ENGLISH.getSubject(), 4);
        map2.put(Subject.BIO.getSubject(), 4);
        map2.put(Subject.HISTORY.getSubject(), 3);
        student2.setLessons(map2);

        Student student3 = new Student();
        student3.setName("Mary");
        student3.setSurname("Clarkson");
        student3.setGroup("B");
        student3.setFaculty(Subject.LITERATURE.getSubject());
        Map<String,Integer> map3 = new HashMap<>();
        map3.put(Subject.ENGLISH.getSubject(), 4);
        map3.put(Subject.BIO.getSubject(), 2);
        map3.put(Subject.HISTORY.getSubject(), 3);
        student3.setLessons(map3);

        Student student4 = new Student();
        student4.setName("Alina");
        student4.setSurname("Pavlenko");
        student4.setGroup("A");
        student4.setFaculty(Subject.CHEMISTRY.getSubject());
        Map<String,Integer> map4 = new HashMap<>();
        map4.put(Subject.CHEMISTRY.getSubject(), 4);
        map4.put(Subject.BIO.getSubject(), 2);
        map4.put(Subject.HISTORY.getSubject(), 1);
        student4.setLessons(map4);

        Student student5 = new Student();
        student5.setName("Max");
        student5.setSurname("Rebriy");
        student5.setGroup("A");
        student5.setFaculty(Subject.CHEMISTRY.getSubject());
        Map<String,Integer> map5 = new HashMap<>();
        map5.put(Subject.CHEMISTRY.getSubject(), 4);
        map5.put(Subject.BIO.getSubject(), 6);
        map5.put(Subject.HISTORY.getSubject(), 1);
        student5.setLessons(map5);

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        return list;

    }

}
