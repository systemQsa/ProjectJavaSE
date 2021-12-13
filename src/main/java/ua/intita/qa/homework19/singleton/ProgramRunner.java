package ua.intita.qa.homework19.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addToLogFile("firstLog");
        ProgramLogger.getProgramLogger().addToLogFile("secondLog");
        ProgramLogger.getProgramLogger().showFile();
    }
}
