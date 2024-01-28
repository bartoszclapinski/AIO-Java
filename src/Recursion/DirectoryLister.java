package Recursion;

import java.io.File;

public class DirectoryLister {
    public static void main(String[] args) {
        File file = new File("src/Recursion");
        showDirectories(file);
    }

    private static void showDirectories(File file) {
        if (file.isDirectory()) {
            System.out.println(file.getAbsolutePath());
            File[] files = file.listFiles();
            for (File f : files) {
                System.out.println(f.getAbsolutePath());
                showDirectories(f);
            }
        }
    }
}
