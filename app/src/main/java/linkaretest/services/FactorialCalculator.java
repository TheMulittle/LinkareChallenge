package linkaretest.services;
import java.util.InputMismatchException;
import java.util.stream.IntStream;

public class FactorialCalculator {
    private static final Integer ZERO_FACTORIAL = 1;

    public static Integer calculateFactorial(Integer factorialToBeCalculated) throws InputMismatchException {
		  
      if(factorialToBeCalculated < 0) {
        throw new InputMismatchException("Factorial of a negative number does not exist");
      }

      IntStream multiplicands = IntStream.rangeClosed(1, factorialToBeCalculated);
		  Integer factorial = multiplicands.reduce(ZERO_FACTORIAL, (previousNumberFactorial, multiplicand) ->  {
        checkMultiplicand(multiplicand);
        return previousNumberFactorial*multiplicand;
      });

      return factorial;
    }

    private static void checkMultiplicand(Integer multiplicand) {
      if(multiplicand % 15 == 0) {
        System.out.println("hokeypokey");
      } else if (multiplicand % 5 == 0) {
        System.out.println("pokey");
      } else if (multiplicand % 3 == 0) {
        System.out.println("hokey");
      }
    }
}
