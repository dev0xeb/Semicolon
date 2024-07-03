public class Kata{
	public static int subtract(int number1, int number2){
		int subtract = number1 - number2;
		if (subtract < 0)
		subtract = number2 - number1;
		return subtract;
		}
		
public static boolean primeNumber(int number){
  if(number == 2 && number == 3)
  return true;
  
  else if (number % 2 == 0 && number % 3 == 0 && number % 5 == 0);
  return false;
    }
    
    public static boolean squareRoot (int squareRootNum) {
    double numberSquared;
    numberSquared = Math.sqrt(squareRootNum);
    if (numberSquared * numberSquared == squareRootNum)
    return true;
    else
    return false;
    }
    
    public static float division(int num1, int num2) {
		float quotient = num1 / num2;
		if (num2 == 0)
		return 0;
		else
		return quotient;
		}

	public static boolean isEven(int number){
			if (number % 2 == 0){
			return true;
			}else{
			return false; }
		}
			

}



