package mod2;

import java.util.Scanner;

/**
 * Created by Admin on 12.07.2017.
 */
public class User {

    private static String name ;
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
                in.nextLine();
                break;

            } catch (Exception e) {
                System.out.println("Некорректный ввод!!!");
                in.nextLine();
            }
        }


    }
    public static int vuborVarianta (){
        int s = in.nextInt();
        while (s != 4){
            if (s == 1){
                System.out.println("Имя: " + name + "\nГород: " + city + "\nВозоаст: " +
                        "" + age + "\nХобби: " + hobby + "\n");

            }
        }

        if( s >= 1 && s <= 3 );
        return s;

    }
}
