package ua.intita.qa.homework19.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static final StringBuilder logFile = new StringBuilder();

    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger() {
    }

    public void addToLogFile(String str) {
        logFile.append(str).append(System.lineSeparator());
    }

    public void showFile() {
        System.out.println(logFile);
    }
}
