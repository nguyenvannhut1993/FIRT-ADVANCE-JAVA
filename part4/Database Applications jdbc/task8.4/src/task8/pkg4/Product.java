
package task8.pkg4;

/**
 *
 * @author Nguyen Van Nhut
 * Day 17/09/2016
 * Version 1
 * Class for building product class
 */
public class Product {
    int id;
    String nameProduct;
    double price;
    int quanlity;
    int categoryId;

    public Product( String nameProduct, double price, int quanlity, int categoryId) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.quanlity = quanlity;
        this.categoryId = categoryId;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    
    @Override
    public String toString() {
        return id+" - "+nameProduct +" - "+price +" - "+quanlity+ " - "+categoryId;
    }
    
}
