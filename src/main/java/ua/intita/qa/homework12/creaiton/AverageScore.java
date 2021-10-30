package ua.intita.qa.homework12.creaiton;

import ua.intita.qa.homework12.exceptions.NoSuchGroupOnFaculty;

public interface AverageScore{
    double getAverage(String groupName,String subject) throws NoSuchGroupOnFaculty;
}
