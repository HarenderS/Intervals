package interval.interval;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import interval.Interval.ClosedMax;
import interval.Interval.Max;

public class ClosedMaxTest extends MaxTest {

  @Override
  protected Max createMax() {
    return new ClosedMax(this.point.getEquals());
  }

  @Test
  @Override
  public void givenMaxWhenIsWithinWithEqualsValue(){
    assertTrue(this.max.isWithin(this.point.getEquals()));
  }
  
}
