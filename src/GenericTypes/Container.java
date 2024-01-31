package GenericTypes;

public class Container {
    private Object[] arr;

    public void setArr(Object[] arr) {
        this.arr = arr;
    }

    public Object[] getArr() {
        return arr;
    }

    public void print() {
        for (Object i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
