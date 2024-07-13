import java.util.List;

public class Cart {

    private List<CartItem> cartItemList;

    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public void addCartItem(CartItem cartItem) {
        this.cartItemList.add(cartItem);
    }

    public int calculateTotalPrice() {
        return this.cartItemList.stream().mapToInt(CartItem::calculateCartItemPrice).sum();
    }
}
