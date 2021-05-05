package pl.edu.pjwstk.zadanie4_i_5;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Wczytywanie {

    public static void main(String[] args) throws IOException {
        File input = new File("input.txt");
        System.out.println(input.exists());

        Stream<String> linesFromFile = Files.lines(input.toPath());
        List<String> listOfLines = linesFromFile.collect(Collectors.toList());

        for (String line : listOfLines) {
            try {
                int lineInt = Integer.parseInt(line);
                System.out.println(lineInt);
            } catch (NumberFormatException ignored) {
            }

            // Java regular expression
            //System.out.println(line);
            // Pattern, Matcher

            String pattern = "\\d+";
            String pattern2 = "[0-9]+";
            String pattern3 = "[0-9]+[*]";
            String pattern4 = "([0-9]+[* | \\- | / | +]*)+";

            boolean isNumber = line.matches(pattern);
            boolean isNumber3 = line.matches(pattern3);
            //System.out.println(line + " " + isNumber);
            System.out.println(line + " " + isNumber3);
        }
    }
}
