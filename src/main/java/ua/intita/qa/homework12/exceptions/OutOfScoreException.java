package ua.intita.qa.homework12.exceptions;

public class OutOfScoreException extends Exception{
     private String message;

     public OutOfScoreException(){}

     public OutOfScoreException(String message){
         this.message = message;
     }

    @Override
    public String getMessage() {
        return message;
    }
}
