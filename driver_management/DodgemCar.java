package driver_management;
import behaviours.*;

public class DodgemCar implements Driveable {

  int avgSpeed;
  int distance;

  public DodgemCar(int avgSpeed){
    this.avgSpeed = avgSpeed;
    this.distance = distance;
  }

  public int driveDistance(){
    return 80;
  }
}