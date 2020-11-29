package interval.Interval;

public abstract class Point {

	protected double value;

	public Point(double value) {
		this.value = value;
	}

	public abstract boolean isWithin(double value);

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public abstract boolean equals(Object obj);
}
