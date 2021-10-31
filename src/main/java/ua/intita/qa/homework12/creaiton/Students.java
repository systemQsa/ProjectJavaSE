package ua.intita.qa.homework12.creaiton;

import ua.intita.qa.homework12.entiry.Student;
import ua.intita.qa.homework12.exceptions.OutOfScoreException;

import java.util.List;
import java.util.Map;

public class Students implements Score{
    private final List<Student> students;

     public Students(){
         students = CreateStudents.createStudents();
     }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public double averageScore(String surname) throws OutOfScoreException {
         int counter = 0;
         double average = 0;
         double res;
         Student student = null;
         for (Student person : students){
             if (surname.equals(person.getSurname())){
                 student = person;
                 break;
             }
         }
        assert student != null;
        for (Map.Entry<String,Integer> entry : student.getLessons().entrySet()){
             average+= entry.getValue();
             counter++;
         }
         res = average/counter;
         if (res < 0 || res > 10){
             throw new OutOfScoreException();
         }

        return res;
    }
}
