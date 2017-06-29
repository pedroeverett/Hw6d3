package driver_management;
import behaviours.*;

public class Driver{
  private String name;
  private Driveable vehicle;

  public Driver(String name, Driveable vehicle){
    this.name = name;
    this.vehicle = vehicle;
  }

  public String getName() {
    return this.name;
  }

  public String getBrand() {
    return this.vehicle.getBrand();
  }

  public void setVeicle(Driveable vehicle){
    this.vehicle = vehicle;
  }


}