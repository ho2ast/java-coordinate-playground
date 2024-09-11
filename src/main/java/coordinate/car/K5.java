package coordinate.car;

public class K5 implements Car
{
  private static final int KM_PER_1_LITER = 13;

  private final int distance;

  public K5(int distance) {
    this.distance = distance;
  }

  @Override
  public double getDistancePerLiter() {
    return KM_PER_1_LITER;
  }

  @Override
  public double getTripDistance() {
    return distance;
  }

  @Override
  public String getName() {
    return "K5";
  }

  @Override
  public double getChargeQuantity() {
    return getTripDistance() / getDistancePerLiter();
  }
}
