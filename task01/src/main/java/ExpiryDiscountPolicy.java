import java.time.LocalDateTime;

public class ExpiryDiscountPolicy implements DiscountPolicy{
    @Override
    public boolean isPossibleDiscount(Item item) {
        LocalDateTime expireDate = item.getExpireDate();
        return expireDate.isAfter(expireDate.minusDays(1));
    }

    @Override
    public double getDiscountRate() {
        return 0.7;
    }
}
