import java.util.LinkedList;

public class LLQueue<KIWI>{
  LinkedList<KIWI> kiwi;
  public KIWI dequeue(){
    if (isEmpty()) {
      return null;
    }
    KIWI old = kiwi.get(0);
    kiwi.remove(0);
    return old;
  }

  public void enqueue( KIWI x ) {
    kiwi.add(x);
  }

  public boolean isEmpty(){
    return kiwi.size() == 0;
  }
  public KIWI peekFront(){
    return kiwi.get(0);
  }
}
