package ua.intita.qa.homework12.exceptions;

public class NoSuchStudentInGroup extends Exception {
    public NoSuchStudentInGroup() {
        super();
    }

    public NoSuchStudentInGroup(String message) {
        super(message);
    }

    public NoSuchStudentInGroup(String message, Throwable cause) {
        super(message, cause);
    }
}
