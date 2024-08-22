import java.util.Arrays;
public class SwapNumbers {
	public static int[] swapnumbers(int[] number) {
	int[] newNumbers = new int[number.length];
	for(int index = 0; index < number.length; index += 2){
	if (index + 1 < number.length){
	newNumbers[index] = number[index + 1];
	newNumbers[index + 1] = number[index];
	}
	else {
	newNumbers[index] = number[index];
	}
	}
	return newNumbers;
}

	public static void main(String[] args) {
	
	int[] number = {1, 2, 3, 4, 5, 6,};
	int[] newNumbers = swapnumbers(number);
	System.out.println(Arrays.toString(newNumbers));
}
}