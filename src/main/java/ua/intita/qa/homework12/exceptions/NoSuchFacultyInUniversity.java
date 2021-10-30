package ua.intita.qa.homework12.exceptions;

public class NoSuchFacultyInUniversity extends Exception{
    private String message;

    public NoSuchFacultyInUniversity(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
