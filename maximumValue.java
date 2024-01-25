import java.util.*;

public class maximumValue {
    public static void main(String[] args){

        // Scanner function
        Scanner scan = new Scanner(System.in);

        // problem :01 > print the largest number
        System.out.print("Enter the value of num1: ");
        int num1 = scan.nextInt();

        System.out.print("Enter the value of num2: ");
        int num2 = scan.nextInt();

        if(num1 == num2){
            System.out.println("Same" + num1);
        }
        else if(num1 > num2){
            System.out.println("Largest number is " + num1);
        }
        else {
            System.out.println("Largest number is " + num2);
        }
        scan.close();
    }
}
