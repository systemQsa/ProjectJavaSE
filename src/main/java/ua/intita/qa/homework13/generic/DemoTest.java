package ua.intita.qa.homework13.generic;

import java.util.ArrayList;
import java.util.List;

public class DemoTest {
    public static void main(String[] args) {
        /*
         * One class  some entity
         * TestOne  generic class has list of entities  "Ones"
         */
        One one = new One("Sasha", 18);
        One two = new One("David", 25);
        List<One> oneList = new ArrayList<>();
        oneList.add(one);
        oneList.add(two);
        TestOne<One> test = new TestOne<>();
        test.setOnes(oneList);
        System.out.println(test.getOnes());
        //------------------------------------

        /*
         * Generalizable interface
         * GeneralizableClass instance implements generic Generalizable interface
         */
        GeneralizableClass gen = new GeneralizableClass("hello java");
        gen.printName();

        //------------------------------------
        /*
         * Dog class instance
         * Cat class instance
         * Animal generic class
         */
        Dog dog = new Dog("Bobik");
        Cat cat = new Cat(5, "Murik");
        Animal<Dog, Cat> animals = new Animal<>(dog, cat);
        System.out.println(animals);
        dog.makeVoice();

    }

}
