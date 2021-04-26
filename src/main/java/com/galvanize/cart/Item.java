package com.galvanize.cart;

public class Item {
  private String name;
  private double price;
  private boolean onSale;
//  private int quantity;

  public Item(String name, double price, boolean onSale) {
    this.name = name;
    this.price = price;
    this.onSale = onSale;
//    quantity = 1;
  }

  public double getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }

  public boolean isOnSale() {
    return onSale;
  }

  //  public void increaseQuantity() {
//    quantity++;
//  }
//
//  public int getQuantity() {
//    return quantity;
//  }

}
