package driver_management;
import behaviours.*;

public class DodgemCar extends Vehicles implements Driveable {

  private int seats;

  public DodgemCar(String brand, String colour, int avgSpeed, int seats){
    super(brand, colour, avgSpeed);
    this.seats = seats;
   
  }

  // public String brand() {
  //   return this.brand;
  // }

  // public int checkAvgSpeed(){
  //   return this.avgSpeed;
  // }

  public int driveDistance(int distances){
    int minutes = (distances * 60) / avgSpeed;
    return minutes;
  }
}