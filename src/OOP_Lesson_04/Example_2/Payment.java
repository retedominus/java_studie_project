package OOP_Lesson_04.Example_2;

import java.math.BigDecimal;

public interface Payment {
    default void payment(String numberAccount, BigDecimal sum){
    }
}
