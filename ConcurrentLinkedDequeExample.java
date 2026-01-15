import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeExample {
  public static void main(String[] args) {
    // Your code goes here
    ConcurrentLinkedDeque<Integer> ob = new ConcurrentLinkedDeque<>();
    ob.add(10);
    ob.add(20);
    ob.addFirst(5);

    System.out.println(ob.removeLast());
  }

}
