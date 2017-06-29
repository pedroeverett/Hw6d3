package driver_management;
import behaviours.*;

public class QuadBike extends Vehicles implements Driveable {
 
  private int cc;

  public QuadBike(String brand, String colour, int avgSpeed, int cc){
    super(brand, colour, avgSpeed);
    this.cc = cc;

    
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