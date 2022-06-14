package linkaretest.services;

import java.util.Scanner;

public class InputReader {
  public static Integer readInteger(String message) {
    System.out.print(message);
    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
  }
}
