public class Cryptography{
  public int encrypt(int number) {
  
	int num1 = number / 1000;
	int num2 = (number % 1000) / 100;
	int num3 = (number % 100) / 10;
	int num4 = number % 10;

	num1 = (num1 + 7) % 10;
	num2 = (num2 + 7) % 10;
	num3 = (num3 + 7) % 10;
	num4 = (num4 + 7) % 10;
	
	//int newNum1 = num3;
	//int newNum2 = num4;
	//int newNum3 = num1;
	//int newNum4 = num2;
	
	int newNum = num3 * 1000 + num4 * 100 + num1 * 10 + num2;
	return newNum;
	
  }

}