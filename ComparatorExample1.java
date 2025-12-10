import java.util.Arrays;

public class ComparatorExample1 {
  public static void main(String[] args) {
    Integer[] arr = { 33, 666, 777, 90, 21 };

    Arrays.sort(arr, (Integer val1, Integer val2) -> val1 - val2);
    System.out.println("Sorted using Comparator: " + Arrays.toString(arr));

    Arrays.sort(arr);
    System.out.println("Sorted using sort method: " + Arrays.toString(arr));

  }

}
