package Comparable.Exercise2;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class EstateApp {
    public static void main(String[] args) {

        String fileName = "./src/Comparable/Exercise2/estatesData";
        try {
            Estate[] estates = EstateFileReader.readEstatesFromFile(fileName);
            Arrays.sort(estates);
            for (Estate estate : estates) System.out.println(estate);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }

    }
}
