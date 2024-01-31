package GenericTypes;

public class IntContainer {
    private int[] arr;

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void print() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
