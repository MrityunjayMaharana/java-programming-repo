import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Number: ");
        int N = input.nextInt();
        int count = 0;

        for(int i=1; i<=N; i++) {
            if(N%i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Given Number is Prime!");
        }
        else {
            System.out.println("Not a Prime Number!");
        }
        input.close();
    }
}
