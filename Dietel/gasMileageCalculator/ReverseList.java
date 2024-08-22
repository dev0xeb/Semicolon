import java.util.Arrays;
public class ReverseList {
	public static int[] reversealist(int[] number) {

	int arraybeginning = 0;
	int arrayend = number.length-1;

	while(arraybeginning < arrayend){
	int swap = number[arraybeginning];
	number[arraybeginning] = number[arrayend];
	number[arrayend] = swap;
	arraybeginning++;
	arrayend --;
	}
	return number;
}
	public static void main(String[] args){
	int[] number = {1, 2, 3, 4, 5,};
	int[] reversealist = reversealist(number);
	System.out.print(Arrays.toString(number));
	}
}