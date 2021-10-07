package ua.intita.qa.homework9.Word;

public interface Handler {
    String uppercase(String word);

    String lowercase(String word);

    int getLength(String word);

    String concat(String str1, String str2);

    boolean contain(String word, char symbol);
}
