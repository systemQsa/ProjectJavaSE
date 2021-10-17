import org.junit.Test;
import static org.junit.Assert.*;
import ua.intita.qa.homework10.ReadFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class ReadFileTest {
   private final ReadFile READFILE = new ReadFile("src/main/resources/shortText.txt");
    private final String text = READFILE.fileReader();

    @Test
    public void orderWords() {
        String[] array = READFILE.orderWords(text);
        System.out.println(Arrays.toString(array));
        String[] arr = new String[11];
        int i = 0;
        File file = new File("src/main/resources/testText.txt");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                arr[i++] = scan.next();
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assertArrayEquals(arr, array);
    }

    @Test
    public void deleteWords() {
        String res = READFILE.deleteWords(text, 7);
        StringBuilder str = new StringBuilder();
        File file = new File("src/main/resources/deleteWordsTest.txt");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                str.append(scan.next()).append(" ");
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        res = res.replaceAll("  ", " ");
        assertEquals(str.toString().trim(), res);
    }
}
