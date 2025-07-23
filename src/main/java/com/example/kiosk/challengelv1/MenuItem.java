package com.example.kiosk.challengelv1;

public class MenuItem {
    private final String name;
    private final double price;
    private final String description;
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public String getDescription() {
        return this.description;
    }
}
