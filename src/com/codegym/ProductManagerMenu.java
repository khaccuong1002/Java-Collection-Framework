package com.codegym;

import java.util.Scanner;

public class ProductManagerMenu {

    public ProductManagerMenu(){};

    ProductManager productManager = ProductManager.getProductManager();

    Scanner sc = new Scanner(System.in);

    public void menu(){
        int choice = 0;
        do {
            System.out.println("------ Menu Sản Phẩm ------");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm");
            System.out.println("3. Xoá sản phẩm");
            System.out.println("4. Tìm kiếm sản phẩm");
            System.out.println("5. Hiển thị danh sách");
            System.out.println("6. Sắp xếp tăng theo giá");
            System.out.println("7. Sắp xếp gỉam theo giá");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1 -> addproduct();
                case 2 -> fixproduct();
                case 3 -> removeproduct();
                case 4 -> searchproduct();
                case 5 -> displayproduct();
                case 6 -> sortIncrece();
                case 7 -> sortDecrese();
                default -> System.out.println("Lựa chọn của bạn không tìm thấy !");
            }
        } while (choice != 0);
    }

    private void sortDecrese(){
        productManager.sortReducedByPrice();
    }

    private void sortIncrece(){
        productManager.sortIncreaseByPrice();
    }

    private void searchproduct(){
        System.out.println("Nhập tên sản phẩm bạn muốn tìm kiếm: ");
        String name = sc.nextLine();
        while (!productManager.checkName(name)){
            System.out.println("Tên không tồn tại. Vui lòng nhập lại");
            name = sc.nextLine();
        }

        productManager.searchByName(name);
    }

    private void displayproduct(){
        productManager.display();
    }

    private void removeproduct(){
        System.out.println("Nhập ID sản phẩm: ");
        int id = sc.nextInt();
        sc.nextLine();

        productManager.removeProduct(id);
    }

    private void fixproduct(){
        System.out.println("Nhập ID sản phẩm muốn sửa: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên sản phẩm muốn sửa: ");
        String name = sc.nextLine();
        System.out.println("Nhập giá sản phẩm muốn sửa: ");
        int price = sc.nextInt();
        sc.nextLine();

        productManager.fixProduct(id, name, price);
    }

    private void addproduct(){
        System.out.println("Nhập sản phẩm trong danh sách: ");
        System.out.println("Nhập ID sản phẩm: ");
        int id = sc.nextInt();
        sc.nextLine();
        while (productManager.checkId(id)){
            System.out.println("ID đã tồn tại. Vui lòng nhập lại!");
            id = sc.nextInt(); sc.nextLine();
        }

        System.out.println("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        int price = sc.nextInt();
        sc.nextLine();


        Product product = new Product(id, name, price);
        productManager.addProduct(product);
    }
}
