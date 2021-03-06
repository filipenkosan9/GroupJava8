package mod4;

import java.util.Scanner;

/**
 Задание 1

 Написать функцию которая считает в консоли до числа Х. Аргументы функции: число Х Например Х = 5. Вывод программы: 1 2 3 4 5

 Задание 2

 Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов '+'
 Аргументы функции: ширина прямугольника в символах, высота прямоугольника в символах
 Например 3 на 2 Вывод программы: + + + + + +

 Задание 3

 Перегрузить функцию drawRectangle (задание 2) таким образом,
 что бы она могла принимать на вход только 1 параметр (ширина квадрата) и рисовать квадрат с равными сторонами
 Например 2 Вывод программы: + + + + Например 3 Вывод программы: + + + + + + + + +

 Задание 4

 Написать функцию getMax которая принимает на вход два аргумента в виде чисел.
 А возврыщает максимальное из этих двух.
 Так же, необходимо перегрузить эту функцию для работы с разными числовыми типами переменных (int, float)

 Задание 5

 Решить задачу 1, без использования циклов. Использовав рекурсию.

 Задание 6

 Решить задачу 2, без использования циклов. Использовав рекурсию.

 Задание 7 (дополнительно)

 Написать программу, в которой выполнены все шесть предыдущих заданий.
 Каждое задание выполняется в отдельной функции.
 В пределах этой же функции происходит ввод с консоли необходимых данных.
 Программа спрашивает пользователя какую задачу он хочет решить (от 1 до 6). Затем программа вызывает соответствующую функцию для решения этой задачи. По окончанию решения задачи, программа спрашивает пользователя, хочет ли он продолжить решать задачи. Если да - опять спрашивает какую задачу.
 */
public class HomeWork4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int f = sc.nextByte();

        System.out.println("Факториал числа " + f + " равен  - " + factorial(f));

        System.out.println("Вывод фигуры с 2 аргументами: ");
        drawRectangle(3,4);
        System.out.println("Вывод фигуры с 1 аргументом: ");
        drawRectangle((byte) 3);
        System.out.println("Поиск максимального числа int " + getMax(5,10));
        System.out.println("Поиск максимального числа float " +getMax(4f,5f));



    }

    public static int factorial(int x) {

        if (x == 1)
            return 1;

        int result = factorial(x - 1) * x;
        return result;
    }

    public static void drawRectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("+");
            }
            System.out.println(" ");

        }

    }
    public static void drawRectangle (byte a){
        for (int i = 0; i < a ; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("+");
            }
            System.out.println(" ");

        }
    }
    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        }else return b;
    }
    public static float getMax(float a, float b) {
        if (a > b) {
            return a;
        }else return b;
    }
}

