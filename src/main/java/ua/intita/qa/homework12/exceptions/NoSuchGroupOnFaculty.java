package ua.intita.qa.homework12.exceptions;

public class NoSuchGroupOnFaculty extends Exception {
    public NoSuchGroupOnFaculty() {
        super();
    }

    public NoSuchGroupOnFaculty(String message) {
        super(message);
    }

    public NoSuchGroupOnFaculty(String message, Throwable cause) {
        super(message, cause);
    }
}
