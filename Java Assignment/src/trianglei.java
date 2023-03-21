public class trianglei {
  public static void main(String[] args) {
    int rows = 4;
    int count = 1;

    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(count + " ");
        count++;
      }
      System.out.println();
    }
  }
}
