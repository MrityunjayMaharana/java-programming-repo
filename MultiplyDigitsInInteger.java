import java.util.Scanner;
public class MultiplyDigitsInInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        // calculating the multiplication 

        if (number < 0 || number > 1000) {
            System.out.println("Invalid input. Please enter a number between 0 and 1000.");
        } 
        else {
            int temp = number;
            int result = 1;
            while (temp > 0) {
                int digit = temp % 10;
                result *= digit;
                temp /= 10;
            }
            System.out.println("The multiplication of all digits in " + number + " is " + result);
        }
        input.close();
    }
}
