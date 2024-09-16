package com.zoo.animal;


import java.util.Set;
import java.util.TreeSet;


public class MainForComparator {
    public static void main(String[] args) {
       TreeSet<Comparator2> arr = new TreeSet<>();

       TreeSet<Integer> arr2 = new TreeSet<>(Set.of(1,15,9,8));
       Comparator2 comparator2 =new Comparator2(arr2);
       arr.add(comparator2);


       TreeSet<Integer> arr3 = new TreeSet<>(Set.of(5,11,2,4));
       Comparator2 comparator3 =new Comparator2(arr3);
        arr.add(comparator3);


        TreeSet<Integer> arr4 = new TreeSet<>(Set.of(3,7,13,11));
        Comparator2 comparator4 =new Comparator2(arr4);
        arr.add(comparator4);


        TreeSet<Integer> arr5 = new TreeSet<>(Set.of(29,23,17,31));
        Comparator2 comparator5 =new Comparator2(arr5);
        arr.add(comparator5);


        TreeSet<Integer> arr6 = new TreeSet<>(Set.of(47,12,16,99));
        Comparator2 comparator6 =new Comparator2(arr6);
        arr.add(comparator6);

        for (Comparator2 a : arr){
            System.out.println(a.array);
        }

    }
}
