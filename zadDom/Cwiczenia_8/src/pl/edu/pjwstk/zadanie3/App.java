package pl.edu.pjwstk.zadanie3;


import jdk.nashorn.internal.ir.debug.ClassHistogramElement;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws IOException {
        File fileStart = new File("src/pl/edu/pjwstk/zadanie3/input.txt");
        if(!fileStart.exists()){
            Random rand = new Random();
            fileStart.createNewFile();
            for(int i = 0 ; i < 100 ; i++){
                String outString = rand.nextInt(100) + "\n";
                Files.write(fileStart.toPath(), outString.getBytes(), StandardOpenOption.APPEND);
            }
        }
        boolean help = true;
        int value1 = -1;
        int value2 = -1;
        Stream<String> linesFromFile = Files.lines(fileStart.toPath());
        List<String> listOfLines = linesFromFile.collect(Collectors.toList());
        for(String line : listOfLines){
            if(help){
                if(value1 == -1) value1 = Integer.parseInt(line);
                else {
                    value2 = Integer.parseInt(line);
                    System.out.println(value1 + value2);
                    value1 = -1;
                }
                help = false;
            } else {
                help = true;
            }
        }
    }
}
