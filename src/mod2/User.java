package mod2;

import java.util.Scanner;


public class User {

    private static String name;
    private static String city;
    private static String hobby;
    private static int age;
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите ваше имя");
        name = in.nextLine();

        System.out.println("Введите ваш город");
        city = in.nextLine();

        System.out.println("Ваше хобби?");
        hobby = in.nextLine();


        while (true) {
            try {
                System.out.println("Сколько Вам лет?");
                age = in.nextInt();
                break;

            } catch (Exception e) {
                System.out.println("Некорректный ввод!!!");
                in.nextLine();
            }
        }

        vuborVarianta();
    }

    public static void vuborVarianta() {
        System.out.println("Выберите вариант");
        int s = in.nextInt();
        while (s != 4) {

            if (s >= 1 && s < 4) {

                if (s == 1) {
                    System.out.println("Имя: " + name + "\nГород: " + city + "\nВозоаст: " +
                            "" + age + "\nХобби: " + hobby + "\n");
                    break;
                }
                if (s == 2) {
                    System.out.println("Человек по имени " + name + " живет в городе " + city + ".\n" +
                            "Этому человеку " + age + " лет и любит он заниматься " + hobby + ".\n");
                    break;
                }
                if (s == 3) {
                    System.out.println(name + " - имя\n" + city + " - город" +
                            "\n" + age + " - возраст\n" + hobby + " - хобби");
                    break;


                }
            }
            in.nextInt();
        }


    }
}
