import java.util.*;

public class homeworkProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Find sum of all odd numbers from 1 to N
        int N = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=N; i++){
            if(i % 2 != 0){
                sum = sum + i;
            }
        }
        System.out.println("The sum of all odd numbers from 1 to N : "+ sum);

        // Leap year

        int year = sc.nextInt();
        if(year % 4 == 0 && ((year % 100 != 0) || (year % 400 == 0))){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }

        // Three side given check if valid triangle

        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2)){
            System.out.println("Valid Triangle");
        }
        else {
            System.out.println("Not a Valid Traingle");
        }

        // the number is perfect power of 2 eg:1, 2, 4, 8, 16 ...
        int number = sc.nextInt();
        int n = number;
        while(n >= 1){
            if(n == 1){
                System.out.println("Yes");
            }
            else if(n %2 != 0){
                System.out.println("No");
            }
            n = n /2;
        }
        sc.close();
        
    }
}
