import java.util.Scanner;
public class Question8 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

int largestNum = 0;
int smallestNum = 0;
	for (int count = 1; count <= 10; count++){
	System.out.printf("Enter a number %d:", count);
	int number = input.nextInt();

	if (number > largestNum)
		largestNum = number;
	if (number == 0 || smallestNum < largestNum )
		smallestNum = largestNum ;}

System.out.println("the largest number is " + largestNum + "the smallest number is " + smallestNum);
}
}

	