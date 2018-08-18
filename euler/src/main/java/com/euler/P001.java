package com.euler;

public class P001 {

  public void display() {
    System.out.println(
        "This function will find the sum of all the natrual \n"
        + "numbers below a given limit.\n"
        + "What is the limit? \n");
  }

  public static int multiples3and5(int limit) {
    int total = 0;
    for ( int i = 0; i < limit; i++ ) {
      if ( i % 3 == 0 || i % 5 == 0 ) {
        total += i;
      }
    }
    return total;
  }

}
