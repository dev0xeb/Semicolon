import java.util.Arrays;
public class ArraySort1 {

	public static int[] ascendingorder(int[] number) {

	for(int index = 0; index < number.length - 1; index++) {
	for(int compare = index +1; compare < number.length; compare++) {
		if (number[index] > number[compare]){
			number[index] = number[index]^ number[compare];
			number[compare] = number[index]^ number[compare];
			number[index] = number[index]^ number[compare];
			
			}
}
}
				
		

	return number;
}

	public static void main(String[] args) {
	int[] number = {2, 1, 4, 3, 6, 5};
	int[] sortedArray = ascendingorder(number);
	System.out.print(Arrays.toString(sortedArray));
	}
}
