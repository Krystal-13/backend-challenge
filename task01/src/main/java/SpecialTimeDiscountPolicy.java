import java.time.LocalDate;
import java.time.LocalDateTime;

public class SpecialTimeDiscountPolicy implements DiscountPolicy{
    @Override
    public boolean isPossibleDiscount(Item item) {
        LocalDateTime now = LocalDateTime.now();
        return now.isAfter(LocalDate.now().atTime(2,0)) && now.isBefore(LocalDate.now().atTime(4,0));
    }

    @Override
    public double getDiscountRate() {
        return 0.3;
    }
}