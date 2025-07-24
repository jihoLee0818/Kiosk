package com.example.kiosk.challengelv1;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final List<Menu> menus;

    private final Cart cart;

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
        this.cart = new Cart();
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getName());
            }
            if(!cart.isCartEmpty()) {
                System.out.println("[ ORDER MENU ]");
                System.out.println("4. Orders        | 장바구니를 확인 후 주문합니다.");
                System.out.println("5. Cancel        | 진행중인 주문을 취소합니다.");
            }

            System.out.println("0. 종료      | 종료");

            int categoryChoice = sc.nextInt();

            if (categoryChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (categoryChoice == 5) {
                cart.clearCart();
                System.out.println("장바구니가 비워졌습니다.");
                continue;
            } else if (categoryChoice > 0 && categoryChoice <= menus.size()) {
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
                System.out.println("\n위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인       2. 취소");
                int confirmChoice = sc.nextInt();
                if (confirmChoice == 1) {
                    cart.addMenuItem(selectedItem);

                    System.out.println(selectedItem.getName() + " 이(가) 장바구니에 추가되었습니다.");
                }
                break;
            } else {
                System.out.println("잘못된 번호를 입력했습니다. 다시 입력해주세요.");

            }
        }
    }
}