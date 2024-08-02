import java.util.ArrayList;
public class Task4 {
	public static int sumofnumbersinalist(ArrayList<Integer> number) {

	int total = 0;
	for(int sum =0; sum < number.size(); sum++){
	total += number.get(sum);
	}
	return total;
}

	public static void main(String[] args){
	ArrayList<Integer> number = new ArrayList<>();

	number.add(10);
	number.add(100);
	number.add(13);
	number.add(17);
	number.add(19);
	int addition= sumofnumbersinalist(number);
	System.out.print(addition);
}
}
