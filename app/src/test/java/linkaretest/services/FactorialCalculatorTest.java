package linkaretest.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.InputMismatchException;

import org.junit.jupiter.api.DisplayName;

public class FactorialCalculatorTest {

  @Test
  @DisplayName("calculateFactorial method returns 1 when parameter is 0")
  void factorialOfZero() {

    Integer factorial = FactorialCalculator.calculateFactorial(0);
    assertEquals(1, factorial);
    
  }

  @Test
  @DisplayName("calculateFactorial method returns 1 when parameter is 1")
  void factorialOfOne() {

    Integer factorial = FactorialCalculator.calculateFactorial(1);
    assertEquals(1, factorial);

  }

  @Test
  @DisplayName("calculateFactorial method returns 120 when parameter is 5")
  void factorialOfOneHundred() {

    Integer factorial = FactorialCalculator.calculateFactorial(5);
    assertEquals(120, factorial);

  }

  @Test
  @DisplayName("calculateFactorial method throws exception when parameter is negative")
  void factorialOfNegativeNumber() {

    assertThrows(InputMismatchException.class, () -> {
      FactorialCalculator.calculateFactorial(-1);
    });

  } 
}
