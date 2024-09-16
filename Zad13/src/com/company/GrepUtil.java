package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GrepUtil {
    public static void main(String[] args) {

        File file = new File(args[1]);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;

                ArrayList<String> al = new ArrayList<>();

                while ((line = reader.readLine()) != null) {
                    String[] array = line.split(" ");

                    for (String i : array) {
                        if (!i.isEmpty()) {
                            al.add(i);
                        }
                    }
                }
                for (String str : al) {
                    if (str.lastIndexOf(args[0]) != -1) {
                        System.out.println(str);
                    }
                }
            } catch (IOException e) {
                System.out.println("Read error");
            }
        }

    }
}
