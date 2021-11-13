/*
TNPG: Perfect Purple Petunias
John Gupta-She + Po, Lauren Lee + Bo, Emily Ortiz + Applesauce
HW 34 -- A Pirate's Life for Me
2021-11-12
time spent:
*/

public class Loopier{
  private static int[] popArray(int[] a){
    for (int i = 0; i < a.length; i++){
      a[i] = (int) (10 * Math.random());
    }
    return a;
  }

  private static String strArray(int[] a){
    String output = "{" + a[0];
    for (int i = 1; i < a.length; i++){
      output += ", " + a[i];
    }
    output += "}";
    return output;
  }

  public static int linSearch(int[] a, int target) {
    for (int i = 0; i < a.length; i++){
      if (a[i] == target){
        return i;
      }
    }
    return -1;
  }

  public static int linSearchR(int[] a, int target) {
    return 5;
  }

  public static int freq(int[] a, int target) {
    int result = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == target) {
        result++;
      }
    }
    return result;
  }

  public static int freqRec(int[] a, int target) {
    return 5;
  }

  public static void main (String args[]){
    int[] a = {1, 2, 3, 4, 5};
    System.out.println(strArray(a));
    System.out.println(linSearch(a, 3));
    System.out.println(linSearch(a, 10));
    System.out.println(freq(a, 2));
    int[] b = {2, 3, 2, 4, 5};
    System.out.println(strArray(b));
    System.out.println(freq(b, 2));
    int[] c;
    c = new int[5];
    popArray(c);
    System.out.println(strArray(c));
  }
}
