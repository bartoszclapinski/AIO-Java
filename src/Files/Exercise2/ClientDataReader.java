package Files.Exercise2;

import java.io.*;
import java.util.Scanner;

public class ClientDataReader {
    public static Client[] readClient(String fileName) throws FileNotFoundException{
        final int linesNumber = countLines(fileName);
        Client[] clients = new Client[linesNumber];
        try (Scanner scanner = new Scanner(new File(fileName))) {
            scanner.nextLine();
            for (int i = 0; i < linesNumber; i++) {
                String line = scanner.nextLine();
                String[] split = line.split(",");
                clients[i] = new Client(Integer.parseInt(split[0]), split[1], split[2], split[3], Double.parseDouble(split[4]));
            }
        }
        return clients;
    }

    private static int countLines(String fileName) throws FileNotFoundException{
        int lines = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                lines++;
            }
        }
        return lines;
    }
}
