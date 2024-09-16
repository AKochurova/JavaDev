package com.zoo.animal;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Game {
    public static void func() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        Set<Character> letters = getChars(word);
        HashSet<String> history = new HashSet<>();

        System.out.println("1-й игрок ");
        String gamer1Word = scanner.nextLine();

        System.out.println("2-й игрок ");
        String gamer2Word = scanner.nextLine();

        int gamer1 = 0;
        int gamer2 = 0;



        while (!gamer1Word.isEmpty() || !gamer2Word.isEmpty()){
            if (!gamer1Word.isEmpty()) {

                Set<Character> inputLetters1 = getChars(gamer1Word);
                if (!isContainsAll(letters, inputLetters1)) {
                    System.out.println("Слово " + gamer1Word + " не состоит из букв первого");
                } else if (history.contains(gamer1Word)) {
                    System.out.println("Это слово введено ранее");
                } else {
                    System.out.println("Слово " + gamer1Word + " засчитано");
                    history.add(gamer1Word);
                    for (Character i : inputLetters1) {
                        gamer1++;
                    }
                }

            }
            if (!gamer2Word.isEmpty()){

                Set<Character> inputLetters2 = getChars(gamer2Word);
                if (!isContainsAll(letters, inputLetters2)) {
                    System.out.println("Слово " + gamer2Word + " не состоит из букв первого");
                } else if (history.contains(gamer2Word)) {
                    System.out.println("Это слово введено ранее");
                } else {
                    System.out.println("Слово " + gamer2Word + " засчитано");
                    history.add(gamer2Word);
                    for (Character j : inputLetters2) {
                        gamer2++;
                    }
                }

            }
            System.out.println("1-й игрок ");
            gamer1Word = scanner.nextLine();
            System.out.println("2-й игрок ");
            gamer2Word = scanner.nextLine();

        }

        System.out.println("Были введены слова: ");
        for (String historyWord : history){
            System.out.println(historyWord);
        }
        System.out.println("Баллы: "+gamer1 + "\nБаллы: "+gamer2);

    }
    public static Set<Character> getChars(String word){
        HashSet<Character> letters = new HashSet<>();
        for (int i = 0; i < word.length(); i++){
            letters.add(word.charAt(i));
        }
        return letters;
    }
    public static boolean isContainsAll(Set<Character> first, Set<Character> second){
        for (Character elem : second){
            if (!first.contains(elem)){
                return false;
            }
        }
        return true;
    }

}
