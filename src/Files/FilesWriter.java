package Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilesWriter {
    public static void main(String[] args) {
        String fileName = "./src/Files/temp/testFile.txt";

        try (
                FileWriter fileWriter = new FileWriter(fileName, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            ) {

            bufferedWriter.write("Line from buffered writer");
            bufferedWriter.newLine();
            bufferedWriter.write("Another line from buffered writer");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
