package ua.intita.qa.homework13.generic;

public class GeneralizableClass implements Generalizable<String>{
    private String string;

    public GeneralizableClass(String string) {
        this.string = string;
    }

    @Override
    public String getT() {
        return string;
    }

    @Override
    public void printName() {
        System.out.println(string);
    }
}
