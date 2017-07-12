package mod3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Module3 {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        System.out.println("Введите количество елементов в масиве: ");

      //  int n = Integer.parseInt(reader.readLine());
        //int[] Array = new int[n];
        int[] Array = {12,45,65,2,10,1};


        System.out.println("Введите целочисельные значения");
//
//        for (int i = 0; i < Array.length; i++){
//            System.out.println("Индекс №: " + i);
//            n = Integer.parseInt(reader.readLine());
//        }
        System.out.println(arrayMin(Array));



    }
    public static int arrayMin (int[]Array) {

        int min = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (min > Array[i]) {
                min = Array[i];
            }
        }
        return min;
    }
}
