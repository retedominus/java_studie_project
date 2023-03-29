package OOP_Lesson_04.Example_2;

import java.math.BigDecimal;

public class DepositAccount extends Account implements Payment{
    @Override
    public BigDecimal balance(String numberAccount) {
        return super.balance(numberAccount);
    }

    @Override
    public void refill(String numberAccount, BigDecimal sum) {
        super.refill(numberAccount, sum);
    }

    public void payment(String numberAccount, BigDecimal sum){
        throw new UnsupportedOperationException("Operation not supported");
    }
}
