package OOP_Lesson_04.Example_4;

import java.math.BigDecimal;

public class Shop {
    private Payment payment;


    public Shop(Payment payment) {
        this.payment = payment;
    }

    public void doPayment(Object order, BigDecimal amount){
//        payment.transaction(amount);
    }
}
