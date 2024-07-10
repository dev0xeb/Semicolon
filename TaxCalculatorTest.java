import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {



	@Test
	public void testCalculator(){
		//given
		TaxCalculator taxCalculator = new TaxCalculator();
		
		//when
		double tax = taxCalculator.calculateTax(30_000);
		
		//assert
		assertEquals(4_500, tax);
		
		}


}

