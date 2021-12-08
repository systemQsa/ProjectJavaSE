package ua.intita.qa.homework18;

import java.io.*;

public class BuffMp3 {
    public static void main(String[] args) {
        try (BufferedInputStream reader = new BufferedInputStream(new FileInputStream("src/main/resources/skillet_those_nights-namobilu.com.mp3"))) {
            BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream("src/main/resources/music.mp3"));
            byte[] chars = new byte[reader.available()];
            reader.read(chars);
            writer.write(chars);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
