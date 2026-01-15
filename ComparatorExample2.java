import java.util.Arrays;

public class ComparatorExample2 {
  public static void main(String[] args) {
    Integer a[] = { 6, 4, 1, 9, 2, 11 };
    Arrays.sort(a, (Integer val1, Integer val2) -> val1 - val2);

    for (int v : a) {
      System.out.println(v);
    }
  }
}
