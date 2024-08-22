import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {

	@Test
	public void testMultiplicationResult() {

		//given
		Multiplication multiplication = new Multiplication();

		//when
		int num1 = 2;
		int num2 = 5;

		int result = multiplication.computemultiply(num1, num2);

		//assert
		assertEquals(10,result);

}

}