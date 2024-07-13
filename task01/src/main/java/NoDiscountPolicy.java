public class NoDiscountPolicy implements DiscountPolicy{
    @Override
    public boolean isPossibleDiscount(Item item) {
        return true;
    }

    @Override
    public double getDiscountRate() {
        return 0.0;
    }
}
