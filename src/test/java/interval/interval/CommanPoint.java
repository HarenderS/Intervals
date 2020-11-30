package interval.interval;

import org.junit.jupiter.api.Test;

import interval.Interval.IntervalPoint;

public abstract class CommanPoint {

	protected IntervalPoint intervalPoint;
	protected Point point;

	protected abstract IntervalPoint create();

	@Test
	public abstract void givenPointWhenIsWithinWithLessValueThenTrue();

	@Test
	public abstract void givenPointWhenIsWithinWithEqualsValue();

	@Test
	public abstract void givenPointWhenIsWithinWithGreaterValueThenTrue();
}
