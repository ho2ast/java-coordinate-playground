package coordinate.company;

import coordinate.car.Car;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {

  private final List<Car> cars = new ArrayList<>();

  private RentCompany() {
  }

  public static RentCompany create() {
    return new RentCompany();
  }

  public void addCar(Car car) {
    this.cars.add(car);
  }

  public String generateReport() {
    StringBuilder report = new StringBuilder();
    cars.forEach(car -> report.append(car.getName()).append(" : ").append((int) car.getChargeQuantity()).append("리터\n"));
    return report.toString();
  }
}
