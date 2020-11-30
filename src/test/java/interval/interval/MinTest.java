package interval.interval;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

import interval.Interval.IntervalPoint;
import interval.Interval.Min;

public class MinTest extends CommonPoint {

	@Before
	@Override
	public void before() {
		this.point = new Point(4.4);
		this.intervalPoint = this.create();
	}
	
	@Override
	protected IntervalPoint create() {
		return new Min(this.point.getEquals());
	}

	@Test
	@Override
	public void givenPointWhenIsWithinWithLessValueThenTrue() {
		assertFalse(this.intervalPoint.isWithin(this.point.getLess()));
	}

	@Test
	@Override
	public void givenPointWhenIsWithinWithEqualsValue() {
		assertFalse(this.intervalPoint.isWithin(this.point.getEquals()));
	}

	@Test
	@Override
	public void givenPointWhenIsWithinWithGreaterValueThenTrue() {
		assertTrue(this.intervalPoint.isWithin(this.point.getGreater()));
	}

}
