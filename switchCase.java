import java.util.*;

public class switchCase {
    public static void main(String[] args){
        // simple calculator using switch
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Choices are: 1.ADD 2.SUB 3.MUL 4.DIV");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        sc.close();
    }
}
