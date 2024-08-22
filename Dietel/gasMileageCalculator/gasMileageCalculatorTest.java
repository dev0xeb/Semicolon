import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class gasMileageCalculatorTest {


	@Test
	public void testCanCalculateMilesPerGallon() {

		//given
		gasMileageCalculator calculator = new gasMileageCalculator();

		//when
		double numberOfMilesDriven = 30.00;
		double numberOfGallons = 20;
		double milesPerGallon = calculator.computeMilesPerGallon(numberOfMilesDriven, numberOfGallons);

		//assert
		assertEquals(1.5, milesPerGallon);

	}

public class  {

	@Test
	public void testCalculateMultiplicationThroughAddition() {

		//given
		gasMileageCalculator calculator = new gasMileageCalculator();

		//when
		int result = calculator.computeresult(int num1, int num2);
		if (num2 < 0)
		return num2 * (-1);

		//assert
		assertEquals(result);

}

}


}


