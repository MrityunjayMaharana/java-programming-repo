import java.util.*;
public class loopPractise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int N = sc.nextInt();

        for(int i=1; i<=N; i++){
            System.out.println(i);
        }
        sc.close();
    }
}
