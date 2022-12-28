import com.codegym.ProductManagerMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProductManagerMenu productManagerMenu = new ProductManagerMenu();

        display();
        int choice = sc.nextInt();
        sc.nextLine();
        while (choice != 0) {
            switch (choice){
                case 1 -> productManagerMenu.menu();
                default -> System.out.println("Lựa chọn của bạn không tìm thấy!");
            }
            display();
            choice = sc.nextInt();
            sc.nextLine();
        }
    }

    private static void display() {
        System.out.println("------MENU------");
        System.out.println("1. Menu sản phẩm");
        System.out.println("2. Thoát");
        System.out.println("Nhập lựa chọn của bạn: ");
    }
}