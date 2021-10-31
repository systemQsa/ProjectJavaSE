package ua.intita.qa.homework12.exceptions;

public class OutOfScoreException extends Exception {
    public OutOfScoreException() {
        super();
    }

    public OutOfScoreException(String message) {
        super(message);
    }

    public OutOfScoreException(String message, Throwable cause) {
        super(message, cause);
    }
}
