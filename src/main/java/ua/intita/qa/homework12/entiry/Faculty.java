package ua.intita.qa.homework12.entiry;
import ua.intita.qa.homework12.exceptions.NoSuchGroupOnFaculty;
import ua.intita.qa.homework12.creaiton.AverageScore;
import ua.intita.qa.homework12.creaiton.CreateStudents;

import java.util.List;
import java.util.Map;

public class Faculty implements AverageScore {
    private final List<Student> students = CreateStudents.createStudents();

    public List<Student> getStudents() {
        return students;
    }

    private boolean checkIfGroupPresent(String faculty) throws NoSuchGroupOnFaculty {
        boolean check = false;
       for (Student student : students){
           if (faculty.equals(student.getFaculty())) {
               check = true;
               break;
           }
       }
       if (!check){
           throw new NoSuchGroupOnFaculty("No such group on faculty!");
       }
       return true;
    }

    @Override
    public double getAverage(String faculty, String subject) throws NoSuchGroupOnFaculty {
        boolean check = checkIfGroupPresent(faculty);
        int counter = 0;
        double average = 0;
        double result = 0;
        if (check){
            for (Student student : students){
               if (faculty.equals(student.getFaculty())){
                   for (Map.Entry<String,Integer> entry : student.getLessons().entrySet()){
                       if (subject.equals(entry.getKey())){
                           average+= entry.getValue();
                           counter++;
                       }
                   }
               }
            }
        }
        try {
            result = average/counter;
        } catch (ArithmeticException e){
            e.printStackTrace();
        }

        return result;
    }
}
