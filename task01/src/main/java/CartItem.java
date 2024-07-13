public class CartItem {

    private Item item;
    private int quantity;

    public Item getItem() {
        return item;
    }

    public CartItem(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public int calculateCartItemPrice() {
        return this.item.getPrice() * this.quantity;
    }
}
