import java.util.Scanner;
import java.util.Arrays;
public class CreditCardValidity {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int additonRightToLeft = 0;

	System.out.println("Welcome to credit card validator where you can get all information regarding your CreditCard");
	System.out.println("Enter your Credit Card number ");
	String cardNumber = input.next();

	if (cardNumber.length() < 13 || cardNumber.length() > 16){
	System.out.print("Invalid Card Number. Card Number should be between a 13 digit to a 16 digit number, Try again: ");
	} else{
	if (cardNumber.charAt(0) == '4'){
	System.out.println("Your Card is Visa Card");}
	
	else if (cardNumber.charAt(0) == '5'){
	System.out.println("Your Card is a Master Card");}

	else if (cardNumber.charAt(0) == '3' && cardNumber.charAt(1) == '7'){
	System.out.println("Your Card is an American Express Card");}

	else if (cardNumber.charAt(0) == '6'){
	System.out.println("Your Card is a Discover Card");}

	else{
	System.out.println("Invalid");
	}
	}

	for(int rightToLeft = cardNumber.length()-2; rightToLeft >= 0; rightToLeft-=2) {
		int number = cardNumber.charAt(rightToLeft);
		int doubleDigit = number * 2;
		if(doubleDigit > 9){
		int num1 = doubleDigit / 10;
		int num2 = doubleDigit % 10;
		
		doubleDigit = num1 + num2;}

		additonRightToLeft += doubleDigit;}
	System.out.print(additonRightToLeft);


		
	
	
	

	
	}
}


		