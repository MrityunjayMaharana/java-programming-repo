import java.util.Scanner;
public class sumOfDigitsOfNnumbers {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for(int i=1; i<=N; i++) {
            int sum = 0;
            int temp = i;
            while(temp != 0) {
                sum = sum + (temp % 10);
                temp = temp / 10;
            }
            System.out.println(sum);
        }
        input.close();
   }
}
