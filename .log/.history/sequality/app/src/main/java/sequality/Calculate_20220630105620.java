package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double ave(int sum, int cnt) {
    return sum / cnt;
  }

  public int total(int x, int y) {
    int sum = x;
    for (int i = x + 1; i <= y; i++) {
      sum = new Calculate().sum(sum, i);
    }
    return sum;
  }

  public int odd(int x, int y) {
    int odd = 0;
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 1) {
        odd = i;
        sum = new Calculate().sum(sum, odd);
      }
    }
    return sum;
  }

  public int even(int x, int y) {
    int even = 0;
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        even = i;
        sum = new Calculate().sum(sum, even);
      }
    }
    return sum;
  }

  public int count(int x, int y) {
    int cnt = 0;
    for (int i = x; i <= y; i++) {
      cnt++;
    }
    return cnt;
  }

  public static void main(String[] args) {
    int a = 2;
    int b = 3;
    int x = 1;
    int y = 10;
    Calculate calc = new Calculate();
    System.out.println("Sum of " + a + " and " + b + " is " + calc.sum(a, b) + ".Average is "
        + calc.ave(calc.sum(a, b), calc.count(a, b)) + ".");
  }
}
