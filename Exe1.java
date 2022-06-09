
// Write a program that calculates the area of a circle from its radius. The radius should be read as an integer from the keyboard. Sample of user dialog:

// Input the radius: 3

// Expected Output :

// The radius is: 3 The area is: 28.274333882308138

// Note: You can use the constant PI from Math.PI.
import java.util.Scanner;
import java.lang.Math;

public class Exe1 {
    public static void main(String[] args) {
       
        Integer r;
        Scanner a = new Scanner(System.in);
        System.out.println("Type the radius of the circle:");
        r = a.nextInt();

        System.out.printf("%s %.3f%n","The area of the circle is:", r*r*Math.PI);
        a.close();
    }
}
