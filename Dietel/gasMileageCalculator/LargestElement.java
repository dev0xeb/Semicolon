public class LargestElement {
	public static int largestelement(int[] number) {

	int largest = number[0];

	for (int index = 1; index < number.length; index++){
	if (number[index] > largest){
	largest = number[index];
	}
}
	return largest;
}

	public static void main(String[] args){
	
	int[] number = {3, 8, 9, 12, 1, 2, 4,};
	
	System.out.println(largestelement(number));
}
}