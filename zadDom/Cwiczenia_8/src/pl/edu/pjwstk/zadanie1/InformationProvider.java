package pl.edu.pjwstk.zadanie1;

import java.io.File;
import java.io.IOException;

public class InformationProvider {
    public static void displayInformation(File file) throws IOException {
        System.out.println("Name :" + file.getName());
        System.out.println("Exist: " + file.exists());
        System.out.println("Directory: " + file.isDirectory());
        System.out.println("File :" + file.isFile());
        System.out.println("Path :" + file.toPath());
        System.out.println("Path (extended) :" + file.getCanonicalPath());
    }
}
