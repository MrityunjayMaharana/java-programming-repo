import java.util.*;

public class AreaOfCircle {
    // Named Constant
    public static final double PI = 3.14;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        double Area = PI * radius * radius;
        System.out.println("Area of Circle is : " + Area);
        sc.close();
    }
}
