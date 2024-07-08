import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MultiplicationTest {
  
  @Test
  public void testTheCalculatorCanMultiply(){

            //given
            Multiplication multiplication = new Multiplication();
      
            //when
            int result = multiplication.multiply(2, 5);
            //assert
            assertEquals(10, result);


  }

}


