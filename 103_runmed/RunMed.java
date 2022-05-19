/*
Keep bigger half of values in the ALHeapMin, the root will be around the median.
Keep the smaller half of values in ALHeapMax, the root again be around the median.
When adding a new value, add it based on root of the ALHeapMin, if it is less, add it to the ALHeapMax, if greater, add it to ALHeapMin
If difference in sizes is >=2, balance them by removing root from bigger one and adding it to smaller one.
If same size, return avg of roots, If one is 1 greater than another, then return node of the bigger one.

*/


public class RunMed{
  private ALHeapMax lilVals;
  private ALHeapMin bigVals;

  public RunMed(){
    lilVals = new ALHeapMax();
    bigVals = new ALHeapMin();
  }

  public void balance(){
    if (lilVals.size() > bigVals.size() + 1){
      int moved = lilVals.removeMax();
      bigVals.add(moved);
    }
    else if (bigVals.size() > lilVals.size() + 1){
      int moved = bigVals.removeMin();
      lilVals.add(moved);
    }
  }

  public void add(Integer newVal){
    if (newVal < bigVals.peekMin()){
      lilVals.add(newVal);
    }
    else{
      bigVals.add(newVal);
    }
    while (lilVals.size() > bigVals.size() + 1){
      balance();
    }
    while (bigVals.size() > lilVals.size() + 1){
      balance();
    }
  }

  public Integer getMedian(){
    if (lilVals.size() == bigVals.size()){
      return (lilVals.peekMax() + bigVals.peekMin())/2;
    }
    else if (lilVals.size() + 1 == bigVals.size()){
      return bigVals.peekMin();
    }
    else if (lilVals.size() == bigVals.size() + 1){
      return lilVals.peekMax();
    }
    else{
      return null;
    }
  }
}
