package Comparable.Exercise2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EstateFileReader {
    private static final int FILE_SIZE = 10;

    public static Estate[] readEstatesFromFile(String fileName) throws FileNotFoundException {
        Estate[] estates = new Estate[FILE_SIZE];
        try (Scanner scanner = new Scanner(new File(fileName))) {
            scanner.nextLine();
            for (int i = 0; i < FILE_SIZE; ++i) estates[i] = readEstate(scanner.nextLine());
        }
        return estates;
    }

    private static Estate readEstate(String line) {
        String[] parts = line.split(";");
        return new Estate(parts[0], Double.parseDouble(parts[1]), Integer.parseInt(parts[2]));
    }
}
