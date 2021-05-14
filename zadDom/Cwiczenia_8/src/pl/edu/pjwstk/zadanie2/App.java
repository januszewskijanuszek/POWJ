package pl.edu.pjwstk.zadanie2;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws IOException {
        File input = new File("src/pl/edu/pjwstk/zadanie2/input.txt");
        if(input.exists()){
            Stream<String> linesFromFile = Files.lines(input.toPath());
            List<String> listOfLines = linesFromFile.collect(Collectors.toList());
            for (String line : listOfLines) {
                try {
                    int lineInt = Integer.parseInt(line);
                    System.out.println(lineInt + " - Is a number!");
                } catch (NumberFormatException ignored) {
                    System.out.println(line + " - Is not a number!");
                }
            }
        } else{
            System.out.println("Error, file not found!");
        }
    }
}
