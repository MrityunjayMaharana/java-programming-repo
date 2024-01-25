import java.util.Scanner;
public class YearsDays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        long minutesInYear = 365 * 24 * 60;
        long years = minutes / minutesInYear;
        long Days = (minutes % minutesInYear) / (24 * 60);

        System.out.println(minutes + " minutes is approximately " + years + " years and " + Days + " days.");
        scanner.close();
    }
}
