package ua.intita.qa.homework12.entiry;

import ua.intita.qa.homework12.exceptions.NoSuchGroupOnFaculty;
import ua.intita.qa.homework12.creaiton.AverageScore;
import ua.intita.qa.homework12.creaiton.CreateStudents;

import java.util.List;
import java.util.Map;

public class Group implements AverageScore {
    private final List<Student> students = CreateStudents.createStudents();

    public List<Student> getStudents() {
        return students;
    }

    private boolean checkIfStudentsPresent(String group) throws NoSuchGroupOnFaculty {
        boolean flag = false;
        for (Student student : students) {
            if (group.equals(student.getGroup())) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            throw new NoSuchGroupOnFaculty("No groups on faculty");
        }

        return true;
    }


    @Override
    public double getAverage(String groupName, String subject) throws NoSuchGroupOnFaculty {
        boolean check = checkIfStudentsPresent(groupName);
        int counter = 0;
        double average = 0;
        double result = 0;
        if (check) {
            for (Student student : students) {
                if (groupName.equals(student.getGroup())) {
                    for (Map.Entry<String, Integer> entry : student.getLessons().entrySet()) {
                        if (subject.equals(entry.getKey())) {
                            average += entry.getValue();
                            counter++;
                        }
                    }
                }
            }
        }
        try{
            result = average/counter;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        return result;
    }
}
