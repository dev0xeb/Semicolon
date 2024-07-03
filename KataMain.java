import java.util.Scanner;
	public class KataMain{
	  public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int number1 = input.nextInt();
		
		System.out.println("Enter second number: ");
		int number2 = input.nextInt();
		
		int subtraction = Kata.subtract(number1, number2);
		System.out.println("the difference "+ subtraction);
		
//2
    System.out.println("Enter a number: ");
		int number = input.nextInt();
		
		boolean primeNumber = Kata.primeNumber(number);
		System.out.println(primeNumber);


//3
      System.out.println("Enter a number: ");
      int squareRootNum = input.nextInt();
      
      boolean squareRoot = Kata.squareRoot(squareRootNum);
      System.out.println(squareRoot);
      
//4
      System.out.println("Enter first number: ");
		int num1 = input.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = input.nextInt();
		
		float division = Kata.division(num1, num2);
		 System.out.println(division);
    
//5
    System.out.print("Enter a number: ");
		int integer = input.nextInt();
		
		boolean result = Kata.isEven(number);
		
		System.out.print(result);
			
		}

}
			
