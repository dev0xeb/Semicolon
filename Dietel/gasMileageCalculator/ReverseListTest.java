import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class ReverseListTest {

	@Test
	public void testToreverseAList(){
	//Given
	int[] number = {1, 2, 3, 4, 5};
	int[] expected = {5, 4, 3, 2, 1};

	//when
	int[] result = ReverseList.reversealist(number);

	//assert
	assertArrayEquals(expected, result);
	}
}