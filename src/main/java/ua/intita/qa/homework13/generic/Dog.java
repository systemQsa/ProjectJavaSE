package ua.intita.qa.homework13.generic;

public class Dog {
    private String name;
    public  void makeVoice(){
        System.out.println(name + " makes GaV gav");
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
