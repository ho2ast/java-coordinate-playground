package coordinate.car;

public class Avante implements Car {
  private static final int KM_PER_1_LITER = 15;

  private final int distance;

  public Avante(int distance) {
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
    return "Avante";
  }

  @Override
  public double getChargeQuantity() {
    return getTripDistance() / getDistancePerLiter();
  }
}
