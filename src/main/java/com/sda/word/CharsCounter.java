package com.sda.word;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

/**
 * Created by RENT on 2017-07-05.
 */
public class CharsCounter implements Countable {


    @Override
    public int count(String filePath) {
        int ch;
        int charsCount = 0;
        int wordsCount = 0;
        boolean prev = true;
        //List<String> chars = null;
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            System.out.println(lines.get(0));
            return lines.toString().replace(" ","").replace("[","").replace("]","").replace(",","").length();

            //return lines.stream().mapToInt(String::length).sum();
            //List<String> charCounter = lines.stream().map
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }}
        /*
        Scanner in = new Scanner(filePath);
        //while (in.hasNextLine()){
        //String line = in.nextLine();
        //Scanner lineScanner = new Scanner(line);
        while (in.hasNext()) {
            wordsCount++;
            String word = in.next();
            charsCount += word.length();
        }
        in.close();
        return charsCount;
    }
}*/
