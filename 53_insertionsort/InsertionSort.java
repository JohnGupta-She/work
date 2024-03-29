// Team Rin-Sensei: Julia Kozak, Rin Fukuoka, John Gupta-She (Duckies Flopsy, Tape, Po)
// APCS pd08
// HW53 -- implementing insertion sort
// 2022-01-06r
// time spent: 0.5 hrs

/******************************
 * class InsertionSort -- implements InsertionSort algorithm
 *
 * ALGO: Start from the second element and determine whether the term to the left of it is a smaller value. If not, swap places with it. Repeat for the third value, or swap it towards the left until the term before it is a smaller value. Repeat for all terms until the end of the list.
 * DISCO: "break" will only break out of the innermost loop.
 *        Insertion Sort requires a pass for every element but the first.
 *
 * QCC: Are there sorting algorithms that can fully sort in less than n-1  passes?
 * q0: How many passes to sort n elements?
 * a0: n passes are needed.
 * q1: What do you know after pass p?
 * a1: we know the first p elements are sorted.
 * q2: How will you know when sorted?
 * a2: when all n elements have been run through / there are no more pairs of adjacent values that are in decreasing order.
 * q3: What constitues a pass?
 * a3: a series of swaps that get the next element to its correct position in the sorted part of the ArrayList (increment of the first for loop).
 * q4: What must you track?
 * a4: the index of the next value you're positioning, and the value of the term directly before it on each swap.
 ******************************/


import java.util.ArrayList;

public class InsertionSort
{
  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of InsertionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void insertionSortV( ArrayList<Comparable> data )
  {
    for( int i=1; i<data.size(); i++ ) {
      //partition marks first item in unsorted region

      System.out.println( "\npartition: " + i + "\tdataset:"); //diag
      System.out.println( data );

      //traverse sorted region from right to left
      for( int j=i; j>0; j-- ) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if ( (int)data.get(j) < (int)data.get(j-1) ) {

          System.out.println( "swap indices "+(j-1)+" & "+j+"..." ); //diag
          int temp = (int)data.get(j);
          data.set(j, data.get(j-1));
          data.set(j-1, temp);
        }
        else
          break;
      }
    }
  }//end insertionSortV


  // ArrayList-returning insertionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable>
    insertionSort( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    insertionSortV( data );

    //return working ArrayList
    return data;
  }//end insertionSort


  public static void main( String [] args )
  {
      System.out.println("\n*** Testing sort-in-place (void) version... *** ");
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "\nArrayList glen before sorting:\n" + glen );
      insertionSortV(glen);
      System.out.println( "\nArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "\nArrayList coco before sorting:\n" + coco );
      insertionSortV(coco);
      System.out.println( "\nArrayList coco after sorting:\n" + coco );

    /*==========for AL-returning methods==========
      System.out.println( "*** Testing non-void version... *** " );
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "\nArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = insertionSort( glen );
      System.out.println( "\nsorted version of ArrayList glen:\n"
      + glenSorted );
      System.out.println( "\nArrayList glen after sorting:\n" + glen );
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "\nArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = insertionSort( coco );
      System.out.println( "\nsorted version of ArrayList coco:\n"
      + cocoSorted );
      System.out.println( "\nArrayList coco after sorting:\n" + coco );
      System.out.println( coco );
      ============================================*/

  }//end main

}//end class InsertionSort
