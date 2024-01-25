import java.util.Scanner;
public class codeforces1352A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            decomposeToRoundNumbersAndPrint(n);
        }
        sc.close();
    }
    public static void decomposeToRoundNumbersAndPrint(int n) {
        int multiplier = 1;

        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > 0) {
                System.out.print(digit * multiplier + " ");
                count++;
            }
            n /= 10;
            multiplier *= 10;
        }

        System.out.println(count);
    }
}