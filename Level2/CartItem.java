import java.util.ArrayList;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }

    public String getItemName() {
        return itemName;
    }
}

class ShoppingCart {
    private ArrayList<CartItem> items = new ArrayList<>();

    public void addItem(CartItem item) {
        items.add(item);
    }

    public void removeItem(String itemName) {
        items.removeIf(item -> item.getItemName().equalsIgnoreCase(itemName));
    }

    public void displayTotalCost() {
        double total = 0;
        for (CartItem item : items) total += item.getTotal();
        System.out.println("Total Cost: ₹" + total);
    }
}

class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new CartItem("Shirt", 999, 2));
        cart.addItem(new CartItem("Jeans", 1499, 1));
        cart.removeItem("Shirt");
        cart.displayTotalCost();
    }
}
