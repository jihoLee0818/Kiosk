package com.example.kiosk.challengelv1;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<MenuItem> items = new ArrayList<>();

    public void addMenuItem(MenuItem item) {
        items.add(item);
    }

    public void displayCart() {
        System.out.println("\n[ Orders ]");
        for (MenuItem item : items) {
            System.out.println(item.getName() + " | W " + item.getPrice() + " | " + item.getDescription());
        }

    }
    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (MenuItem item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
    public void clearCart() {
        items.clear();
    }

    public boolean isCartEmpty() {
        return items.isEmpty();
    }


}
