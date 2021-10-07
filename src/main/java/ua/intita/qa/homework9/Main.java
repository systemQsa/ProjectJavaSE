package ua.intita.qa.homework9;

import org.apache.maven.archetype.Calculator;
import ua.intita.qa.homework9.Text.Text;
import ua.intita.qa.homework9.Word.Word;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(10, 20));
        // min() method == diff()
        System.out.println(calculator.min(100, 97));
        Word word = new Word();
        System.out.println("length = " + word.getLength("Sasha"));
        System.out.println(word.lowercase("ALEX"));
        System.out.println(word.uppercase("alex"));
        System.out.println("concat = " + word.concat("java", "party"));
        System.out.println("contain symbol = " + word.contain("java", 'v'));

        Text text = new Text();
        System.out.println("number of letters = " + text.countNumberLetters("sa_s_ha"));
        System.out.println("number of vowels = " + text.countNumberVowels("Summer"));
        System.out.println("number of constants  = " + text.countNumberConsonants("Martin"));
        System.out.println("number of points = " + text.countPoints("some text. here.also some text.."));
        System.out.println("number of commas = " + text.countComas("some, text,text,also something,,"));
    }
}
