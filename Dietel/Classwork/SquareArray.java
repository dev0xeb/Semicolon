import java.util.*;
public class SquareArray{
	public static void main(String[] args){

	int[] number = {-8, 1, 5, 3, 6, 7, 2, 4};
	for(int square = 0; square < number.length; square++){
	number[square] *= number[square];}

	System.out.print(Arrays.toString(number));

	//Arrays.sort(number);
	//System.out.print(Arrays.toString(number));
	
	for(int count =0; count < number.length; count++){
		for(int sort = count + 1; sort < number.length; sort++)
		if (number[count] > number[sort]){
			int swap = number[count];
			number[count] = number[sort];
			number[sort] = swap;
	
}
}
System.out.print(Arrays.toString(number));
	}
}
	