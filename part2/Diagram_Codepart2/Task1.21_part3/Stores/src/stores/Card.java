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
 * class for creating Card class
 * input Idcard, m_CreditCard,m_ATMCard,m_Order
 * output show information
 */
public class Card extends InfomationCustommer {

    protected String IdCard;
    public CreditCard m_CreditCard;
    public ATMCard m_ATMCard;
    public Order m_Order;

    public Card() {

    }

    public Card(String IdCard, CreditCard m_CreditCard, ATMCard m_ATMCard, Order m_Order) {
        this.IdCard = IdCard;
        this.m_CreditCard = m_CreditCard;
        this.m_ATMCard = m_ATMCard;
        this.m_Order = m_Order;
    }

    public String getIdCard() {
        return IdCard;
    }

    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    public CreditCard getM_CreditCard() {
        return m_CreditCard;
    }

    public void setM_CreditCard(CreditCard m_CreditCard) {
        this.m_CreditCard = m_CreditCard;
    }

    public ATMCard getM_ATMCard() {
        return m_ATMCard;
    }

    public void setM_ATMCard(ATMCard m_ATMCard) {
        this.m_ATMCard = m_ATMCard;
    }

    public Order getM_Order() {
        return m_Order;
    }

    public void setM_Order(Order m_Order) {
        this.m_Order = m_Order;
    }

    public void finalize() throws Throwable {
        super.finalize();
    }
    //show information
    public String showInfoCard() {
        return "ID card:" + identifyCard;
    }
}
