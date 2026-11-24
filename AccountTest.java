import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {




    @Test
    public  void testThatAccountIsOpenedWithZeroBalance(){
        Account eniolaAccount = new Account();
        assertEquals(0, eniolaAccount.getBalance());

    }

    @Test
    public void testThat5kIsDeposited_balanceIs5kTest(){
        Account eniolaAccount = new Account();
        eniolaAccount.deposit(5_000);
        assertEquals(5_000, eniolaAccount.getBalance());

    }

   @Test
   public void testWithdraw2kFromBalance_balanceIs3kTest(){
        Account eniolaAccount = new Account();
       eniolaAccount.deposit(5_000);
        eniolaAccount.withdraw(2_000);
        assertEquals(3_000, eniolaAccount.getBalance());

    }
}
