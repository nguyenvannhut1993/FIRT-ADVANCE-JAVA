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
 * class for creating InfomationCustommer class
 * input Address, Email,identifyCard,Names,phoneNumber,m_Order
 * output show information
 */
public class InfomationCustommer {

    protected String Address;
    protected String Email;
    protected String identifyCard;
    protected String Names;
    protected String phoneNumber;
    public Order m_Order;

    public InfomationCustommer() {

    }

    public InfomationCustommer(String Address, String Email, String identifyCard, String Names, String phoneNumber, Order m_Order) {
        this.Address = Address;
        this.Email = Email;
        this.identifyCard = identifyCard;
        this.Names = Names;
        this.phoneNumber = phoneNumber;
        this.m_Order = m_Order;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getIdentifyCard() {
        return identifyCard;
    }

    public void setIdentifyCard(String identifyCard) {
        this.identifyCard = identifyCard;
    }

    public String getNames() {
        return Names;
    }

    public void setNames(String Names) {
        this.Names = Names;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Order getM_Order() {
        return m_Order;
    }

    public void setM_Order(Order m_Order) {
        this.m_Order = m_Order;
    }

    public void finalize() throws Throwable {

    }
    // show information custommer
    public String showinforCustom(Order n) throws Exception {

        return "Address:" + Address + "--" + "Email:" + Email + "--" + "Identify card:" + identifyCard + "--"
                + "name custommer:" + Names + "--" + "phone number:" + phoneNumber + "--\n"
                + "Sum of money not tax:" + n.calSum() + "\n"
                + "tax:" + n.calTax() + "\n"
                + "Sum of money must pay:" + n.SumMoney();
    }
    // show information money
    public String showNotInfo(Order n) throws Exception {
        return "Sum of money not tax:" + n.calSum() + "\n"
                + "tax:" + n.calTax() + "\n"
                + "Sum of money must pay:" + n.SumMoney();
    }
}
