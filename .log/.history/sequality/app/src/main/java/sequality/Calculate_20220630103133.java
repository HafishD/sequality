package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double ave(int x, int y) {
    return x / y;
  }

  public int total(int x, int y) {
    int sum = 0;
    for (int i = x; i < y; i++) {
      new Calculate().sum(i, i + 1);
    }
    return sum;
  }
}
