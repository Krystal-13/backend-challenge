public class Customer {

    private int id;
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void addToCart(Cart cart, CartItem cartItem) {
        cart.addCartItem(cartItem);
    }

    public PaymentResult pay(MartOwner martOwner, PaymentInfo paymentInfo, PayType payType) {
        return martOwner.pay(paymentInfo, payType);
    }

    public PaymentInfo requestCheckOut(MartOwner martOwner, Cart cart) {
        return martOwner.createPaymentInfo(this.id, cart);
    }
}
