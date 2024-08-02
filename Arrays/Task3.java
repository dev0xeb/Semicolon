import java.util.ArrayList;
import java.util.List;
public class Task3 {
	public static boolean returnelementinalist(List<Integer> list, int number) {
	return list.contains(number);


}
	public static void main(String[] args){
	List<Integer>number = new ArrayList<>();
	number.add(1);
	number.add(2);
	number.add(3);
	number.add(4);
	number.add(5);

	System.out.println(returnelementinalist(number, 3));
	}
}