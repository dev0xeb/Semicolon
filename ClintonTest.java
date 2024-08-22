import java.util.Arrays;
public class ClintonTest {

 	public static int[] sortanarray(int[] numbers) {

	for(int index = 0; index < numbers.length - 1; index++){
		for(int compare =index + 1; compare < numbers.length; compare++){
			if(numbers[index] > numbers[compare]){
			numbers[index] = numbers[index]^ numbers[compare];
			numbers[compare] = numbers[compare]^ numbers[index];
			numbers[index] = numbers[index]^ numbers[compare];
			}
		}
	}
	return numbers;
		
	
}		


	public static void main(String[] args) {
	int[] numbers = {1, 5, 3, 2, 4, 8, 6, 7, 9, 10};
	int[] average = sortanarray(numbers);
	System.out.print(Arrays.toString(average));
	}
}