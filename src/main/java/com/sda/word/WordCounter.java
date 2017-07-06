package com.sda.word;

/**
 * Created by RENT on 2017-07-06.
 */

import java.nio.file.Paths;
import java.util.Scanner;


public class WordCounter {


    public int count(String filePath) {
        try {
            int wordCount = 0;
            Scanner sc = new Scanner(Paths.get(filePath));
            while (sc.hasNext()) {
                wordCount++;
                sc.next();
            }
            return wordCount;
        } catch (Exception e) {
            System.err.println(e);
        }
        return 0;
    }
}

