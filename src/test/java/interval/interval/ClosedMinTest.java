package interval.interval;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import interval.Interval.ClosedMin;
import interval.Interval.Min;

public class ClosedMinTest extends MinTest {

  @Override
  protected Min create() {
    return new ClosedMin(this.point.getEquals());
  }

  @Test
  @Override
  public void givenPointWhenIsWithinWithEqualsValue(){
    assertTrue(this.intervalPoint.isWithin(this.point.getEquals()));
  }
  
}
