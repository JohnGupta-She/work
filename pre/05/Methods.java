public class Methods{
  public static void main(String[] args){
    System.out.println(isDivisible(5, 3));
    System.out.println(isDivisible(35, 7));
    System.out.println(isTriangle(1, 2, 3));
    System.out.println(isTriangle(5, 4, 5));
    System.out.println(isTriangle(2, 6, 2));
    System.out.println(ack(0, 0));
    System.out.println(ack(1, 1));
    System.out.println(ack(2, 2));
  }
  public static boolean isDivisible(int n, int m) {
    double nDouble = n;
    double mDouble = m;
    int intDivide = n / m;
    double inDivideSwap = intDivide;
    return (inDivideSwap == nDouble / mDouble);
  }
  public static boolean isTriangle(int a, int b, int c) {
    if (a > b && a > c) {
      return (a < (b + c));
    }
    else if (b >= a && b > c) {
      return (b < (a + c));
    }
    else {
      return (c < (a + b));
    }
  }
  public static int ack(int m, int n) {
    if (m == 0) {
      return (n+1);
    }
    else if (m > 0 && n == 0) {
      return ack(m-1, 1);
    }
    else {
      return ack(m-1, ack (m, n-1));
    }
  }
}
