package com.codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager {
    private ArrayList<Product> listProduct;

    private static ProductManager productManager = new ProductManager();

    private ProductManager() {
        listProduct = new ArrayList<>();
    }

    public static ProductManager getProductManager(){
        return productManager;
    }

    public static void setProductManager(ProductManager productManager) {
        ProductManager.productManager = productManager;
    }

    public void addProduct(Product product) {
        listProduct.add(product);
    }

    public boolean fixProduct(int idProduct, String nameProduct, int price){
        for (Product product: listProduct) {
            if(product.getIdProduct() == idProduct){
                product.setNameProduct(nameProduct);
                product.setPrice(price);
                return true;
            }
        }
        return false;
    }

    public boolean removeProduct(int idProduct) {
        for(Product product: listProduct) {
            if (product.getIdProduct() == idProduct) {
                listProduct.remove(product);
                return true;
            }
        }
        return false;
    }

    public void display(){
        System.out.println(listProduct);
    }

    public boolean searchByName(String nameProduct){
        for (Product product: listProduct){
            if (product.getNameProduct().equals(nameProduct)){
                System.out.println(product);
                return true;
            }
        }
        return false;
    }

    public void sortIncreaseByPrice(){
        ComparatorProduct comparatorProduct = new ComparatorProduct();

        listProduct.sort(comparatorProduct);
        System.out.println(listProduct);
    }

    public void sortReducedByPrice(){
        ComparatorProduct comparatorProduct = new ComparatorProduct();

        Collections.sort(listProduct, comparatorProduct.reversed());
        System.out.println(listProduct);
    }

    public boolean checkId(int id){
        for (Product product: listProduct){
            if (product.getIdProduct() == id){
                return true;
            }
        }
        return false;
    }

    public boolean checkName(String name){
        for(Product product: listProduct){
            if (product.getNameProduct().equals(name)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return "Product Manager {" + "list Product" + listProduct + '}';
    }
}
