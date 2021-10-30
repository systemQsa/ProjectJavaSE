package ua.intita.qa.homework12.creaiton;

import ua.intita.qa.homework12.exceptions.NoSuchStudentInGroup;
import ua.intita.qa.homework12.exceptions.NoSuchSubjectException;
import ua.intita.qa.homework12.exceptions.OutOfScoreException;

public interface Score {
    double averageScore(String name) throws NoSuchSubjectException, NoSuchStudentInGroup, OutOfScoreException;
}
