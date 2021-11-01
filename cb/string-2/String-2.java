public class String-2{
  public String doubleChar(String str) {
    String result = "";
    for (int n = 0; n < str.length(); n++) {
      result = result + str.substring(n, n+1) + str.substring(n, n+1);
    }
    return result;
  }
  public String countHi(String str) {
    int count = 0;
    for (int n = 0; n < str.length() - 1; n++) {
      if (str.substring(n, n+2).equals("hi")) {
        count++;
      }
    }
    return count;
  }
  public boolean catDog(String str) {
    int countCat = 0;
    int countDog = 0;
    for (int n = 0; n < str.length() - 2; n++) {
      if (str.substring(n, n+3).equals("cat")) {
        countCat++;
      }
      if (str.substring(n, n+3)q.equals("dog")) {
        countDog++;
      }
    }
    return countCat==countDog
  }
  public int countCode(String str) {
    int count = 0;
    for (int n = 0; n < str.length() - 3; n++) {
      if (str.substring(n, n+2).equals("co") && str.substring(n+3, n+4).equals("e")) {
        count++;
      }
    }
    return count;
  }
  public boolean endOther(String a, String b) {
    String lowerA = a.toLowerCase();
    String lowerB = b.toLowerCase();
    if (lowerA.length() < lowerB.length()) {
      return lowerB.substring(lowerB.length()-lowerA.length()).equals(lowerA);
    }
    else {
      return lowerA.substring(lowerA.length()-lowerB.length()).equals(lowerB);
    }
  }
  public boolean xyzThere(String str) {
    int count = 0;
    for (int n = 0; n < str.length() - 2; n++) {
      if (str.substring(n, n+3).equals("xyz")) {
        if (n==0 || !(str.substring(n-1, n).equals("."))) {
          count++;
        }
      }
    }
    return count>0;
  }
}
