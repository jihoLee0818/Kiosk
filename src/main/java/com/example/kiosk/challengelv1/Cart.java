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

    public boolean isCartEmpty() {
        return items.isEmpty();
    }


}
