import java.time.LocalDateTime;
import java.util.Set;

public class Item {
    private String name;
    private int price;
    private LocalDateTime expireDate;
    private Set<DiscountPolicy> discountPolicySet;

    public Item(String name, int price, LocalDateTime expireDate) {
        this.name = name;
        this.price = price;
        this.expireDate = expireDate;
    }

    public int getPrice() {
        return (int)(price * this.getBestDiscountRate());
    }

    public LocalDateTime getExpireDate() {
        return expireDate;
    }

    private double getBestDiscountRate() {
        return discountPolicySet.stream()
                .filter(policy -> policy.isPossibleDiscount(this))
                .map(DiscountPolicy::getDiscountRate)
                .max(Double::compareTo)
                .orElse(0.0);
    }
}
