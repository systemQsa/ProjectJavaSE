package ua.intita.qa.homework17.animal;

import java.util.Comparator;
import java.util.Objects;

public class Cat extends Pet implements Comparator<Cat>{
    private String name;
    private String bread;
    private int age;

    public Cat(int id,String name, String bread, int age) {
        this.id = id;
        this.name = name;
        this.bread = bread;
        this.age = age;
    }

    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getAge() - o2.getAge();
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
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", age=" + age +
                '}';
    }


}
