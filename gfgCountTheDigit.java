import java.util.Scanner;
public class gfgCountTheDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int temp = N;
        int count = 0;
        while(temp > 0) {
            int digit = temp % 10;
            if(digit !=0 && N % digit == 0) {
                count++;
            }
            temp = temp / 10;
        }
        System.out.println(count);
        input.close();
    }
}
