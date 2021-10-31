package ua.intita.qa.homework12.exceptions;

public class NoSuchSubjectException extends Exception {
    public NoSuchSubjectException() {
        super();
    }

    public NoSuchSubjectException(String message) {
        super(message);
    }

    public NoSuchSubjectException(String message, Throwable cause) {
        super(message, cause);
    }
}
