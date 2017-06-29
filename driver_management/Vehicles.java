package driver_management;

public abstract class Vehicles {
  String brand;
  String colour;
  int avgSpeed;

  public Vehicles(String brand, String colour, int avgSpeed) {
    this.brand = brand;
    this.colour = colour;
    this.avgSpeed = avgSpeed;
  } 

  public String getBrand() {
    return this.brand;
  }

  public int checkAvgSpeed(){
    return this.avgSpeed;
  }

}