package ua.intita.qa.homework17.animal;

import java.util.Comparator;
import java.util.Objects;

public class Parrot extends Pet implements Comparable<Parrot>{

    private String name;
    private int age;

    public Parrot(int id, String name, int age) {
        super(id);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parrot)) return false;
        if (!super.equals(o)) return false;
        Parrot parrot = (Parrot) o;
        return age == parrot.age && Objects.equals(name, parrot.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, age);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Parrot o) {
        return name.compareTo(o.name);
    }

    public static class ParrotComparator implements Comparator<Parrot> {

        @Override
        public int compare(Parrot o1, Parrot o2) {
            return o1.age - o2.age;
        }
    }
}
