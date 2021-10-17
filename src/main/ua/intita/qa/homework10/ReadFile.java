package ua.intita.qa.homework10;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadFile {
    private final String fileName;
    private int counter = 0;

    public ReadFile(String fileName) {
        this.fileName = fileName;
    }

    public String fileReader() {
        StringBuilder str = new StringBuilder();
        File file = new File(fileName);
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                str.append(scan.next()).append(" ");
                counter++;
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return str.toString();
    }

    public String[] orderWords(String text) {
        String[] array;
        Pattern pattern = Pattern.compile("\\b[a-zA-Z]+\\b");
        Matcher matcher = pattern.matcher(text);
        array = new String[counter];

        int i = 0;
        while (matcher.find()) {
            array[i++] = matcher.group().toLowerCase(Locale.ROOT);
        }
        //sort version 1
        Arrays.sort(array);
        //sort version 2
        return sorting(array);
    }

    public String[] sorting(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String word = arr[i];
                    arr[i] = arr[j];
                    arr[j] = word;
                }
            }
        }
        return arr;
    }

    public String deleteWords(String text, int length) {
        Pattern pattern = Pattern.compile("\\b(?![aoiuye])\\w+\\b");
        Matcher matcher = pattern.matcher(text);
        StringBuffer str = new StringBuffer();
        while (matcher.find()) {
            if (matcher.group().length() == length) {
                matcher.appendReplacement(str, "");
            }
        }
        matcher.appendTail(str);
        return str.toString().trim();
    }
}
