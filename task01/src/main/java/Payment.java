import java.time.LocalDateTime;
import java.util.List;

public class Payment {
    private PaymentInfo paymentInfo;
    private PayType payType;
    private LocalDateTime paidAt;

    public Payment(PaymentInfo paymentInfo, PayType payType, LocalDateTime paidAt) {
        this.paymentInfo = paymentInfo;
        this.payType = payType;
        this.paidAt = paidAt;
    }

    public PaymentInfo createPaymentInfo(int customerId, Cart cart) {
        int totalPrice = cart.calculateTotalPrice();
        List<CartItem> cartItemList = cart.getCartItemList();

        return new PaymentInfo(customerId, cartItemList, totalPrice);
    }

    public PaymentResult pay(PaymentInfo paymentInfo, PayType payType) {
        new Payment(paymentInfo, payType, LocalDateTime.now());

        return PaymentResult.PAYMENT_SUCCESS;
    }
}
