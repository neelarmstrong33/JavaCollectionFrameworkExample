import java.util.Comparator;

public class CarNameComparator implements Comparator<ComparatorExample7.Car> {
  public int compare(ComparatorExample7.Car car1, ComparatorExample7.Car car2) {
    return car2.carName.compareTo(car1.carName);
  }

}
