import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CollectionMethodsExample {
  public static void main(String[] args) {
    List<Integer> values = new ArrayList<>();
    values.add(2);
    values.add(3);
    values.add(4);

    // size
    System.out.println("Size : " + values.size());

    // isEmpty
    System.out.println("isEmpty: " + values.isEmpty());

    // contains
    System.out.println("contains: " + values.contains(5));

    // add
    values.add(5);
    System.out.println("added: " + values.contains(5));

    // remove
    values.remove(3);
    System.out.println("removed using index: " + values.contains(3));

    // remove using the Object, removes the first occurrence of the value
    values.remove(Integer.valueOf(3));
    System.out.println("removed using the object : " + values.contains(3));

    Stack<Integer> stackvalues = new Stack<>();
    stackvalues.add(6);
    stackvalues.add(7);
    stackvalues.add(8);

    // addAll
    values.addAll(stackvalues);
    System.out.println("addAll test using containsAll: " + values.containsAll(stackvalues));

    values.remove(Integer.valueOf(7));
    System.out.println("containsAll after removing 1 element: " + values.containsAll(stackvalues));

    values.removeAll(stackvalues);
    System.out.println("removeAll: " + values.contains(8));

    // clear
    values.clear();
    System.out.println("clear: " + values.isEmpty());

  }
}