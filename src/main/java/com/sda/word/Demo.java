package com.sda.word;

public class Demo {

    public static void main(String[] args) {

CountLines cs = new CountLines();
        System.out.println("Number of lines in file: " + cs.countLines("file.txt"));

        CharsCounter charsCounter = new CharsCounter();
        System.out.println(charsCounter.count("file.txt"));


    }
}
