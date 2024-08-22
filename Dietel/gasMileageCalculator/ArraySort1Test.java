import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class ArraySort1Test {


	@Test
	public void testtoreturnascendingorder(){

	//Given
	int[] number= {5, 4, 3, 2, 1};
	int[] expected = {1, 2, 3, 4, 5};

	//when
	int[] result = ArraySort1.ascendingorder(number);

	//assert
	assertArrayEquals(expected, result);
	}
}