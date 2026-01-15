import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHasMapExampleOrderMaintainExample {
  public static void main(String[] args) {
    // Your code goes here
    System.out.println("-----------------------------Below is LinkedHashMap Output -----------------------------");
    Map<Integer, String> map = new LinkedHashMap<>();
    map.put(1, "A");
    map.put(21, "B");
    map.put(23, "C");
    map.put(141, "D");
    map.put(25, "E");

    map.forEach((Integer key, String val) -> System.out.println(key + ":" + val));

    System.out.println("---------------------------------Below is normal HashMap Output -----------------------------");

    Map<Integer, String> map2 = new HashMap<>();
    map2.put(1, "A");
    map2.put(21, "B");
    map2.put(23, "C");
    map2.put(141, "D");
    map2.put(25, "E");

    for (Map.Entry<Integer, String> entry : map2.entrySet()) {
      Integer key = entry.getKey();
      String value = entry.getValue();
      System.out.println(key + ":" + value);
    }

  }

}
