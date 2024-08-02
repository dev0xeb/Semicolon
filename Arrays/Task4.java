import java.util.ArrayList;
public class Task4 {
	public static void oddpositions(ArrayList<Integer> number) {
	for(int odd = 0; odd < number.size(); odd++){
	if(odd % 2 == 1)
	
	System.out.println("Element at index " + odd + ": " + number.get(odd));
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