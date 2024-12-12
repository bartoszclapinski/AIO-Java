package Iterators.Exercises.Exercise2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FilteringWords {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        // Wczytywanie wyrazów
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj wyraz nr " + (i + 1));
            words.add(scanner.nextLine());
        }

        System.out.println("Podaj tekst do odfiltrowania:");
        String filterWord = scanner.nextLine();
        
        // Użycie iteratora do bezpiecznego usuwania elementów
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.toLowerCase().contains(filterWord.toLowerCase())) {
                iterator.remove();  // Bezpieczne usuwanie przez iterator
            }
        }

        System.out.println(words);
        scanner.close();
    }
}
