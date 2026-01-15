import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeSet {
  public static void main(String[] args) {
    // Your code goes here
    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap<>();
    Set<Integer> threadSafeSet = concurrentHashMap.newKeySet();
    threadSafeSet.add(10);
    threadSafeSet.add(20);

    Iterator<Integer> iterator = threadSafeSet.iterator();
    while (iterator.hasNext()) {
      int val = iterator.next();
      if (val == 10) {
        threadSafeSet.add(30); // we should be able to add in the set as we are using a thread-safe set
      }
    }
    threadSafeSet.forEach((Integer val) -> System.out.println(val));
  }

}
