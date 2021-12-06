package ua.intita.qa.homework17.animal;

import java.util.Comparator;
import java.util.Objects;

public class Parrot extends Pet implements Comparator<Parrot> {
   private String name;
   private int age;

    @Override
    public int compare(Parrot o1, Parrot o2) {
        return o1.getAge() - o2.getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parrot parrot = (Parrot) o;
        return age == parrot.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    public Parrot(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
