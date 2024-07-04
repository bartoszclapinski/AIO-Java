package Collections.Sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsExample {
    public static void main(String[] args) {

        // Create a set with integers
        Set<Integer> numbers = new HashSet<>();

        // Add elements to the set
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(1);
        numbers.add(2);

        // Print the set
        System.out.println("Hash set with integers: \n" + numbers);

        System.out.println("-------------------------------------------------");

        // Create a set with strings
        Set<String> set = new HashSet<>();

        // Add elements to the set
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java");
        set.add("JavaScript");

        // Print the set
        System.out.println("Hash set with strings: \n" + set);

        System.out.println("-------------------------------------------------");

        System.out.println("Is set of strings contains Java? " + set.contains("Java"));
        System.out.println("Set of strings size: " + set.size());

        System.out.println("-------------------------------------------------");
        TreeSet<Integer>  treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(1);
        treeSet.add(2);

        System.out.println("Tree set with integers: \n" + treeSet);
        System.out.println("Is tree set contains 1? " + treeSet.contains(1));
        System.out.println("Tree set size: " + treeSet.size());
        System.out.println("First element in tree set: " + treeSet.first());
        System.out.println("Last element in tree set: " + treeSet.last());

        System.out.println("-------------------------------------------------");

        Set<String> names = Set.of("John", "Jane", "Doe", "Alice", "Bob", "Charlie");
        System.out.println("Set of names: " + names);
        //  names.add("Eve"); // UnsupportedOperationException

        //  LinkedHashSet preserves the insertion order
        //  TreeSet is a sorted set implementation, objects need to implement Comparable interface
        //  HashSet is a set implementation that uses a hash table

    }
}
