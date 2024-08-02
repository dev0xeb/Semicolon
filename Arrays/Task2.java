import java.util.Arrays;
public class Task2 {
	public static int[] reversealist(int[] number) {
	
	int arrayBeginning =0;
	int arrayEnd = number.length -1;

	while (arrayBeginning  < arrayEnd){
	int swap = number[arrayBeginning];
	number[arrayBeginning] = number[arrayEnd];
	number[arrayEnd] = swap;
	arrayBeginning++;
	arrayEnd--;
	}
	
	//Collections.reverse(number);
	return number;
}

	public static void main(String[] args){
	int[] number = {1, 2, 3, 4, 5,};
	//Collections.reverse(number) = reversealist(number);
	int[] reversealist = reversealist(number);
	System.out.print(Arrays.toString(number));
	}
}