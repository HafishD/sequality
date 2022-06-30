package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double ave(int x, int y) {
    return x / y;
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
      if(i%2==1){
        odd = i;
        sum = new Calculate().sum(sum, odd);
      }
    }
    return sum;
  }
}
