import java.util.Scanner;

public class CreditCardValidity {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int additonRightToLeft = 0;
	int oddTotal = 0;
	String cardNumber;

	while(true){
	System.out.println("Welcome to credit card validator where you can get all information regarding your CreditCard");
	System.out.println("Enter your Credit Card number ");
	cardNumber = input.next();
		if (numeric(cardNumber)){
		break;}
		else{
		System.out.println("Invalid Input, Enter a valid Credit Card number ");
		}
	}
	System.out.println();
	System.out.println("*********************************************************");
	if (cardNumber.length() < 13 || cardNumber.length() > 16){
	System.out.print("Invalid Card Number.");
	} else{
	if (cardNumber.charAt(0) == '4'){
	System.out.println("**Credit Card type: Visa Card");}
	
	else if (cardNumber.charAt(0) == '5'){
	System.out.println("**Credit Card type: Master Card");}

	else if (cardNumber.charAt(0) == '3' && cardNumber.charAt(1) == '7'){
	System.out.println("**Credit Card type: American Express Card");}

	else if (cardNumber.charAt(0) == '6'){
	System.out.println("**Credit Card type: Discover Card");}

	else{
	System.out.println("**Credit Card type: Unknown Card");
	}
	}

	for(int rightToLeft = cardNumber.length()-2; rightToLeft >= 0; rightToLeft-=2) {
		int number = Integer.parseInt(String.valueOf(cardNumber.charAt(rightToLeft)));
		number = number * 2;
		if(number > 9)
		number = number / 10 + number % 10;

		additonRightToLeft += number;}
		//System.out.print(additonRightToLeft);

	for(int oddIndex = cardNumber.length()-1; oddIndex >= 0; oddIndex-=2) {
		int numbers = Integer.parseInt(String.valueOf(cardNumber.charAt(oddIndex)));
		oddTotal += numbers;
		}
		//System.out.print(oddTotal);
	
	System.out.println("**Credit Card Number: " + cardNumber);
	System.out.println("**Credit Card Digit Length: " + cardNumber.length());
	int sum = additonRightToLeft + oddTotal;
	if(sum % 10 == 0)
	System.out.println("**Credit Card Validity Status: Valid");
	else
	System.out.println("**Credit Card Validity Status: Invalid");
		
	System.out.println("*********************************************************");
	
	
	

	
	}
}


		