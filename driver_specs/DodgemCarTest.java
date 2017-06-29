import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DodgemCarTest {
  DodgemCar dodgemCar;

  @Before
  public void before() {
    dodgemCar = new DodgemCar("Bumper", "Black", 60, 4);
  }

  @Test
  public void checkSpeed() {
    assertEquals(60, dodgemCar.checkAvgSpeed());
  }

  @Test
  public void checkDriveDistance(){
    // dodgemCar.driveDistance(45);
    assertEquals(45, dodgemCar.driveDistance(45));
  }

}