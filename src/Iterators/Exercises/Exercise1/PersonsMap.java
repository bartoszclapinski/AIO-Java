package Iterators.Exercises.Exercise1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class PersonsMap {
    public static void main(String[] args) {
        // Tworzymy TreeMap, która automatycznie sortuje po kluczu (nazwisku)
        Map<String, String> osoby = new TreeMap<>();
        
        // Dodajemy osoby w nieposortowanej kolejności
        osoby.put("Zieliński", "Jan Zieliński, 25 lat");
        osoby.put("Kowalski", "Adam Kowalski, 30 lat");
        osoby.put("Nowak", "Maria Nowak, 28 lat");
        osoby.put("Adamski", "Piotr Adamski, 35 lat");
        osoby.put("Wójcik", "Anna Wójcik, 22 lat");

        // Pobieramy iterator dla zestawu wpisów mapy
        Iterator<Map.Entry<String, String>> iterator = osoby.entrySet().iterator();

        // Wyświetlamy dane używając iteratora i pętli while
        System.out.println("Lista osób (posortowana według nazwisk):");
        while (iterator.hasNext()) {
            Map.Entry<String, String> wpis = iterator.next();
            System.out.println(wpis.getValue());
        }
    }
}
