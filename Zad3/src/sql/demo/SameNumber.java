package sql.demo;

import java.util.ArrayList;


public class SameNumber {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        al.add(1);
        al.add(1);
        al.add(1);
        al.add(5);
        al.add(7);

        System.out.println(al);
        System.out.println(fun(al));

    }

    public static ArrayList<Integer> fun(ArrayList<Integer> al) {
        ArrayList<Integer> al2 = new ArrayList();
        for (int i = 0; i < al.size(); i++) {
            if (!al2.contains(al.get(i))) {
                al2.add(al.get(i));
            }

        }

        return al2;
    }
}
