package ua.intita.qa.homework17.animal;

import java.util.*;

public class Animal {
    private final Map<String, Pet> map = new HashMap<>();

    public Map<String, Pet> fillData() {
        Scanner scan = new Scanner(System.in);
        String name;
        int idCat = 1;
        int idDog = 1;
        int idParrot = 1;
        String bread;
        int age;
        do {
            System.out.println("enter your Cat name. To stop enter 0! to continue enter any digit...");
            name = scan.next();
            System.out.println("enter its bread");
            bread = scan.next();
            System.out.println("enter its age");
            age = scan.nextInt();
            map.put(name, new Cat(idCat++, name, bread, age));
        } while (scan.nextInt() != 0);

        do {
            System.out.println("enter your Dog name.To stop enter 0! to continue enter any digit...");
            name = scan.next();
            System.out.println("enter its bread");
            bread = scan.next();
            System.out.println("enter its age");
            age = scan.nextInt();
            map.put(name, new Dog(idDog++, name, bread, age));
        } while (scan.nextInt() != 0);

        do {
            System.out.println("enter your Parrot name.To stop enter 0! to continue enter any digit...");
            name = scan.next();
            System.out.println("enter its age");
            age = scan.nextInt();
            map.put(name, new Parrot(idParrot++, name, age));
        } while (scan.nextInt() != 0);
        return map;
    }

    public void printAllKeys(Map<String, ? extends Pet> map) {
        for (Map.Entry<String, ? extends Pet> entry : map.entrySet()) {
            System.out.println("KEY = " + entry.getKey());
        }
    }
    public void printSortedMapName(Map<String, ? extends Pet> map){
        List<Map.Entry<String, ? extends Pet>> list = new LinkedList<Map.Entry<String, ? extends Pet>>(map.entrySet());
        Map<String, ? extends Pet> newMap = new TreeMap<>(map);
        for (Map.Entry<String,? extends Pet> elem:newMap.entrySet()) {
            System.out.println(elem.getKey());
        }
    }

    public void sortByAge(Map<String, ? extends Pet> map){
        List<Map.Entry<String, ? extends Pet>> list = new LinkedList<Map.Entry<String, ? extends Pet>>(map.entrySet());
        List<Pet>list1 = new ArrayList<>();
        for (Map.Entry<String,?extends Pet> elem: map.entrySet()) {
            list1.add(elem.getValue());
        }
       Collections.sort(list1, new Comparator<Pet>() {
           @Override
           public int compare(Pet o1, Pet o2) {
               //???? не понимаю как сравнивать, если у Pet только id и он не знает о поле возраст в наследниках
               return 0;
           }
       });
        for (Pet pet:list1) {
            System.out.println(pet);
        }

    }

}
