package Files;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectWriter {
    public static void main(String[] args) {
        String fileName = "./src/Files/temp/person.obj";
        Person person1 = new Person("John", "Smith");
        Person person2 = new Person("Jane", "Doe");

        try (
                var fileOutputStream = new FileOutputStream(fileName);
                var objectOutputStream = new ObjectOutputStream(fileOutputStream);
            ) {

            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(person2);
            System.out.println("Objects written to file: " + fileName);

        } catch (Exception e) {
            System.err.println("Error while writing to file: " + fileName);
            System.out.println(e.getMessage());
        }
    }
}
