package Collections.Sets.Exercise1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class ReadNames {
    public static void main(String[] args) {

        final String FILE_PATH = "./src/Collections/Sets/Files/namespl.txt";

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(FILE_PATH));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        TreeSet<String> names = new TreeSet<>((name1, name2) -> -name1.compareTo(name2));

        while (scanner.hasNext()) names.add(scanner.nextLine());

        System.out.println("Names in set: " + names.size());
        System.out.println("First name: " + names.first());
        System.out.println("Last name: " + names.last());

        /*
        System.out.println("Names in reverse order:");
        names.forEach(System.out::println);
        */

        scanner.close();
    }
}
