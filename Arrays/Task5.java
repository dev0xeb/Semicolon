import java.util.ArrayList;
public class Task5 {
	public static void oddpositions(ArrayList<Integer> number) {
	for(int even = 0; even < number.size(); even++){
	if(even % 2 == 0)
	
	System.out.println("Element at index " + even + ": " + number.get(even));
}
}

	public static void main(String[] args) {
	ArrayList<Integer> number = new ArrayList<>();
	number.add(10);
	number.add(100);
	number.add(13);
	number.add(17);
	number.add(19);
	
	oddpositions(number);
}
}