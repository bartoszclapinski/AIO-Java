package GenericTypes.Exercise;

public class Pair <T, K>{
    private final T first;
    private final K second;

    public Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public void print() {
        System.out.println(first + " " + second);
    }
}
