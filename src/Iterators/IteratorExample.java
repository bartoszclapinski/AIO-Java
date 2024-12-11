package Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class IteratorExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(43);
        numbers.add(3);
        numbers.add(21);
        numbers.add(150);
        numbers.add(1);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Jim");
        names.add("Jill");
        names.add("Jack");
        names.add("Jill");
        names.add("Jack");
        names.add("Jill");
        names.add("Jack");
        names.add("Jill");

        System.out.println("Names before removing: " + names);
        
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);            
            if (name.equals("Jill")) {
                names.remove(name);
                i--;
            }
        }
        System.out.println("Names after removing Jill: " + names);

        Iterator<String> iterator2 = names.iterator();
        while (iterator2.hasNext()) {
            String name = iterator2.next();            
            if (name.equals("Jack")) {
                iterator2.remove();
            }
        }
        System.out.println("Names after removing Jack: " + names);
    }
}

