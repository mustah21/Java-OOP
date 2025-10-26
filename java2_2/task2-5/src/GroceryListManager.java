import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private final HashMap<String, Item> groceryList;

    public GroceryListManager() {
        this.groceryList = new HashMap<>();
    }

    void addItem(String item, double cost, String category, int quantity) {
        if (item != null) {
            this.groceryList.put(item, new Item(item, cost, category, quantity));
        }
    }

    void removeItem(String item) {
        if (item != null) {
            this.groceryList.remove(item);
        }
    }

    void displayList() {
        System.out.println("Items in the list");
        int i = 1;
        for (Map.Entry<String, Item> item : this.groceryList.entrySet()) {
//            System.out.println("  " + i + ". " + item.getValue().name);
            System.out.println("Item: " + item.getValue().name + ", Cost: " + ": €" + item.getValue().cost + ", Quantity: " + item.getValue().quantity);

            i++;
        }
    }

    boolean checkItem(String item) {
        return this.groceryList.containsKey(item);
    }

    void displayAllCategory() {
        System.out.println("Items by category");

        HashMap<String, ArrayList<String>> categories = new HashMap<>();
        for (Map.Entry<String, Item> item : this.groceryList.entrySet()) {
            ArrayList<String> byCategory = new ArrayList<>();
            String key = item.getValue().category;

            if (categories.containsKey(key)) {
                byCategory = categories.get(key);
            }
            byCategory.add(item.getValue().name);
            categories.put(key, byCategory);
        }
        for (Map.Entry<String, ArrayList<String>> itemsInCategory : categories.entrySet()) {
            System.out.println(" " + itemsInCategory.getKey());

            for (String item : itemsInCategory.getValue()) {
                System.out.println("    " + item);
            }
        }
    }

    void displayByCategory(String category) {
        System.out.println("\nItems specified by category");

        for (Map.Entry<String, Item> item : this.groceryList.entrySet()) {
            Item itemGroup = item.getValue();
            if (itemGroup.category != null && itemGroup.category.equalsIgnoreCase(category)) {
                System.out.printf("  - %s (Cost: $%.2f, Qty: %d)\n", itemGroup.name, itemGroup.cost, itemGroup.quantity);
            }
        }

    }


    double calculateCost() {
        double cost = 0;
        for (Map.Entry<String, Item> entry : this.groceryList.entrySet()) {
            Item item = entry.getValue();
            if (item.quantity > 0) {
                cost += item.quantity * item.cost;
            }
        }
        return cost;
    }

    void updateQuantity(String item, int quantity) {
        if (quantity > 0) {
            if (groceryList.containsKey(item)) {
                Item itemToUpdate = groceryList.get(item);
                itemToUpdate.quantity = quantity;
            } else {
                System.out.println("Item does not exist: " + item);
            }
        } else {
            System.out.println("Quantity cannot be less than 0");
        }
    }

    void displayAvailableItems() {
        System.out.println("\n ---------------");
        for (Map.Entry<String, Item> item : this.groceryList.entrySet()) {
            System.out.println(" Item: " + item.getValue().name + " with quantity: " + item.getValue().quantity);
        }
    }

    public static void main(String[] args) {

        GroceryListManager manager = new GroceryListManager();

        manager.addItem("Apples", 5, "Fruits", 5);
        manager.addItem("Milk", 10, "Dairy", 4);
        manager.addItem("Bread", 15, "Bakery", 4);
        manager.addItem("Yogurt", 20, "Dairy", 5);
        manager.addItem("Pizza", 20, "Bakery", 5);


        System.out.println("Grocery List:");
        manager.displayList();

        String itemToCheck = "Milk";
        boolean found = manager.checkItem(itemToCheck);
        System.out.println("\nIs \"" + itemToCheck + "\" in the grocery list? " + found);
        System.out.println("Cost of the all items: " + " € " + manager.calculateCost());

        String itemToRemove = "Milk";
        System.out.println("\nRemoving \"" + itemToRemove + "\" from the list...");
        manager.removeItem(itemToRemove);

        System.out.println("\nUpdated Grocery List:");
        manager.displayList();

        manager.displayAllCategory();
        manager.displayAvailableItems();
        manager.updateQuantity("Apples", 110);
        manager.displayAvailableItems();
        System.out.println("Total cost is: € " + manager.calculateCost());
        manager.displayByCategory("Dairy");

    }

}