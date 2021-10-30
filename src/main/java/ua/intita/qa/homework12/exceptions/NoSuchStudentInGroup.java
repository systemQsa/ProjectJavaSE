package ua.intita.qa.homework12.exceptions;

public class NoSuchStudentInGroup extends NoSuchFieldException{
    private String message;
    public NoSuchStudentInGroup(){}

    public NoSuchStudentInGroup(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
