public class task1 {
	public static int returnlargestelement(int[] number) {

	int largest = number[0];

	for(int count = 1; count < number.length; count++){
	 if(number[count] > largest) 
		largest = number[count];
	}
	return largest;


}

	public static void main(String[] args){
	int[] number = {3, 8, 9, 12, 1, 2, 4,};
	int largest = returnlargestelement(number);
	System.out.println("The largest element in the list is " + largest);
	}
}