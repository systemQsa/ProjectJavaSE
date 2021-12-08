package ua.intita.qa.homework18;

import java.io.*;

public class BuffText {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/test.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/out_text.txt"))) {
            String s = "";
            while ((s = reader.readLine()) != null) {
                System.out.println(s + "  ");
                writer.write(s);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
