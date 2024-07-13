import java.util.List;

public class PaymentInfo {
    private int customerId;
    private List<CartItem> cartItemList;
    private int totalPrice;

    public PaymentInfo(int customerId, List<CartItem> cartItemList, int totalPrice) {
        this.customerId = customerId;
        this.cartItemList = cartItemList;
        this.totalPrice = totalPrice;
    }

}
