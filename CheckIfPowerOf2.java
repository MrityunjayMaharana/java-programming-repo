import java.util.Scanner;
public class CheckIfPowerOf2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int temp = N;
        int count = 0;
        while(temp % 2 == 0) {
            temp = temp / 2;
            count++;
        }
        if(temp == 1) {
            System.out.println("Yes! 2 to the power " + count);
        }
        else {
            System.out.println("No");
        }
        input.close();
    }
}
