package ua.intita.qa.homework9.Text;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TextTest {
    Text text = new Text();

    @Test
    public void countNumberLetters() {
        int numbers = text.countNumberLetters("Vinnitsya");
        assertEquals(9, numbers);
    }

    @Test
    public void countNumberVowels() {
        int number = text.countNumberVowels("autumn");
        assertThat(3, is(number));
    }

    @Test
    public void countNumberConsonants() {
        int counter = text.countNumberConsonants("developer");
        assertThat(5, is(counter));
    }

    @Test
    public void countPoints() {
        int points = text.countPoints("testo.text.info..something else");
        assertEquals(4, points);
    }

    @Test
    public void countComas() {
        int commas = text.countComas("developer,jav,a,simple,text");
        assertEquals(4, commas);
    }
}