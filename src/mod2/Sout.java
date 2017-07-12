package mod2;

import java.util.Scanner;

/**
 * 1. Создать новый проект на своем компе
 * 2. Создать новый проект на GitHub и объеденить проекст локальный с проектом на GitHub
 * 3. Написать программу, которая делает следующее:
 * 3.1 спрашивает у пользователя имя (String)
 * 3.2 спрашивает у пользователя город проживания (String)
 * 3.3 спрашивает у пользователя возраст (int)
 * 3.5 спрашивает у пользователя хобби (String)
 * 3.6 перед каждым вводом данных, программа должна вывести информацию пользователю с требованием ввода соответствующей информации.
 * 3.7 прогрмма выводит красиво оформленно всю информацию о пользователе в трех разных вариантах:
 * ----------------------------------
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
 * ----------------------------------
 * 4. По ходу решения задачи, пушить изменения на GitHub
 * 5. Финальный рабочий код программы которая соответствует всем подпунктам пункта 3, залить на GitHub
 * <p>
 * ______________________
 * ответ ментора:
 * <p>
 * Yevhenii Skliarov
 * ввод числа от 1 до 4 выделите в отдельный метод, и всю программу засуньте в цикл вайл,
 * а выход их него реализуйте с помощью break при выборе четверки
 */
public class Sout {
   private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

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

        out(name, city, hobby, age);
    }

    static void out(String name, String city, String hobby, int age) {
        System.out.println("Выберите вариант вывода : \n 1 обич \n 2 табл \n 3 иное ");


        switch (vuborVarianta()) {

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

                out(name, city, hobby, age);

                break;
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



