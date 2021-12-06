package ua.intita.qa.homework17.animal;


import java.util.Map;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Map<String, Pet>map = animal.fillData();
       // animal.printAllKeys(map);
        animal.printSortedMapName(map);


        //?????
      //  animal.sortByAge(map);
    }
}
