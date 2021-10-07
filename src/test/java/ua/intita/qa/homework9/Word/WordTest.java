package ua.intita.qa.homework9.Word;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordTest {
    Word word = new Word();

    @Test
    public void uppercase() {
        String str = word.uppercase("sasha");
        assertEquals("SASHA", str);
    }

    @Test
    public void lowercase() {
        String string = word.lowercase("JAVA");
        assertEquals("java", string);
    }

    @Test
    public void getLength() {
        int length = word.getLength("spring");
        assertEquals(6, length);
    }

    @Test
    public void concat() {
        String str = word.concat("java", "duke");
        assertEquals("javaduke", str);
    }

    @Test
    public void contain() {
        boolean truth = word.contain("winter", 't');
        assertEquals(true, truth);
        boolean truth2 = word.contain("spam", 'r');
        assertEquals(false, truth2);
    }
}