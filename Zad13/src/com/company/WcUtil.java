package com.company;

import java.io.*;
import java.util.ArrayList;


public class WcUtil {

    public static void main(String[] args) {

        for (String arg : args) {

            File file = new File(arg);
            if (file.exists()) {

                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    int count = 0;
                    long count2 = 0;
                    ArrayList<String> al = new ArrayList<>();

                    while ((line = reader.readLine()) != null) {
                        count++;

                        String[] array = line.split(" ");

                        for (String i : array) {
                            if (!i.isEmpty()) {
                                al.add(i);
                            }
                        }
                        count2 = file.length();
                    }
                    System.out.println("number of lines: " + count);
                    System.out.println("number of bytes: " + count2);
                    System.out.println("number of words: " + al.size());

                } catch (IOException e) {
                    System.out.println("Read error");
                }
            }


        }
    }
}

