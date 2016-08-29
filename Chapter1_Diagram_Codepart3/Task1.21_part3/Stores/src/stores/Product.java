/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stores;

/**
 *
 * @author nguyen van nhut
 * Day:29/08/2016
 * version 1
 * class for creating Product class
 * input name product, price 
 * output show information
 */
public class Product {

    public String nameProduct;
    public double Price;

    public Product() {

    }

    public Product(String nameProduct, double Price) {
        this.nameProduct = nameProduct;
        this.Price = Price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

}
