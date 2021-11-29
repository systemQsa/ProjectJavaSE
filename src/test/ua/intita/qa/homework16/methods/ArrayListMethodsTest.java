package ua.intita.qa.homework16.methods;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ArrayListMethodsTest {

    @Test
    public void fromStringToArrList() {
        ArrayListMethods entryPoint = new ArrayListMethods();
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> res = entryPoint.fromStringToArrList("sasha nasta oleg java duke duke sasha");
        expected.add("sasha");
        expected.add("nasta");
        expected.add("oleg");
        expected.add("java");
        expected.add("duke");
        expected.add("duke");
        expected.add("sasha");
        assertEquals(expected, res);

    }

    @Test
    public void repeatsOfWords() {
        ArrayListMethods entryPoint = new ArrayListMethods();
        Map<String, Integer> expected = new HashMap<>();
        ArrayList<String> result = entryPoint.fromStringToArrList("sasha nasta oleg java duke duke sasha");
        expected.put("sasha", 2);
        expected.put("nasta", 1);
        expected.put("oleg", 1);
        expected.put("java", 1);
        expected.put("duke", 2);
        Map<String, Integer> res = entryPoint.repeatsOfWords(result);
        assertEquals(expected, res);
    }

}