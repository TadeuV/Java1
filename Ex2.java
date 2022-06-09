
// Write a program that takes in an input number of cents. The program will write out the number of dollars and cents, like this:

// Input the cents: 324

// Expected Output :

// The value is 3 dollars and 24 cents.

// Note: Use integer arithmetic and avoid floating point arithmetic.

import java.nio.IntBuffer;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
      
    int cen;
    int cent;
   
    Scanner scan = new Scanner(System.in);
    System.out.println("Type here the cent number:");

    cen = scan.nextInt();
    cent= cen%100;

    System.out.printf("%s %-1d %s %2d %s", "The value is", cen/100, "dollars and", cent, "cents!");
    
    scan.close();

    }
}
