// Team BrainForked (Gloria Lee, Jack Chen, John Gupta-She)
// APCS pd8
// HW77: Insert|Remove
// 2022-03-15t
// time spent: 1  hr
/*
DISCO:
- When creating a new LLNode temp, be careful not to use methods such as get or set on it because those are LList methods.
- We can use this.get(i) to easily access the cargo at a particular index of this particular _head


QCC:
- Our output when adding/removing at the 2nd index is:
Removing index 2
HEAD->I->got->beat->null->NULL
Adding at index 2
HEAD->I->got->a->beat->null->null->NULL

So where are all the nulls coming from? An issue with our algo? Would it be efficient to just use remove on all the nulls?

ALGO ADD:
-traverses list from right to left until it reaches index of adding
-adds everything from back of list to the index of adding including the element at that index to the temporary LLNode
-then adds whatever input of the add method to front of current temp
-traverses from element to left of index of adding to front of list, adding each element to temp

ALGO REM:
-traverses list from right to left until it reaches index of removal
-adds everything from back of list to the index of removal except the element at that index to the temporary LLNode
-traverses from element to left of index to front of list, adding each element to temp
-this way, the element at index of removal is never added

KIS USED: 3 pages total
*/
/***
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 **/

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _head = null; //at birth, a list has no elements
    _size = 0;
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    LLNode tmp = new LLNode( newVal, _head );
    _head = tmp;
    _size++;
    return true;
  }

  public void add( int index, String newVal ) {
    _size ++;
    LLNode temp = new LLNode(null, null);
    for(int i=_size-1 ; i>index-1 ; i --){
      LLNode foo = new LLNode(null, null);
      foo.setCargo(this.get(i));
      foo.setNext(temp);
      temp = foo;
    }
    LLNode foo = new LLNode(null, null);
    foo.setCargo(newVal);
    foo.setNext(temp);
    temp = foo;
    for(int j = index-1; j>-1 ; j--){
      foo = new LLNode(null, null);
      foo.setCargo(this.get(j));
      foo.setNext(temp);
      temp = foo;
    }
    _head = temp;
  }

  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    String retVal;
    LLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //check target node's cargo hold
    retVal = tmp.getCargo();
    return retVal;
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    LLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //store target node's cargo
    String oldVal = tmp.getCargo();

    //modify target node's cargo
    tmp.setCargo( newVal );

    return oldVal;
  }

  public String remove( int index ){
    LLNode temp = new LLNode(null, null);
    String output = this.get(index);
    for(int i=_size-1 ; i>index ; i --){
      LLNode foo = new LLNode(null, null);
      foo.setCargo(this.get(i));
      foo.setNext(temp);
      temp = foo;
    }
    for(int j = index - 1; j>-1 ; j--){
      LLNode foo = new LLNode(null, null);
      foo.setCargo(this.get(j));
      foo.setNext(temp);
      temp = foo;
    }
    _head = temp;
    _size--;
    return output;
  }


  //return number of nodes in list
  public int size() { return _size; }

  //--------------^  List interface methods  ^--------------


  // override inherited toString
  public String toString()
  {
    String retStr = "HEAD->";
    LLNode tmp = _head; //init tr
    while( tmp != null ) {
	    retStr += tmp.getCargo() + "->";
	    tmp = tmp.getNext();
    }
    retStr += "NULL";
    return retStr;
  }


  //main method for testing
  public static void main( String[] args )
  {
    LList james = new LList();

    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("beat");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("a");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("need");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("I");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    System.out.println( "2nd item is: " + james.get(1) );

    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

    System.out.println( james );

    System.out.println(james.get(2));
   james.remove(2);
    System.out.println("Removing index 2");
    System.out.println(james);

    james.add(2, "a");
    System.out.println("Adding at index 2");
    System.out.println(james);
  }



}//end class LList
