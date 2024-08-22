import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

int totalOdd = 0;
int totalEven = 0;

	for (int count = 1; count <= 10; count++){
	System.out.printf("Enter a number %d:", count);
	int number = input.nextInt();
	
	if (number % 2 == 0)
	totalEven += number;
	
	if (number %2 == 1)
	totalOdd += number;
}

	System.out.println("the sum of the even number " + totalEven + "the sum of the odd numbers is " + totalOdd);
}
}