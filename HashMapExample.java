import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
  public static void main(String[] args) {
    Map<Integer, String> rollNumberVsNameMap = new HashMap<>();
    rollNumberVsNameMap.put(null, "TEST");
    rollNumberVsNameMap.put(0, null);
    rollNumberVsNameMap.put(1, "A");
    rollNumberVsNameMap.put(2, "B");

    // compute if present
    rollNumberVsNameMap.putIfAbsent(null, "test");
    rollNumberVsNameMap.putIfAbsent(0, "Zero");
    rollNumberVsNameMap.putIfAbsent(3, "C");

    for (Map.Entry<Integer, String> entry : rollNumberVsNameMap.entrySet()) {
      Integer key = entry.getKey();
      String value = entry.getValue();
      System.out.println("Key: " + key + ", Value: " + value);
    }

    System.out.println("isEmpty: " + rollNumberVsNameMap.isEmpty());

    // Size of the map
    System.out.println("Size: " + rollNumberVsNameMap.size());

    // containsKey
    System.out.println("Contains key 2: " + rollNumberVsNameMap.containsKey(2));

    // get(Key)
    System.out.println("Value for key 1: " + rollNumberVsNameMap.get(1));

    // getOrDefault(key)
    System.out.println("Value for key 4: " + rollNumberVsNameMap.getOrDefault(4, "Default Value"));

    // remove(key)
    System.out.println("Removing key 2, Value: " + rollNumberVsNameMap.remove(2));

    for (Map.Entry<Integer, String> entry : rollNumberVsNameMap.entrySet()) {
      Integer key = entry.getKey();
      String value = entry.getValue();
      System.out.println("Key: " + key + ", Value: " + value);
    }

    // keySet()
    System.out.println("Keys in the map: " + rollNumberVsNameMap.keySet());

    // values()
    Collection<String> values = rollNumberVsNameMap.values();
    for (String val : values) {
      System.out.println("Value: " + val);
    }

  }
}