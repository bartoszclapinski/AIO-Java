package Arrays.Exercise1;
import java.util.Arrays;

public class PersonDatabase {
    private Person[] arr;
    private int index;

    public PersonDatabase() {
        arr = new Person[1];
        index = 0;
    }

    public void add(Person p) {
        if (p == null) throw new NullPointerException("Null argument");
        if (index == arr.length){
            Person[] temp = Arrays.copyOf(arr, arr.length * 2);
            arr = Arrays.copyOf(temp, temp.length);
        }
        arr[index] = p;
        index++;
    }

    public void remove(Person p) {
        if (p == null) throw new NullPointerException("Null argument");
        int indexToRemove = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) break;
            if (arr[i].equals(p)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove < 0) {
            System.out.println("Person not found");
        } else {
            for (int i = indexToRemove; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            index--;
        }
    }

    public Person get(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= arr.length) throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        return arr[index];
    }

    public int size() {
        return index;
    }

    public void print() {
        for (Person p : arr) {
            if (p == null) break;
            System.out.println(p);
        }
    }

}
