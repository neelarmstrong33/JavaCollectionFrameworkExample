import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapAccessOrderMaintain {
  public static void main(String[] args) {
    // Your code goes here
    System.out.println(
        "----------------------------------------below is LinkedHashMapAccessOrderMaintain.java----------------------------------------");

    Map<Integer, String> map = new LinkedHashMap<>(16, 0.75f, true);
    map.put(1, "A");
    map.put(21, "B");
    map.put(23, "C");
    map.put(141, "D");
    map.put(25, "E");

    // Access some elements to change their order
    map.get(23);
    map.forEach((Integer key, String val) -> System.out.println(key + ":" + val));
  }

}
