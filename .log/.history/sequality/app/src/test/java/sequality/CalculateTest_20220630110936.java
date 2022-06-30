package sequality;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAve() {
    Calculate calc = new Calculate();
    double expected = 5.5;
    assertEquals(expected, calc.ave(55, 10), 0.0f);
  }

  @Test
  public void testTotal() {
    Calculate calc = new Calculate();
    int expected = 55;
    assertEquals(expected, calc.total(1, 10));
  }

  @Test
  public void testOdd() {
    Calculate calc = new Calculate();
    int expected = 25;
    assertEquals(expected, calc.odd(1, 10));
  }

  @Test
  public void testEven() {
    Calculate calc = new Calculate();
    int expected = 30;
    assertEquals(expected, calc.even(1, 10));
  }

  @Test
  public void testCount() {
    Calculate calc = new Calculate();
    int expected = 10;
    assertEquals(expected, calc.count(1, 10));
  }
}
