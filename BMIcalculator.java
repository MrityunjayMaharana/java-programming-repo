import java.util.Scanner;
public class BMIcalculator {
    public static void main(String[] args) {
        
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METRES_PER_INCH = 0.0254;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();

        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMetres = height * METRES_PER_INCH;

        double bmi = weightInKilograms / (heightInMetres * heightInMetres);


        System.out.println("BMI is " + bmi);
        if(bmi < 18.5) {
            System.out.println("Underweight");
        } 
        else if(bmi < 25) {
            System.out.println("Normal");
        } 
        else if(bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        input.close();
    }
}
