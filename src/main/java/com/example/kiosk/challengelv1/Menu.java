package com.example.kiosk.challengelv1;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final String name;
    private final List<MenuItem> menuItems;

    public Menu(String name) {
        this.name = name;
        this.menuItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public List<MenuItem> getMenuItems() {
        return new ArrayList<>(menuItems);
    }
    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }
}
