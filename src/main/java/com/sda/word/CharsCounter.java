package com.sda.word;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by RENT on 2017-07-05.
 */
public class CharsCounter implements Countable{


    @Override
    public int count(String filePath) {
        List<String> chars = null;
        try {
            chars = Files.readAllLines(Paths.get(filePath));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
