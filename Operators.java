import java.util.Scanner;
import java.lang.Math;

public class Operators {
    public static void main(String[] args) {
        // Scanner function
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        // Exponent operation
        System.out.println(Math.pow(2, 3));


        // System.out.println(1 - 0.9);
        input.close();
    
    }
}
