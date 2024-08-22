import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MultiplicationTest {
  
  @Test
  public void testThePopulationCalculatorfor75Years(){

            //given
            PopulationCalculator population = new PopulationCalculator();
      
            //when
            int result = population.multiply(8120000000, 0.01, 75);

            //assert
            assertEquals(10, result);


  }
}