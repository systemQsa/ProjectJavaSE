package ua.intita.qa.homework12;

import ua.intita.qa.homework12.entiry.Faculty;
import ua.intita.qa.homework12.entiry.Group;
import ua.intita.qa.homework12.entiry.Subject;
import ua.intita.qa.homework12.entiry.University;
import ua.intita.qa.homework12.exceptions.NoSuchGroupOnFaculty;
import ua.intita.qa.homework12.creaiton.AverageScore;
import ua.intita.qa.homework12.creaiton.Students;
import ua.intita.qa.homework12.exceptions.OutOfScoreException;

public class Main {
    public static void main(String[] args) {
      Students students = new Students();
        try {
            double res = students.averageScore("Parker");
            System.out.println(res);
        } catch (OutOfScoreException e) {
            e.printStackTrace();
        }

        AverageScore group = new Group();
        try {
            System.out.println(group.getAverage("A", Subject.BIO.getSubject()));
        } catch (NoSuchGroupOnFaculty e) {
            e.printStackTrace();
        }

        AverageScore faculty = new Faculty();
        try {
            System.out.println(faculty.getAverage(Subject.LITERATURE.getSubject(), Subject.ENGLISH.getSubject()));
        } catch (NoSuchGroupOnFaculty e) {
            e.printStackTrace();
        }

        AverageScore university = new University();
        try {
            System.out.println(university.getAverage(Subject.CHEMISTRY.getSubject(), Subject.BIO.getSubject()));
        } catch (NoSuchGroupOnFaculty e) {
            e.printStackTrace();
        }

    }
}
