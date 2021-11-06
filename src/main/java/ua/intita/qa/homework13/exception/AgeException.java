package ua.intita.qa.homework13.exception;

public class AgeException extends Exception{
    public AgeException(String message) {
        super(message);
    }

    public AgeException(Throwable cause) {
        super(cause);
    }

    public AgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
