public class Loops{
  public static void main(String[] args) {
    System.out.println(power(2.0, 10));
    System.out.println(factorial(6));
    check(1.0);
    check(2.0);
  }
  public static double power(double x, int n) {
    double a = 1.0;
    while (n > 0) {
      a = a * x;
      n = n-1;
    }
    return a;
  }
  public static int factorial(int x) {
    int a = 1;
    while (x > 0) {
      a = a * x;
      x = x - 1;
    }
    return a;
  }
  public static double myexp(double x, int n) {
    double a = 0.0;
    while (n >= 0) {
      double factorialDouble = factorial(n);
      a = a + (power(x, n)/factorialDouble);
      n = n - 1;
    }
    return a;
  }
  public static double bettermyexp(double x, int n) {
    double total = 0;
    double a = 1;
    int counter = 1;
    while (counter <= n) {
      total = total + a;
      a = a * x / counter;
      counter = counter + 1;
    }
    return total;
  }
  public static void check(double x) {
    System.out.print(x);
    System.out.print("   ");
    System.out.print(myexp(x, 5));
    System.out.print("   ");
    System.out.println(Math.exp(x));
  }
}
