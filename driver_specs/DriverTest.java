import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DriverTest {
  Driver driver;
  DodgemCar dodgemCar;

  @Before
  public void before() {
    driver = new Driver("Pedro", dodgemCar);
    dodgemCar = new DodgemCar(60);
  }
}