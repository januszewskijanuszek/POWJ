package pl.edu.pjwstk.zadanie1;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        // Create directory
        File directory = new File("src/pl/edu/pjwstk/zadanie1/exercise");
        directory.mkdir();
        // Create file
        File file = new File("src/pl/edu/pjwstk/zadanie1/exercise/output.txt");
        file.createNewFile();

        File directory1 = new File("src/pl/edu/pjwstk/zadanie1/exercise/dir1");
        File directory2 = new File("src/pl/edu/pjwstk/zadanie1/exercise/dir2");
        directory1.mkdir();
        directory2.mkdir();

        InformationProvider.displayInformation(directory);
        InformationProvider.displayInformation(file);
        InformationProvider.displayInformation(directory1);
        InformationProvider.displayInformation(directory2);
    }
}
