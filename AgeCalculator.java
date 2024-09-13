import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their birthdate
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String inputDate = scanner.nextLine();

        // Parse the input date to LocalDate
        LocalDate birthDate = LocalDate.parse(inputDate);
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between the birthdate and the current date
        Period period = Period.between(birthDate, currentDate);

        // Display the age
        System.out.printf("Your age is %d years, %d months, and %d days.%n",
                period.getYears(), period.getMonths(), period.getDays());
   }

}
