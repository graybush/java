package com.euler;

import java.util.Scanner;

// import euler.P001;

/**
 * Hello world!
 *
 */
public class Euler {

  // create a single shared scanner for keyboard input
  private Scanner scanner = new Scanner( System.in );

  public static void main( String[] args ){

    Euler euler = new Euler();
    while (true) {
      euler.display();
    }

  }

  private void display() {
    System.out.println( "Welcome to Project Euler! \n" 
        + "Please select your desired application:  \n"
        + "1: Multiples of 3 and 5\n"
        + "4: Exit\n");

    try {
      int choice = scanner.nextInt();
      scanner.nextLine();
      switch (choice) {
        case 1:
          try {
            P001 p001 = new P001();
            p001.display();
            int limit = scanner.nextInt();
            int ans = p001.multiples3and5(limit);
            System.out.println(ans + "\n");
          } catch (Exception e) {
            System.out.println(e);
          }

          break;
        case 2:
          //
          break;
        case 4:
          this.exit();
          break;
        default:
          System.out.println( "Invalid selection." );
          //
      }
    } catch (Exception e) {
      scanner.nextLine();
      System.out.println("Invalid input detected.\n");
    }

  }


  private void exit() {
    System.out.println( "Exiting..." );
    System.exit(1);
  }

}
