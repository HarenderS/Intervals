package interval.interval;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import interval.Interval.IntervalPoint;

public abstract class CommonPoint {

	protected IntervalPoint intervalPoint;
	protected Point point;

	protected abstract IntervalPoint create();

	@Test
	public abstract void givenPointWhenIsWithinWithLessValueThenTrue();

	@Test
	public abstract void givenPointWhenIsWithinWithEqualsValue();

	@Test
	public abstract void givenPointWhenIsWithinWithGreaterValueThenTrue();

	@Before
	public void before() {
		this.point = new Point(4.4);
		this.intervalPoint = this.create();
	}

}
