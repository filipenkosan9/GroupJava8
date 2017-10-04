package carsMod5;

/**
 * Created by Admin on 03.10.2017.
 */
public class Main {
    public static void main(String[] args) {


        CarDoor dor = new CarDoor();

        dor.CloseDoor();
        dor.ShowInfoDoor();
        dor.OpenDoor();
        dor.ShowInfoDoor();
        System.out.println("________________________");

        dor.ShowInfoWindow();
        dor.OpenAndCloseWindow();
        dor.ShowInfoWindow();


    }
}
