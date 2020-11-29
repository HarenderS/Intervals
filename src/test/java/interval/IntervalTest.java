package interval;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class IntervalTest {
  
  private Point left = new Point(-2.2);
  private Point right = new Point(4.4);
  private IntervalBuilder intervalBuilder;

  @Before
  public void before(){
    this.left = new Point(-2.2);
    this.right = new Point(4.4);
    this.intervalBuilder = new IntervalBuilder();
  }

  @Test
  public void givenIntervaOpenOpenlwhenIncludeWithIncludedValueThenTrue() {
    Interval interval = this.intervalBuilder.open(left.getEquals()).open(right.getEquals()).build();
    assertFalse(interval.include(left.getLess()));
    assertFalse(interval.include(left.getEquals()));
    assertTrue(interval.include(left.getGreater()));
    assertTrue(interval.include(right.getLess()));
    assertFalse(interval.include(right.getEquals()));
    assertFalse(interval.include(right.getGreater()));
  }

  @Test
  public void givenIntervaOpenOpenlwhenInc3ludeWithIncludedValueThenTrue() {
    Interval interval = this.intervalBuilder.closed(left.getEquals()).open(right.getEquals()).build();
    assertFalse(interval.include(left.getLess()));
    assertTrue(interval.include(left.getEquals()));
    assertTrue(interval.include(left.getGreater()));

    assertTrue(interval.include(right.getLess()));
    assertFalse(interval.include(right.getEquals()));
    assertFalse(interval.include(right.getGreater()));
  }

  @Test
  public void givenIntervaOpenOpenlwhenIncludeWit3hIncludedValueThenTrue() {
    Interval interval = this.intervalBuilder.open(left.getEquals()).closed(right.getEquals()).build();
    assertFalse(interval.include(left.getLess()));
    assertFalse(interval.include(left.getEquals()));
    assertTrue(interval.include(left.getGreater()));

    assertTrue(interval.include(right.getLess()));
    assertTrue(interval.include(right.getEquals()));
    assertFalse(interval.include(right.getGreater()));
  }

  @Test
  public void givenIntervaOpenOpenlwhenIncludeWithInclude5dValueThenTrue() {
    Interval interval = this.intervalBuilder.closed(left.getEquals()).closed(right.getEquals()).build();
    assertFalse(interval.include(left.getLess()));
    assertTrue(interval.include(left.getEquals()));
    assertTrue(interval.include(left.getGreater()));

    assertTrue(interval.include(right.getLess()));
    assertTrue(interval.include(right.getEquals()));
    assertFalse(interval.include(right.getGreater()));
  }
  
  @org.junit.Test
  public void isLeftIntersectedTest() {
	  Interval intervel1 = new IntervalBuilder().open(1).open(5).build();
	  Interval intervel2 = new IntervalBuilder().closed(2).closed(8).build();
	  assertTrue(intervel1.isIntersected(intervel2));;
  }
  
  @org.junit.Test
  public void isNotLeftIntersectedTest() {
	  Interval intervel1 = new IntervalBuilder().open(1).open(5).build();
	  Interval intervel2 = new IntervalBuilder().closed(0).closed(8).build();
	  assertFalse(intervel1.isIntersected(intervel2));;
  }

  @org.junit.Test
  public void isMaxPointIntoIntersectedTest() {
	  Interval intervel1 = new IntervalBuilder().open(1).open(5).build();
	  Interval intervel2 = new IntervalBuilder().closed(0).closed(4).build();
	  assertTrue(intervel1.isIntersected(intervel2));;
  }
  
  @org.junit.Test
  public void isMaxPointNotIntoIntersectedTest() {
	  Interval intervel1 = new IntervalBuilder().open(1).open(5).build();
	  Interval intervel2 = new IntervalBuilder().closed(0).closed(6).build();
	  assertFalse(intervel1.isIntersected(intervel2));;
  }
  
  @org.junit.Test
  public void minPointOutOfMaxPointIntersectionTest() {
	  Interval intervel1 = new IntervalBuilder().open(1).open(5).build();
	  Interval intervel2 = new IntervalBuilder().closed(6).closed(7).build();
	  assertFalse(intervel1.isIntersected(intervel2));;
  }
  
  @org.junit.Test
  public void maxPointOutOfMinPointIntersectionTest() {
	  Interval intervel1 = new IntervalBuilder().open(5).open(7).build();
	  Interval intervel2 = new IntervalBuilder().closed(1).closed(4).build();
	  assertFalse(intervel1.isIntersected(intervel2));;
  }
  
}