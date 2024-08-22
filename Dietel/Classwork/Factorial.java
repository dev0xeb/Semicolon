public class Factorial { 
	public static void main(String[] args){

System.out.print(factorial(10));
System.out.print(power(5, 2));

}
	
public static int factorial(int number) {
	int factorial =1;
	for(int counter =1; counter<= number; ++counter){

		factorial *= counter;}
	
		return factorial;
	
	}
public static int power(int number1, int number2){
	double raisetopower = 1;
	while(number2 != 0)
	raisetopower = raisetopower * number2;

	return raisetopower;
}




}