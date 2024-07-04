package Collections.Sets;

import java.util.HashSet;
import java.util.Set;

public class PersonSet {
    public static void main(String[] args) {
        // Create a set with persons
        Set<Person> persons = new HashSet<>();

        // Add elements to the set
        persons.add(new Person("John", "Doe"));
        persons.add(new Person("Jane", "Doe"));
        persons.add(new Person("John", "Doe"));
        persons.add(new Person("Jane", "Doe"));

        // Print the set
        System.out.println("Hash set with persons: \n" + persons);

        System.out.println("-------------------------------------------------");

        System.out.println("Is set of persons contains John Doe? " + persons.contains(new Person("John", "Doe")));
        System.out.println("Set of persons size: " + persons.size());
        persons.remove(new Person("John", "Doe"));
        System.out.println("Set of persons size after removing John Doe: " + persons.size());
        System.out.println("Hash set with persons after removing John Doe: \n" + persons);

        System.out.println("-------------------------------------------------");

        // Create a set with persons with hash
        Set<PersonWithHash> personsWithHash = new HashSet<>();

        // Add elements to the set
        personsWithHash.add(new PersonWithHash("John", "Doe"));
        personsWithHash.add(new PersonWithHash("Jane", "Doe"));
        personsWithHash.add(new PersonWithHash("John", "Doe"));
        personsWithHash.add(new PersonWithHash("Jane", "Doe"));

        // Print the set
        System.out.println("Hash set with persons with hash: \n" + personsWithHash);

        System.out.println("-------------------------------------------------");

        System.out.println("Is set of persons with hash contains John Doe? " + personsWithHash.contains(new PersonWithHash("John", "Doe")));
        System.out.println("Set of persons with hash size: " + personsWithHash.size());
        personsWithHash.remove(new PersonWithHash("John", "Doe"));
        System.out.println("Set of persons with hash size after removing John Doe: " + personsWithHash.size());
        System.out.println("Hash set with persons with hash after removing John Doe: \n" + personsWithHash);

    }
}
