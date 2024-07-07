import java.util.Scanner;
public class LogisticsMain {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	int num2 = 0;

	System.out.println("Enter successful deliveries made by the rider: ");
	int num1 = input.nextInt();

	if (num1 < 50){
		num2 = 160;}
	else if (num1 >= 50 && num1 <= 59){
		num2 = 200;}
	else if (num1 >= 60 && num1 <= 69){
		num2 = 250;}
	else if (num1 >= 70){
		num2 = 500;}

	System.out.println("Amount of parcel is " + num2);

	int multiply = Logistics.multiply(num1, num2);
	System.out.println(multiply);
	}
}
