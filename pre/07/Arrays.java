public class Arrays{
  public static void main(String[] args) {
    int[] test = {1, 2, 5, 23};
    double[] testDoubles = {1.9, 2.0, 5.0, 23.0};
    System.out.println(powArray(testDoubles));
    System.out.println(indexOfMax(test));
  }
  public static double[] powArray(double[] a) {
    double[] answer = new double[a.length];
    for (int i = 0; i < a.length; i++) {
      answer[i] = Math.pow(a[i], 2);
    }
    return answer;
  }
  public static int indexOfMax(int[] a) {
    int x = a[0];
    int index = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] > x) {
        x = a[i];
        index = i;
      }
    }
    return index;
  }
}
