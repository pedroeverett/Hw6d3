import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DriverTest {
  Driver driver;
  DodgemCar dodgemCar;

  @Before
  public void before() {
    driver = new Driver("Pedro", dodgemCar);
    dodgemCar = new DodgemCar("Bumper", "Black", 60, 4);
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