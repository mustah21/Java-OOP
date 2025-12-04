package Task2;

import java.util.HashMap;

public class ShoppingCart {

    private final HashMap<String, Double> groceryList;

    public ShoppingCart() {
        this.groceryList = new HashMap<>();
    }

    public void addItem(String item, double quantity) {
        this.groceryList.put(item, quantity);
    }

    public void removeItem(String item) {
        this.groceryList.remove(item);
    }

    public int getItemCount() {
        return this.groceryList.size();
    }

    public double calculateTotal() {
        double total = 0;
        for (String item : this.groceryList.keySet()) {
            total += this.groceryList.get(item);
        }
        return total;
    }

}


