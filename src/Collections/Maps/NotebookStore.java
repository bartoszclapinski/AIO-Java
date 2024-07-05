package Collections.Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NotebookStore {
    public static void main(String[] args) {
        Map<String, Notebook> notebooks = new HashMap<>();
        notebooks.put("X541UV", new Notebook("Asus", "X541UV"));
        notebooks.put("Inspirion 5567", new Notebook("Dell", "Inspirion 5567"));
        notebooks.put("Pavilion 17", new Notebook("HP", "Pavilion 17"));
        notebooks.put("MacBook Pro", new Notebook("Apple", "MacBook Pro"));

        String key = "Inspirion 5567";
        Notebook notebook = notebooks.get(key);
        System.out.println(notebook);
        notebooks.remove("MacBook Pro");
        System.out.println(notebooks.get("MacBook Pro"));
        notebooks.put("MacBook Pro", new Notebook("Apple", "MacBook Pro"));

        Set<String> keys = notebooks.keySet();
        System.out.println("Notebooks keys: " + keys);

        Collection<Notebook> values = notebooks.values();
        System.out.println("Notebooks values: " + values);

        for (String k : keys) System.out.println(k + " : " + notebooks.get(k));

        System.out.println("-------------------------------");

        Set<Map.Entry<String, Notebook>> entries = notebooks.entrySet();

        for (Map.Entry<String, Notebook> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Map<String, Integer> people = Map.of("John", 25, "Anna", 30, "Tom", 35);
        System.out.println(people);
    }
}
