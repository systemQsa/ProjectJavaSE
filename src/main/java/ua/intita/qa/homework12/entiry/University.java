package ua.intita.qa.homework12.entiry;


import ua.intita.qa.homework12.exceptions.NoSuchFacultyInUniversity;
import ua.intita.qa.homework12.creaiton.AverageScore;
import ua.intita.qa.homework12.creaiton.CreateStudents;

import java.util.List;
import java.util.Map;

public class University implements AverageScore {
    private final List<Student> students = CreateStudents.createStudents();

    private boolean checkFaculty(String nameFaculty) throws NoSuchFacultyInUniversity {
        boolean checking = false;
        for (Student student : students) {
            if (nameFaculty.equals(student.getFaculty())) {
                checking = true;
                break;
            }
        }
        if (!checking) {
            throw new NoSuchFacultyInUniversity("no such faculty in University!");
        }
        return true;
    }

    @Override
    public double getAverage(String faculty, String subject) {
        int counter = 0;
        double average = 0;

        for (Student student : students) {
            if (faculty.equals(student.getFaculty())) {
                for (Map.Entry<String, Integer> entry : student.getLessons().entrySet()) {
                    if (subject.equals(entry.getKey())) {
                        average += entry.getValue();
                        counter++;
                    }
                }
            }
        }

        return average / counter;
    }
}
