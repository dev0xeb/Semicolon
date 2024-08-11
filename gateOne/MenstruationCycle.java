import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class MenstruationCycle {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	System.out.println("Welcome to Clinton's Menstruation, \n User's Identity and Data are safe with us");
	
	System.out.println("Enter the start date of your previous Menstrual period (use the format yyyy-MM-DD): ");
	String lastStartdateString = input.next();
	LocalDate lastStartdate = LocalDate.parse(lastStartdateString, formatter);

	System.out.println("On the average, how long is your typical Menstrual Cycle: ");
	int cycleLength= input.nextInt();

	System.out.println("What was last Menstrual duration(how many days did your period last): ");
	int menstrualDuration = input.nextInt();

	LocalDate lastEnddate = lastStartdate.plusDays(menstrualDuration);
	System.out.println("The End date of your previous period was " + lastEnddate);

	System.out.println();
	LocalDate nextStartdate = lastStartdate.plusDays(cycleLength);

	LocalDate nextEnddate = lastStartdate.plusDays(menstrualDuration);
	System.out.println("The estimated date of your next period is " + nextStartdate + " to " + nextEnddate);

	System.out.println();
	LocalDate ovulationStartdate = lastStartdate.plusDays((cycleLength/2) -2);

	LocalDate ovulationEnddate = lastStartdate.plusDays((cycleLength/2) + 1);
	System.out.println("Your estimated Ovulation Date is " + ovulationStartdate + " to " + ovulationEnddate);

	System.out.println();
	LocalDate safePeriodStart = nextEnddate.plusDays(1);

	LocalDate safePeriodEnd = safePeriodStart.plusDays((cycleLength/2) - 1);
	System.out.println("Your estimated Safe Period is " + safePeriodStart + " to " + safePeriodEnd);

	system.out.println("Disclamier: Calculations may not be acurrate as Menstrual Cycle calculations varies in indviduals")
	System.out.println();
	System.out.println("""
				Symptoms to watch out for when nearing your Next Period:-
				- Menstrual Cramps.
				- Breast Tenderness.
				- Mood Swings.
				- Fatigue.
				- Back Pain.
				- Increased Urination.
				- Changes in Appetite.
				""");

	System.out.println();
	System.out.println("""
				Health Tips:-
				- Eat Balanced Diet.
				- Stay Hydrated.
				- Limit caffeine and Alcohol.
				- Maintain Hygiene.
				- Avoid Excessive Salt and Sugar.
				- Consult a Health care Provider if you experience severe symptoms such as debilitating cramps or unusually heavy bleeding.
			""");


				

	}
}