package pl.edu.pjwstk.zadanie4_i_5;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        File file = new File("nazwa.txt");
        file.createNewFile();

        boolean fileExists = file.exists();
        System.out.println(file.getAbsoluteFile());

        File directory = new File("katalog");
        directory.mkdir();

        System.out.println(directory.isFile());
        System.out.println(directory.isDirectory());
    }
}
