package ua.intita.qa.homework12.exceptions;

public class NoSuchFacultyInUniversity extends Exception{

    public NoSuchFacultyInUniversity() {
        super();
    }

    public NoSuchFacultyInUniversity(String message) {
        super(message);
    }

    public NoSuchFacultyInUniversity(String message, Throwable cause) {
        super(message, cause);
    }
}
