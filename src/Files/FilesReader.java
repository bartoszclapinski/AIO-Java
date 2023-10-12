package Files;

import java.io.*;
import java.util.Scanner;

public class FilesReader {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "./src/Files/temp/testFile.txt";
        File file = new File(fileName);

        System.out.println("Reading file with Scanner: " + fileName);
        Scanner scanner = new Scanner(file);
        int lines = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            lines++;
        }
        System.out.println("Number of lines: " + lines);
        scanner.close();

        System.out.println("Reading file with BufferedReader: " + fileName);
        // Could be in try catch block with FileNotFoundException
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        lines = 0;
        try {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
                lines++;
            }
        } catch (Exception e) {
            System.out.println("Error while reading file: " + fileName);
        } finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println("Error while closing file: " + fileName);
            }
        }
        System.out.println("Number of lines: " + lines);


        System.out.println("Reading file with try-with-resources: " + fileName);
        try (
                var fileReader2 = new FileReader(fileName);
                var bufferedReader2 = new BufferedReader(fileReader2);
            ) {
            lines = 0;
            String line = bufferedReader2.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader2.readLine();
                lines++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Number of lines: " + lines);

    }
}
