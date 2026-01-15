import java.util.HashSet;
import java.util.Set;

public class SetExample {
  public static void main(String[] args) {
    // Your code goes here
    Set<Integer> set1 = new HashSet<>();
    set1.add(12);
    set1.add(11);
    set1.add(33);
    set1.add(4);

    Set<Integer> set2 = new HashSet<>();
    set2.add(11);
    set2.add(9);
    set2.add(88);
    set2.add(10);
    set2.add(5);
    set2.add(12);

    // Union of 2 sets
    set1.addAll(set2);
    System.out.println("After union");
    set1.forEach((Integer val) -> System.out.println(val));

    // Intersection of 2 sets
    set1 = new HashSet<>();
    set1.add(12);
    set1.add(11);
    set1.add(33);
    set1.add(4);

    set2 = new HashSet<>();
    set2.add(11);
    set2.add(9);
    set2.add(88);
    set2.add(10);
    set2.add(5);
    set2.add(12);

    set1.retainAll(set2);
    System.out.println("After intersection");
    set1.forEach((Integer val) -> System.out.println(val));

    // Difference of 2 sets
    set1 = new HashSet<>();
    set1.add(12);
    set1.add(11);
    set1.add(33);
    set1.add(4);

    set2 = new HashSet<>();
    set2.add(11);
    set2.add(9);
    set2.add(88);
    set2.add(10);
    set2.add(5);
    set2.add(12);

    set1.removeAll(set2);
    System.out.println("After difference");
    set1.forEach((Integer val) -> System.out.println(val));

  }

}
