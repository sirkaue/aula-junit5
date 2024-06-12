package entity;

import factory.AccountFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTests {

    @Test
    public void depositShouldIncreaseBalanceAndDiscountFeeWhenPositiveAmount() {

        double amount = 200.0;
        double expectedValue = 196.0;
        Account account = AccountFactory.createEmptyAccount();

        account.deposit(amount);

        Assertions.assertEquals(expectedValue, account.getBalance());
    }

    @Test
    public void depositShouldDoNothingWhenNegativeAmount() {
        double expectedValue = 100.0;
        Account account = AccountFactory.createAccount(expectedValue);
        double amount = -200.0;

        account.deposit(amount);

        Assertions.assertEquals(expectedValue, account.getBalance());
    }
}
