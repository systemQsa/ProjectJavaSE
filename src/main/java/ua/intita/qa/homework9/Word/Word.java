package ua.intita.qa.homework9.Word;

public class Word implements Handler {
    @Override
    public String uppercase(String word) {
        char[] chars = word.toCharArray();
        boolean flag = true;
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toUpperCase(chars[i]);
        }
        return new String(chars);
    }

    @Override
    public String lowercase(String word) {
        char[] chars = word.toCharArray();
        boolean flag = true;
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toLowerCase(chars[i]);
        }
        return new String(chars);
    }

    @Override
    public int getLength(String word) {
        int length = 0;
        char[] chars = word.toCharArray();
        for (char c : chars) {
            length++;
        }

        return length;
    }

    @Override
    public String concat(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        char[] charsResult = new char[getLength(str1) + getLength(str2)];
        for (int i = 0; i < chars1.length; i++) {
            charsResult[i] = chars1[i];
        }
        int j = 0;
        for (int i = getLength(str1); i < charsResult.length; i++) {
            charsResult[i] = chars2[j++];
            if (j == chars2.length) break;
        }
        String s = new String(charsResult);
        return s;
    }

    @Override
    public boolean contain(String word, char symbol) {
        char[] charArray = word.toCharArray();
        for (char letter : charArray) {
            if (letter == symbol) {
                return true;
            }
        }
        return false;
    }
}
