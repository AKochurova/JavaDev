package sql.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ширину рамки");
        int na = scanner.nextInt();
        System.out.println("Введите длину рамки");
        int nb = scanner.nextInt();
        System.out.println("Введите строку");
        String word = reader.readLine();

        //Если длина строки больше ширины рамки выводит "Ошибка"
        if (nb < word.length() || na <= 2) {
            System.out.println("Ошибка");
        } else {
            //Выводит а строк, состоящих из "*"
            for (int i = 0; i < na; i++) {
                System.out.print("*");
                //Заполняет пробелами все кроме 1го столбца с "*"
                if (i != 0 & i != na - 1) {
                    //Центрирует строку
                    for (int j = 0; j < nb - 2; j++) {
                        if (j == (nb / 2) - (word.length() / 2) - 1 & i == na / 2) {
                            System.out.print(word);
                            j = (nb / 2) + (word.length() / 2) - 1;
                        }
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                //Рисует верхнюю и нижнюю границы
                else {
                    for (int j = 0; j < nb - 1; j++) {
                        System.out.print("*");
                    }
                }
                System.out.println("");
            }
        }
    }
}

