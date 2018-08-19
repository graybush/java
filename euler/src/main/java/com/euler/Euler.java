package com.euler;

import java.util.Scanner;


/**
 * Project Euler!
 *
 */
public class Euler {

  // create a single shared scanner for keyboard input
  private Scanner scanner = new Scanner(System.in);

  public static void main(String[] args){
    System.out.println("\nWelcome to Project Euler!\n");
    Euler euler = new Euler();
    while (true) {
      euler.display();
    }

  }

  private void display() {
    System.out.println("Please select your desired application:  \n"
        + "1: Multiples of 3 and 5\n"
        + "00: Exit\n");

    try {
      int choice = scanner.nextInt();
      scanner.nextLine();
      switch (choice) {
        case 1:
          P001 p001 = new P001();
          p001.display();
          break;
        case 2:
          //
          break;
        case 0:
          this.exit();
          break;
        default:
          System.out.println("\nInvalid input detected.\n");
          //
      }
    } catch (Exception e) {
      scanner.nextLine();
      System.out.println("\nInvalid input detected.\n");
    }
  }

  private void exit() {
    System.out.println( "Exiting..." );
    System.exit(0);
  }

}
