import java.util.Scanner;
public class SumOfDigitsInNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            sum = sum + (temp % 10);
            temp = temp / 10;
        }
        System.out.println("Sum of digit in number " + number + " is " + sum);
        input.close();
    }
}
