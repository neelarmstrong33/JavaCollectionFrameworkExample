import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorExample6 {
  public static class Car {

    String carName;
    String carType;

    Car(String name, String type) {
      this.carName = name;
      this.carType = type;
    }

  }

  public static void main(String[] args) {

    List<Car> cars = new ArrayList<>();
    cars.add(new Car("SUV", "petrol"));
    cars.add(new Car("Sedan", "diesel"));
    cars.add(new Car("HatchBack", "cng"));

    Collections.sort(cars, (Car ob1, Car ob2) -> ob2.carName.compareTo(ob1.carName));

    cars.forEach((Car carObj) -> System.out.println(carObj.carName + "..." + carObj.carType));
  }
}