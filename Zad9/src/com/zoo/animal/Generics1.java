package com.zoo.animal;

import java.util.ArrayList;
import java.util.function.Predicate;


public class Generics1 {
    public static boolean fun(String s) {

        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        if (s.length() > 3) {
            fun(s.substring(1, s.length() - 2));
            return true;
        } else return true;

    }
    public static <T> boolean filter(ArrayList<T> array, Predicate<T> predicate){
        boolean s=true;
        int count = 0;

        for (T integer : array) {

            if (!predicate.test(integer)) {
                s = false;
                count++;
            }
        }
        System.out.println(count);
        return s;
    }
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(3);
        array.add(7);
        array.add(5);
        array.add(8);
        ArrayList<String> palindrom = new ArrayList<>();
        palindrom.add("топот");
        palindrom.add("поп");
        palindrom.add("dffd");
        palindrom.add("df");
        palindrom.add("dfrrgre");
        boolean odd_number = filter(array, a -> a%2==0);
        System.out.println(odd_number);
        boolean po = filter(palindrom, g -> !fun(g));
        System.out.println(po);
    }
}
