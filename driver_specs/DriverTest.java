import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;
import behaviours.*;

public class DriverTest {
  Driver driver;
  Driveable vehicle;

  @Before
  public void before() {
    vehicle = new DodgemCar("Bumper", "Black", 60, 4);
    driver = new Driver("Pedro", vehicle);
  }

  @Test
  public void checkDriverName() {
    assertEquals("Pedro", driver.getName());
  }

  @Test 
  public void canSetVeicle() {
    QuadBike quadBike = new QuadBike("Honda", "Red", 50, 500);
    driver.setVeicle(quadBike);
    assertEquals("Honda", driver.getBrand());
  }
}