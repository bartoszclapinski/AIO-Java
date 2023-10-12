package Files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {
    public static void main(String[] args) {
        String fileName = "./src/Files/temp/person.obj";
        Person person1 = null;
        Person person2 = null;

        try (
                var fileInputStream = new FileInputStream(fileName);
                var objectInputStream = new ObjectInputStream(fileInputStream);
            ) {

            person1 = (Person) objectInputStream.readObject();
            person2 = (Person) objectInputStream.readObject();

        } catch (ClassNotFoundException | IOException e) {
            System.err.println("Error while reading from file: " + fileName);
            System.out.println(e.getMessage());
        }

        System.out.println("Objects read from file: " + fileName);
        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);
    }
}
