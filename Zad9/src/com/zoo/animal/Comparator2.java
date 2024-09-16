package com.zoo.animal;


import java.util.TreeSet;

public class Comparator2 implements Comparable<Comparator2>{

    TreeSet<Integer> array = new TreeSet<>();


    public Comparator2() {
    }

    public Comparator2(TreeSet<Integer> arr) {

        this.array=arr;
    }

    public void setArray(TreeSet<Integer> array) {
        this.array = array;
    }

    public TreeSet<Integer> getArray() {
        return array;
    }

    @Override
    public int compareTo(Comparator2 c2) {

        if (func(array) < func(c2.array)){
            return -1;
        }
        return 1;

    }
    public static int func(TreeSet<Integer> o){
        int count = 0;
        for (Integer integer : o){
            if(integer==3 || integer==2 || integer==5 || integer==7){
                count++;
            }

            if((integer!=1) && !(integer%2==0) && !(integer%3==0) && !(integer%5==0) && !(integer%7==0)){

                count++;
            }
            //System.out.println(integer);

        }
        //System.out.println("******");
        //System.out.println(count);
        //System.out.println("******");
        return count;
    }
}
