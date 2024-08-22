import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClintonTest {

	@Test
	public void testClintonTestandFunction() {
	
	Clinton clinton = new Clinton();

	int result = clinton.addition(10, 5);

	assertEquals(15, result);
}

	@Test
	public void testClintonTestand2NegativeFunction() {
	
	Clinton clinton = new Clinton();

	int result = clinton.sum(-10, -5);

	assertEquals(-15, result);
}

	@Test
	public void testClintonTestand1NegativeFunction() {
	
	Clinton clinton = new Clinton();

	int result = clinton.add(-10, 5);

	assertEquals(-5, result);
}



}