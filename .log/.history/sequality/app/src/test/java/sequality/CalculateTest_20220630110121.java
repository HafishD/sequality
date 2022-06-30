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
    double expected = 2.5;
    
  }
}
