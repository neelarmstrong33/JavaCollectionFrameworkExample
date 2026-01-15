import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
  public static void main(String[] args) {
    // Your code goes here
    Set<Integer> intSet = new LinkedHashSet<>();
    intSet.add(12);
    intSet.add(11);
    intSet.add(33);
    intSet.add(4);

    Iterator<Integer> iterable = intSet.iterator();
    while (iterable.hasNext()) {
      int val = iterable.next();
      System.out.println(val);

    }
  }

}
