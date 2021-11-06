package ua.intita.qa.homework13.generic;

public class One {
    private String name;
    private int age;

    public One() {
    }

    public One(String name, int age) {
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
        return "OneClass " + "name= '" + name +
                "', age= " + age ;
    }
}
