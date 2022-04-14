#### Team BrainForked (Gloria Lee, Jack Chen, John Gupta-She)
#### APCS pd8
####  HW91: Deque the Halls
#### 2022-04-12t
####  time spent: 0.5  hr

### Prioritized todo list:
0. 
* public boolean isEmpty();
* public void addFirst(KIWI x);
* public void addLast(KIWI x); 

1.
* public KIWI peekFirst();
* public KIWI peekLast();

2.
* public KIWI removeFirst();
* public KIWI removeLast();

3.
* public boolean removeFirstOccurrence(KIWI x);
* public boolean removeLastOccurrence(KIWI x);

### Breakdown of design decsions made in implementing your deque
* We decided to use a linked list because it offered constant add and remove given a tail and a head pointer.
* As for to do list order, we decided to address addFirst and addLast as our first objective because they were the most crucial to the deque. without them, there would be no pushing onto the deck, and therefore any other methods would have no use (except for isEmpty)
* We saved newer methods that we did not ahve previous exposure to such as removeFirstOccurrence for last, although these methods were all just pass thru functionality upon further analysis.
