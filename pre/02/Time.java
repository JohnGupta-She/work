public class Time{
  public static void main(String[] args){
    int hour = 13;
    int minute = 20;
    int second = 13;
    int secSinceMidnight = (hour * 60 + minute) * 60 + second;
    int secLeft = 24 * 60 * 60 - secSinceMidnight;
    int percentOfDay = secSinceMidnight * 100 / (24 * 60 * 60);
    System.out.print("Seconds since midnight: ");
    System.out.println(secSinceMidnight);
    System.out.print("Seconds remaining until midnight: ");
    System.out.println(secLeft);
    System.out.print("Seconds remaining until midnight: ");
    System.out.println(secLeft);
    System.out.print("Percent of day that has passed: ");
    System.out.println(percentOfDay + "%");
  }
}
