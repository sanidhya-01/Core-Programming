public class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public void displayDetails(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Unit Price: ₹" + price);
        System.out.println("Total Cost for " + quantity + ": ₹" + calculateTotalCost(quantity));
    }
}

class Main {
    public static void main(String[] args) {
        Item item = new Item(1001, "Notebook", 45.5);
        item.displayDetails(10);
    }
}
