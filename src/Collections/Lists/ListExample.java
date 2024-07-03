package Collections.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        double[] numbers = new double[3];
        numbers[0] = 1.1;
        numbers[1] = 2.2;
        numbers[2] = 3.3;
        double[] numbersCopy = Arrays.copyOf(numbers, 10);
        System.out.println("ARRAY");
        System.out.println(Arrays.toString(numbersCopy));

        System.out.println("==================================================");

        ArrayList<Double> list = new ArrayList<>();
        list.add(1.1);
        list.add(2.2);
        list.add(3.3);
        System.out.println("LIST");
        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println("Sum of elements: " + list.stream().mapToDouble(Double::doubleValue).sum());

        System.out.println("==================================================");

        ArrayList<Double> list2 = new ArrayList<>();
        for (int i = 0; i < 100; i++) list2.add((double) i);
        System.out.println("LIST2");
        System.out.println("list.get(50): " + list2.get(50));
        System.out.println("Size: " + list2.size());
        list2.remove(2);
        System.out.println(list2);
        list2.remove(1.0);
        System.out.println(list2);
        list2.clear();
        System.out.println(list2);

        System.out.println("==================================================");

        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.add(1.1);
        linkedList.add(2.2);
        linkedList.add(3.3);
        linkedList.add(4.4);
        System.out.println("LINKED LIST");
        System.out.println(linkedList);

        System.out.println("==================================================");

        printList(linkedList);
        printList(list);
        List<Integer> integers = List.of(5, 10, 15);
        System.out.println(integers);
    }

    private static void printList(List<Double> list){
        for (Double d : list) System.out.println(d);
        System.out.println();
    }
}
