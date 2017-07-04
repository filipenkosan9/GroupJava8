import java.util.Scanner;

/**
 * Created by Admin on 25.06.2017.
 */
public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;
        //sc.nextLine();//java bug

        while (true) {
            try {
                System.out.println("Введите возраст");
                age = sc.nextInt();
                sc.nextLine();//java bug
                break;
            } catch (Exception e) {
                System.out.println("Упс, это не число!!! может все таки - ");
                sc.nextLine();//java bug
            }
        }



    }
}
