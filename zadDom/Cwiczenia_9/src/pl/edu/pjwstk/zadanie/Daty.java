package pl.edu.pjwstk.zadanie;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;

public class Daty {

    public static void main(String[] args) throws IOException {
        LocalDate localDate = LocalDate.now();
        File out = new File("output.txt");
        LocalDate date = LocalDate.now();
        // localDate = LocalDate.of(2021, 4, 11);

        int counter = 0;
        while(counter < 100){
            localDate = localDate.plusYears(1);
            if(localDate.isLeapYear()){
                counter++;
                System.out.println(localDate);

                String outString = localDate + "\n";

                Files.write(out.toPath(), outString.getBytes(), StandardOpenOption.APPEND);
            }
        }

    }
}
