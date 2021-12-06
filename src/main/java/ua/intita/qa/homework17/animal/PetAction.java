package ua.intita.qa.homework17.animal;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PetAction {

    public Set<String> getNames(Map<String, ? extends Pet> pets) {
        return pets.keySet();
    }

    public Collection<? extends Pet> getPets(Map<String, ? extends Pet> pets) {
        return new TreeMap<>(pets).values();
    }
}
