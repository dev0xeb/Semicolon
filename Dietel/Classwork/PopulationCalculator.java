import java.util.Scanner;
public class PopulationCalculator {
	public static void main(String[] args) {


long worldPopulation = 8120000000L;
float growthRate = 0.01f;

	for(int year= 1; year<= 75; year++) {
	long worldPopulationIncrease = Math.round(worldPopulation * growthRate);
	long worldPopulationGrowth = worldPopulation + worldPopulationIncrease;
	worldPopulation = worldPopulationGrowth;

	System.out.printf("%d\t%d\n", year, worldPopulationGrowth);
	
		}
	System.out.println("Year\tEstimated Population");
	}
}