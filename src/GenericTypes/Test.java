package GenericTypes;

public class Test {
    public static void main(String[] args) {
        IntContainer intArr = new IntContainer();
        intArr.setArr(new int[]{1, 2, 3, 4, 5});
        intArr.print();

        StringContainer strArr = new StringContainer();
        strArr.setArr(new String[]{"one", "two", "three", "four", "five"});
        strArr.print();

        Container container = new Container();
        container.setArr(new String[]{"one", "two", "three", "four", "five"});
        container.print();

        GenericContainer<String> genericStringContainer = new GenericContainer<>();
        genericStringContainer.setArr(new String[]{"one", "two", "three", "four", "five"});
        genericStringContainer.print();

        GenericContainer<Integer> genericIntegerContainer = new GenericContainer<>();
        genericIntegerContainer.setArr(new Integer[]{1, 2, 3, 4, 5});
        genericIntegerContainer.print();
    }
}
