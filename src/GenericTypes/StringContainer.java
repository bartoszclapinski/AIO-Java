package GenericTypes;

public class StringContainer {
    private String[] arr;

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public String[] getArr() {
        return arr;
    }

    public void print() {
        for (String i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
