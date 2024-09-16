package sql.demo;


import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);
        System.out.println("Введите строку");
        String str1 = br.nextLine();

        if (str1 == null || str1.isEmpty()) {
            System.out.println("Введите строку правильно");
        } else System.out.println(fun(str1));

    }

    public static boolean fun(String s) {

        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        if (s.length() > 3) {
            fun(s.substring(1, s.length() - 2));
            return true;
        } else return true;

    }
}
