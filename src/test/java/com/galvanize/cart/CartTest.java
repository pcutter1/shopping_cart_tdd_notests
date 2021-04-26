package com.galvanize.cart;

import com.galvanize.App;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CartTest {

  @Test
  public void testEmptyCart() {
    Cart cartUnderTest = new Cart();

    int expected = 0;
    int actual = cartUnderTest.getItems().size();

    assertEquals(expected, actual, "Testing if cart is empty");
  }

  @Test
  public void testEmptyCartBalance() {
    Cart cartUnderTest = new Cart();

    double expected = 0.00;
    double actual = cartUnderTest.getTotalPrice();

    assertEquals(expected, actual, "Testing if empty cart has zero balance");
  }

  @Test
  public void testAddItem() {
    Cart cartUnderTest = new Cart();
    Item firstItem = new Item("Rolex", 230.00, false);
    cartUnderTest.addItem(firstItem);

    int expected = 1;
    int actual = cartUnderTest.getItems().size();

    assertEquals(expected, actual, "Testing addItem method");
  }

  @Test
  public void testTotalPrice() {
    Cart cartUnderTest = new Cart();
    Item firstItem = new Item("Rolex", 230.00, false);

    cartUnderTest.addItem(firstItem);

    double expected = 230;
    double actual = cartUnderTest.getTotalPrice();

    assertEquals(expected, actual, "Testing getTotalPrice method");
  }

  @Test
  public void testItemizedList() {
    Cart cartUnderTest = new Cart();
    Item firstItem = new Item("Rolex", 230.00, false);

    cartUnderTest.addItem(firstItem);

    List<Item> expected = new ArrayList<>();
    expected.add(firstItem);

    List<Item> actual = cartUnderTest.itemizedList();

    assertEquals(expected, actual, "Testing itemizedList method");
  }

  @Test
  public void testMultipleTotalPrice() {
    Cart cartUnderTest = new Cart();

    Item firstItem = new Item("Rolex", 230.00, false);
    Item secondItem = new Item("Rolex", 230.00, false);

    cartUnderTest.addItem(firstItem);
    cartUnderTest.addItem(secondItem);

    double expected = 460.00;
    double actual = cartUnderTest.getTotalPrice();

    assertEquals(expected, actual, "Testing total price method for multiple item");
  }

  @Test
  public void testItemQuantity() {
    Cart cartUnderTest = new Cart();

    Item firstItem = new Item("Rolex", 230.00, false);
    Item secondItem = new Item("Rolex", 230.00, false);
    Item thirdItem = new Item("Rolex", 230.00, false);

    cartUnderTest.addItem(firstItem);
    cartUnderTest.addItem(secondItem);
    cartUnderTest.addItem(thirdItem);

    int expected = 3;
    int actual = cartUnderTest.itemQuantities();

    assertEquals(expected, actual, "Testing itemQuantities method");
  }

  @Test
  public void testOnSaleItems() {
    Cart cartUnderTest = new Cart();

    Item firstItem = new Item("Rolex", 230.00, false);
    Item secondItem = new Item("Rolex", 150.00, true);
    Item thirdItem = new Item("Rolex", 230.00, false);

    cartUnderTest.addItem(firstItem);
    cartUnderTest.addItem(secondItem);
    cartUnderTest.addItem(thirdItem);

    List<Item> expected = new ArrayList<>();
    expected.add(secondItem);

    List<Item> actual = cartUnderTest.onSaleItems();

    assertEquals(expected, actual, "Testing onSaleItems method");
  }

}
