public class Mysterion{
  public static void mysterion(int[] arr, int a, int b, int c){
    int v = arr[c];
    swap(arr, c, b);
    int s = a;
    for(int i = a; i<b; i++){
      if (arr[i] < v){
        swap(arr, s, i);
        s++;
      }
    }
    swap(arr, b, s);
  }

  public static void swap (int[] arr, int a, int b){
    int old = arr[a];
    arr[a] = arr[b];
    arr[b] = old;
  }

  public static void main(String[] args){
    int[] handout = {7, 1, 5, 12, 3};
    mysterion(handout, 0, 4, 2);
  }
}
