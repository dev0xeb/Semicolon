import java.util.Scanner;
public class Primenumber{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter a positive number: ");
	int number = input.nextInt();

	if (number < 0){
	System.out.println("the number you entered is not a positive number, \nEnter a positive number");
	number = input.nextInt();}

	else if (number < 2)
	System.out.println("number is not a prime number");

	else if (number == 2 || number == 3)
	System.out.println("number is a prime number");

	else if (number % 2 == 0)
	System.out.println("number is not a prime number");

	else if (number % 3 == 0)
	System.out.println("number is not a prime number");
	
	else if (number % 5 == 0)
	System.out.println("number is not a prime number");
	
	else
	System.out.println("number is a prime number");
	



	}
}
