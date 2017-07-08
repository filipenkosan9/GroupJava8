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
        out(name,city,hobby,age);
    }
    static void out (String name, String city, String hobby, int age){
        System.out.println("Выберите вариант вывода : \n 1 обич \n 2 табл \n 3 иное ");
        Scanner aa = new Scanner(System.in);


        int variant = aa.nextInt();
        switch (variant) {

            case 1:
                System.out.println("Имя: " + name + "\nГород: " + city + "\nВозоаст: " +
                        "" + age + "\nХобби: " + hobby + "\n");
                break;
            case 2:
                System.out.println("Человек по имени " + name + " живет в городе " + city + ".\n" +
                        "Этому человеку " + age + " лет и любит он заниматься " + hobby + ".\n");
                break;
            case 3:
                System.out.println(name + " - имя\n" + city + " - город" +
                        "\n" + age + " - возраст\n" + hobby + " - хобби");
                break;

            default:
                System.out.println("Выберите один из вариантов!!");

                out(name,city,hobby,age);

                break;
        }
    }
}



