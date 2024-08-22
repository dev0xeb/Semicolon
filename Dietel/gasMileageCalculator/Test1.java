import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Test1 {

	@Test
	public void testToFindTheLargestElement(){
	//Given
	int[] number = {1, 9, 3, 4, 5};
	int expected = 9;

	//when
	int result = LargestElement.largestelement(number);

	//assert
	assertEquals(expected, result);
	}
}