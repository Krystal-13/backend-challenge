import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Item cola = new Item("콜라", 1500, LocalDateTime.now().plusDays(14));
        Item bread = new Item("빵", 1500, LocalDateTime.now().plusDays(1));
        Item yogurt = new Item("요거트", 2000, LocalDateTime.now().plusDays(3));
        Item ace = new Item("에이스", 1000, LocalDateTime.now().plusDays(30));
        Item iceCream = new Item("아이스크림", 2500, LocalDateTime.now().plusDays(180));

        Customer customer = new Customer("고객");
        Cart cart = new Cart();
        MartOwner martOwner = new MartOwner("마트오너");

        // 1. 고객이 상품을 카트에 담는다.
        customer.addToCart(cart, new CartItem(iceCream, 3));
        customer.addToCart(cart, new CartItem(yogurt, 1));

        // 2. 마트오너는 계산하기 전 지불 정보를 만든다.
        PaymentInfo paymentInfo = customer.requestCheckOut(martOwner, cart);

        // 3. 고객은 지불 정보를 바탕으로 결제한다. (결제 수단은 오직 카드뿐이다.)
        PaymentResult result = customer.pay(martOwner, paymentInfo, PayType.Card);


    }
}
