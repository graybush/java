package com.euler;

import java.util.Scanner;

public class P001 {

  private Scanner scanner = new Scanner(System.in);

  public void display() {
    System.out.println(
        "\nThis function will find the sum of all the natural \n"
        + "numbers below a given limit.\n");
    getInput();
  }

  private void getInput() {
    boolean state = true;
    while (state) {
      try {
        System.out.println("What is the limit? \n");
        int limit = scanner.nextInt();
        int ans = multiples3and5(limit);
        System.out.println("Answer: " + ans + "\n");
        state = false;
      } catch (Exception e) {
        scanner.nextLine();
        System.out.println("\nInvalid input detected.\n");
      }

    }
  }

  private int multiples3and5(int limit) {
    int total = 0;
    for ( int i = 0; i < limit; i++ ) {
      if ( i % 3 == 0 || i % 5 == 0 ) {
        total += i;
      }
    }
    return total;
  }

}
