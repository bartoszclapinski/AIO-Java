package Files;

import java.io.File;
import java.io.IOException;

public class FileCreator {
    public static void main(String[] args) {
        String fileName = "./src/Files/temp/testFile.txt";
        String dirName = "./src/Files/temp";
        File file = new File(fileName);

        boolean fileExist = file.exists();
        if (!fileExist) {
            boolean dirExist = new File(dirName).exists();
            if (!dirExist) {
                boolean dirCreated = new File(dirName).mkdirs();
                if (dirCreated) {
                    System.out.println("Directory created: " + dirName);
                }
            }
            try {
                fileExist = file.createNewFile();
            } catch (IOException e) {
                System.out.println("File not created: " + fileName);
            }
        }

        if (fileExist) {
            System.out.println("File created: " + fileName);
        }
    }
}
