import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class QuadBikeTest {
  QuadBike quadBike;

  @Before
  public void before() {
    quadBike = new QuadBike("Honda", "Red", 50, 500);
  }

  @Test
  public void checkSpeed() {
    assertEquals(50, quadBike.checkAvgSpeed());
  }

  @Test
  public void checkDriveDistance(){

    assertEquals(48, quadBike.driveDistance(40));
  }

}