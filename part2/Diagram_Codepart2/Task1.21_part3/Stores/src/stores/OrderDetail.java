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
 * class for creating OrderDetail class
 * input quanlity, m_Product 
 * output Calculate DetailFrice
 */
public class OrderDetail {

    private double quanlity;
    public Product m_Product;

    public OrderDetail() {

    }

    public OrderDetail(double quanlity, Product m_Product) {
        this.quanlity = quanlity;
        this.m_Product = m_Product;
    }

    public double getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(double quanlity) {
        this.quanlity = quanlity;
    }

    public Product getM_Product() {
        return m_Product;
    }

    public void setM_Product(Product m_Product) {
        this.m_Product = m_Product;
    }

    public void finalize() throws Throwable {

    }
    // calculate frice 1 product
    public double CalDetailFrice() {
        double sumMoney = quanlity * m_Product.getPrice();
        return sumMoney;
    }

}
