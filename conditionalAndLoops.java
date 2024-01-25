import java.util.*;

public class conditionalAndLoops {
    public static void main( String[] args){
        Scanner scan = new Scanner(System.in);

        int marks = scan.nextInt();
        if(marks >= 33){
            System.out.println("You passed the exam!!");
        }
        else {
            System.out.println("You failed!!!");
        }

        // Ternary Operator
        boolean passed = (marks >= 33)?true:false;
        System.out.println(passed);

        // if, else if, and else
        if(marks >= 80){
            System.out.println("Very good marks");
        }
        else if(marks >= 60 && marks < 80){
            System.out.println("Good marks");
        }
        else if(marks >=33 && marks <60){
            System.out.println("Average Marks");
        }
        else {
            System.out.println("Fail");
        }

        // loops = for, while, and do-while

        // for(initialistion; condition; updation){}
        String val = "mrityunjay";
        for(int i=0; i<5; i++){
            System.out.println(val);
        }

        scan.close();

    }
}
