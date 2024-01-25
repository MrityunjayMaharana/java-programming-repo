import java.util.*;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking the input for co-ordinates

        System.out.println("Enter the value for x1 and y1 : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter the value for x2 and y2 : ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.println("Enter the value for x3 and y3 : ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // calculating sides of triangle

        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        // calculating area of triangle

        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        // printing area
        System.out.println("Area of Triangle is : "+ area);
        input.close();
    }
}
