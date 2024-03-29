/*
TNPG: BrainForked (Gloria Lee, John Gupta-She, Jack Chen)
APCS pd08
HW75
2022-03-13
time spent: 1 hr n
/***
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 **/

public class LLNode
{
  //instance vars
  private String car;
  private LLNode cdr;
  // constructor

  public LLNode( String value, LLNode next )
  {
    car = value;
    cdr = next;
  }


  //--------------v  ACCESSORS  v--------------
  public String getCargo()
  {
    return car;
  }

  public LLNode getNext()
  {
    return cdr;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public String setCargo( String newCargo )
  {
    String oldCargo = car;
    car = newCargo;
    return oldCargo;
  }

  public LLNode setNext( LLNode newNext )
  {
    LLNode oldNext = cdr;
    cdr = newNext;
    return oldNext;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    return getCargo();
  }


  //main method for testing
  public static void main( String[] args )
  {

    //Below is an exercise in creating a linked list...

    //Create a node
    LLNode first = new LLNode( "cat", null );

    //Create a new node after the first
    first.setNext( new LLNode( "dog", null ) );

    //Create a third node after the second
    first.getNext().setNext( new LLNode( "cow", null ) );

      // A naive list traversal, has side effects.... ??
       while( first != null ) {
       System.out.println( first );
       first = first.getNext();
       }


    //Q: when head ptr moves to next node in list, what happens to the node it just left?

    //...so better: ?
    //
    //
    //

  }//end main
