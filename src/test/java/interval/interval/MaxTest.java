package interval.interval;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

import interval.Interval.Max;

public class MaxTest extends CommanPoint{
  
  @Before
  public void before(){
    this.point = new Point(4.4);
    this.intervalPoint = this.create();
  }

  @Override
  protected Max create() {
    return new Max(this.point.getEquals());
  }

  @Test
  @Override
  public void givenPointWhenIsWithinWithLessValueThenTrue(){
    assertTrue(this.intervalPoint.isWithin(this.point.getLess()));
  }

  @Test
  @Override
  public void givenPointWhenIsWithinWithEqualsValue(){
    assertFalse(this.intervalPoint.isWithin(this.point.getEquals()));
  }

  @Test
  @Override
  public void givenPointWhenIsWithinWithGreaterValueThenTrue(){
    assertFalse(this.intervalPoint.isWithin(this.point.getGreater()));
  }
 
}
