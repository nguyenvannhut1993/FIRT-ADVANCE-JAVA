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
 * class for creating Order class
 * input dateOrder,printOrder,stateOrder,Names,m_OrderDetail
 * output calculate tax, sum, sum of money
 */
public class Order {

    private String dateOrder;
    private String printOrder;
    private String stateOrder;
    public OrderDetail[] m_OrderDetail;

    public Order() {

    }

    public Order(String dateOrder, String printOrder, String stateOrder, OrderDetail[] m_OrderDetail) {
        this.dateOrder = dateOrder;
        this.printOrder = printOrder;
        this.stateOrder = stateOrder;
        this.m_OrderDetail = m_OrderDetail;
    }

    public String getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(String dateOrder) {
        this.dateOrder = dateOrder;
    }

    public String getPrintOrder() {
        return printOrder;
    }

    public void setPrintOrder(String printOrder) {
        this.printOrder = printOrder;
    }

    public String getStateOrder() {
        return stateOrder;
    }

    public void setStateOrder(String stateOrder) {
        this.stateOrder = stateOrder;
    }

    public OrderDetail[] getM_OrderDetail() {
        return m_OrderDetail;
    }

    public void setM_OrderDetail(OrderDetail[] m_OrderDetail) {
        this.m_OrderDetail = m_OrderDetail;
    }
    // add product
    public boolean addProduct(OrderDetail c) {
        for (int i = 0; i < m_OrderDetail.length; i++) {
            if (m_OrderDetail[i] == null) {
                m_OrderDetail[i] = c;
                return true;
            }

        }
        return false;
    }
    // calculate sum not tax
    public double calSum() {
        double sum = 0;
        for (int i = 0; i < m_OrderDetail.length; i++) {
            if (m_OrderDetail[i] != null) {
                sum = sum + m_OrderDetail[i].CalDetailFrice();
            }
        }
        return sum;
    }
    // calculate tax
    public double calTax() throws Exception {
        double sumTax = 0;
        if (getPrintOrder().equalsIgnoreCase("y")) {
            sumTax = 0.10;
        } else if (getPrintOrder().equalsIgnoreCase("n")) {
            sumTax = 0;
        } else {
            throw new Exception("Error: choice not correctly");
        }
        return sumTax;
    }
    // calculate sum of money
    public double SumMoney() throws Exception {
        return calSum() * calTax();
    }

}
