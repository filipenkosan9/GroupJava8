package carsMod5;

/**
 * Created by Admin on 03.10.2017.
 */
public class CarDoor {
   private boolean door = false;
   private boolean window = false;

  public CarDoor(){};
  public CarDoor(boolean door, boolean window){};



    boolean OpenAndCloseDoor(){
        if(door == false) door = true;
        else if(!door) door = false;
        return door;
    }
    public boolean OpenDoor(){
        door = true;
        return door;
    }
    public boolean CloseDoor() {
         door = false;
        return door;

    }
    public void ShowInfoDoor(){
        if(door == false)
            System.out.println("Двекрь закрыта");
        else System.out.println("Дверь открыта");
    }

    public boolean OpenAndCloseWindow(){
        if(window) window = true;
        else if(!window) window = false;
        return window;
    }
    public boolean OpenWindow(){
         window = true;
        return window;
    }
    public boolean CloseWindow() {
         window = false;
        return window;
    }
    public void ShowInfoWindow(){
        if(door == false) System.out.println("Окно закрыто");
        else System.out.println("Окно открыто");
    }
}
