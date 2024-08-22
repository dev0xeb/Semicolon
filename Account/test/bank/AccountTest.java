package bank;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AccountTest {


    @Test
    public void newAccount_isZeroTest(){
        Account account = new Account();
        assertEquals(0, account.getBalance());
    }

    @Test
    public void newAccount_deposit2k(){
        Account account = new Account();
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance());
    }

    @Test
    public void newAccount_balance2kDepositMinus5kBalance2k(){
        Account account = new Account();
        assertEquals(2_000, account.getBalance());
        account.deposit(-5_000);
        assertEquals(2_000, account.getBalance());
    }
}
