package mod2;

import java.util.Scanner;

/**
 * Вариант 1 (табличный):
 * Имя: хххххх
 * Город: хххххх
 * Возраст: хххххх
 * Хобби: хххххх
 * ----------------------------------
 * Вариант 2 (текстовый):
 * Человек по имени хххххх живет в городе хххххх.
 * Этому человеку хххххх лет и любит он заниматься хххххх.
 * ----------------------------------
 * Вариант 3 (иной):
 * хххххх - имя
 * хххххх - город
 * хххххх - возраст
 * хххххх - хобби
 */
public class Sout {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваше имя");
        String name = in.nextLine();

        System.out.println("Введите ваш город");
        String city = in.nextLine();

        System.out.println("Ваше хобби?");
        String hobby = in.nextLine();


        int age;

        while (true) {
            try {
                System.out.println("Сколько Вам лет?");
                age = in.nextInt();
                in.nextLine();
                break;

            } catch (Exception e) {
                System.out.println("Некорректный ввод!!!");
                in.nextLine();
            }
        }


        System.out.println("Вариант 1:\n----------");
        System.out.println("Имя: " + name);
        System.out.println("Город: " + city);
        System.out.println("Возраст: " + age);
        System.out.println("Хобби: " + hobby);
        System.out.println();
        System.out.println("Вариант 2:\n----------");
        System.out.println("Человек по имени " + name + " живет в городе " + city);
        System.out.println("Этому человеку " + age + "лет и любит он заниматься " + hobby);
        System.out.println();
        System.out.println("Вариант 3(инной):\n---------- ");
        System.out.println("Имя: " + name);
        System.out.println("Город: " + city);
        System.out.println("Возраст: " + age);
        System.out.println("Хобби: " + hobby);


    }


}
