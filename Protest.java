import java.util.Random;

public class Protest {
	public static void main(String[] args) {

	Random random = new Random();
	
	String[] protestDemands = {"End Corruption.", "Government Transperancy.", "End Police Brutality", "Economic Relief.", "Job Creation.", "Cost of Living and Minimum Wage.", "Affordable Education.", "Easy Access to Medical Care", "Urban Development.", "End Protest."};

	
	int index = random.nextInt(protestDemands.length);

	String randomProtestDemands = protestDemands[index];

	System.out.println("Protest Demands from the citizens include " + randomProtestDemands);
	}
} 