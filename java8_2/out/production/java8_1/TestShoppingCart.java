package production.java8_1;

import Task2.ShoppingCart;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestShoppingCart {

    @Test
    public void testRemoveNonExistingItem() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Apple", 1.0);
        cart.removeItem("Banana");

        assertEquals(1, cart.getItemCount());
    }

    @Test
    public void testCalculateTotalEmptyCart() {
        ShoppingCart cart = new ShoppingCart();

        assertEquals(0.0, cart.calculateTotal(), 0.01);
    }

    @Test
    public void testAddItemWithZeroPrice() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("FreeSample", 0.0);

        assertEquals(1, cart.getItemCount());
        assertEquals(0.0, cart.calculateTotal(), 0.01);
    }

    @Test
    public void testAddItemWithNegativePrice() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("WeirdItem", -5.0);
        assertEquals(1, cart.getItemCount());
        assertEquals(-5.0, cart.calculateTotal(), 0.01);
    }

    @Test
    public void testRemoveAllItems() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);

        cart.removeItem("Apple");
        cart.removeItem("Banana");

        assertEquals(0, cart.getItemCount());
        assertEquals(0.0, cart.calculateTotal(), 0.01);
    }

    @Test
    public void testCaseSensitivity() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("apple", 1.0);
        cart.addItem("Apple", 2.0);

        assertEquals(2, cart.getItemCount());
        assertEquals(3.0, cart.calculateTotal(), 0.01);
    }
}