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
 * input deadDate, maxDebt,TypeCard,authu
 * output show information
 */
public class CreditCard implements authuMethod {

    private String deadDate;
    private String maxDebt;
    private String TypeCard;
    private String authu;

    public CreditCard() {

    }

    public CreditCard(String deadDate, String maxDebt, String TypeCard, String authu) {
        this.deadDate = deadDate;
        this.maxDebt = maxDebt;
        this.TypeCard = TypeCard;
        this.authu = authu;
    }

    public String getDeadDate() {
        return deadDate;
    }

    public void setDeadDate(String deadDate) {
        this.deadDate = deadDate;
    }

    public String getMaxDebt() {
        return maxDebt;
    }

    public void setMaxDebt(String maxDebt) {
        this.maxDebt = maxDebt;
    }

    public String getTypeCard() {
        return TypeCard;
    }

    public void setTypeCard(String TypeCard) {
        this.TypeCard = TypeCard;
    }

    public String getAuthu() {
        return authu;
    }

    public void setAuthu(String authu) {
        this.authu = authu;
    }

    public String authuCardMethod() {
        return authu;
    }
    // show information 
    public String showInfoCreditCard() {
        return "deadDate:" + deadDate + "--" + "maximum dept:" + maxDebt + "--" + "type card:" + TypeCard + "--"
                + "authucation:" + authu;
    }
}
