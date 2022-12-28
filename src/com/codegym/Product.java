package com.codegym;

public class Product {
    private int idProduct;
    private String nameProduct;
    private int price;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, int price) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "\n" + "Sản phẩm: " + "\n" +
                "ID sản phẩm: " + idProduct + "\n" +
                "Tên sản phẩm: " + nameProduct + "\n" +
                "Giá: " + price + "\n" ;
    }
}
