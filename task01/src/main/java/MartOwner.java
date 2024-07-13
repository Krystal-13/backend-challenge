public class MartOwner {
    private String name;
    private Payment payment;

    public MartOwner(String name) {
        this.name = name;
    }

    public PaymentInfo createPaymentInfo(int customerId, Cart cart) {
        return this.payment.createPaymentInfo(customerId, cart);
    }

    public PaymentResult pay(PaymentInfo paymentInfo, PayType payType) {
        return this.payment.pay(paymentInfo, payType);
    }
}
