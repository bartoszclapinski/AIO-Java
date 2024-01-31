package GenericTypes;

public class GenericContainer<T> {
    private T[] arr;

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }

    public void print() {
        for (T i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
