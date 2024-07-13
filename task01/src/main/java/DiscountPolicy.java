public interface DiscountPolicy {
    boolean isPossibleDiscount(Item item);
    double getDiscountRate();
}

