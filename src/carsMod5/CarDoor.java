package carsMod5;

/**
 * Created by Admin on 03.10.2017.
 */
public class CarDoor {
   private boolean StatusDoor;
   private boolean StatusWindow;

   boolean OpenDoor (){
       if (StatusDoor) StatusDoor = false;
       return StatusDoor;
   }
   boolean CloseDoor (){
       if (!StatusDoor) StatusDoor = true;
       return StatusDoor;
   }
   boolean CloseOpenDoor(){
      return StatusDoor = !StatusDoor;
   }

   boolean OpenWindow(){
       if(StatusWindow) StatusWindow = false;
        return StatusWindow;
   }
   boolean CloseWindow(){
       if(StatusWindow) StatusWindow = true;
       return StatusWindow;
   }
   boolean CloseOpenWindow(){
       if(StatusWindow) StatusWindow = false;
       else if(!StatusWindow) StatusWindow = true;
       return StatusWindow;
   }

    public CarDoor() {
        StatusDoor = true;
        StatusWindow = true;
    }
    public CarDoor(boolean statusDoor, boolean statusWindow) {
        StatusDoor = statusDoor;
        StatusWindow = statusWindow;
    }
}
