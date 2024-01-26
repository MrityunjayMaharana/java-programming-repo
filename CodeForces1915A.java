import java.util.Scanner;
public class CodeForces1915A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i=0; i<t; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            if(a == b) {
                System.out.println(c);
            }
            else if (b == c) {
                System.out.println(a);
            }
            else {
                System.out.println(b);
            }
        }
        input.close();
    }
}
