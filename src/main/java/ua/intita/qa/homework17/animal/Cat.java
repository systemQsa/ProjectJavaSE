package ua.intita.qa.homework17.animal;

import java.util.Comparator;
import java.util.Objects;

public class Cat extends Pet{

    private String name;
    private String bread;
    private int age;

    public Cat(int id, String name, String bread, int age) {
        super(id);
        this.name = name;
        this.bread = bread;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(bread, cat.bread);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, bread, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
