package coordinate.car;

public class Sonata implements Car {

  private static final int KM_PER_1_LITER = 10;

  private final int distance;

  public Sonata(int distance) {
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
    return "Sonata";
  }

  @Override
  public double getChargeQuantity() {
    return getTripDistance() / getDistancePerLiter();
  }
}
