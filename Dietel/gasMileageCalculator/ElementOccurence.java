import java.util.Arrays;
public class ElementOccurence {
	public static boolean checkanelementinlist(int element, int[] number) {
	
	for(int index = 0; index < number.length; index++){
	if(index == element){
	return true;}
	}
	return false;
}

	public static void main(String[] args) {

	int[] number = {1, 2, 3, 4, 5,};
	int element = 8;

	boolean result = checkanelementinlist(element, number);

	System.out.println("Element " + element + " in array " + result);
	}
}

	