package interval.Interval;

public class Max extends IntervalPoint{

  public Max(double value) {
    super(value);
  }

  @Override
  public boolean isWithin(double value) {
    return this.value > value;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Max other = (Max) obj;
    if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return this.value + ")";
  }

}
