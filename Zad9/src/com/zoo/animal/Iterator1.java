package com.zoo.animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(324,1,25,678,4,54));

        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()){
            int sled = iterator.next();
            int zeloe = sled/10;
            float ostat=sled%10;
            System.out.println((int)ostat);
            while (zeloe!=0) {

                ostat = zeloe%10;
                zeloe = zeloe/10;
                System.out.println((int) ostat);
            }
            System.out.println("-----");

        }
    }
}
