import java.util.*;

public class maxValOf3 {
    public static void main(String[] args){
        // scanner function
        Scanner scan = new Scanner(System.in);

        // max of three number
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("Largest number is "+ num1);
        }
        else if(num2 >= num1 && num2 >= num3){
            System.out.println("Largest number is "+ num2);
        }
        else {
            System.out.println("Largest number is "+ num3);
        }
        scan.close();
    }
}
