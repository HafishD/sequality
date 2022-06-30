package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double ave(int sum, int cnt) {
    double total = sum;
    return total / cnt;
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

}
