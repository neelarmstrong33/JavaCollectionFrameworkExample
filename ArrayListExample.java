import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {
  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<>();

    // add(int index, Element e)
    list1.add(0, 400);
    list1.add(1, 500);
    list1.add(2, 600);

    // addAll(int index, Collection c)
    List<Integer> list2 = new ArrayList<>();
    list2.add(0, 100);
    list2.add(1, 200);
    list2.add(2, 300);

    list1.addAll(2, list2);
    list1.forEach((Integer val) -> System.out.println(val));

    // replaceAll(UniaryOperator op)
    list1.replaceAll((Integer val) -> -1 * val);
    System.out.println("after replace all");
    list1.forEach((Integer val) -> System.out.println(val));

    // sort(Comparator c)
    list1.sort((Integer val1, Integer val2) -> val1 - val2);
    System.out.println("after sorting in increasing order");
    list1.forEach((Integer val) -> System.out.println(val));

    // get(int index)
    System.out.println("value present at index 2 is: " + list1.get(2));

    // set(int index, Element e)
    list1.set(2, -4000);
    System.out.println("after the set method: ");
    list1.forEach((Integer val) -> System.out.println(val));

    // remove(int index)
    list1.remove(2);
    System.out.println("after removing: ");
    list1.forEach((Integer val) -> System.out.println(val));

    // indexOf(object e)
    System.out.println("index of -200 Integer object is: " + list1.indexOf(-200));

    // need to provide the index in listIterator, from where it has to start
    ListIterator<Integer> listIterator1 = list1.listIterator(list1.size());

    // traverse backward direction
    while (listIterator1.hasPrevious()) {
      int previousVal = listIterator1.previous();
      System.out.println("traversing backward: " + previousVal + " nextIndex: " + listIterator1.nextIndex()
          + " previous index: " + listIterator1.previousIndex());
      if (previousVal == -100) {
        listIterator1.set(-50);
      }
    }

    list1.forEach((Integer val) -> System.out.println("after set: " + val));

    ListIterator<Integer> listIterator2 = list1.listIterator();
    // traverse forward direction
    while (listIterator2.hasNext()) {
      int val = listIterator2.next();
      System.out.println("traversing forward: " + val + " nextIndex: " + listIterator2.nextIndex() + " previous index: "
          + listIterator2.previousIndex());
      if (val == -200) {
        listIterator2.add(-100);
      }
    }

    list1.forEach((Integer val) -> System.out.println("after add: " + val));

    List<Integer> subList = list1.subList(1, 4);
    subList.forEach((Integer val) -> System.out.println("sublist: " + val));

    subList.add(-900);
    list1.forEach((Integer val) -> System.out.println("after value added in sublist: " + val));

  }

}
