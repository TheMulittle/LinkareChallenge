package linkaretest.services;

import java.util.Scanner;

public class InputReader {
  
  public static Integer readInteger(String message) {
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.print(message);
      return scanner.nextInt();   
    } finally {
      scanner.close();
    }

  }
}
