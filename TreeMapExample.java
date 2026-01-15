import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {
  public static void main(String[] args) {
    // Your code goes here
    Map<Integer, String> map1 = new TreeMap<>((Integer a, Integer b) -> b - a);
    map1.put(21, "SJ");
    map1.put(11, "PJ");
    map1.put(13, "KJ");
    map1.put(5, "TJ");

    // decreasing order
    map1.forEach((Integer key, String val) -> System.out.println(key + ":" + val));

    System.out.println("-------------------------");
    Map<Integer, String> map2 = new TreeMap<>();
    map2.put(21, "SJ");
    map2.put(11, "PJ");
    map2.put(13, "KJ");
    map2.put(5, "TJ");

    // increasing order
    map2.forEach((Integer key, String val) -> System.out.println(key + ":" + val));

    System.out.println("-------------------------");
    SortedMap<Integer, String> map3 = new TreeMap<>();
    map3.put(21, "SJ");
    map3.put(11, "PJ");
    map3.put(13, "KJ");
    map3.put(5, "TJ");

    System.out.println("Head Map: " + map3.headMap(13));
    System.out.println("Tail Map: " + map3.tailMap(13));
    System.out.println("Sub Map: " + map3.subMap(11, 21));
    System.out.println("First Key: " + map3.firstKey());
    System.out.println("Last Key: " + map3.lastKey());

  }

}
