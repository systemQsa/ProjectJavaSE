package ua.intita.qa.homework13.generic;

public class Animal<Cat,Dog> {
    private Cat cat;
    private Dog dog;

    public Animal(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }

    @Override
    public String toString() {
        return dog + "  " + cat;
    }
}
