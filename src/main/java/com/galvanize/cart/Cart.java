package com.galvanize.cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Cart {

  private double totalPrice;
  private List<Item> items = new ArrayList<>();
  private List<Item> onSaleItems = new ArrayList<>();
  private HashMap<String, Integer> quantities = new HashMap<>();


  public Cart() {
    totalPrice = 0.00;
  }

  public List<Item> getItems() {
    return items;
  }

  public double getTotalPrice() {
    return totalPrice;
  }

  public void addItem(Item item) {
//    if (items.contains(item)) {
//      System.out.println("This block runs");
//      int idx = items.indexOf(item);
//      items.get(idx).increaseQuantity();
//    }
    if (quantities.containsKey(item.getName())) {
      quantities.put(item.getName(), quantities.get(item.getName()) + 1);
    } else {
      quantities.put(item.getName(), 1);
    }

    items.add(item);
    if (item.isOnSale()) {
      onSaleItems.add(item);
    }
    totalPrice += item.getPrice();
  }

  public List<Item> itemizedList() {
    return items;
  }

  public int itemQuantities() {
    int total = 0;

    for (String key : quantities.keySet()) {
      total += quantities.get(key);
    }

    return total;
  }


  public List<Item> onSaleItems() {
    return onSaleItems;
  }

}
