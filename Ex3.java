// Write a program that takes a number as input and prints its multiplication table up to 10. Sample Output:

// Input a number: 9

// Expected Output :

// 9 x 1 = 9 9 x 2 = 18 9 x 3 = 27 ... 9 x 10 = 90

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
       
    int num;
    int i;

    Scanner scan = new Scanner(System.in);
    System.out.println("Type the number desired:");

    num = scan.nextInt();
    
    for(i=1; i<=10; i++) {

        System.out.println(num + " x "+ i + " = " + num*i);

    }
    System.out.println();
        

    scan.close();
    }
}
