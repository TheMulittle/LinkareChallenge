/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkaretest;

import java.util.Scanner;

import linkaretest.services.FactorialCalculator;
import linkaretest.services.InputReader;

public class App {
    public static void main(String[] args) {
        final String numberQuery = "Please type the number whose factorial is to be calculated: ";
        
        Integer factorialToBeCalculated = InputReader.readInteger(numberQuery);
        Integer factorialResult = FactorialCalculator.calculateFactorial(factorialToBeCalculated);
		
        System.out.print("\nThe factorial of " + factorialToBeCalculated + " is " + factorialResult);
    }
}
