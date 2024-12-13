package CollectionsOperations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionOperation {
    public static void main(String[] args) {
               
        String sentence = "The test page serves two purposes: it provides visual confirmation " + 
        "of printer operation and may also contain helpful information for troubleshooting " + 
        "issues, such as printer driver details.";

        List<String> words = Arrays.asList(sentence.split(" "));
        System.out.println("Original list: ");
        printList(words);

        Collections.shuffle(words);
        System.out.println("Shuffled list: ");
        printList(words);

        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted list: ");
        printList(words);

        int index = Collections.binarySearch(words, "printer");
        System.out.println("Index of 'printer': " + index);

        int count = Collections.frequency(words, "printer");
        System.out.println("Frequency of 'printer': " + count);

        String min = Collections.min(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Min element: " + min);

        String max = Collections.max(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Max element: " + max);
    }

    private static void printList(List<String> list) {
        for (String word : list) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
    
}
