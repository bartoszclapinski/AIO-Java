package GenericTypes.Exercise;

public class Test {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("one", 1);
        pair1.print();

        Pair<String, String> pair2 = new Pair<>("one", "two");
        pair2.print();

        Pair<Integer, String> pair3 = new Pair<>(1, "two");
        pair3.print();

        Pair<Integer, Integer> pair4 = new Pair<>(1, 2);
        pair4.print();
    }
}
