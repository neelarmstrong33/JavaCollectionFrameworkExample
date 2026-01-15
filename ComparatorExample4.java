import java.util.Arrays;

public class ComparatorExample4 {
  public static class Car {

    String carName;
    String carType;

    Car(String name, String type) {
      this.carName = name;
      this.carType = type;
    }

  }

  public static void main(String[] args) {

    Car[] carArray = new Car[3];
    carArray[0] = new Car("SUV", "petrol");
    carArray[1] = new Car("Sedan", "diesel");
    carArray[2] = new Car("HatchBack", "cng");

    Arrays.sort(carArray, (Car obj1, Car obj2) -> obj2.carType.compareTo(obj1.carType));

    for (Car car : carArray) {
      System.out.println(car.carName + "...." + car.carType);
    }
  }
}
