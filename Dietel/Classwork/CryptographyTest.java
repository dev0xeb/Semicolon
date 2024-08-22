import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CryptographyTest {
  
  @Test
  public void testCryptography(){

            //given
           Cryptography cryptography= new Cryptography();
      
            //when
            int result = cryptography.encrypt(2222);

            //assert
            assertEquals(5555, result);
  }
}