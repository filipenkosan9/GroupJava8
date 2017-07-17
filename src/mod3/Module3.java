package mod3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Задание 1

        Создать новый проект на GitHub и на локальном компе Написать программу которая:

        1. на вход через консоль принимает размер массива

        2. на вход через консоль принимает массив чисел

        3. найти минимальное число в массиве и вывести в консоль (без использования сортировки)

        4. найти максимальное число в массиве и вывести в консоль (без использования сортировки)

        5. посчитать кол-во повторений числа 5 и вывести в консоль

        6. вывести в консоль отсортированный массив


        Задание 2 (дополнительное)

        Добавить к программе из задания 1 следующее:

        7. вывести в консоль максимальное кол-во повторений чисел в массиве пример 1: массив 1, 2, 3, 4, 1, 6.

        Ответ 2. Так как число 1 повторяется 2 раза пример 2: массив 1, 1, 1, 4, 6, 6.

        Ответ 3. Так как число 1 повторяется 3 раза. А число 6 повторяется 2 раза.
        Поскольку надо вывести максимум, выводим 3. пример 3: массив 2, 3, 3, 5, 5, 6

        Ответ 3. Так как 3 и 5 повторяются по 2 раза, не важное кого из них подсчитывать, цель - вывести максимум.

        В этом примере максимум повторений чисел является 2 раза.

        8. вывести в консоль минимальное кол-во повторений чисел в массиве


        Задание 3 (дополнительное)

        9. Избавиться от пункта номер один. Массив в программе должен быть создан такого же размера
        как длинна массива из консоли (пример: 10, 10, 10, 10 тут размер массива 4; 10, 10 тут размер массива 2)
*/
public class Module3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Введите количество елементов в масиве: ");

        int arrayElement = Integer.parseInt(reader.readLine());
        int[] Array = new int[arrayElement];

        System.out.println("Введите целочисельные значения");
        for (int i = 0; i < Array.length; i++) {
            System.out.println("Индекс №: " + i);
            Array[i] = Integer.parseInt(reader.readLine());
        }

        povtorenieZnacheniya(Array);
        System.out.println("минимальное число масива " + arrayMin(Array));
        System.out.println("максимальное число масива " + arrayMax(Array));


    }

    public  static void povtorenieZnacheniya (int[] Array){
        int count = 0;
        for (int i = 0; i < Array.length ; i++) {
            if(Array[i] == 5)
                count++;
        }
        System.out.println("Число 5 в масиве повторилось " + count + " раз(а)");

    }

    public static int arrayMin(int[] Array) {

        int min = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (min > Array[i]) {
                min = Array[i];
            }
        }
        return min;
    }

    public static int arrayMax(int[] Array) {

        int max = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (max < Array[i]) {
                max = Array[i];
            }
        }
        return max;
    }
}
