package com.euler;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Euler {

  // create a single shared scanner for keyboard input
  private static Scanner scanner = new Scanner( System.in );

  public static void main( String[] args ){
    System.out.println( "Welcome to Project Euler!" );
    System.out.println( "Please select your desired application: " );
    System.out.println( "1: Multiples of 3 and 5");

    // String input = scanner.nextLine();
    // int num = Integer.parseInt( input );

    int choice = scanner.nextInt();

    switch (choice) {
      case 1:

        System.out.println( "This function will find the sum of all the natural "
            + "numbers below a given limit. What is the limit? ");
        try {
          int limit = scanner.nextInt();
          // int lim = Integer.parseInt( limit );
          int ans = multiples3and5( limit );
          System.out.println( ans );
        } catch ( Exception e ) {
        }

        break;
      case 2:
        //
        break;
      default:
        //
    }


  }

  private static int multiples3and5( int limit ) {
    int total = 0;
    for ( int i = 0; i < limit; i++ ) {
      if ( i % 3 == 0 || i % 5 == 0 ) {
        total += i;
      }
    }
    return total;
  }

}
