package ua.intita.qa.homework13.exception;

public class NameException extends Exception {
    public NameException(String message) {
        super(message);
    }

    public NameException(Throwable cause) {
        super(cause);
    }

    public NameException(String message, Throwable cause) {
        super(message, cause);
    }
}
