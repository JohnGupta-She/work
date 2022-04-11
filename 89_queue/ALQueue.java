import java.util.ArrayList;

public class ALQueue<KIWI>{
  ArrayList<KIWI> kiwi;
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
