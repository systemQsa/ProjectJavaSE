package ua.intita.qa.homework13.exception;

public class EmailException extends Exception{
    public EmailException(String message) {
        super(message);
    }

    public EmailException(Throwable cause) {
        super(cause);
    }

    public EmailException(String message, Throwable cause) {
        super(message, cause);
    }
}
