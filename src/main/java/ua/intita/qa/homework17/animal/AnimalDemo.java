package ua.intita.qa.homework17.animal;


import java.util.*;

public class AnimalDemo {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        Map<String, Pet>map = animal.fillData();
//       // animal.printAllKeys(map);
//        animal.printSortedMapName(map);
//
//
//        //?????
//      //  animal.sortByAge(map);

//        Map<String, Pet> pets = new HashMap<>();
//        pets.put("Bobik", new Dog(1, "Bobik", "boldog", 3));
//        pets.put("Murka", new Cat(2, "Murka", "scotland", 2));
//        pets.put("Gosha", new Parrot(3, "Gosha", 10));
//
//        PetAction petAction = new PetAction();
//        final Set<String> names = petAction.getNames(pets);
//        System.out.println(names);
//
//        final Collection<? extends Pet> pets1 = petAction.getPets(pets);
//        System.out.println(pets1);

        Set<Parrot> parrots = new TreeSet<>(Comparator.comparing(Pet::getId));
        parrots.add(new Parrot(3, "Gosha", 10));
        parrots.add(new Parrot(4, "AGosha", 8));
        parrots.add(new Parrot(1, "YGosha", 9));

        System.out.println(parrots);
    }
}

