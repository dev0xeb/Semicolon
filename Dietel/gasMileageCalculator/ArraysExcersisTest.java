import java.util.*;
public class ArrayExercisesTest {
	public static void main(String[] args){
	
	double sum = 0;
	double average = 0;
	int count= 0;

	int[] numbers = new int[10];

	for(count = 0; count < numbers.length; count++){
	numbers[count] = numbers[count] + 9 - count+1;
	}

	System.out.println(Arrays.toString(numbers));{
	for(int counter = 0; counter < numbers.length; counter++)
		sum = sum + numbers[counter];}
		System.out.println(sum);

	average = sum / count;
	System.out.println(average);
	
	}

}