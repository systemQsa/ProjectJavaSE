package ua.intita.qa.homework12.exceptions;

public class NoSuchSubjectException extends NoSuchFieldException{
    private String message;
    public NoSuchSubjectException(){}

    public NoSuchSubjectException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
