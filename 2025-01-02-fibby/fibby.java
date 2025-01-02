public class fibby{
  // The max i got was 46 which takes 6 seconds but 47 takes 11 seconds
  //
  public static void main(String[] args) {
    System.out.println(fibby(46));
  }
  public static int fibby(int n){
    if (n > 1){
      return fibby(n-1) + fibby(n-2);
    }
    else  {
      return n;
    }
  }
}
