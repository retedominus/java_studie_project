package OOP_Lesson_04.Example_2;

import java.math.BigDecimal;

public class SallaryAccount extends Account implements Payment{
    @Override
    public BigDecimal balance(String numberAccount) {
        return super.balance(numberAccount);
    }

    @Override
    public void refill(String numberAccount, BigDecimal sum) {
        super.refill(numberAccount, sum);
    }

    @Override
    public void payment(String numberAccount, BigDecimal sum) {
        Payment.super.payment(numberAccount, sum);
    }
}
