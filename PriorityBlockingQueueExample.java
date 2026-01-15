import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueExample {
  public static void main(String[] args) {
    PriorityBlockingQueue<Integer> pq = new PriorityBlockingQueue<>();
    pq.add(5);
    pq.add(2);
    pq.add(8);

    System.out.println(pq.peek());
  }

}
