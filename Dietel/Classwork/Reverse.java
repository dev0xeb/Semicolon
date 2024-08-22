public static int reverse(int number){

int firstNum = number / 10000;
int secondNum = (number / 1000) % 10;
int thirdNum = (number / 100) % 10;
int fourthNum = (number / 10) % 10;
int fifthNum = number % 10;

	return fifthNum fourthNum thirdNum secondNum firstNum;
}
}