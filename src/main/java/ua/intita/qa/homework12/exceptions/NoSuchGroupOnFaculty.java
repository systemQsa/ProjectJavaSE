package ua.intita.qa.homework12.exceptions;

public class NoSuchGroupOnFaculty extends Exception{
    private String message;

    public NoSuchGroupOnFaculty(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
