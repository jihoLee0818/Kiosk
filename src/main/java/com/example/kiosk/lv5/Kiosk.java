package com.example.kiosk.lv5;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final List<Menu> menus;

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getName());
            }
            System.out.println("0. 종료      | 종료");

            int categoryChoice = sc.nextInt();

            if (categoryChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (categoryChoice > 0 && categoryChoice <= menus.size()) {
                Menu selectedMenu = menus.get(categoryChoice - 1);

                displayMenuItems(selectedMenu, sc);
            } else {
                System.out.println("잘못된 번호를 입력했습니다. 다시 입력해주세요.");
            }
        }
        sc.close();
    }

    private void displayMenuItems(Menu menu, Scanner sc) {
        while (true) {
            System.out.println("\n[ " + menu.getName() + " MENU ]");
            List<MenuItem> menuItems = menu.getMenuItems();
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.println((i + 1) + ". " + item.getName() + "    | W " + item.getPrice() + " | " +
                        item.getDescription());
            }
            System.out.println("0. 뒤로가기");


            int itemChoice = sc.nextInt();


            if (itemChoice == 0) {
                break;
            }

            if (itemChoice > 0 && itemChoice <= menuItems.size()) {
                MenuItem selectedItem = menuItems.get(itemChoice - 1);
                System.out.println("선택한 메뉴: " + selectedItem.getName() + " | W " + selectedItem.getPrice()
                        + " | " + selectedItem.getDescription());
                break;
            } else {
                System.out.println("잘못된 번호를 입력했습니다. 다시 입력해주세요.");

            }
        }
    }
}