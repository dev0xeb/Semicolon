import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BackToSenderTest {

	@Test
	public void calculateRidersWage() {

	BackToSender backtosender = new BackToSender();
	int ridersWage = backtosender.multiply(80);
	assertEquals(45000, ridersWage);
	}

	@Test
	public void calculateRidersLowWage() {

	BackToSender backtosender = new BackToSender();
	int ridersWage = backtosender.multiply(25);
	assertEquals(9000, ridersWage);
	}
}