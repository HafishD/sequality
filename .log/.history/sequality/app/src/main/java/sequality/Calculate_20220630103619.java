package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double ave(int x, int y) {
    return x / y;
  }

  public int total(int x, int y) {
    Calculate calc = new Calculate();
    int sum = calc.sum(x, x + 1);
    for (int i = x+2; i <= y; i++) {
      sum = calc.sum(sum, i);
    }
    return sum;
  }
}
