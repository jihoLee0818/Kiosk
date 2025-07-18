package com.example.kiosk.lv4;

import java.util.List;
import java.util.ArrayList;

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
        return menuItems;
    }
    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }
}
