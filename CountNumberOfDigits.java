import java.util.Scanner;
public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 0;
        int temp = number;
        while (temp != 0) {
            if (temp > 0) {
                count++;
                temp = temp / 10;
            }
        }
        System.out.println("Total digits in "+ number + " is " + count);
        input.close();
    }
}
