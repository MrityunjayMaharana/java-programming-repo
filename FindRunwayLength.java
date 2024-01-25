import java.util.Scanner;
public class FindRunwayLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter speed and acceleration: ");
        double v = input.nextDouble();
        double a = input.nextDouble();

        // calculating runway length
        double length = (v * v)/(2 * a);

        System.out.println("The minimum runway length for this airplane is "+ length);
        input.close();

    }
}