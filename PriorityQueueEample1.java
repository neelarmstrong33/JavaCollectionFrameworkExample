import java.util.PriorityQueue;

public class PriorityQueueEample1 {
  public static void main(String[] args) {
    PriorityQueue<Integer> minPQ = new PriorityQueue<>();
    minPQ.add(5);
    minPQ.add(2);
    minPQ.add(8);
    minPQ.add(1);

    // Lets print all the values
    minPQ.forEach((Integer val) -> System.out.println(val));

    while (!minPQ.isEmpty()) {
      int val = minPQ.poll();
      System.out.println("remove from the top: " + val);

    }
  }
}
