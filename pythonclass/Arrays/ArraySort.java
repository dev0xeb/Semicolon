import java.util.Arrays;
public class ArraySort {

	public static int[] arraysinascendingorder(int[] array) {

	for(int index = 0; index < array.length; index++){
		for(int compare = index + 1; compare < array.length; compare++)

			if (array[index] > array[compare]){
				int swap = array[index];
				array[index] = array[compare];
				array[compare] = swap;
			}
		}
	
	return array;
}

	public static void main(String[] args){
	int[] array = {1, 4, 2, 3, 8, 6, 7, 5, -9};
	int[] arraySorts = arraysinascendingorder(array);
	System.out.print(Arrays.toString(arraySorts));
	}	
}